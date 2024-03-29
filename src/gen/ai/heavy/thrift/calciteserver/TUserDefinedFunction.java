/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.calciteserver;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TUserDefinedFunction implements org.apache.thrift.TBase<TUserDefinedFunction, TUserDefinedFunction._Fields>, java.io.Serializable, Cloneable, Comparable<TUserDefinedFunction> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUserDefinedFunction");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ARG_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("argTypes", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField RET_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("retType", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TUserDefinedFunctionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TUserDefinedFunctionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TExtArgumentType> argTypes; // required
  /**
   * 
   * @see TExtArgumentType
   */
  public @org.apache.thrift.annotation.Nullable TExtArgumentType retType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    ARG_TYPES((short)2, "argTypes"),
    /**
     * 
     * @see TExtArgumentType
     */
    RET_TYPE((short)3, "retType");

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
        case 1: // NAME
          return NAME;
        case 2: // ARG_TYPES
          return ARG_TYPES;
        case 3: // RET_TYPE
          return RET_TYPE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARG_TYPES, new org.apache.thrift.meta_data.FieldMetaData("argTypes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TExtArgumentType.class))));
    tmpMap.put(_Fields.RET_TYPE, new org.apache.thrift.meta_data.FieldMetaData("retType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TExtArgumentType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUserDefinedFunction.class, metaDataMap);
  }

  public TUserDefinedFunction() {
  }

  public TUserDefinedFunction(
    java.lang.String name,
    java.util.List<TExtArgumentType> argTypes,
    TExtArgumentType retType)
  {
    this();
    this.name = name;
    this.argTypes = argTypes;
    this.retType = retType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUserDefinedFunction(TUserDefinedFunction other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetArgTypes()) {
      java.util.List<TExtArgumentType> __this__argTypes = new java.util.ArrayList<TExtArgumentType>(other.argTypes.size());
      for (TExtArgumentType other_element : other.argTypes) {
        __this__argTypes.add(other_element);
      }
      this.argTypes = __this__argTypes;
    }
    if (other.isSetRetType()) {
      this.retType = other.retType;
    }
  }

  public TUserDefinedFunction deepCopy() {
    return new TUserDefinedFunction(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.argTypes = null;
    this.retType = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public TUserDefinedFunction setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getArgTypesSize() {
    return (this.argTypes == null) ? 0 : this.argTypes.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TExtArgumentType> getArgTypesIterator() {
    return (this.argTypes == null) ? null : this.argTypes.iterator();
  }

  public void addToArgTypes(TExtArgumentType elem) {
    if (this.argTypes == null) {
      this.argTypes = new java.util.ArrayList<TExtArgumentType>();
    }
    this.argTypes.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TExtArgumentType> getArgTypes() {
    return this.argTypes;
  }

  public TUserDefinedFunction setArgTypes(@org.apache.thrift.annotation.Nullable java.util.List<TExtArgumentType> argTypes) {
    this.argTypes = argTypes;
    return this;
  }

  public void unsetArgTypes() {
    this.argTypes = null;
  }

  /** Returns true if field argTypes is set (has been assigned a value) and false otherwise */
  public boolean isSetArgTypes() {
    return this.argTypes != null;
  }

  public void setArgTypesIsSet(boolean value) {
    if (!value) {
      this.argTypes = null;
    }
  }

  /**
   * 
   * @see TExtArgumentType
   */
  @org.apache.thrift.annotation.Nullable
  public TExtArgumentType getRetType() {
    return this.retType;
  }

  /**
   * 
   * @see TExtArgumentType
   */
  public TUserDefinedFunction setRetType(@org.apache.thrift.annotation.Nullable TExtArgumentType retType) {
    this.retType = retType;
    return this;
  }

  public void unsetRetType() {
    this.retType = null;
  }

  /** Returns true if field retType is set (has been assigned a value) and false otherwise */
  public boolean isSetRetType() {
    return this.retType != null;
  }

  public void setRetTypeIsSet(boolean value) {
    if (!value) {
      this.retType = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case ARG_TYPES:
      if (value == null) {
        unsetArgTypes();
      } else {
        setArgTypes((java.util.List<TExtArgumentType>)value);
      }
      break;

    case RET_TYPE:
      if (value == null) {
        unsetRetType();
      } else {
        setRetType((TExtArgumentType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case ARG_TYPES:
      return getArgTypes();

    case RET_TYPE:
      return getRetType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case ARG_TYPES:
      return isSetArgTypes();
    case RET_TYPE:
      return isSetRetType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUserDefinedFunction)
      return this.equals((TUserDefinedFunction)that);
    return false;
  }

  public boolean equals(TUserDefinedFunction that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_argTypes = true && this.isSetArgTypes();
    boolean that_present_argTypes = true && that.isSetArgTypes();
    if (this_present_argTypes || that_present_argTypes) {
      if (!(this_present_argTypes && that_present_argTypes))
        return false;
      if (!this.argTypes.equals(that.argTypes))
        return false;
    }

    boolean this_present_retType = true && this.isSetRetType();
    boolean that_present_retType = true && that.isSetRetType();
    if (this_present_retType || that_present_retType) {
      if (!(this_present_retType && that_present_retType))
        return false;
      if (!this.retType.equals(that.retType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetArgTypes()) ? 131071 : 524287);
    if (isSetArgTypes())
      hashCode = hashCode * 8191 + argTypes.hashCode();

    hashCode = hashCode * 8191 + ((isSetRetType()) ? 131071 : 524287);
    if (isSetRetType())
      hashCode = hashCode * 8191 + retType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TUserDefinedFunction other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetArgTypes(), other.isSetArgTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgTypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argTypes, other.argTypes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRetType(), other.isSetRetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retType, other.retType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUserDefinedFunction(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("argTypes:");
    if (this.argTypes == null) {
      sb.append("null");
    } else {
      sb.append(this.argTypes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("retType:");
    if (this.retType == null) {
      sb.append("null");
    } else {
      sb.append(this.retType);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUserDefinedFunctionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TUserDefinedFunctionStandardScheme getScheme() {
      return new TUserDefinedFunctionStandardScheme();
    }
  }

  private static class TUserDefinedFunctionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TUserDefinedFunction> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUserDefinedFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ARG_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.argTypes = new java.util.ArrayList<TExtArgumentType>(_list0.size);
                @org.apache.thrift.annotation.Nullable TExtArgumentType _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = ai.heavy.thrift.calciteserver.TExtArgumentType.findByValue(iprot.readI32());
                  if (_elem1 != null)
                  {
                    struct.argTypes.add(_elem1);
                  }
                }
                iprot.readListEnd();
              }
              struct.setArgTypesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RET_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.retType = ai.heavy.thrift.calciteserver.TExtArgumentType.findByValue(iprot.readI32());
              struct.setRetTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUserDefinedFunction struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.argTypes != null) {
        oprot.writeFieldBegin(ARG_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.argTypes.size()));
          for (TExtArgumentType _iter3 : struct.argTypes)
          {
            oprot.writeI32(_iter3.getValue());
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.retType != null) {
        oprot.writeFieldBegin(RET_TYPE_FIELD_DESC);
        oprot.writeI32(struct.retType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUserDefinedFunctionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TUserDefinedFunctionTupleScheme getScheme() {
      return new TUserDefinedFunctionTupleScheme();
    }
  }

  private static class TUserDefinedFunctionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TUserDefinedFunction> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUserDefinedFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetArgTypes()) {
        optionals.set(1);
      }
      if (struct.isSetRetType()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetArgTypes()) {
        {
          oprot.writeI32(struct.argTypes.size());
          for (TExtArgumentType _iter4 : struct.argTypes)
          {
            oprot.writeI32(_iter4.getValue());
          }
        }
      }
      if (struct.isSetRetType()) {
        oprot.writeI32(struct.retType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUserDefinedFunction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
          struct.argTypes = new java.util.ArrayList<TExtArgumentType>(_list5.size);
          @org.apache.thrift.annotation.Nullable TExtArgumentType _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = ai.heavy.thrift.calciteserver.TExtArgumentType.findByValue(iprot.readI32());
            if (_elem6 != null)
            {
              struct.argTypes.add(_elem6);
            }
          }
        }
        struct.setArgTypesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.retType = ai.heavy.thrift.calciteserver.TExtArgumentType.findByValue(iprot.readI32());
        struct.setRetTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

