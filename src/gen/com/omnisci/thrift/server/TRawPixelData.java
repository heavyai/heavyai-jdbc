/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.omnisci.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TRawPixelData implements org.apache.thrift.TBase<TRawPixelData, TRawPixelData._Fields>, java.io.Serializable, Cloneable, Comparable<TRawPixelData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRawPixelData");

  private static final org.apache.thrift.protocol.TField WIDTH_FIELD_DESC = new org.apache.thrift.protocol.TField("width", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("height", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RENDER_PASS_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("render_pass_map", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRawPixelDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRawPixelDataTupleSchemeFactory();

  public int width; // required
  public int height; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,TRawRenderPassDataResult> render_pass_map; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WIDTH((short)1, "width"),
    HEIGHT((short)2, "height"),
    RENDER_PASS_MAP((short)3, "render_pass_map");

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
        case 1: // WIDTH
          return WIDTH;
        case 2: // HEIGHT
          return HEIGHT;
        case 3: // RENDER_PASS_MAP
          return RENDER_PASS_MAP;
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
  private static final int __WIDTH_ISSET_ID = 0;
  private static final int __HEIGHT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WIDTH, new org.apache.thrift.meta_data.FieldMetaData("width", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HEIGHT, new org.apache.thrift.meta_data.FieldMetaData("height", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RENDER_PASS_MAP, new org.apache.thrift.meta_data.FieldMetaData("render_pass_map", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.MAP        , "TRenderPassMap")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRawPixelData.class, metaDataMap);
  }

  public TRawPixelData() {
  }

  public TRawPixelData(
    int width,
    int height,
    java.util.Map<java.lang.Integer,TRawRenderPassDataResult> render_pass_map)
  {
    this();
    this.width = width;
    setWidthIsSet(true);
    this.height = height;
    setHeightIsSet(true);
    this.render_pass_map = render_pass_map;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRawPixelData(TRawPixelData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.width = other.width;
    this.height = other.height;
    if (other.isSetRender_pass_map()) {
      java.util.Map<java.lang.Integer,TRawRenderPassDataResult> __this__render_pass_map = new java.util.HashMap<java.lang.Integer,TRawRenderPassDataResult>(other.render_pass_map.size());
      for (java.util.Map.Entry<java.lang.Integer, TRawRenderPassDataResult> other_element : other.render_pass_map.entrySet()) {

        java.lang.Integer other_element_key = other_element.getKey();
        TRawRenderPassDataResult other_element_value = other_element.getValue();

        java.lang.Integer __this__render_pass_map_copy_key = other_element_key;

        TRawRenderPassDataResult __this__render_pass_map_copy_value = new TRawRenderPassDataResult(other_element_value);

        __this__render_pass_map.put(__this__render_pass_map_copy_key, __this__render_pass_map_copy_value);
      }
      this.render_pass_map = __this__render_pass_map;
    }
  }

  public TRawPixelData deepCopy() {
    return new TRawPixelData(this);
  }

  @Override
  public void clear() {
    setWidthIsSet(false);
    this.width = 0;
    setHeightIsSet(false);
    this.height = 0;
    this.render_pass_map = null;
  }

  public int getWidth() {
    return this.width;
  }

  public TRawPixelData setWidth(int width) {
    this.width = width;
    setWidthIsSet(true);
    return this;
  }

  public void unsetWidth() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WIDTH_ISSET_ID);
  }

  /** Returns true if field width is set (has been assigned a value) and false otherwise */
  public boolean isSetWidth() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WIDTH_ISSET_ID);
  }

  public void setWidthIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WIDTH_ISSET_ID, value);
  }

  public int getHeight() {
    return this.height;
  }

  public TRawPixelData setHeight(int height) {
    this.height = height;
    setHeightIsSet(true);
    return this;
  }

  public void unsetHeight() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HEIGHT_ISSET_ID);
  }

  /** Returns true if field height is set (has been assigned a value) and false otherwise */
  public boolean isSetHeight() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HEIGHT_ISSET_ID);
  }

  public void setHeightIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HEIGHT_ISSET_ID, value);
  }

  public int getRender_pass_mapSize() {
    return (this.render_pass_map == null) ? 0 : this.render_pass_map.size();
  }

  public void putToRender_pass_map(int key, TRawRenderPassDataResult val) {
    if (this.render_pass_map == null) {
      this.render_pass_map = new java.util.HashMap<java.lang.Integer,TRawRenderPassDataResult>();
    }
    this.render_pass_map.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Integer,TRawRenderPassDataResult> getRender_pass_map() {
    return this.render_pass_map;
  }

  public TRawPixelData setRender_pass_map(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,TRawRenderPassDataResult> render_pass_map) {
    this.render_pass_map = render_pass_map;
    return this;
  }

  public void unsetRender_pass_map() {
    this.render_pass_map = null;
  }

  /** Returns true if field render_pass_map is set (has been assigned a value) and false otherwise */
  public boolean isSetRender_pass_map() {
    return this.render_pass_map != null;
  }

  public void setRender_pass_mapIsSet(boolean value) {
    if (!value) {
      this.render_pass_map = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case WIDTH:
      if (value == null) {
        unsetWidth();
      } else {
        setWidth((java.lang.Integer)value);
      }
      break;

    case HEIGHT:
      if (value == null) {
        unsetHeight();
      } else {
        setHeight((java.lang.Integer)value);
      }
      break;

    case RENDER_PASS_MAP:
      if (value == null) {
        unsetRender_pass_map();
      } else {
        setRender_pass_map((java.util.Map<java.lang.Integer,TRawRenderPassDataResult>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case WIDTH:
      return getWidth();

    case HEIGHT:
      return getHeight();

    case RENDER_PASS_MAP:
      return getRender_pass_map();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case WIDTH:
      return isSetWidth();
    case HEIGHT:
      return isSetHeight();
    case RENDER_PASS_MAP:
      return isSetRender_pass_map();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TRawPixelData)
      return this.equals((TRawPixelData)that);
    return false;
  }

  public boolean equals(TRawPixelData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_width = true;
    boolean that_present_width = true;
    if (this_present_width || that_present_width) {
      if (!(this_present_width && that_present_width))
        return false;
      if (this.width != that.width)
        return false;
    }

    boolean this_present_height = true;
    boolean that_present_height = true;
    if (this_present_height || that_present_height) {
      if (!(this_present_height && that_present_height))
        return false;
      if (this.height != that.height)
        return false;
    }

    boolean this_present_render_pass_map = true && this.isSetRender_pass_map();
    boolean that_present_render_pass_map = true && that.isSetRender_pass_map();
    if (this_present_render_pass_map || that_present_render_pass_map) {
      if (!(this_present_render_pass_map && that_present_render_pass_map))
        return false;
      if (!this.render_pass_map.equals(that.render_pass_map))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + width;

    hashCode = hashCode * 8191 + height;

    hashCode = hashCode * 8191 + ((isSetRender_pass_map()) ? 131071 : 524287);
    if (isSetRender_pass_map())
      hashCode = hashCode * 8191 + render_pass_map.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TRawPixelData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetWidth(), other.isSetWidth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWidth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.width, other.width);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHeight(), other.isSetHeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.height, other.height);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRender_pass_map(), other.isSetRender_pass_map());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRender_pass_map()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.render_pass_map, other.render_pass_map);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRawPixelData(");
    boolean first = true;

    sb.append("width:");
    sb.append(this.width);
    first = false;
    if (!first) sb.append(", ");
    sb.append("height:");
    sb.append(this.height);
    first = false;
    if (!first) sb.append(", ");
    sb.append("render_pass_map:");
    if (this.render_pass_map == null) {
      sb.append("null");
    } else {
      sb.append(this.render_pass_map);
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

  private static class TRawPixelDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRawPixelDataStandardScheme getScheme() {
      return new TRawPixelDataStandardScheme();
    }
  }

  private static class TRawPixelDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRawPixelData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRawPixelData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WIDTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.width = iprot.readI32();
              struct.setWidthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.height = iprot.readI32();
              struct.setHeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RENDER_PASS_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map224 = iprot.readMapBegin();
                struct.render_pass_map = new java.util.HashMap<java.lang.Integer,TRawRenderPassDataResult>(2*_map224.size);
                int _key225;
                @org.apache.thrift.annotation.Nullable TRawRenderPassDataResult _val226;
                for (int _i227 = 0; _i227 < _map224.size; ++_i227)
                {
                  _key225 = iprot.readI32();
                  _val226 = new TRawRenderPassDataResult();
                  _val226.read(iprot);
                  struct.render_pass_map.put(_key225, _val226);
                }
                iprot.readMapEnd();
              }
              struct.setRender_pass_mapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRawPixelData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(WIDTH_FIELD_DESC);
      oprot.writeI32(struct.width);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HEIGHT_FIELD_DESC);
      oprot.writeI32(struct.height);
      oprot.writeFieldEnd();
      if (struct.render_pass_map != null) {
        oprot.writeFieldBegin(RENDER_PASS_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.render_pass_map.size()));
          for (java.util.Map.Entry<java.lang.Integer, TRawRenderPassDataResult> _iter228 : struct.render_pass_map.entrySet())
          {
            oprot.writeI32(_iter228.getKey());
            _iter228.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRawPixelDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRawPixelDataTupleScheme getScheme() {
      return new TRawPixelDataTupleScheme();
    }
  }

  private static class TRawPixelDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRawPixelData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRawPixelData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetWidth()) {
        optionals.set(0);
      }
      if (struct.isSetHeight()) {
        optionals.set(1);
      }
      if (struct.isSetRender_pass_map()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetWidth()) {
        oprot.writeI32(struct.width);
      }
      if (struct.isSetHeight()) {
        oprot.writeI32(struct.height);
      }
      if (struct.isSetRender_pass_map()) {
        {
          oprot.writeI32(struct.render_pass_map.size());
          for (java.util.Map.Entry<java.lang.Integer, TRawRenderPassDataResult> _iter229 : struct.render_pass_map.entrySet())
          {
            oprot.writeI32(_iter229.getKey());
            _iter229.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRawPixelData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.width = iprot.readI32();
        struct.setWidthIsSet(true);
      }
      if (incoming.get(1)) {
        struct.height = iprot.readI32();
        struct.setHeightIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map230 = iprot.readMapBegin(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT); 
          struct.render_pass_map = new java.util.HashMap<java.lang.Integer,TRawRenderPassDataResult>(2*_map230.size);
          int _key231;
          @org.apache.thrift.annotation.Nullable TRawRenderPassDataResult _val232;
          for (int _i233 = 0; _i233 < _map230.size; ++_i233)
          {
            _key231 = iprot.readI32();
            _val232 = new TRawRenderPassDataResult();
            _val232.read(iprot);
            struct.render_pass_map.put(_key231, _val232);
          }
        }
        struct.setRender_pass_mapIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

