/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TLeafInfo implements org.apache.thrift.TBase<TLeafInfo, TLeafInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TLeafInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLeafInfo");

  private static final org.apache.thrift.protocol.TField LEAF_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("leaf_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_LEAVES_FIELD_DESC = new org.apache.thrift.protocol.TField("num_leaves", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TLeafInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TLeafInfoTupleSchemeFactory();

  public int leaf_id; // required
  public int num_leaves; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LEAF_ID((short)1, "leaf_id"),
    NUM_LEAVES((short)2, "num_leaves");

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
        case 1: // LEAF_ID
          return LEAF_ID;
        case 2: // NUM_LEAVES
          return NUM_LEAVES;
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
  private static final int __LEAF_ID_ISSET_ID = 0;
  private static final int __NUM_LEAVES_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LEAF_ID, new org.apache.thrift.meta_data.FieldMetaData("leaf_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_LEAVES, new org.apache.thrift.meta_data.FieldMetaData("num_leaves", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLeafInfo.class, metaDataMap);
  }

  public TLeafInfo() {
  }

  public TLeafInfo(
    int leaf_id,
    int num_leaves)
  {
    this();
    this.leaf_id = leaf_id;
    setLeaf_idIsSet(true);
    this.num_leaves = num_leaves;
    setNum_leavesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLeafInfo(TLeafInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.leaf_id = other.leaf_id;
    this.num_leaves = other.num_leaves;
  }

  public TLeafInfo deepCopy() {
    return new TLeafInfo(this);
  }

  @Override
  public void clear() {
    setLeaf_idIsSet(false);
    this.leaf_id = 0;
    setNum_leavesIsSet(false);
    this.num_leaves = 0;
  }

  public int getLeaf_id() {
    return this.leaf_id;
  }

  public TLeafInfo setLeaf_id(int leaf_id) {
    this.leaf_id = leaf_id;
    setLeaf_idIsSet(true);
    return this;
  }

  public void unsetLeaf_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LEAF_ID_ISSET_ID);
  }

  /** Returns true if field leaf_id is set (has been assigned a value) and false otherwise */
  public boolean isSetLeaf_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LEAF_ID_ISSET_ID);
  }

  public void setLeaf_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LEAF_ID_ISSET_ID, value);
  }

  public int getNum_leaves() {
    return this.num_leaves;
  }

  public TLeafInfo setNum_leaves(int num_leaves) {
    this.num_leaves = num_leaves;
    setNum_leavesIsSet(true);
    return this;
  }

  public void unsetNum_leaves() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_LEAVES_ISSET_ID);
  }

  /** Returns true if field num_leaves is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_leaves() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_LEAVES_ISSET_ID);
  }

  public void setNum_leavesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_LEAVES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LEAF_ID:
      if (value == null) {
        unsetLeaf_id();
      } else {
        setLeaf_id((java.lang.Integer)value);
      }
      break;

    case NUM_LEAVES:
      if (value == null) {
        unsetNum_leaves();
      } else {
        setNum_leaves((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LEAF_ID:
      return getLeaf_id();

    case NUM_LEAVES:
      return getNum_leaves();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LEAF_ID:
      return isSetLeaf_id();
    case NUM_LEAVES:
      return isSetNum_leaves();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TLeafInfo)
      return this.equals((TLeafInfo)that);
    return false;
  }

  public boolean equals(TLeafInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_leaf_id = true;
    boolean that_present_leaf_id = true;
    if (this_present_leaf_id || that_present_leaf_id) {
      if (!(this_present_leaf_id && that_present_leaf_id))
        return false;
      if (this.leaf_id != that.leaf_id)
        return false;
    }

    boolean this_present_num_leaves = true;
    boolean that_present_num_leaves = true;
    if (this_present_num_leaves || that_present_num_leaves) {
      if (!(this_present_num_leaves && that_present_num_leaves))
        return false;
      if (this.num_leaves != that.num_leaves)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + leaf_id;

    hashCode = hashCode * 8191 + num_leaves;

    return hashCode;
  }

  @Override
  public int compareTo(TLeafInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetLeaf_id(), other.isSetLeaf_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeaf_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leaf_id, other.leaf_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNum_leaves(), other.isSetNum_leaves());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_leaves()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_leaves, other.num_leaves);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TLeafInfo(");
    boolean first = true;

    sb.append("leaf_id:");
    sb.append(this.leaf_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_leaves:");
    sb.append(this.num_leaves);
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

  private static class TLeafInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TLeafInfoStandardScheme getScheme() {
      return new TLeafInfoStandardScheme();
    }
  }

  private static class TLeafInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TLeafInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLeafInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LEAF_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.leaf_id = iprot.readI32();
              struct.setLeaf_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_LEAVES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_leaves = iprot.readI32();
              struct.setNum_leavesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLeafInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LEAF_ID_FIELD_DESC);
      oprot.writeI32(struct.leaf_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_LEAVES_FIELD_DESC);
      oprot.writeI32(struct.num_leaves);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLeafInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TLeafInfoTupleScheme getScheme() {
      return new TLeafInfoTupleScheme();
    }
  }

  private static class TLeafInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TLeafInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLeafInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLeaf_id()) {
        optionals.set(0);
      }
      if (struct.isSetNum_leaves()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLeaf_id()) {
        oprot.writeI32(struct.leaf_id);
      }
      if (struct.isSetNum_leaves()) {
        oprot.writeI32(struct.num_leaves);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLeafInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.leaf_id = iprot.readI32();
        struct.setLeaf_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.num_leaves = iprot.readI32();
        struct.setNum_leavesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

