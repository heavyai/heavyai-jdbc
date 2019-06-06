/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mapd.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TColSlotContext implements org.apache.thrift.TBase<TColSlotContext, TColSlotContext._Fields>, java.io.Serializable, Cloneable, Comparable<TColSlotContext> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColSlotContext");

  private static final org.apache.thrift.protocol.TField SLOT_SIZES_FIELD_DESC = new org.apache.thrift.protocol.TField("slot_sizes", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField COL_TO_SLOT_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("col_to_slot_map", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TColSlotContextStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TColSlotContextTupleSchemeFactory();

  public java.util.List<TSlotSize> slot_sizes; // required
  public java.util.List<java.util.List<java.lang.Integer>> col_to_slot_map; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SLOT_SIZES((short)1, "slot_sizes"),
    COL_TO_SLOT_MAP((short)2, "col_to_slot_map");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SLOT_SIZES
          return SLOT_SIZES;
        case 2: // COL_TO_SLOT_MAP
          return COL_TO_SLOT_MAP;
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
    tmpMap.put(_Fields.SLOT_SIZES, new org.apache.thrift.meta_data.FieldMetaData("slot_sizes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSlotSize.class))));
    tmpMap.put(_Fields.COL_TO_SLOT_MAP, new org.apache.thrift.meta_data.FieldMetaData("col_to_slot_map", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColSlotContext.class, metaDataMap);
  }

  public TColSlotContext() {
  }

  public TColSlotContext(
    java.util.List<TSlotSize> slot_sizes,
    java.util.List<java.util.List<java.lang.Integer>> col_to_slot_map)
  {
    this();
    this.slot_sizes = slot_sizes;
    this.col_to_slot_map = col_to_slot_map;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TColSlotContext(TColSlotContext other) {
    if (other.isSetSlot_sizes()) {
      java.util.List<TSlotSize> __this__slot_sizes = new java.util.ArrayList<TSlotSize>(other.slot_sizes.size());
      for (TSlotSize other_element : other.slot_sizes) {
        __this__slot_sizes.add(new TSlotSize(other_element));
      }
      this.slot_sizes = __this__slot_sizes;
    }
    if (other.isSetCol_to_slot_map()) {
      java.util.List<java.util.List<java.lang.Integer>> __this__col_to_slot_map = new java.util.ArrayList<java.util.List<java.lang.Integer>>(other.col_to_slot_map.size());
      for (java.util.List<java.lang.Integer> other_element : other.col_to_slot_map) {
        java.util.List<java.lang.Integer> __this__col_to_slot_map_copy = new java.util.ArrayList<java.lang.Integer>(other_element);
        __this__col_to_slot_map.add(__this__col_to_slot_map_copy);
      }
      this.col_to_slot_map = __this__col_to_slot_map;
    }
  }

  public TColSlotContext deepCopy() {
    return new TColSlotContext(this);
  }

  @Override
  public void clear() {
    this.slot_sizes = null;
    this.col_to_slot_map = null;
  }

  public int getSlot_sizesSize() {
    return (this.slot_sizes == null) ? 0 : this.slot_sizes.size();
  }

  public java.util.Iterator<TSlotSize> getSlot_sizesIterator() {
    return (this.slot_sizes == null) ? null : this.slot_sizes.iterator();
  }

  public void addToSlot_sizes(TSlotSize elem) {
    if (this.slot_sizes == null) {
      this.slot_sizes = new java.util.ArrayList<TSlotSize>();
    }
    this.slot_sizes.add(elem);
  }

  public java.util.List<TSlotSize> getSlot_sizes() {
    return this.slot_sizes;
  }

  public TColSlotContext setSlot_sizes(java.util.List<TSlotSize> slot_sizes) {
    this.slot_sizes = slot_sizes;
    return this;
  }

  public void unsetSlot_sizes() {
    this.slot_sizes = null;
  }

  /** Returns true if field slot_sizes is set (has been assigned a value) and false otherwise */
  public boolean isSetSlot_sizes() {
    return this.slot_sizes != null;
  }

  public void setSlot_sizesIsSet(boolean value) {
    if (!value) {
      this.slot_sizes = null;
    }
  }

  public int getCol_to_slot_mapSize() {
    return (this.col_to_slot_map == null) ? 0 : this.col_to_slot_map.size();
  }

  public java.util.Iterator<java.util.List<java.lang.Integer>> getCol_to_slot_mapIterator() {
    return (this.col_to_slot_map == null) ? null : this.col_to_slot_map.iterator();
  }

  public void addToCol_to_slot_map(java.util.List<java.lang.Integer> elem) {
    if (this.col_to_slot_map == null) {
      this.col_to_slot_map = new java.util.ArrayList<java.util.List<java.lang.Integer>>();
    }
    this.col_to_slot_map.add(elem);
  }

  public java.util.List<java.util.List<java.lang.Integer>> getCol_to_slot_map() {
    return this.col_to_slot_map;
  }

  public TColSlotContext setCol_to_slot_map(java.util.List<java.util.List<java.lang.Integer>> col_to_slot_map) {
    this.col_to_slot_map = col_to_slot_map;
    return this;
  }

  public void unsetCol_to_slot_map() {
    this.col_to_slot_map = null;
  }

  /** Returns true if field col_to_slot_map is set (has been assigned a value) and false otherwise */
  public boolean isSetCol_to_slot_map() {
    return this.col_to_slot_map != null;
  }

  public void setCol_to_slot_mapIsSet(boolean value) {
    if (!value) {
      this.col_to_slot_map = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SLOT_SIZES:
      if (value == null) {
        unsetSlot_sizes();
      } else {
        setSlot_sizes((java.util.List<TSlotSize>)value);
      }
      break;

    case COL_TO_SLOT_MAP:
      if (value == null) {
        unsetCol_to_slot_map();
      } else {
        setCol_to_slot_map((java.util.List<java.util.List<java.lang.Integer>>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SLOT_SIZES:
      return getSlot_sizes();

    case COL_TO_SLOT_MAP:
      return getCol_to_slot_map();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SLOT_SIZES:
      return isSetSlot_sizes();
    case COL_TO_SLOT_MAP:
      return isSetCol_to_slot_map();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TColSlotContext)
      return this.equals((TColSlotContext)that);
    return false;
  }

  public boolean equals(TColSlotContext that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_slot_sizes = true && this.isSetSlot_sizes();
    boolean that_present_slot_sizes = true && that.isSetSlot_sizes();
    if (this_present_slot_sizes || that_present_slot_sizes) {
      if (!(this_present_slot_sizes && that_present_slot_sizes))
        return false;
      if (!this.slot_sizes.equals(that.slot_sizes))
        return false;
    }

    boolean this_present_col_to_slot_map = true && this.isSetCol_to_slot_map();
    boolean that_present_col_to_slot_map = true && that.isSetCol_to_slot_map();
    if (this_present_col_to_slot_map || that_present_col_to_slot_map) {
      if (!(this_present_col_to_slot_map && that_present_col_to_slot_map))
        return false;
      if (!this.col_to_slot_map.equals(that.col_to_slot_map))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSlot_sizes()) ? 131071 : 524287);
    if (isSetSlot_sizes())
      hashCode = hashCode * 8191 + slot_sizes.hashCode();

    hashCode = hashCode * 8191 + ((isSetCol_to_slot_map()) ? 131071 : 524287);
    if (isSetCol_to_slot_map())
      hashCode = hashCode * 8191 + col_to_slot_map.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TColSlotContext other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSlot_sizes()).compareTo(other.isSetSlot_sizes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlot_sizes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slot_sizes, other.slot_sizes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCol_to_slot_map()).compareTo(other.isSetCol_to_slot_map());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCol_to_slot_map()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.col_to_slot_map, other.col_to_slot_map);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TColSlotContext(");
    boolean first = true;

    sb.append("slot_sizes:");
    if (this.slot_sizes == null) {
      sb.append("null");
    } else {
      sb.append(this.slot_sizes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("col_to_slot_map:");
    if (this.col_to_slot_map == null) {
      sb.append("null");
    } else {
      sb.append(this.col_to_slot_map);
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

  private static class TColSlotContextStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TColSlotContextStandardScheme getScheme() {
      return new TColSlotContextStandardScheme();
    }
  }

  private static class TColSlotContextStandardScheme extends org.apache.thrift.scheme.StandardScheme<TColSlotContext> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TColSlotContext struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SLOT_SIZES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.slot_sizes = new java.util.ArrayList<TSlotSize>(_list0.size);
                TSlotSize _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TSlotSize();
                  _elem1.read(iprot);
                  struct.slot_sizes.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSlot_sizesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COL_TO_SLOT_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.col_to_slot_map = new java.util.ArrayList<java.util.List<java.lang.Integer>>(_list3.size);
                java.util.List<java.lang.Integer> _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  {
                    org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                    _elem4 = new java.util.ArrayList<java.lang.Integer>(_list6.size);
                    int _elem7;
                    for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                    {
                      _elem7 = iprot.readI32();
                      _elem4.add(_elem7);
                    }
                    iprot.readListEnd();
                  }
                  struct.col_to_slot_map.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setCol_to_slot_mapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TColSlotContext struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.slot_sizes != null) {
        oprot.writeFieldBegin(SLOT_SIZES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.slot_sizes.size()));
          for (TSlotSize _iter9 : struct.slot_sizes)
          {
            _iter9.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.col_to_slot_map != null) {
        oprot.writeFieldBegin(COL_TO_SLOT_MAP_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.col_to_slot_map.size()));
          for (java.util.List<java.lang.Integer> _iter10 : struct.col_to_slot_map)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, _iter10.size()));
              for (int _iter11 : _iter10)
              {
                oprot.writeI32(_iter11);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TColSlotContextTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TColSlotContextTupleScheme getScheme() {
      return new TColSlotContextTupleScheme();
    }
  }

  private static class TColSlotContextTupleScheme extends org.apache.thrift.scheme.TupleScheme<TColSlotContext> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TColSlotContext struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSlot_sizes()) {
        optionals.set(0);
      }
      if (struct.isSetCol_to_slot_map()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSlot_sizes()) {
        {
          oprot.writeI32(struct.slot_sizes.size());
          for (TSlotSize _iter12 : struct.slot_sizes)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetCol_to_slot_map()) {
        {
          oprot.writeI32(struct.col_to_slot_map.size());
          for (java.util.List<java.lang.Integer> _iter13 : struct.col_to_slot_map)
          {
            {
              oprot.writeI32(_iter13.size());
              for (int _iter14 : _iter13)
              {
                oprot.writeI32(_iter14);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TColSlotContext struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.slot_sizes = new java.util.ArrayList<TSlotSize>(_list15.size);
          TSlotSize _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = new TSlotSize();
            _elem16.read(iprot);
            struct.slot_sizes.add(_elem16);
          }
        }
        struct.setSlot_sizesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.col_to_slot_map = new java.util.ArrayList<java.util.List<java.lang.Integer>>(_list18.size);
          java.util.List<java.lang.Integer> _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            {
              org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
              _elem19 = new java.util.ArrayList<java.lang.Integer>(_list21.size);
              int _elem22;
              for (int _i23 = 0; _i23 < _list21.size; ++_i23)
              {
                _elem22 = iprot.readI32();
                _elem19.add(_elem22);
              }
            }
            struct.col_to_slot_map.add(_elem19);
          }
        }
        struct.setCol_to_slot_mapIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
