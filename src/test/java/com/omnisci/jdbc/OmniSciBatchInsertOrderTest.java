package com.omnisci.jdbc;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class verifies that the order of columns specified in an insert statement does not matter
 * 
 * 1. The test creates a table student with 4 columns. 
 * 2. Then, it creates an insert statement with all the 4 columns, but in random order. 
 * 3. It then inserts some number of rows using addBatch/executeBatch
 * 4. Then, it creates another insert statement, with a different order - and again inserts records
 * 5. After some number of iterations - it checks if the expected rows are present in the database
 * 
 * 
 */
public class OmniSciBatchInsertOrderTest {

  private static final Logger log = LoggerFactory.getLogger(OmniSciBatchInsertOrderTest.class);
  
  static Properties PROPERTIES = new Property_loader("connection.properties");
  static final String url = PROPERTIES.getProperty("default_db_connection_url");
  static final String user = PROPERTIES.getProperty("default_super_user");
  static final String password = PROPERTIES.getProperty("default_user_password");
  
  static class Column {
    final String name;
    final String type;
    
    Column(String name, String type) {
      this.name = name;
      this.type = type;
    }
  }
  
  private final List<Column> columns = Collections.unmodifiableList(
      Arrays.asList(new Column("id", "integer not null"),
          new Column("name", "text not null"),
          new Column("age", "integer not null"), 
          new Column("department", "text")));
  
  @Before
  public void createTable() throws SQLException{
    try (Connection conn = getConnection()) {
      PreparedStatement drop = conn.prepareStatement("drop table if exists student");
      drop.executeQuery();
      drop.close();
      
      String query = ddlForTable("student", columns);
      log.info("Creating table by running {}", query);
      PreparedStatement create = conn.prepareStatement(query);
      create.executeQuery();
      create.close();
    }
  }

  private String ddlForTable(String table, List<Column> cols) {
    StringBuilder builder = new StringBuilder();
    builder.append("create table ").append(table).append("( ").append("\n");
    for (int i = 0; i < cols.size(); i++) {
      Column col = cols.get(i);
      builder.append("  ").append(col.name).append(" ").append(col.type);
      if (i < cols.size()- 1) {
        builder.append(",");
      }
      builder.append("\n");
    }
    builder.append(")");
    return builder.toString();
  }
  
  @Test
  public void testOrderOfColumnsInInsertDoesntMatter() 
      throws SQLException {
     
    int numIterations = 20;
    List<Map<String, String>> rows = new ArrayList<>();
    rows.add(getRow("12", "sri", "37", "engineering"));
    rows.add(getRow("13", "john", "41", "marketing"));
    rows.add(getRow("14", "harry", "39", "marketing"));
    rows.add(getRow("15", "sally", "35", "sales"));
    rows.add(getRow("16", "bobby", "34", "sales"));
    
    try (Connection conn = getConnection()) {
      Random random = new Random(42);
      for (int iter = 0; iter < numIterations; iter++) {
        List<Column> cols = new ArrayList<>(columns);
        Collections.shuffle(cols, random);
        insertBatch(conn, cols, rows);
      }
      
      assertCount(conn, numIterations * rows.size(), "select count(*) from student");
      assertCount(conn, numIterations, "select count(*) from student where id = 12");
      assertCount(conn, numIterations, "select count(*) from student where id = 15");
      assertCount(conn, numIterations, "select count(*) from student where name = 'bobby'");
      assertCount(conn, numIterations, "select count(*) from student where name = 'sally'");
      assertCount(conn, numIterations * 2, "select count(*) from student where department = 'marketing'");
      assertCount(conn, numIterations, "select count(*) from student where age = 39");
      assertCount(conn, numIterations, "select count(*) from student where age = 41");
    }
  }
  
  private Connection getConnection() throws SQLException {
    try {
      Class.forName("com.omnisci.jdbc.OmniSciDriver");
    } catch(ClassNotFoundException e) {
      throw new RuntimeException("Cannot load JDBC driver class", e);
    }
    return DriverManager.getConnection(url, user, password);
  }
  
  private void insertBatch(Connection conn, List<Column> cols, List<Map<String, String>> rows) throws SQLException {
    String insertSql = buildInsertStatement("student", cols);
    
    log.info("inserting {} rows in batch using query {}", rows.size(), insertSql);
    PreparedStatement insert = conn.prepareStatement(insertSql);
    for (Map<String, String> row : rows) {
      int index = 1;
      for (Column col : cols) {
        String val = row.get(col.name);
        if (col.type.contains("integer")) {
          insert.setInt(index++, Integer.parseInt(val));
        } else {
          insert.setString(index++, val);
        }
      }
      insert.addBatch();
    }
    insert.executeBatch();
  }
  
  private String buildInsertStatement(String tableName, List<Column> cols) {
    StringBuilder builder = new StringBuilder();
    builder.append("insert into ").append(tableName).append(" (");
    for (int i = 0; i < cols.size(); i++) {
      builder.append(cols.get(i).name);
      if (i < cols.size() - 1) {
        builder.append(", ");
      }
    }
    builder.append(") values (");
    for (int i = 0; i < cols.size(); i++) {
      builder.append("?");
      if (i < cols.size() - 1) {
        builder.append(", ");
      }
    }
    builder.append(")");
    return builder.toString();
  }

  private Map<String, String> getRow(String ...colValues) {
    if (colValues.length != columns.size()) {
      throw new IllegalArgumentException("colValues != columnNames");
    }
    Map<String, String> row = new HashMap<>();
    for (int i = 0; i < colValues.length; i++) {
      row.put(columns.get(i).name, colValues[i]);
    }
    return row;
  }

  private void assertCount(Connection conn, int expectedCount, String sql) throws SQLException {
    PreparedStatement statement = conn.prepareStatement(sql);
    ResultSet rs = statement.executeQuery();
    rs.next();
    int actualCount = rs.getInt(1);
    
    assertEquals(sql, expectedCount, actualCount);
  }
}
