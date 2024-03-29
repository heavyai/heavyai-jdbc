/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TDashboardPermissions implements org.apache.thrift.TBase<TDashboardPermissions, TDashboardPermissions._Fields>, java.io.Serializable, Cloneable, Comparable<TDashboardPermissions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDashboardPermissions");

  private static final org.apache.thrift.protocol.TField CREATE__FIELD_DESC = new org.apache.thrift.protocol.TField("create_", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField DELETE__FIELD_DESC = new org.apache.thrift.protocol.TField("delete_", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField VIEW__FIELD_DESC = new org.apache.thrift.protocol.TField("view_", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField EDIT__FIELD_DESC = new org.apache.thrift.protocol.TField("edit_", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDashboardPermissionsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDashboardPermissionsTupleSchemeFactory();

  public boolean create_; // required
  public boolean delete_; // required
  public boolean view_; // required
  public boolean edit_; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CREATE_((short)1, "create_"),
    DELETE_((short)2, "delete_"),
    VIEW_((short)3, "view_"),
    EDIT_((short)4, "edit_");

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
        case 1: // CREATE_
          return CREATE_;
        case 2: // DELETE_
          return DELETE_;
        case 3: // VIEW_
          return VIEW_;
        case 4: // EDIT_
          return EDIT_;
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
  private static final int __CREATE__ISSET_ID = 0;
  private static final int __DELETE__ISSET_ID = 1;
  private static final int __VIEW__ISSET_ID = 2;
  private static final int __EDIT__ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CREATE_, new org.apache.thrift.meta_data.FieldMetaData("create_", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DELETE_, new org.apache.thrift.meta_data.FieldMetaData("delete_", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VIEW_, new org.apache.thrift.meta_data.FieldMetaData("view_", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.EDIT_, new org.apache.thrift.meta_data.FieldMetaData("edit_", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDashboardPermissions.class, metaDataMap);
  }

  public TDashboardPermissions() {
  }

  public TDashboardPermissions(
    boolean create_,
    boolean delete_,
    boolean view_,
    boolean edit_)
  {
    this();
    this.create_ = create_;
    setCreate_IsSet(true);
    this.delete_ = delete_;
    setDelete_IsSet(true);
    this.view_ = view_;
    setView_IsSet(true);
    this.edit_ = edit_;
    setEdit_IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDashboardPermissions(TDashboardPermissions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.create_ = other.create_;
    this.delete_ = other.delete_;
    this.view_ = other.view_;
    this.edit_ = other.edit_;
  }

  public TDashboardPermissions deepCopy() {
    return new TDashboardPermissions(this);
  }

  @Override
  public void clear() {
    setCreate_IsSet(false);
    this.create_ = false;
    setDelete_IsSet(false);
    this.delete_ = false;
    setView_IsSet(false);
    this.view_ = false;
    setEdit_IsSet(false);
    this.edit_ = false;
  }

  public boolean isCreate_() {
    return this.create_;
  }

  public TDashboardPermissions setCreate_(boolean create_) {
    this.create_ = create_;
    setCreate_IsSet(true);
    return this;
  }

  public void unsetCreate_() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATE__ISSET_ID);
  }

  /** Returns true if field create_ is set (has been assigned a value) and false otherwise */
  public boolean isSetCreate_() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATE__ISSET_ID);
  }

  public void setCreate_IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATE__ISSET_ID, value);
  }

  public boolean isDelete_() {
    return this.delete_;
  }

  public TDashboardPermissions setDelete_(boolean delete_) {
    this.delete_ = delete_;
    setDelete_IsSet(true);
    return this;
  }

  public void unsetDelete_() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DELETE__ISSET_ID);
  }

  /** Returns true if field delete_ is set (has been assigned a value) and false otherwise */
  public boolean isSetDelete_() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DELETE__ISSET_ID);
  }

  public void setDelete_IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DELETE__ISSET_ID, value);
  }

  public boolean isView_() {
    return this.view_;
  }

  public TDashboardPermissions setView_(boolean view_) {
    this.view_ = view_;
    setView_IsSet(true);
    return this;
  }

  public void unsetView_() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VIEW__ISSET_ID);
  }

  /** Returns true if field view_ is set (has been assigned a value) and false otherwise */
  public boolean isSetView_() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VIEW__ISSET_ID);
  }

  public void setView_IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VIEW__ISSET_ID, value);
  }

  public boolean isEdit_() {
    return this.edit_;
  }

  public TDashboardPermissions setEdit_(boolean edit_) {
    this.edit_ = edit_;
    setEdit_IsSet(true);
    return this;
  }

  public void unsetEdit_() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EDIT__ISSET_ID);
  }

  /** Returns true if field edit_ is set (has been assigned a value) and false otherwise */
  public boolean isSetEdit_() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EDIT__ISSET_ID);
  }

  public void setEdit_IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EDIT__ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CREATE_:
      if (value == null) {
        unsetCreate_();
      } else {
        setCreate_((java.lang.Boolean)value);
      }
      break;

    case DELETE_:
      if (value == null) {
        unsetDelete_();
      } else {
        setDelete_((java.lang.Boolean)value);
      }
      break;

    case VIEW_:
      if (value == null) {
        unsetView_();
      } else {
        setView_((java.lang.Boolean)value);
      }
      break;

    case EDIT_:
      if (value == null) {
        unsetEdit_();
      } else {
        setEdit_((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATE_:
      return isCreate_();

    case DELETE_:
      return isDelete_();

    case VIEW_:
      return isView_();

    case EDIT_:
      return isEdit_();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CREATE_:
      return isSetCreate_();
    case DELETE_:
      return isSetDelete_();
    case VIEW_:
      return isSetView_();
    case EDIT_:
      return isSetEdit_();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TDashboardPermissions)
      return this.equals((TDashboardPermissions)that);
    return false;
  }

  public boolean equals(TDashboardPermissions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_create_ = true;
    boolean that_present_create_ = true;
    if (this_present_create_ || that_present_create_) {
      if (!(this_present_create_ && that_present_create_))
        return false;
      if (this.create_ != that.create_)
        return false;
    }

    boolean this_present_delete_ = true;
    boolean that_present_delete_ = true;
    if (this_present_delete_ || that_present_delete_) {
      if (!(this_present_delete_ && that_present_delete_))
        return false;
      if (this.delete_ != that.delete_)
        return false;
    }

    boolean this_present_view_ = true;
    boolean that_present_view_ = true;
    if (this_present_view_ || that_present_view_) {
      if (!(this_present_view_ && that_present_view_))
        return false;
      if (this.view_ != that.view_)
        return false;
    }

    boolean this_present_edit_ = true;
    boolean that_present_edit_ = true;
    if (this_present_edit_ || that_present_edit_) {
      if (!(this_present_edit_ && that_present_edit_))
        return false;
      if (this.edit_ != that.edit_)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((create_) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((delete_) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((view_) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((edit_) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TDashboardPermissions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCreate_(), other.isSetCreate_());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreate_()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.create_, other.create_);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDelete_(), other.isSetDelete_());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDelete_()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.delete_, other.delete_);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetView_(), other.isSetView_());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetView_()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.view_, other.view_);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEdit_(), other.isSetEdit_());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEdit_()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.edit_, other.edit_);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDashboardPermissions(");
    boolean first = true;

    sb.append("create_:");
    sb.append(this.create_);
    first = false;
    if (!first) sb.append(", ");
    sb.append("delete_:");
    sb.append(this.delete_);
    first = false;
    if (!first) sb.append(", ");
    sb.append("view_:");
    sb.append(this.view_);
    first = false;
    if (!first) sb.append(", ");
    sb.append("edit_:");
    sb.append(this.edit_);
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

  private static class TDashboardPermissionsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDashboardPermissionsStandardScheme getScheme() {
      return new TDashboardPermissionsStandardScheme();
    }
  }

  private static class TDashboardPermissionsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDashboardPermissions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDashboardPermissions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CREATE_
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.create_ = iprot.readBool();
              struct.setCreate_IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DELETE_
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.delete_ = iprot.readBool();
              struct.setDelete_IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VIEW_
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.view_ = iprot.readBool();
              struct.setView_IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EDIT_
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.edit_ = iprot.readBool();
              struct.setEdit_IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDashboardPermissions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CREATE__FIELD_DESC);
      oprot.writeBool(struct.create_);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DELETE__FIELD_DESC);
      oprot.writeBool(struct.delete_);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VIEW__FIELD_DESC);
      oprot.writeBool(struct.view_);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EDIT__FIELD_DESC);
      oprot.writeBool(struct.edit_);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDashboardPermissionsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDashboardPermissionsTupleScheme getScheme() {
      return new TDashboardPermissionsTupleScheme();
    }
  }

  private static class TDashboardPermissionsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDashboardPermissions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDashboardPermissions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCreate_()) {
        optionals.set(0);
      }
      if (struct.isSetDelete_()) {
        optionals.set(1);
      }
      if (struct.isSetView_()) {
        optionals.set(2);
      }
      if (struct.isSetEdit_()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCreate_()) {
        oprot.writeBool(struct.create_);
      }
      if (struct.isSetDelete_()) {
        oprot.writeBool(struct.delete_);
      }
      if (struct.isSetView_()) {
        oprot.writeBool(struct.view_);
      }
      if (struct.isSetEdit_()) {
        oprot.writeBool(struct.edit_);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDashboardPermissions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.create_ = iprot.readBool();
        struct.setCreate_IsSet(true);
      }
      if (incoming.get(1)) {
        struct.delete_ = iprot.readBool();
        struct.setDelete_IsSet(true);
      }
      if (incoming.get(2)) {
        struct.view_ = iprot.readBool();
        struct.setView_IsSet(true);
      }
      if (incoming.get(3)) {
        struct.edit_ = iprot.readBool();
        struct.setEdit_IsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

