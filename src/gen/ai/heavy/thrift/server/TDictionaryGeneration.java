/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDictionaryGeneration implements org.apache.thrift.TBase<TDictionaryGeneration, TDictionaryGeneration._Fields>, java.io.Serializable, Cloneable, Comparable<TDictionaryGeneration> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDictionaryGeneration");

  private static final org.apache.thrift.protocol.TField DICT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dict_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ENTRY_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("entry_count", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDictionaryGenerationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDictionaryGenerationTupleSchemeFactory();

  public int dict_id; // required
  public long entry_count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DICT_ID((short)1, "dict_id"),
    ENTRY_COUNT((short)2, "entry_count");

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
        case 1: // DICT_ID
          return DICT_ID;
        case 2: // ENTRY_COUNT
          return ENTRY_COUNT;
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
  private static final int __DICT_ID_ISSET_ID = 0;
  private static final int __ENTRY_COUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DICT_ID, new org.apache.thrift.meta_data.FieldMetaData("dict_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ENTRY_COUNT, new org.apache.thrift.meta_data.FieldMetaData("entry_count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDictionaryGeneration.class, metaDataMap);
  }

  public TDictionaryGeneration() {
  }

  public TDictionaryGeneration(
    int dict_id,
    long entry_count)
  {
    this();
    this.dict_id = dict_id;
    setDict_idIsSet(true);
    this.entry_count = entry_count;
    setEntry_countIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDictionaryGeneration(TDictionaryGeneration other) {
    __isset_bitfield = other.__isset_bitfield;
    this.dict_id = other.dict_id;
    this.entry_count = other.entry_count;
  }

  public TDictionaryGeneration deepCopy() {
    return new TDictionaryGeneration(this);
  }

  @Override
  public void clear() {
    setDict_idIsSet(false);
    this.dict_id = 0;
    setEntry_countIsSet(false);
    this.entry_count = 0;
  }

  public int getDict_id() {
    return this.dict_id;
  }

  public TDictionaryGeneration setDict_id(int dict_id) {
    this.dict_id = dict_id;
    setDict_idIsSet(true);
    return this;
  }

  public void unsetDict_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DICT_ID_ISSET_ID);
  }

  /** Returns true if field dict_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDict_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DICT_ID_ISSET_ID);
  }

  public void setDict_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DICT_ID_ISSET_ID, value);
  }

  public long getEntry_count() {
    return this.entry_count;
  }

  public TDictionaryGeneration setEntry_count(long entry_count) {
    this.entry_count = entry_count;
    setEntry_countIsSet(true);
    return this;
  }

  public void unsetEntry_count() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENTRY_COUNT_ISSET_ID);
  }

  /** Returns true if field entry_count is set (has been assigned a value) and false otherwise */
  public boolean isSetEntry_count() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENTRY_COUNT_ISSET_ID);
  }

  public void setEntry_countIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENTRY_COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DICT_ID:
      if (value == null) {
        unsetDict_id();
      } else {
        setDict_id((java.lang.Integer)value);
      }
      break;

    case ENTRY_COUNT:
      if (value == null) {
        unsetEntry_count();
      } else {
        setEntry_count((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DICT_ID:
      return getDict_id();

    case ENTRY_COUNT:
      return getEntry_count();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DICT_ID:
      return isSetDict_id();
    case ENTRY_COUNT:
      return isSetEntry_count();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TDictionaryGeneration)
      return this.equals((TDictionaryGeneration)that);
    return false;
  }

  public boolean equals(TDictionaryGeneration that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_dict_id = true;
    boolean that_present_dict_id = true;
    if (this_present_dict_id || that_present_dict_id) {
      if (!(this_present_dict_id && that_present_dict_id))
        return false;
      if (this.dict_id != that.dict_id)
        return false;
    }

    boolean this_present_entry_count = true;
    boolean that_present_entry_count = true;
    if (this_present_entry_count || that_present_entry_count) {
      if (!(this_present_entry_count && that_present_entry_count))
        return false;
      if (this.entry_count != that.entry_count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + dict_id;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(entry_count);

    return hashCode;
  }

  @Override
  public int compareTo(TDictionaryGeneration other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDict_id(), other.isSetDict_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDict_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dict_id, other.dict_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEntry_count(), other.isSetEntry_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntry_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entry_count, other.entry_count);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDictionaryGeneration(");
    boolean first = true;

    sb.append("dict_id:");
    sb.append(this.dict_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("entry_count:");
    sb.append(this.entry_count);
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

  private static class TDictionaryGenerationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDictionaryGenerationStandardScheme getScheme() {
      return new TDictionaryGenerationStandardScheme();
    }
  }

  private static class TDictionaryGenerationStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDictionaryGeneration> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDictionaryGeneration struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DICT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dict_id = iprot.readI32();
              struct.setDict_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENTRY_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.entry_count = iprot.readI64();
              struct.setEntry_countIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDictionaryGeneration struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DICT_ID_FIELD_DESC);
      oprot.writeI32(struct.dict_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ENTRY_COUNT_FIELD_DESC);
      oprot.writeI64(struct.entry_count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDictionaryGenerationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDictionaryGenerationTupleScheme getScheme() {
      return new TDictionaryGenerationTupleScheme();
    }
  }

  private static class TDictionaryGenerationTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDictionaryGeneration> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDictionaryGeneration struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDict_id()) {
        optionals.set(0);
      }
      if (struct.isSetEntry_count()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDict_id()) {
        oprot.writeI32(struct.dict_id);
      }
      if (struct.isSetEntry_count()) {
        oprot.writeI64(struct.entry_count);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDictionaryGeneration struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.dict_id = iprot.readI32();
        struct.setDict_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.entry_count = iprot.readI64();
        struct.setEntry_countIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

