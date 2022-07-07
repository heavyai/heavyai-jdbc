/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;


public enum TDatumType implements org.apache.thrift.TEnum {
  SMALLINT(0),
  INT(1),
  BIGINT(2),
  FLOAT(3),
  DECIMAL(4),
  DOUBLE(5),
  STR(6),
  TIME(7),
  TIMESTAMP(8),
  DATE(9),
  BOOL(10),
  INTERVAL_DAY_TIME(11),
  INTERVAL_YEAR_MONTH(12),
  POINT(13),
  LINESTRING(14),
  POLYGON(15),
  MULTIPOLYGON(16),
  TINYINT(17),
  GEOMETRY(18),
  GEOGRAPHY(19),
  MULTILINESTRING(20);

  private final int value;

  private TDatumType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TDatumType findByValue(int value) { 
    switch (value) {
      case 0:
        return SMALLINT;
      case 1:
        return INT;
      case 2:
        return BIGINT;
      case 3:
        return FLOAT;
      case 4:
        return DECIMAL;
      case 5:
        return DOUBLE;
      case 6:
        return STR;
      case 7:
        return TIME;
      case 8:
        return TIMESTAMP;
      case 9:
        return DATE;
      case 10:
        return BOOL;
      case 11:
        return INTERVAL_DAY_TIME;
      case 12:
        return INTERVAL_YEAR_MONTH;
      case 13:
        return POINT;
      case 14:
        return LINESTRING;
      case 15:
        return POLYGON;
      case 16:
        return MULTIPOLYGON;
      case 17:
        return TINYINT;
      case 18:
        return GEOMETRY;
      case 19:
        return GEOGRAPHY;
      case 20:
        return MULTILINESTRING;
      default:
        return null;
    }
  }
}
