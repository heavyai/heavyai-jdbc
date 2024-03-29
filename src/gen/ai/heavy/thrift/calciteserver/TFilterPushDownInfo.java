/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.calciteserver;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TFilterPushDownInfo implements org.apache.thrift.TBase<TFilterPushDownInfo, TFilterPushDownInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TFilterPushDownInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFilterPushDownInfo");

  private static final org.apache.thrift.protocol.TField INPUT_PREV_FIELD_DESC = new org.apache.thrift.protocol.TField("input_prev", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField INPUT_START_FIELD_DESC = new org.apache.thrift.protocol.TField("input_start", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField INPUT_NEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("input_next", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFilterPushDownInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFilterPushDownInfoTupleSchemeFactory();

  public int input_prev; // required
  public int input_start; // required
  public int input_next; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INPUT_PREV((short)1, "input_prev"),
    INPUT_START((short)2, "input_start"),
    INPUT_NEXT((short)3, "input_next");

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
        case 1: // INPUT_PREV
          return INPUT_PREV;
        case 2: // INPUT_START
          return INPUT_START;
        case 3: // INPUT_NEXT
          return INPUT_NEXT;
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
  private static final int __INPUT_PREV_ISSET_ID = 0;
  private static final int __INPUT_START_ISSET_ID = 1;
  private static final int __INPUT_NEXT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INPUT_PREV, new org.apache.thrift.meta_data.FieldMetaData("input_prev", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INPUT_START, new org.apache.thrift.meta_data.FieldMetaData("input_start", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INPUT_NEXT, new org.apache.thrift.meta_data.FieldMetaData("input_next", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFilterPushDownInfo.class, metaDataMap);
  }

  public TFilterPushDownInfo() {
  }

  public TFilterPushDownInfo(
    int input_prev,
    int input_start,
    int input_next)
  {
    this();
    this.input_prev = input_prev;
    setInput_prevIsSet(true);
    this.input_start = input_start;
    setInput_startIsSet(true);
    this.input_next = input_next;
    setInput_nextIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFilterPushDownInfo(TFilterPushDownInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.input_prev = other.input_prev;
    this.input_start = other.input_start;
    this.input_next = other.input_next;
  }

  public TFilterPushDownInfo deepCopy() {
    return new TFilterPushDownInfo(this);
  }

  @Override
  public void clear() {
    setInput_prevIsSet(false);
    this.input_prev = 0;
    setInput_startIsSet(false);
    this.input_start = 0;
    setInput_nextIsSet(false);
    this.input_next = 0;
  }

  public int getInput_prev() {
    return this.input_prev;
  }

  public TFilterPushDownInfo setInput_prev(int input_prev) {
    this.input_prev = input_prev;
    setInput_prevIsSet(true);
    return this;
  }

  public void unsetInput_prev() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INPUT_PREV_ISSET_ID);
  }

  /** Returns true if field input_prev is set (has been assigned a value) and false otherwise */
  public boolean isSetInput_prev() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INPUT_PREV_ISSET_ID);
  }

  public void setInput_prevIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INPUT_PREV_ISSET_ID, value);
  }

  public int getInput_start() {
    return this.input_start;
  }

  public TFilterPushDownInfo setInput_start(int input_start) {
    this.input_start = input_start;
    setInput_startIsSet(true);
    return this;
  }

  public void unsetInput_start() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INPUT_START_ISSET_ID);
  }

  /** Returns true if field input_start is set (has been assigned a value) and false otherwise */
  public boolean isSetInput_start() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INPUT_START_ISSET_ID);
  }

  public void setInput_startIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INPUT_START_ISSET_ID, value);
  }

  public int getInput_next() {
    return this.input_next;
  }

  public TFilterPushDownInfo setInput_next(int input_next) {
    this.input_next = input_next;
    setInput_nextIsSet(true);
    return this;
  }

  public void unsetInput_next() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INPUT_NEXT_ISSET_ID);
  }

  /** Returns true if field input_next is set (has been assigned a value) and false otherwise */
  public boolean isSetInput_next() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INPUT_NEXT_ISSET_ID);
  }

  public void setInput_nextIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INPUT_NEXT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INPUT_PREV:
      if (value == null) {
        unsetInput_prev();
      } else {
        setInput_prev((java.lang.Integer)value);
      }
      break;

    case INPUT_START:
      if (value == null) {
        unsetInput_start();
      } else {
        setInput_start((java.lang.Integer)value);
      }
      break;

    case INPUT_NEXT:
      if (value == null) {
        unsetInput_next();
      } else {
        setInput_next((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INPUT_PREV:
      return getInput_prev();

    case INPUT_START:
      return getInput_start();

    case INPUT_NEXT:
      return getInput_next();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INPUT_PREV:
      return isSetInput_prev();
    case INPUT_START:
      return isSetInput_start();
    case INPUT_NEXT:
      return isSetInput_next();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFilterPushDownInfo)
      return this.equals((TFilterPushDownInfo)that);
    return false;
  }

  public boolean equals(TFilterPushDownInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_input_prev = true;
    boolean that_present_input_prev = true;
    if (this_present_input_prev || that_present_input_prev) {
      if (!(this_present_input_prev && that_present_input_prev))
        return false;
      if (this.input_prev != that.input_prev)
        return false;
    }

    boolean this_present_input_start = true;
    boolean that_present_input_start = true;
    if (this_present_input_start || that_present_input_start) {
      if (!(this_present_input_start && that_present_input_start))
        return false;
      if (this.input_start != that.input_start)
        return false;
    }

    boolean this_present_input_next = true;
    boolean that_present_input_next = true;
    if (this_present_input_next || that_present_input_next) {
      if (!(this_present_input_next && that_present_input_next))
        return false;
      if (this.input_next != that.input_next)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + input_prev;

    hashCode = hashCode * 8191 + input_start;

    hashCode = hashCode * 8191 + input_next;

    return hashCode;
  }

  @Override
  public int compareTo(TFilterPushDownInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetInput_prev(), other.isSetInput_prev());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInput_prev()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.input_prev, other.input_prev);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInput_start(), other.isSetInput_start());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInput_start()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.input_start, other.input_start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInput_next(), other.isSetInput_next());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInput_next()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.input_next, other.input_next);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFilterPushDownInfo(");
    boolean first = true;

    sb.append("input_prev:");
    sb.append(this.input_prev);
    first = false;
    if (!first) sb.append(", ");
    sb.append("input_start:");
    sb.append(this.input_start);
    first = false;
    if (!first) sb.append(", ");
    sb.append("input_next:");
    sb.append(this.input_next);
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

  private static class TFilterPushDownInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFilterPushDownInfoStandardScheme getScheme() {
      return new TFilterPushDownInfoStandardScheme();
    }
  }

  private static class TFilterPushDownInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFilterPushDownInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFilterPushDownInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INPUT_PREV
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.input_prev = iprot.readI32();
              struct.setInput_prevIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INPUT_START
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.input_start = iprot.readI32();
              struct.setInput_startIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INPUT_NEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.input_next = iprot.readI32();
              struct.setInput_nextIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFilterPushDownInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INPUT_PREV_FIELD_DESC);
      oprot.writeI32(struct.input_prev);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INPUT_START_FIELD_DESC);
      oprot.writeI32(struct.input_start);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INPUT_NEXT_FIELD_DESC);
      oprot.writeI32(struct.input_next);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFilterPushDownInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFilterPushDownInfoTupleScheme getScheme() {
      return new TFilterPushDownInfoTupleScheme();
    }
  }

  private static class TFilterPushDownInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFilterPushDownInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFilterPushDownInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInput_prev()) {
        optionals.set(0);
      }
      if (struct.isSetInput_start()) {
        optionals.set(1);
      }
      if (struct.isSetInput_next()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetInput_prev()) {
        oprot.writeI32(struct.input_prev);
      }
      if (struct.isSetInput_start()) {
        oprot.writeI32(struct.input_start);
      }
      if (struct.isSetInput_next()) {
        oprot.writeI32(struct.input_next);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFilterPushDownInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.input_prev = iprot.readI32();
        struct.setInput_prevIsSet(true);
      }
      if (incoming.get(1)) {
        struct.input_start = iprot.readI32();
        struct.setInput_startIsSet(true);
      }
      if (incoming.get(2)) {
        struct.input_next = iprot.readI32();
        struct.setInput_nextIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

