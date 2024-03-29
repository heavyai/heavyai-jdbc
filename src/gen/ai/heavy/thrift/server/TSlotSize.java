/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TSlotSize implements org.apache.thrift.TBase<TSlotSize, TSlotSize._Fields>, java.io.Serializable, Cloneable, Comparable<TSlotSize> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSlotSize");

  private static final org.apache.thrift.protocol.TField PADDED_FIELD_DESC = new org.apache.thrift.protocol.TField("padded", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField LOGICAL_FIELD_DESC = new org.apache.thrift.protocol.TField("logical", org.apache.thrift.protocol.TType.I16, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSlotSizeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSlotSizeTupleSchemeFactory();

  public short padded; // required
  public short logical; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PADDED((short)1, "padded"),
    LOGICAL((short)2, "logical");

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
        case 1: // PADDED
          return PADDED;
        case 2: // LOGICAL
          return LOGICAL;
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
  private static final int __PADDED_ISSET_ID = 0;
  private static final int __LOGICAL_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PADDED, new org.apache.thrift.meta_data.FieldMetaData("padded", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.LOGICAL, new org.apache.thrift.meta_data.FieldMetaData("logical", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSlotSize.class, metaDataMap);
  }

  public TSlotSize() {
  }

  public TSlotSize(
    short padded,
    short logical)
  {
    this();
    this.padded = padded;
    setPaddedIsSet(true);
    this.logical = logical;
    setLogicalIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSlotSize(TSlotSize other) {
    __isset_bitfield = other.__isset_bitfield;
    this.padded = other.padded;
    this.logical = other.logical;
  }

  public TSlotSize deepCopy() {
    return new TSlotSize(this);
  }

  @Override
  public void clear() {
    setPaddedIsSet(false);
    this.padded = 0;
    setLogicalIsSet(false);
    this.logical = 0;
  }

  public short getPadded() {
    return this.padded;
  }

  public TSlotSize setPadded(short padded) {
    this.padded = padded;
    setPaddedIsSet(true);
    return this;
  }

  public void unsetPadded() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PADDED_ISSET_ID);
  }

  /** Returns true if field padded is set (has been assigned a value) and false otherwise */
  public boolean isSetPadded() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PADDED_ISSET_ID);
  }

  public void setPaddedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PADDED_ISSET_ID, value);
  }

  public short getLogical() {
    return this.logical;
  }

  public TSlotSize setLogical(short logical) {
    this.logical = logical;
    setLogicalIsSet(true);
    return this;
  }

  public void unsetLogical() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LOGICAL_ISSET_ID);
  }

  /** Returns true if field logical is set (has been assigned a value) and false otherwise */
  public boolean isSetLogical() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LOGICAL_ISSET_ID);
  }

  public void setLogicalIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LOGICAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PADDED:
      if (value == null) {
        unsetPadded();
      } else {
        setPadded((java.lang.Short)value);
      }
      break;

    case LOGICAL:
      if (value == null) {
        unsetLogical();
      } else {
        setLogical((java.lang.Short)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PADDED:
      return getPadded();

    case LOGICAL:
      return getLogical();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PADDED:
      return isSetPadded();
    case LOGICAL:
      return isSetLogical();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSlotSize)
      return this.equals((TSlotSize)that);
    return false;
  }

  public boolean equals(TSlotSize that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_padded = true;
    boolean that_present_padded = true;
    if (this_present_padded || that_present_padded) {
      if (!(this_present_padded && that_present_padded))
        return false;
      if (this.padded != that.padded)
        return false;
    }

    boolean this_present_logical = true;
    boolean that_present_logical = true;
    if (this_present_logical || that_present_logical) {
      if (!(this_present_logical && that_present_logical))
        return false;
      if (this.logical != that.logical)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + padded;

    hashCode = hashCode * 8191 + logical;

    return hashCode;
  }

  @Override
  public int compareTo(TSlotSize other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPadded(), other.isSetPadded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPadded()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.padded, other.padded);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLogical(), other.isSetLogical());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogical()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logical, other.logical);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSlotSize(");
    boolean first = true;

    sb.append("padded:");
    sb.append(this.padded);
    first = false;
    if (!first) sb.append(", ");
    sb.append("logical:");
    sb.append(this.logical);
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

  private static class TSlotSizeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSlotSizeStandardScheme getScheme() {
      return new TSlotSizeStandardScheme();
    }
  }

  private static class TSlotSizeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSlotSize> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSlotSize struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PADDED
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.padded = iprot.readI16();
              struct.setPaddedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOGICAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.logical = iprot.readI16();
              struct.setLogicalIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSlotSize struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PADDED_FIELD_DESC);
      oprot.writeI16(struct.padded);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOGICAL_FIELD_DESC);
      oprot.writeI16(struct.logical);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSlotSizeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSlotSizeTupleScheme getScheme() {
      return new TSlotSizeTupleScheme();
    }
  }

  private static class TSlotSizeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSlotSize> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSlotSize struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPadded()) {
        optionals.set(0);
      }
      if (struct.isSetLogical()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPadded()) {
        oprot.writeI16(struct.padded);
      }
      if (struct.isSetLogical()) {
        oprot.writeI16(struct.logical);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSlotSize struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.padded = iprot.readI16();
        struct.setPaddedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.logical = iprot.readI16();
        struct.setLogicalIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

