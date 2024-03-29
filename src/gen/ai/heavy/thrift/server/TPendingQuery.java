/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TPendingQuery implements org.apache.thrift.TBase<TPendingQuery, TPendingQuery._Fields>, java.io.Serializable, Cloneable, Comparable<TPendingQuery> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPendingQuery");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("column_ranges", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField DICTIONARY_GENERATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("dictionary_generations", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField TABLE_GENERATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("table_generations", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField PARENT_SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parent_session_id", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPendingQueryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPendingQueryTupleSchemeFactory();

  public long id; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TColumnRange> column_ranges; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TDictionaryGeneration> dictionary_generations; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TTableGeneration> table_generations; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String parent_session_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    COLUMN_RANGES((short)2, "column_ranges"),
    DICTIONARY_GENERATIONS((short)3, "dictionary_generations"),
    TABLE_GENERATIONS((short)4, "table_generations"),
    PARENT_SESSION_ID((short)5, "parent_session_id");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // COLUMN_RANGES
          return COLUMN_RANGES;
        case 3: // DICTIONARY_GENERATIONS
          return DICTIONARY_GENERATIONS;
        case 4: // TABLE_GENERATIONS
          return TABLE_GENERATIONS;
        case 5: // PARENT_SESSION_ID
          return PARENT_SESSION_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TQueryId")));
    tmpMap.put(_Fields.COLUMN_RANGES, new org.apache.thrift.meta_data.FieldMetaData("column_ranges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnRange.class))));
    tmpMap.put(_Fields.DICTIONARY_GENERATIONS, new org.apache.thrift.meta_data.FieldMetaData("dictionary_generations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDictionaryGeneration.class))));
    tmpMap.put(_Fields.TABLE_GENERATIONS, new org.apache.thrift.meta_data.FieldMetaData("table_generations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableGeneration.class))));
    tmpMap.put(_Fields.PARENT_SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("parent_session_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TSessionId")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPendingQuery.class, metaDataMap);
  }

  public TPendingQuery() {
  }

  public TPendingQuery(
    long id,
    java.util.List<TColumnRange> column_ranges,
    java.util.List<TDictionaryGeneration> dictionary_generations,
    java.util.List<TTableGeneration> table_generations,
    java.lang.String parent_session_id)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.column_ranges = column_ranges;
    this.dictionary_generations = dictionary_generations;
    this.table_generations = table_generations;
    this.parent_session_id = parent_session_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPendingQuery(TPendingQuery other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetColumn_ranges()) {
      java.util.List<TColumnRange> __this__column_ranges = new java.util.ArrayList<TColumnRange>(other.column_ranges.size());
      for (TColumnRange other_element : other.column_ranges) {
        __this__column_ranges.add(new TColumnRange(other_element));
      }
      this.column_ranges = __this__column_ranges;
    }
    if (other.isSetDictionary_generations()) {
      java.util.List<TDictionaryGeneration> __this__dictionary_generations = new java.util.ArrayList<TDictionaryGeneration>(other.dictionary_generations.size());
      for (TDictionaryGeneration other_element : other.dictionary_generations) {
        __this__dictionary_generations.add(new TDictionaryGeneration(other_element));
      }
      this.dictionary_generations = __this__dictionary_generations;
    }
    if (other.isSetTable_generations()) {
      java.util.List<TTableGeneration> __this__table_generations = new java.util.ArrayList<TTableGeneration>(other.table_generations.size());
      for (TTableGeneration other_element : other.table_generations) {
        __this__table_generations.add(new TTableGeneration(other_element));
      }
      this.table_generations = __this__table_generations;
    }
    if (other.isSetParent_session_id()) {
      this.parent_session_id = other.parent_session_id;
    }
  }

  public TPendingQuery deepCopy() {
    return new TPendingQuery(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.column_ranges = null;
    this.dictionary_generations = null;
    this.table_generations = null;
    this.parent_session_id = null;
  }

  public long getId() {
    return this.id;
  }

  public TPendingQuery setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getColumn_rangesSize() {
    return (this.column_ranges == null) ? 0 : this.column_ranges.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TColumnRange> getColumn_rangesIterator() {
    return (this.column_ranges == null) ? null : this.column_ranges.iterator();
  }

  public void addToColumn_ranges(TColumnRange elem) {
    if (this.column_ranges == null) {
      this.column_ranges = new java.util.ArrayList<TColumnRange>();
    }
    this.column_ranges.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TColumnRange> getColumn_ranges() {
    return this.column_ranges;
  }

  public TPendingQuery setColumn_ranges(@org.apache.thrift.annotation.Nullable java.util.List<TColumnRange> column_ranges) {
    this.column_ranges = column_ranges;
    return this;
  }

  public void unsetColumn_ranges() {
    this.column_ranges = null;
  }

  /** Returns true if field column_ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetColumn_ranges() {
    return this.column_ranges != null;
  }

  public void setColumn_rangesIsSet(boolean value) {
    if (!value) {
      this.column_ranges = null;
    }
  }

  public int getDictionary_generationsSize() {
    return (this.dictionary_generations == null) ? 0 : this.dictionary_generations.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TDictionaryGeneration> getDictionary_generationsIterator() {
    return (this.dictionary_generations == null) ? null : this.dictionary_generations.iterator();
  }

  public void addToDictionary_generations(TDictionaryGeneration elem) {
    if (this.dictionary_generations == null) {
      this.dictionary_generations = new java.util.ArrayList<TDictionaryGeneration>();
    }
    this.dictionary_generations.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TDictionaryGeneration> getDictionary_generations() {
    return this.dictionary_generations;
  }

  public TPendingQuery setDictionary_generations(@org.apache.thrift.annotation.Nullable java.util.List<TDictionaryGeneration> dictionary_generations) {
    this.dictionary_generations = dictionary_generations;
    return this;
  }

  public void unsetDictionary_generations() {
    this.dictionary_generations = null;
  }

  /** Returns true if field dictionary_generations is set (has been assigned a value) and false otherwise */
  public boolean isSetDictionary_generations() {
    return this.dictionary_generations != null;
  }

  public void setDictionary_generationsIsSet(boolean value) {
    if (!value) {
      this.dictionary_generations = null;
    }
  }

  public int getTable_generationsSize() {
    return (this.table_generations == null) ? 0 : this.table_generations.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTableGeneration> getTable_generationsIterator() {
    return (this.table_generations == null) ? null : this.table_generations.iterator();
  }

  public void addToTable_generations(TTableGeneration elem) {
    if (this.table_generations == null) {
      this.table_generations = new java.util.ArrayList<TTableGeneration>();
    }
    this.table_generations.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTableGeneration> getTable_generations() {
    return this.table_generations;
  }

  public TPendingQuery setTable_generations(@org.apache.thrift.annotation.Nullable java.util.List<TTableGeneration> table_generations) {
    this.table_generations = table_generations;
    return this;
  }

  public void unsetTable_generations() {
    this.table_generations = null;
  }

  /** Returns true if field table_generations is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_generations() {
    return this.table_generations != null;
  }

  public void setTable_generationsIsSet(boolean value) {
    if (!value) {
      this.table_generations = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParent_session_id() {
    return this.parent_session_id;
  }

  public TPendingQuery setParent_session_id(@org.apache.thrift.annotation.Nullable java.lang.String parent_session_id) {
    this.parent_session_id = parent_session_id;
    return this;
  }

  public void unsetParent_session_id() {
    this.parent_session_id = null;
  }

  /** Returns true if field parent_session_id is set (has been assigned a value) and false otherwise */
  public boolean isSetParent_session_id() {
    return this.parent_session_id != null;
  }

  public void setParent_session_idIsSet(boolean value) {
    if (!value) {
      this.parent_session_id = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case COLUMN_RANGES:
      if (value == null) {
        unsetColumn_ranges();
      } else {
        setColumn_ranges((java.util.List<TColumnRange>)value);
      }
      break;

    case DICTIONARY_GENERATIONS:
      if (value == null) {
        unsetDictionary_generations();
      } else {
        setDictionary_generations((java.util.List<TDictionaryGeneration>)value);
      }
      break;

    case TABLE_GENERATIONS:
      if (value == null) {
        unsetTable_generations();
      } else {
        setTable_generations((java.util.List<TTableGeneration>)value);
      }
      break;

    case PARENT_SESSION_ID:
      if (value == null) {
        unsetParent_session_id();
      } else {
        setParent_session_id((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case COLUMN_RANGES:
      return getColumn_ranges();

    case DICTIONARY_GENERATIONS:
      return getDictionary_generations();

    case TABLE_GENERATIONS:
      return getTable_generations();

    case PARENT_SESSION_ID:
      return getParent_session_id();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case COLUMN_RANGES:
      return isSetColumn_ranges();
    case DICTIONARY_GENERATIONS:
      return isSetDictionary_generations();
    case TABLE_GENERATIONS:
      return isSetTable_generations();
    case PARENT_SESSION_ID:
      return isSetParent_session_id();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPendingQuery)
      return this.equals((TPendingQuery)that);
    return false;
  }

  public boolean equals(TPendingQuery that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_column_ranges = true && this.isSetColumn_ranges();
    boolean that_present_column_ranges = true && that.isSetColumn_ranges();
    if (this_present_column_ranges || that_present_column_ranges) {
      if (!(this_present_column_ranges && that_present_column_ranges))
        return false;
      if (!this.column_ranges.equals(that.column_ranges))
        return false;
    }

    boolean this_present_dictionary_generations = true && this.isSetDictionary_generations();
    boolean that_present_dictionary_generations = true && that.isSetDictionary_generations();
    if (this_present_dictionary_generations || that_present_dictionary_generations) {
      if (!(this_present_dictionary_generations && that_present_dictionary_generations))
        return false;
      if (!this.dictionary_generations.equals(that.dictionary_generations))
        return false;
    }

    boolean this_present_table_generations = true && this.isSetTable_generations();
    boolean that_present_table_generations = true && that.isSetTable_generations();
    if (this_present_table_generations || that_present_table_generations) {
      if (!(this_present_table_generations && that_present_table_generations))
        return false;
      if (!this.table_generations.equals(that.table_generations))
        return false;
    }

    boolean this_present_parent_session_id = true && this.isSetParent_session_id();
    boolean that_present_parent_session_id = true && that.isSetParent_session_id();
    if (this_present_parent_session_id || that_present_parent_session_id) {
      if (!(this_present_parent_session_id && that_present_parent_session_id))
        return false;
      if (!this.parent_session_id.equals(that.parent_session_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetColumn_ranges()) ? 131071 : 524287);
    if (isSetColumn_ranges())
      hashCode = hashCode * 8191 + column_ranges.hashCode();

    hashCode = hashCode * 8191 + ((isSetDictionary_generations()) ? 131071 : 524287);
    if (isSetDictionary_generations())
      hashCode = hashCode * 8191 + dictionary_generations.hashCode();

    hashCode = hashCode * 8191 + ((isSetTable_generations()) ? 131071 : 524287);
    if (isSetTable_generations())
      hashCode = hashCode * 8191 + table_generations.hashCode();

    hashCode = hashCode * 8191 + ((isSetParent_session_id()) ? 131071 : 524287);
    if (isSetParent_session_id())
      hashCode = hashCode * 8191 + parent_session_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPendingQuery other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumn_ranges(), other.isSetColumn_ranges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumn_ranges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_ranges, other.column_ranges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDictionary_generations(), other.isSetDictionary_generations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDictionary_generations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dictionary_generations, other.dictionary_generations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTable_generations(), other.isSetTable_generations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_generations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_generations, other.table_generations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetParent_session_id(), other.isSetParent_session_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParent_session_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parent_session_id, other.parent_session_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPendingQuery(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("column_ranges:");
    if (this.column_ranges == null) {
      sb.append("null");
    } else {
      sb.append(this.column_ranges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dictionary_generations:");
    if (this.dictionary_generations == null) {
      sb.append("null");
    } else {
      sb.append(this.dictionary_generations);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("table_generations:");
    if (this.table_generations == null) {
      sb.append("null");
    } else {
      sb.append(this.table_generations);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parent_session_id:");
    if (this.parent_session_id == null) {
      sb.append("null");
    } else {
      sb.append(this.parent_session_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPendingQueryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPendingQueryStandardScheme getScheme() {
      return new TPendingQueryStandardScheme();
    }
  }

  private static class TPendingQueryStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPendingQuery> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPendingQuery struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_RANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list168 = iprot.readListBegin();
                struct.column_ranges = new java.util.ArrayList<TColumnRange>(_list168.size);
                @org.apache.thrift.annotation.Nullable TColumnRange _elem169;
                for (int _i170 = 0; _i170 < _list168.size; ++_i170)
                {
                  _elem169 = new TColumnRange();
                  _elem169.read(iprot);
                  struct.column_ranges.add(_elem169);
                }
                iprot.readListEnd();
              }
              struct.setColumn_rangesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DICTIONARY_GENERATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list171 = iprot.readListBegin();
                struct.dictionary_generations = new java.util.ArrayList<TDictionaryGeneration>(_list171.size);
                @org.apache.thrift.annotation.Nullable TDictionaryGeneration _elem172;
                for (int _i173 = 0; _i173 < _list171.size; ++_i173)
                {
                  _elem172 = new TDictionaryGeneration();
                  _elem172.read(iprot);
                  struct.dictionary_generations.add(_elem172);
                }
                iprot.readListEnd();
              }
              struct.setDictionary_generationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLE_GENERATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list174 = iprot.readListBegin();
                struct.table_generations = new java.util.ArrayList<TTableGeneration>(_list174.size);
                @org.apache.thrift.annotation.Nullable TTableGeneration _elem175;
                for (int _i176 = 0; _i176 < _list174.size; ++_i176)
                {
                  _elem175 = new TTableGeneration();
                  _elem175.read(iprot);
                  struct.table_generations.add(_elem175);
                }
                iprot.readListEnd();
              }
              struct.setTable_generationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARENT_SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parent_session_id = iprot.readString();
              struct.setParent_session_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPendingQuery struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.column_ranges != null) {
        oprot.writeFieldBegin(COLUMN_RANGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.column_ranges.size()));
          for (TColumnRange _iter177 : struct.column_ranges)
          {
            _iter177.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.dictionary_generations != null) {
        oprot.writeFieldBegin(DICTIONARY_GENERATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.dictionary_generations.size()));
          for (TDictionaryGeneration _iter178 : struct.dictionary_generations)
          {
            _iter178.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.table_generations != null) {
        oprot.writeFieldBegin(TABLE_GENERATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.table_generations.size()));
          for (TTableGeneration _iter179 : struct.table_generations)
          {
            _iter179.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.parent_session_id != null) {
        oprot.writeFieldBegin(PARENT_SESSION_ID_FIELD_DESC);
        oprot.writeString(struct.parent_session_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPendingQueryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPendingQueryTupleScheme getScheme() {
      return new TPendingQueryTupleScheme();
    }
  }

  private static class TPendingQueryTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPendingQuery> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPendingQuery struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetColumn_ranges()) {
        optionals.set(1);
      }
      if (struct.isSetDictionary_generations()) {
        optionals.set(2);
      }
      if (struct.isSetTable_generations()) {
        optionals.set(3);
      }
      if (struct.isSetParent_session_id()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetColumn_ranges()) {
        {
          oprot.writeI32(struct.column_ranges.size());
          for (TColumnRange _iter180 : struct.column_ranges)
          {
            _iter180.write(oprot);
          }
        }
      }
      if (struct.isSetDictionary_generations()) {
        {
          oprot.writeI32(struct.dictionary_generations.size());
          for (TDictionaryGeneration _iter181 : struct.dictionary_generations)
          {
            _iter181.write(oprot);
          }
        }
      }
      if (struct.isSetTable_generations()) {
        {
          oprot.writeI32(struct.table_generations.size());
          for (TTableGeneration _iter182 : struct.table_generations)
          {
            _iter182.write(oprot);
          }
        }
      }
      if (struct.isSetParent_session_id()) {
        oprot.writeString(struct.parent_session_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPendingQuery struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list183 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.column_ranges = new java.util.ArrayList<TColumnRange>(_list183.size);
          @org.apache.thrift.annotation.Nullable TColumnRange _elem184;
          for (int _i185 = 0; _i185 < _list183.size; ++_i185)
          {
            _elem184 = new TColumnRange();
            _elem184.read(iprot);
            struct.column_ranges.add(_elem184);
          }
        }
        struct.setColumn_rangesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list186 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.dictionary_generations = new java.util.ArrayList<TDictionaryGeneration>(_list186.size);
          @org.apache.thrift.annotation.Nullable TDictionaryGeneration _elem187;
          for (int _i188 = 0; _i188 < _list186.size; ++_i188)
          {
            _elem187 = new TDictionaryGeneration();
            _elem187.read(iprot);
            struct.dictionary_generations.add(_elem187);
          }
        }
        struct.setDictionary_generationsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list189 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.table_generations = new java.util.ArrayList<TTableGeneration>(_list189.size);
          @org.apache.thrift.annotation.Nullable TTableGeneration _elem190;
          for (int _i191 = 0; _i191 < _list189.size; ++_i191)
          {
            _elem190 = new TTableGeneration();
            _elem190.read(iprot);
            struct.table_generations.add(_elem190);
          }
        }
        struct.setTable_generationsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.parent_session_id = iprot.readString();
        struct.setParent_session_idIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

