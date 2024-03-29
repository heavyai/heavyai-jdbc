/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TCountDistinctSetStorage extends org.apache.thrift.TUnion<TCountDistinctSetStorage, TCountDistinctSetStorage._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCountDistinctSetStorage");
  private static final org.apache.thrift.protocol.TField BITMAP_FIELD_DESC = new org.apache.thrift.protocol.TField("bitmap", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SPARSE_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("sparse_set", org.apache.thrift.protocol.TType.SET, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BITMAP((short)1, "bitmap"),
    SPARSE_SET((short)2, "sparse_set");

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
        case 1: // BITMAP
          return BITMAP;
        case 2: // SPARSE_SET
          return SPARSE_SET;
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

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BITMAP, new org.apache.thrift.meta_data.FieldMetaData("bitmap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SPARSE_SET, new org.apache.thrift.meta_data.FieldMetaData("sparse_set", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCountDistinctSetStorage.class, metaDataMap);
  }

  public TCountDistinctSetStorage() {
    super();
  }

  public TCountDistinctSetStorage(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public TCountDistinctSetStorage(TCountDistinctSetStorage other) {
    super(other);
  }
  public TCountDistinctSetStorage deepCopy() {
    return new TCountDistinctSetStorage(this);
  }

  public static TCountDistinctSetStorage bitmap(java.nio.ByteBuffer value) {
    TCountDistinctSetStorage x = new TCountDistinctSetStorage();
    x.setBitmap(value);
    return x;
  }

  public static TCountDistinctSetStorage bitmap(byte[] value) {
    TCountDistinctSetStorage x = new TCountDistinctSetStorage();
    x.setBitmap  (java.nio.ByteBuffer.wrap(value.clone()));
    return x;
  }

  public static TCountDistinctSetStorage sparse_set(java.util.Set<java.lang.Long> value) {
    TCountDistinctSetStorage x = new TCountDistinctSetStorage();
    x.setSparse_set(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case BITMAP:
        if (value instanceof java.nio.ByteBuffer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.nio.ByteBuffer for field 'bitmap', but got " + value.getClass().getSimpleName());
      case SPARSE_SET:
        if (value instanceof java.util.Set) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.util.Set<java.lang.Long> for field 'sparse_set', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case BITMAP:
          if (field.type == BITMAP_FIELD_DESC.type) {
            java.nio.ByteBuffer bitmap;
            bitmap = iprot.readBinary();
            return bitmap;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SPARSE_SET:
          if (field.type == SPARSE_SET_FIELD_DESC.type) {
            java.util.Set<java.lang.Long> sparse_set;
            {
              org.apache.thrift.protocol.TSet _set48 = iprot.readSetBegin();
              sparse_set = new java.util.HashSet<java.lang.Long>(2*_set48.size);
              long _elem49;
              for (int _i50 = 0; _i50 < _set48.size; ++_i50)
              {
                _elem49 = iprot.readI64();
                sparse_set.add(_elem49);
              }
              iprot.readSetEnd();
            }
            return sparse_set;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BITMAP:
        java.nio.ByteBuffer bitmap = (java.nio.ByteBuffer)value_;
        oprot.writeBinary(bitmap);
        return;
      case SPARSE_SET:
        java.util.Set<java.lang.Long> sparse_set = (java.util.Set<java.lang.Long>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, sparse_set.size()));
          for (long _iter51 : sparse_set)
          {
            oprot.writeI64(_iter51);
          }
          oprot.writeSetEnd();
        }
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case BITMAP:
          java.nio.ByteBuffer bitmap;
          bitmap = iprot.readBinary();
          return bitmap;
        case SPARSE_SET:
          java.util.Set<java.lang.Long> sparse_set;
          {
            org.apache.thrift.protocol.TSet _set52 = iprot.readSetBegin();
            sparse_set = new java.util.HashSet<java.lang.Long>(2*_set52.size);
            long _elem53;
            for (int _i54 = 0; _i54 < _set52.size; ++_i54)
            {
              _elem53 = iprot.readI64();
              sparse_set.add(_elem53);
            }
            iprot.readSetEnd();
          }
          return sparse_set;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BITMAP:
        java.nio.ByteBuffer bitmap = (java.nio.ByteBuffer)value_;
        oprot.writeBinary(bitmap);
        return;
      case SPARSE_SET:
        java.util.Set<java.lang.Long> sparse_set = (java.util.Set<java.lang.Long>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, sparse_set.size()));
          for (long _iter55 : sparse_set)
          {
            oprot.writeI64(_iter55);
          }
          oprot.writeSetEnd();
        }
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case BITMAP:
        return BITMAP_FIELD_DESC;
      case SPARSE_SET:
        return SPARSE_SET_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public byte[] getBitmap() {
    setBitmap(org.apache.thrift.TBaseHelper.rightSize(bufferForBitmap()));
    java.nio.ByteBuffer b = bufferForBitmap();
    return b == null ? null : b.array();
  }

  public java.nio.ByteBuffer bufferForBitmap() {
    if (getSetField() == _Fields.BITMAP) {
      return org.apache.thrift.TBaseHelper.copyBinary((java.nio.ByteBuffer)getFieldValue());
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'bitmap' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBitmap(byte[] value) {
    setBitmap  (java.nio.ByteBuffer.wrap(value.clone()));
  }

  public void setBitmap(java.nio.ByteBuffer value) {
    setField_ = _Fields.BITMAP;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.BITMAP");
  }

  public java.util.Set<java.lang.Long> getSparse_set() {
    if (getSetField() == _Fields.SPARSE_SET) {
      return (java.util.Set<java.lang.Long>)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'sparse_set' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSparse_set(java.util.Set<java.lang.Long> value) {
    setField_ = _Fields.SPARSE_SET;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.SPARSE_SET");
  }

  public boolean isSetBitmap() {
    return setField_ == _Fields.BITMAP;
  }


  public boolean isSetSparse_set() {
    return setField_ == _Fields.SPARSE_SET;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof TCountDistinctSetStorage) {
      return equals((TCountDistinctSetStorage)other);
    } else {
      return false;
    }
  }

  public boolean equals(TCountDistinctSetStorage other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TCountDistinctSetStorage other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}
