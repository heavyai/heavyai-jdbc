/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TSessionInfo implements org.apache.thrift.TBase<TSessionInfo, TSessionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TSessionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSessionInfo");

  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DATABASE_FIELD_DESC = new org.apache.thrift.protocol.TField("database", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("start_time", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField IS_SUPER_FIELD_DESC = new org.apache.thrift.protocol.TField("is_super", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSessionInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSessionInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String user; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String database; // required
  public long start_time; // required
  public boolean is_super; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER((short)1, "user"),
    DATABASE((short)2, "database"),
    START_TIME((short)3, "start_time"),
    IS_SUPER((short)4, "is_super");

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
        case 1: // USER
          return USER;
        case 2: // DATABASE
          return DATABASE;
        case 3: // START_TIME
          return START_TIME;
        case 4: // IS_SUPER
          return IS_SUPER;
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
  private static final int __START_TIME_ISSET_ID = 0;
  private static final int __IS_SUPER_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATABASE, new org.apache.thrift.meta_data.FieldMetaData("database", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("start_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_SUPER, new org.apache.thrift.meta_data.FieldMetaData("is_super", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSessionInfo.class, metaDataMap);
  }

  public TSessionInfo() {
  }

  public TSessionInfo(
    java.lang.String user,
    java.lang.String database,
    long start_time,
    boolean is_super)
  {
    this();
    this.user = user;
    this.database = database;
    this.start_time = start_time;
    setStart_timeIsSet(true);
    this.is_super = is_super;
    setIs_superIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSessionInfo(TSessionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetDatabase()) {
      this.database = other.database;
    }
    this.start_time = other.start_time;
    this.is_super = other.is_super;
  }

  public TSessionInfo deepCopy() {
    return new TSessionInfo(this);
  }

  @Override
  public void clear() {
    this.user = null;
    this.database = null;
    setStart_timeIsSet(false);
    this.start_time = 0;
    setIs_superIsSet(false);
    this.is_super = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUser() {
    return this.user;
  }

  public TSessionInfo setUser(@org.apache.thrift.annotation.Nullable java.lang.String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDatabase() {
    return this.database;
  }

  public TSessionInfo setDatabase(@org.apache.thrift.annotation.Nullable java.lang.String database) {
    this.database = database;
    return this;
  }

  public void unsetDatabase() {
    this.database = null;
  }

  /** Returns true if field database is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabase() {
    return this.database != null;
  }

  public void setDatabaseIsSet(boolean value) {
    if (!value) {
      this.database = null;
    }
  }

  public long getStart_time() {
    return this.start_time;
  }

  public TSessionInfo setStart_time(long start_time) {
    this.start_time = start_time;
    setStart_timeIsSet(true);
    return this;
  }

  public void unsetStart_time() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __START_TIME_ISSET_ID);
  }

  /** Returns true if field start_time is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_time() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __START_TIME_ISSET_ID);
  }

  public void setStart_timeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __START_TIME_ISSET_ID, value);
  }

  public boolean isIs_super() {
    return this.is_super;
  }

  public TSessionInfo setIs_super(boolean is_super) {
    this.is_super = is_super;
    setIs_superIsSet(true);
    return this;
  }

  public void unsetIs_super() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_SUPER_ISSET_ID);
  }

  /** Returns true if field is_super is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_super() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_SUPER_ISSET_ID);
  }

  public void setIs_superIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_SUPER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((java.lang.String)value);
      }
      break;

    case DATABASE:
      if (value == null) {
        unsetDatabase();
      } else {
        setDatabase((java.lang.String)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStart_time();
      } else {
        setStart_time((java.lang.Long)value);
      }
      break;

    case IS_SUPER:
      if (value == null) {
        unsetIs_super();
      } else {
        setIs_super((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER:
      return getUser();

    case DATABASE:
      return getDatabase();

    case START_TIME:
      return getStart_time();

    case IS_SUPER:
      return isIs_super();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER:
      return isSetUser();
    case DATABASE:
      return isSetDatabase();
    case START_TIME:
      return isSetStart_time();
    case IS_SUPER:
      return isSetIs_super();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSessionInfo)
      return this.equals((TSessionInfo)that);
    return false;
  }

  public boolean equals(TSessionInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_database = true && this.isSetDatabase();
    boolean that_present_database = true && that.isSetDatabase();
    if (this_present_database || that_present_database) {
      if (!(this_present_database && that_present_database))
        return false;
      if (!this.database.equals(that.database))
        return false;
    }

    boolean this_present_start_time = true;
    boolean that_present_start_time = true;
    if (this_present_start_time || that_present_start_time) {
      if (!(this_present_start_time && that_present_start_time))
        return false;
      if (this.start_time != that.start_time)
        return false;
    }

    boolean this_present_is_super = true;
    boolean that_present_is_super = true;
    if (this_present_is_super || that_present_is_super) {
      if (!(this_present_is_super && that_present_is_super))
        return false;
      if (this.is_super != that.is_super)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
    if (isSetUser())
      hashCode = hashCode * 8191 + user.hashCode();

    hashCode = hashCode * 8191 + ((isSetDatabase()) ? 131071 : 524287);
    if (isSetDatabase())
      hashCode = hashCode * 8191 + database.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(start_time);

    hashCode = hashCode * 8191 + ((is_super) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TSessionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetUser(), other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDatabase(), other.isSetDatabase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.database, other.database);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStart_time(), other.isSetStart_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_time, other.start_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIs_super(), other.isSetIs_super());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_super()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_super, other.is_super);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSessionInfo(");
    boolean first = true;

    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("database:");
    if (this.database == null) {
      sb.append("null");
    } else {
      sb.append(this.database);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("start_time:");
    sb.append(this.start_time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_super:");
    sb.append(this.is_super);
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

  private static class TSessionInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSessionInfoStandardScheme getScheme() {
      return new TSessionInfoStandardScheme();
    }
  }

  private static class TSessionInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSessionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSessionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATABASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.database = iprot.readString();
              struct.setDatabaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start_time = iprot.readI64();
              struct.setStart_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_SUPER
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_super = iprot.readBool();
              struct.setIs_superIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSessionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.database != null) {
        oprot.writeFieldBegin(DATABASE_FIELD_DESC);
        oprot.writeString(struct.database);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.start_time);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_SUPER_FIELD_DESC);
      oprot.writeBool(struct.is_super);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSessionInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSessionInfoTupleScheme getScheme() {
      return new TSessionInfoTupleScheme();
    }
  }

  private static class TSessionInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSessionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSessionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUser()) {
        optionals.set(0);
      }
      if (struct.isSetDatabase()) {
        optionals.set(1);
      }
      if (struct.isSetStart_time()) {
        optionals.set(2);
      }
      if (struct.isSetIs_super()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetDatabase()) {
        oprot.writeString(struct.database);
      }
      if (struct.isSetStart_time()) {
        oprot.writeI64(struct.start_time);
      }
      if (struct.isSetIs_super()) {
        oprot.writeBool(struct.is_super);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSessionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(1)) {
        struct.database = iprot.readString();
        struct.setDatabaseIsSet(true);
      }
      if (incoming.get(2)) {
        struct.start_time = iprot.readI64();
        struct.setStart_timeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.is_super = iprot.readBool();
        struct.setIs_superIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

