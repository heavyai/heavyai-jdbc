/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TTableRefreshInfo implements org.apache.thrift.TBase<TTableRefreshInfo, TTableRefreshInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TTableRefreshInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTableRefreshInfo");

  private static final org.apache.thrift.protocol.TField UPDATE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("update_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TIMING_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("timing_type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField START_DATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("start_date_time", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField INTERVAL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("interval_type", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField INTERVAL_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("interval_count", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField LAST_REFRESH_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("last_refresh_time", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField NEXT_REFRESH_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("next_refresh_time", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTableRefreshInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTableRefreshInfoTupleSchemeFactory();

  /**
   * 
   * @see TTableRefreshUpdateType
   */
  public @org.apache.thrift.annotation.Nullable TTableRefreshUpdateType update_type; // required
  /**
   * 
   * @see TTableRefreshTimingType
   */
  public @org.apache.thrift.annotation.Nullable TTableRefreshTimingType timing_type; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String start_date_time; // required
  /**
   * 
   * @see TTableRefreshIntervalType
   */
  public @org.apache.thrift.annotation.Nullable TTableRefreshIntervalType interval_type; // required
  public long interval_count; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String last_refresh_time; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String next_refresh_time; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TTableRefreshUpdateType
     */
    UPDATE_TYPE((short)1, "update_type"),
    /**
     * 
     * @see TTableRefreshTimingType
     */
    TIMING_TYPE((short)2, "timing_type"),
    START_DATE_TIME((short)3, "start_date_time"),
    /**
     * 
     * @see TTableRefreshIntervalType
     */
    INTERVAL_TYPE((short)4, "interval_type"),
    INTERVAL_COUNT((short)5, "interval_count"),
    LAST_REFRESH_TIME((short)6, "last_refresh_time"),
    NEXT_REFRESH_TIME((short)7, "next_refresh_time");

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
        case 1: // UPDATE_TYPE
          return UPDATE_TYPE;
        case 2: // TIMING_TYPE
          return TIMING_TYPE;
        case 3: // START_DATE_TIME
          return START_DATE_TIME;
        case 4: // INTERVAL_TYPE
          return INTERVAL_TYPE;
        case 5: // INTERVAL_COUNT
          return INTERVAL_COUNT;
        case 6: // LAST_REFRESH_TIME
          return LAST_REFRESH_TIME;
        case 7: // NEXT_REFRESH_TIME
          return NEXT_REFRESH_TIME;
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
  private static final int __INTERVAL_COUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UPDATE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("update_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TTableRefreshUpdateType.class)));
    tmpMap.put(_Fields.TIMING_TYPE, new org.apache.thrift.meta_data.FieldMetaData("timing_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TTableRefreshTimingType.class)));
    tmpMap.put(_Fields.START_DATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("start_date_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INTERVAL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("interval_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TTableRefreshIntervalType.class)));
    tmpMap.put(_Fields.INTERVAL_COUNT, new org.apache.thrift.meta_data.FieldMetaData("interval_count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_REFRESH_TIME, new org.apache.thrift.meta_data.FieldMetaData("last_refresh_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NEXT_REFRESH_TIME, new org.apache.thrift.meta_data.FieldMetaData("next_refresh_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTableRefreshInfo.class, metaDataMap);
  }

  public TTableRefreshInfo() {
  }

  public TTableRefreshInfo(
    TTableRefreshUpdateType update_type,
    TTableRefreshTimingType timing_type,
    java.lang.String start_date_time,
    TTableRefreshIntervalType interval_type,
    long interval_count,
    java.lang.String last_refresh_time,
    java.lang.String next_refresh_time)
  {
    this();
    this.update_type = update_type;
    this.timing_type = timing_type;
    this.start_date_time = start_date_time;
    this.interval_type = interval_type;
    this.interval_count = interval_count;
    setInterval_countIsSet(true);
    this.last_refresh_time = last_refresh_time;
    this.next_refresh_time = next_refresh_time;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTableRefreshInfo(TTableRefreshInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUpdate_type()) {
      this.update_type = other.update_type;
    }
    if (other.isSetTiming_type()) {
      this.timing_type = other.timing_type;
    }
    if (other.isSetStart_date_time()) {
      this.start_date_time = other.start_date_time;
    }
    if (other.isSetInterval_type()) {
      this.interval_type = other.interval_type;
    }
    this.interval_count = other.interval_count;
    if (other.isSetLast_refresh_time()) {
      this.last_refresh_time = other.last_refresh_time;
    }
    if (other.isSetNext_refresh_time()) {
      this.next_refresh_time = other.next_refresh_time;
    }
  }

  public TTableRefreshInfo deepCopy() {
    return new TTableRefreshInfo(this);
  }

  @Override
  public void clear() {
    this.update_type = null;
    this.timing_type = null;
    this.start_date_time = null;
    this.interval_type = null;
    setInterval_countIsSet(false);
    this.interval_count = 0;
    this.last_refresh_time = null;
    this.next_refresh_time = null;
  }

  /**
   * 
   * @see TTableRefreshUpdateType
   */
  @org.apache.thrift.annotation.Nullable
  public TTableRefreshUpdateType getUpdate_type() {
    return this.update_type;
  }

  /**
   * 
   * @see TTableRefreshUpdateType
   */
  public TTableRefreshInfo setUpdate_type(@org.apache.thrift.annotation.Nullable TTableRefreshUpdateType update_type) {
    this.update_type = update_type;
    return this;
  }

  public void unsetUpdate_type() {
    this.update_type = null;
  }

  /** Returns true if field update_type is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdate_type() {
    return this.update_type != null;
  }

  public void setUpdate_typeIsSet(boolean value) {
    if (!value) {
      this.update_type = null;
    }
  }

  /**
   * 
   * @see TTableRefreshTimingType
   */
  @org.apache.thrift.annotation.Nullable
  public TTableRefreshTimingType getTiming_type() {
    return this.timing_type;
  }

  /**
   * 
   * @see TTableRefreshTimingType
   */
  public TTableRefreshInfo setTiming_type(@org.apache.thrift.annotation.Nullable TTableRefreshTimingType timing_type) {
    this.timing_type = timing_type;
    return this;
  }

  public void unsetTiming_type() {
    this.timing_type = null;
  }

  /** Returns true if field timing_type is set (has been assigned a value) and false otherwise */
  public boolean isSetTiming_type() {
    return this.timing_type != null;
  }

  public void setTiming_typeIsSet(boolean value) {
    if (!value) {
      this.timing_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStart_date_time() {
    return this.start_date_time;
  }

  public TTableRefreshInfo setStart_date_time(@org.apache.thrift.annotation.Nullable java.lang.String start_date_time) {
    this.start_date_time = start_date_time;
    return this;
  }

  public void unsetStart_date_time() {
    this.start_date_time = null;
  }

  /** Returns true if field start_date_time is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_date_time() {
    return this.start_date_time != null;
  }

  public void setStart_date_timeIsSet(boolean value) {
    if (!value) {
      this.start_date_time = null;
    }
  }

  /**
   * 
   * @see TTableRefreshIntervalType
   */
  @org.apache.thrift.annotation.Nullable
  public TTableRefreshIntervalType getInterval_type() {
    return this.interval_type;
  }

  /**
   * 
   * @see TTableRefreshIntervalType
   */
  public TTableRefreshInfo setInterval_type(@org.apache.thrift.annotation.Nullable TTableRefreshIntervalType interval_type) {
    this.interval_type = interval_type;
    return this;
  }

  public void unsetInterval_type() {
    this.interval_type = null;
  }

  /** Returns true if field interval_type is set (has been assigned a value) and false otherwise */
  public boolean isSetInterval_type() {
    return this.interval_type != null;
  }

  public void setInterval_typeIsSet(boolean value) {
    if (!value) {
      this.interval_type = null;
    }
  }

  public long getInterval_count() {
    return this.interval_count;
  }

  public TTableRefreshInfo setInterval_count(long interval_count) {
    this.interval_count = interval_count;
    setInterval_countIsSet(true);
    return this;
  }

  public void unsetInterval_count() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INTERVAL_COUNT_ISSET_ID);
  }

  /** Returns true if field interval_count is set (has been assigned a value) and false otherwise */
  public boolean isSetInterval_count() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INTERVAL_COUNT_ISSET_ID);
  }

  public void setInterval_countIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INTERVAL_COUNT_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLast_refresh_time() {
    return this.last_refresh_time;
  }

  public TTableRefreshInfo setLast_refresh_time(@org.apache.thrift.annotation.Nullable java.lang.String last_refresh_time) {
    this.last_refresh_time = last_refresh_time;
    return this;
  }

  public void unsetLast_refresh_time() {
    this.last_refresh_time = null;
  }

  /** Returns true if field last_refresh_time is set (has been assigned a value) and false otherwise */
  public boolean isSetLast_refresh_time() {
    return this.last_refresh_time != null;
  }

  public void setLast_refresh_timeIsSet(boolean value) {
    if (!value) {
      this.last_refresh_time = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNext_refresh_time() {
    return this.next_refresh_time;
  }

  public TTableRefreshInfo setNext_refresh_time(@org.apache.thrift.annotation.Nullable java.lang.String next_refresh_time) {
    this.next_refresh_time = next_refresh_time;
    return this;
  }

  public void unsetNext_refresh_time() {
    this.next_refresh_time = null;
  }

  /** Returns true if field next_refresh_time is set (has been assigned a value) and false otherwise */
  public boolean isSetNext_refresh_time() {
    return this.next_refresh_time != null;
  }

  public void setNext_refresh_timeIsSet(boolean value) {
    if (!value) {
      this.next_refresh_time = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case UPDATE_TYPE:
      if (value == null) {
        unsetUpdate_type();
      } else {
        setUpdate_type((TTableRefreshUpdateType)value);
      }
      break;

    case TIMING_TYPE:
      if (value == null) {
        unsetTiming_type();
      } else {
        setTiming_type((TTableRefreshTimingType)value);
      }
      break;

    case START_DATE_TIME:
      if (value == null) {
        unsetStart_date_time();
      } else {
        setStart_date_time((java.lang.String)value);
      }
      break;

    case INTERVAL_TYPE:
      if (value == null) {
        unsetInterval_type();
      } else {
        setInterval_type((TTableRefreshIntervalType)value);
      }
      break;

    case INTERVAL_COUNT:
      if (value == null) {
        unsetInterval_count();
      } else {
        setInterval_count((java.lang.Long)value);
      }
      break;

    case LAST_REFRESH_TIME:
      if (value == null) {
        unsetLast_refresh_time();
      } else {
        setLast_refresh_time((java.lang.String)value);
      }
      break;

    case NEXT_REFRESH_TIME:
      if (value == null) {
        unsetNext_refresh_time();
      } else {
        setNext_refresh_time((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATE_TYPE:
      return getUpdate_type();

    case TIMING_TYPE:
      return getTiming_type();

    case START_DATE_TIME:
      return getStart_date_time();

    case INTERVAL_TYPE:
      return getInterval_type();

    case INTERVAL_COUNT:
      return getInterval_count();

    case LAST_REFRESH_TIME:
      return getLast_refresh_time();

    case NEXT_REFRESH_TIME:
      return getNext_refresh_time();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case UPDATE_TYPE:
      return isSetUpdate_type();
    case TIMING_TYPE:
      return isSetTiming_type();
    case START_DATE_TIME:
      return isSetStart_date_time();
    case INTERVAL_TYPE:
      return isSetInterval_type();
    case INTERVAL_COUNT:
      return isSetInterval_count();
    case LAST_REFRESH_TIME:
      return isSetLast_refresh_time();
    case NEXT_REFRESH_TIME:
      return isSetNext_refresh_time();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTableRefreshInfo)
      return this.equals((TTableRefreshInfo)that);
    return false;
  }

  public boolean equals(TTableRefreshInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_update_type = true && this.isSetUpdate_type();
    boolean that_present_update_type = true && that.isSetUpdate_type();
    if (this_present_update_type || that_present_update_type) {
      if (!(this_present_update_type && that_present_update_type))
        return false;
      if (!this.update_type.equals(that.update_type))
        return false;
    }

    boolean this_present_timing_type = true && this.isSetTiming_type();
    boolean that_present_timing_type = true && that.isSetTiming_type();
    if (this_present_timing_type || that_present_timing_type) {
      if (!(this_present_timing_type && that_present_timing_type))
        return false;
      if (!this.timing_type.equals(that.timing_type))
        return false;
    }

    boolean this_present_start_date_time = true && this.isSetStart_date_time();
    boolean that_present_start_date_time = true && that.isSetStart_date_time();
    if (this_present_start_date_time || that_present_start_date_time) {
      if (!(this_present_start_date_time && that_present_start_date_time))
        return false;
      if (!this.start_date_time.equals(that.start_date_time))
        return false;
    }

    boolean this_present_interval_type = true && this.isSetInterval_type();
    boolean that_present_interval_type = true && that.isSetInterval_type();
    if (this_present_interval_type || that_present_interval_type) {
      if (!(this_present_interval_type && that_present_interval_type))
        return false;
      if (!this.interval_type.equals(that.interval_type))
        return false;
    }

    boolean this_present_interval_count = true;
    boolean that_present_interval_count = true;
    if (this_present_interval_count || that_present_interval_count) {
      if (!(this_present_interval_count && that_present_interval_count))
        return false;
      if (this.interval_count != that.interval_count)
        return false;
    }

    boolean this_present_last_refresh_time = true && this.isSetLast_refresh_time();
    boolean that_present_last_refresh_time = true && that.isSetLast_refresh_time();
    if (this_present_last_refresh_time || that_present_last_refresh_time) {
      if (!(this_present_last_refresh_time && that_present_last_refresh_time))
        return false;
      if (!this.last_refresh_time.equals(that.last_refresh_time))
        return false;
    }

    boolean this_present_next_refresh_time = true && this.isSetNext_refresh_time();
    boolean that_present_next_refresh_time = true && that.isSetNext_refresh_time();
    if (this_present_next_refresh_time || that_present_next_refresh_time) {
      if (!(this_present_next_refresh_time && that_present_next_refresh_time))
        return false;
      if (!this.next_refresh_time.equals(that.next_refresh_time))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUpdate_type()) ? 131071 : 524287);
    if (isSetUpdate_type())
      hashCode = hashCode * 8191 + update_type.getValue();

    hashCode = hashCode * 8191 + ((isSetTiming_type()) ? 131071 : 524287);
    if (isSetTiming_type())
      hashCode = hashCode * 8191 + timing_type.getValue();

    hashCode = hashCode * 8191 + ((isSetStart_date_time()) ? 131071 : 524287);
    if (isSetStart_date_time())
      hashCode = hashCode * 8191 + start_date_time.hashCode();

    hashCode = hashCode * 8191 + ((isSetInterval_type()) ? 131071 : 524287);
    if (isSetInterval_type())
      hashCode = hashCode * 8191 + interval_type.getValue();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(interval_count);

    hashCode = hashCode * 8191 + ((isSetLast_refresh_time()) ? 131071 : 524287);
    if (isSetLast_refresh_time())
      hashCode = hashCode * 8191 + last_refresh_time.hashCode();

    hashCode = hashCode * 8191 + ((isSetNext_refresh_time()) ? 131071 : 524287);
    if (isSetNext_refresh_time())
      hashCode = hashCode * 8191 + next_refresh_time.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTableRefreshInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetUpdate_type(), other.isSetUpdate_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdate_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.update_type, other.update_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTiming_type(), other.isSetTiming_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTiming_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timing_type, other.timing_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStart_date_time(), other.isSetStart_date_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_date_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_date_time, other.start_date_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInterval_type(), other.isSetInterval_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterval_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interval_type, other.interval_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInterval_count(), other.isSetInterval_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterval_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interval_count, other.interval_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLast_refresh_time(), other.isSetLast_refresh_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLast_refresh_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.last_refresh_time, other.last_refresh_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNext_refresh_time(), other.isSetNext_refresh_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNext_refresh_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.next_refresh_time, other.next_refresh_time);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTableRefreshInfo(");
    boolean first = true;

    sb.append("update_type:");
    if (this.update_type == null) {
      sb.append("null");
    } else {
      sb.append(this.update_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timing_type:");
    if (this.timing_type == null) {
      sb.append("null");
    } else {
      sb.append(this.timing_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("start_date_time:");
    if (this.start_date_time == null) {
      sb.append("null");
    } else {
      sb.append(this.start_date_time);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("interval_type:");
    if (this.interval_type == null) {
      sb.append("null");
    } else {
      sb.append(this.interval_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("interval_count:");
    sb.append(this.interval_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("last_refresh_time:");
    if (this.last_refresh_time == null) {
      sb.append("null");
    } else {
      sb.append(this.last_refresh_time);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("next_refresh_time:");
    if (this.next_refresh_time == null) {
      sb.append("null");
    } else {
      sb.append(this.next_refresh_time);
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

  private static class TTableRefreshInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTableRefreshInfoStandardScheme getScheme() {
      return new TTableRefreshInfoStandardScheme();
    }
  }

  private static class TTableRefreshInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTableRefreshInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTableRefreshInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UPDATE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.update_type = ai.heavy.thrift.server.TTableRefreshUpdateType.findByValue(iprot.readI32());
              struct.setUpdate_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIMING_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timing_type = ai.heavy.thrift.server.TTableRefreshTimingType.findByValue(iprot.readI32());
              struct.setTiming_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // START_DATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.start_date_time = iprot.readString();
              struct.setStart_date_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INTERVAL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.interval_type = ai.heavy.thrift.server.TTableRefreshIntervalType.findByValue(iprot.readI32());
              struct.setInterval_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INTERVAL_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.interval_count = iprot.readI64();
              struct.setInterval_countIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LAST_REFRESH_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.last_refresh_time = iprot.readString();
              struct.setLast_refresh_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // NEXT_REFRESH_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.next_refresh_time = iprot.readString();
              struct.setNext_refresh_timeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTableRefreshInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.update_type != null) {
        oprot.writeFieldBegin(UPDATE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.update_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.timing_type != null) {
        oprot.writeFieldBegin(TIMING_TYPE_FIELD_DESC);
        oprot.writeI32(struct.timing_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.start_date_time != null) {
        oprot.writeFieldBegin(START_DATE_TIME_FIELD_DESC);
        oprot.writeString(struct.start_date_time);
        oprot.writeFieldEnd();
      }
      if (struct.interval_type != null) {
        oprot.writeFieldBegin(INTERVAL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.interval_type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INTERVAL_COUNT_FIELD_DESC);
      oprot.writeI64(struct.interval_count);
      oprot.writeFieldEnd();
      if (struct.last_refresh_time != null) {
        oprot.writeFieldBegin(LAST_REFRESH_TIME_FIELD_DESC);
        oprot.writeString(struct.last_refresh_time);
        oprot.writeFieldEnd();
      }
      if (struct.next_refresh_time != null) {
        oprot.writeFieldBegin(NEXT_REFRESH_TIME_FIELD_DESC);
        oprot.writeString(struct.next_refresh_time);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTableRefreshInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTableRefreshInfoTupleScheme getScheme() {
      return new TTableRefreshInfoTupleScheme();
    }
  }

  private static class TTableRefreshInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTableRefreshInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTableRefreshInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUpdate_type()) {
        optionals.set(0);
      }
      if (struct.isSetTiming_type()) {
        optionals.set(1);
      }
      if (struct.isSetStart_date_time()) {
        optionals.set(2);
      }
      if (struct.isSetInterval_type()) {
        optionals.set(3);
      }
      if (struct.isSetInterval_count()) {
        optionals.set(4);
      }
      if (struct.isSetLast_refresh_time()) {
        optionals.set(5);
      }
      if (struct.isSetNext_refresh_time()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetUpdate_type()) {
        oprot.writeI32(struct.update_type.getValue());
      }
      if (struct.isSetTiming_type()) {
        oprot.writeI32(struct.timing_type.getValue());
      }
      if (struct.isSetStart_date_time()) {
        oprot.writeString(struct.start_date_time);
      }
      if (struct.isSetInterval_type()) {
        oprot.writeI32(struct.interval_type.getValue());
      }
      if (struct.isSetInterval_count()) {
        oprot.writeI64(struct.interval_count);
      }
      if (struct.isSetLast_refresh_time()) {
        oprot.writeString(struct.last_refresh_time);
      }
      if (struct.isSetNext_refresh_time()) {
        oprot.writeString(struct.next_refresh_time);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTableRefreshInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.update_type = ai.heavy.thrift.server.TTableRefreshUpdateType.findByValue(iprot.readI32());
        struct.setUpdate_typeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timing_type = ai.heavy.thrift.server.TTableRefreshTimingType.findByValue(iprot.readI32());
        struct.setTiming_typeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.start_date_time = iprot.readString();
        struct.setStart_date_timeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.interval_type = ai.heavy.thrift.server.TTableRefreshIntervalType.findByValue(iprot.readI32());
        struct.setInterval_typeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.interval_count = iprot.readI64();
        struct.setInterval_countIsSet(true);
      }
      if (incoming.get(5)) {
        struct.last_refresh_time = iprot.readString();
        struct.setLast_refresh_timeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.next_refresh_time = iprot.readString();
        struct.setNext_refresh_timeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
