/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TFrontendView implements org.apache.thrift.TBase<TFrontendView, TFrontendView._Fields>, java.io.Serializable, Cloneable, Comparable<TFrontendView> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFrontendView");

  private static final org.apache.thrift.protocol.TField VIEW_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("view_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VIEW_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("view_state", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IMAGE_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("image_hash", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("update_time", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField VIEW_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("view_metadata", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFrontendViewStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFrontendViewTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String view_name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String view_state; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String image_hash; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String update_time; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String view_metadata; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VIEW_NAME((short)1, "view_name"),
    VIEW_STATE((short)2, "view_state"),
    IMAGE_HASH((short)3, "image_hash"),
    UPDATE_TIME((short)4, "update_time"),
    VIEW_METADATA((short)5, "view_metadata");

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
        case 1: // VIEW_NAME
          return VIEW_NAME;
        case 2: // VIEW_STATE
          return VIEW_STATE;
        case 3: // IMAGE_HASH
          return IMAGE_HASH;
        case 4: // UPDATE_TIME
          return UPDATE_TIME;
        case 5: // VIEW_METADATA
          return VIEW_METADATA;
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
    tmpMap.put(_Fields.VIEW_NAME, new org.apache.thrift.meta_data.FieldMetaData("view_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VIEW_STATE, new org.apache.thrift.meta_data.FieldMetaData("view_state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IMAGE_HASH, new org.apache.thrift.meta_data.FieldMetaData("image_hash", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("update_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VIEW_METADATA, new org.apache.thrift.meta_data.FieldMetaData("view_metadata", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFrontendView.class, metaDataMap);
  }

  public TFrontendView() {
  }

  public TFrontendView(
    java.lang.String view_name,
    java.lang.String view_state,
    java.lang.String image_hash,
    java.lang.String update_time,
    java.lang.String view_metadata)
  {
    this();
    this.view_name = view_name;
    this.view_state = view_state;
    this.image_hash = image_hash;
    this.update_time = update_time;
    this.view_metadata = view_metadata;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFrontendView(TFrontendView other) {
    if (other.isSetView_name()) {
      this.view_name = other.view_name;
    }
    if (other.isSetView_state()) {
      this.view_state = other.view_state;
    }
    if (other.isSetImage_hash()) {
      this.image_hash = other.image_hash;
    }
    if (other.isSetUpdate_time()) {
      this.update_time = other.update_time;
    }
    if (other.isSetView_metadata()) {
      this.view_metadata = other.view_metadata;
    }
  }

  public TFrontendView deepCopy() {
    return new TFrontendView(this);
  }

  @Override
  public void clear() {
    this.view_name = null;
    this.view_state = null;
    this.image_hash = null;
    this.update_time = null;
    this.view_metadata = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getView_name() {
    return this.view_name;
  }

  public TFrontendView setView_name(@org.apache.thrift.annotation.Nullable java.lang.String view_name) {
    this.view_name = view_name;
    return this;
  }

  public void unsetView_name() {
    this.view_name = null;
  }

  /** Returns true if field view_name is set (has been assigned a value) and false otherwise */
  public boolean isSetView_name() {
    return this.view_name != null;
  }

  public void setView_nameIsSet(boolean value) {
    if (!value) {
      this.view_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getView_state() {
    return this.view_state;
  }

  public TFrontendView setView_state(@org.apache.thrift.annotation.Nullable java.lang.String view_state) {
    this.view_state = view_state;
    return this;
  }

  public void unsetView_state() {
    this.view_state = null;
  }

  /** Returns true if field view_state is set (has been assigned a value) and false otherwise */
  public boolean isSetView_state() {
    return this.view_state != null;
  }

  public void setView_stateIsSet(boolean value) {
    if (!value) {
      this.view_state = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getImage_hash() {
    return this.image_hash;
  }

  public TFrontendView setImage_hash(@org.apache.thrift.annotation.Nullable java.lang.String image_hash) {
    this.image_hash = image_hash;
    return this;
  }

  public void unsetImage_hash() {
    this.image_hash = null;
  }

  /** Returns true if field image_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetImage_hash() {
    return this.image_hash != null;
  }

  public void setImage_hashIsSet(boolean value) {
    if (!value) {
      this.image_hash = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUpdate_time() {
    return this.update_time;
  }

  public TFrontendView setUpdate_time(@org.apache.thrift.annotation.Nullable java.lang.String update_time) {
    this.update_time = update_time;
    return this;
  }

  public void unsetUpdate_time() {
    this.update_time = null;
  }

  /** Returns true if field update_time is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdate_time() {
    return this.update_time != null;
  }

  public void setUpdate_timeIsSet(boolean value) {
    if (!value) {
      this.update_time = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getView_metadata() {
    return this.view_metadata;
  }

  public TFrontendView setView_metadata(@org.apache.thrift.annotation.Nullable java.lang.String view_metadata) {
    this.view_metadata = view_metadata;
    return this;
  }

  public void unsetView_metadata() {
    this.view_metadata = null;
  }

  /** Returns true if field view_metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetView_metadata() {
    return this.view_metadata != null;
  }

  public void setView_metadataIsSet(boolean value) {
    if (!value) {
      this.view_metadata = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VIEW_NAME:
      if (value == null) {
        unsetView_name();
      } else {
        setView_name((java.lang.String)value);
      }
      break;

    case VIEW_STATE:
      if (value == null) {
        unsetView_state();
      } else {
        setView_state((java.lang.String)value);
      }
      break;

    case IMAGE_HASH:
      if (value == null) {
        unsetImage_hash();
      } else {
        setImage_hash((java.lang.String)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdate_time();
      } else {
        setUpdate_time((java.lang.String)value);
      }
      break;

    case VIEW_METADATA:
      if (value == null) {
        unsetView_metadata();
      } else {
        setView_metadata((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VIEW_NAME:
      return getView_name();

    case VIEW_STATE:
      return getView_state();

    case IMAGE_HASH:
      return getImage_hash();

    case UPDATE_TIME:
      return getUpdate_time();

    case VIEW_METADATA:
      return getView_metadata();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VIEW_NAME:
      return isSetView_name();
    case VIEW_STATE:
      return isSetView_state();
    case IMAGE_HASH:
      return isSetImage_hash();
    case UPDATE_TIME:
      return isSetUpdate_time();
    case VIEW_METADATA:
      return isSetView_metadata();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFrontendView)
      return this.equals((TFrontendView)that);
    return false;
  }

  public boolean equals(TFrontendView that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_view_name = true && this.isSetView_name();
    boolean that_present_view_name = true && that.isSetView_name();
    if (this_present_view_name || that_present_view_name) {
      if (!(this_present_view_name && that_present_view_name))
        return false;
      if (!this.view_name.equals(that.view_name))
        return false;
    }

    boolean this_present_view_state = true && this.isSetView_state();
    boolean that_present_view_state = true && that.isSetView_state();
    if (this_present_view_state || that_present_view_state) {
      if (!(this_present_view_state && that_present_view_state))
        return false;
      if (!this.view_state.equals(that.view_state))
        return false;
    }

    boolean this_present_image_hash = true && this.isSetImage_hash();
    boolean that_present_image_hash = true && that.isSetImage_hash();
    if (this_present_image_hash || that_present_image_hash) {
      if (!(this_present_image_hash && that_present_image_hash))
        return false;
      if (!this.image_hash.equals(that.image_hash))
        return false;
    }

    boolean this_present_update_time = true && this.isSetUpdate_time();
    boolean that_present_update_time = true && that.isSetUpdate_time();
    if (this_present_update_time || that_present_update_time) {
      if (!(this_present_update_time && that_present_update_time))
        return false;
      if (!this.update_time.equals(that.update_time))
        return false;
    }

    boolean this_present_view_metadata = true && this.isSetView_metadata();
    boolean that_present_view_metadata = true && that.isSetView_metadata();
    if (this_present_view_metadata || that_present_view_metadata) {
      if (!(this_present_view_metadata && that_present_view_metadata))
        return false;
      if (!this.view_metadata.equals(that.view_metadata))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetView_name()) ? 131071 : 524287);
    if (isSetView_name())
      hashCode = hashCode * 8191 + view_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetView_state()) ? 131071 : 524287);
    if (isSetView_state())
      hashCode = hashCode * 8191 + view_state.hashCode();

    hashCode = hashCode * 8191 + ((isSetImage_hash()) ? 131071 : 524287);
    if (isSetImage_hash())
      hashCode = hashCode * 8191 + image_hash.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdate_time()) ? 131071 : 524287);
    if (isSetUpdate_time())
      hashCode = hashCode * 8191 + update_time.hashCode();

    hashCode = hashCode * 8191 + ((isSetView_metadata()) ? 131071 : 524287);
    if (isSetView_metadata())
      hashCode = hashCode * 8191 + view_metadata.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFrontendView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetView_name(), other.isSetView_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetView_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.view_name, other.view_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetView_state(), other.isSetView_state());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetView_state()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.view_state, other.view_state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetImage_hash(), other.isSetImage_hash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImage_hash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.image_hash, other.image_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUpdate_time(), other.isSetUpdate_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdate_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.update_time, other.update_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetView_metadata(), other.isSetView_metadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetView_metadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.view_metadata, other.view_metadata);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFrontendView(");
    boolean first = true;

    sb.append("view_name:");
    if (this.view_name == null) {
      sb.append("null");
    } else {
      sb.append(this.view_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("view_state:");
    if (this.view_state == null) {
      sb.append("null");
    } else {
      sb.append(this.view_state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("image_hash:");
    if (this.image_hash == null) {
      sb.append("null");
    } else {
      sb.append(this.image_hash);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("update_time:");
    if (this.update_time == null) {
      sb.append("null");
    } else {
      sb.append(this.update_time);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("view_metadata:");
    if (this.view_metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.view_metadata);
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

  private static class TFrontendViewStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFrontendViewStandardScheme getScheme() {
      return new TFrontendViewStandardScheme();
    }
  }

  private static class TFrontendViewStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFrontendView> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFrontendView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VIEW_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.view_name = iprot.readString();
              struct.setView_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VIEW_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.view_state = iprot.readString();
              struct.setView_stateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IMAGE_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.image_hash = iprot.readString();
              struct.setImage_hashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.update_time = iprot.readString();
              struct.setUpdate_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VIEW_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.view_metadata = iprot.readString();
              struct.setView_metadataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFrontendView struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.view_name != null) {
        oprot.writeFieldBegin(VIEW_NAME_FIELD_DESC);
        oprot.writeString(struct.view_name);
        oprot.writeFieldEnd();
      }
      if (struct.view_state != null) {
        oprot.writeFieldBegin(VIEW_STATE_FIELD_DESC);
        oprot.writeString(struct.view_state);
        oprot.writeFieldEnd();
      }
      if (struct.image_hash != null) {
        oprot.writeFieldBegin(IMAGE_HASH_FIELD_DESC);
        oprot.writeString(struct.image_hash);
        oprot.writeFieldEnd();
      }
      if (struct.update_time != null) {
        oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
        oprot.writeString(struct.update_time);
        oprot.writeFieldEnd();
      }
      if (struct.view_metadata != null) {
        oprot.writeFieldBegin(VIEW_METADATA_FIELD_DESC);
        oprot.writeString(struct.view_metadata);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFrontendViewTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFrontendViewTupleScheme getScheme() {
      return new TFrontendViewTupleScheme();
    }
  }

  private static class TFrontendViewTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFrontendView> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFrontendView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetView_name()) {
        optionals.set(0);
      }
      if (struct.isSetView_state()) {
        optionals.set(1);
      }
      if (struct.isSetImage_hash()) {
        optionals.set(2);
      }
      if (struct.isSetUpdate_time()) {
        optionals.set(3);
      }
      if (struct.isSetView_metadata()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetView_name()) {
        oprot.writeString(struct.view_name);
      }
      if (struct.isSetView_state()) {
        oprot.writeString(struct.view_state);
      }
      if (struct.isSetImage_hash()) {
        oprot.writeString(struct.image_hash);
      }
      if (struct.isSetUpdate_time()) {
        oprot.writeString(struct.update_time);
      }
      if (struct.isSetView_metadata()) {
        oprot.writeString(struct.view_metadata);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFrontendView struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.view_name = iprot.readString();
        struct.setView_nameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.view_state = iprot.readString();
        struct.setView_stateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.image_hash = iprot.readString();
        struct.setImage_hashIsSet(true);
      }
      if (incoming.get(3)) {
        struct.update_time = iprot.readString();
        struct.setUpdate_timeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.view_metadata = iprot.readString();
        struct.setView_metadataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

