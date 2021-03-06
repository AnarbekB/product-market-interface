/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ru.balmukanov.productmarketinterface.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-03-11")
public class CreateProductDto implements org.apache.thrift.TBase<CreateProductDto, CreateProductDto._Fields>, java.io.Serializable, Cloneable, Comparable<CreateProductDto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateProductDto");

  private static final org.apache.thrift.protocol.TField EXTERNAL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("externalId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField AGREEMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("agreementId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("currency", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField ACTIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("active", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CreateProductDtoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CreateProductDtoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String externalId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  /**
   * 
   * @see ProductType
   */
  public @org.apache.thrift.annotation.Nullable ProductType type; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String agreementId; // required
  public long userId; // required
  public double amount; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String currency; // required
  public boolean active; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXTERNAL_ID((short)1, "externalId"),
    NAME((short)2, "name"),
    /**
     * 
     * @see ProductType
     */
    TYPE((short)3, "type"),
    AGREEMENT_ID((short)4, "agreementId"),
    USER_ID((short)5, "userId"),
    AMOUNT((short)6, "amount"),
    CURRENCY((short)7, "currency"),
    ACTIVE((short)8, "active");

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
        case 1: // EXTERNAL_ID
          return EXTERNAL_ID;
        case 2: // NAME
          return NAME;
        case 3: // TYPE
          return TYPE;
        case 4: // AGREEMENT_ID
          return AGREEMENT_ID;
        case 5: // USER_ID
          return USER_ID;
        case 6: // AMOUNT
          return AMOUNT;
        case 7: // CURRENCY
          return CURRENCY;
        case 8: // ACTIVE
          return ACTIVE;
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
  private static final int __USERID_ISSET_ID = 0;
  private static final int __AMOUNT_ISSET_ID = 1;
  private static final int __ACTIVE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXTERNAL_ID, new org.apache.thrift.meta_data.FieldMetaData("externalId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ProductType.class)));
    tmpMap.put(_Fields.AGREEMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("agreementId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("currency", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTIVE, new org.apache.thrift.meta_data.FieldMetaData("active", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateProductDto.class, metaDataMap);
  }

  public CreateProductDto() {
  }

  public CreateProductDto(
    java.lang.String externalId,
    java.lang.String name,
    ProductType type,
    java.lang.String agreementId,
    long userId,
    double amount,
    java.lang.String currency,
    boolean active)
  {
    this();
    this.externalId = externalId;
    this.name = name;
    this.type = type;
    this.agreementId = agreementId;
    this.userId = userId;
    setUserIdIsSet(true);
    this.amount = amount;
    setAmountIsSet(true);
    this.currency = currency;
    this.active = active;
    setActiveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateProductDto(CreateProductDto other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetExternalId()) {
      this.externalId = other.externalId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetAgreementId()) {
      this.agreementId = other.agreementId;
    }
    this.userId = other.userId;
    this.amount = other.amount;
    if (other.isSetCurrency()) {
      this.currency = other.currency;
    }
    this.active = other.active;
  }

  public CreateProductDto deepCopy() {
    return new CreateProductDto(this);
  }

  @Override
  public void clear() {
    this.externalId = null;
    this.name = null;
    this.type = null;
    this.agreementId = null;
    setUserIdIsSet(false);
    this.userId = 0;
    setAmountIsSet(false);
    this.amount = 0.0;
    this.currency = null;
    setActiveIsSet(false);
    this.active = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getExternalId() {
    return this.externalId;
  }

  public CreateProductDto setExternalId(@org.apache.thrift.annotation.Nullable java.lang.String externalId) {
    this.externalId = externalId;
    return this;
  }

  public void unsetExternalId() {
    this.externalId = null;
  }

  /** Returns true if field externalId is set (has been assigned a value) and false otherwise */
  public boolean isSetExternalId() {
    return this.externalId != null;
  }

  public void setExternalIdIsSet(boolean value) {
    if (!value) {
      this.externalId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public CreateProductDto setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
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

  /**
   * 
   * @see ProductType
   */
  @org.apache.thrift.annotation.Nullable
  public ProductType getType() {
    return this.type;
  }

  /**
   * 
   * @see ProductType
   */
  public CreateProductDto setType(@org.apache.thrift.annotation.Nullable ProductType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAgreementId() {
    return this.agreementId;
  }

  public CreateProductDto setAgreementId(@org.apache.thrift.annotation.Nullable java.lang.String agreementId) {
    this.agreementId = agreementId;
    return this;
  }

  public void unsetAgreementId() {
    this.agreementId = null;
  }

  /** Returns true if field agreementId is set (has been assigned a value) and false otherwise */
  public boolean isSetAgreementId() {
    return this.agreementId != null;
  }

  public void setAgreementIdIsSet(boolean value) {
    if (!value) {
      this.agreementId = null;
    }
  }

  public long getUserId() {
    return this.userId;
  }

  public CreateProductDto setUserId(long userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public double getAmount() {
    return this.amount;
  }

  public CreateProductDto setAmount(double amount) {
    this.amount = amount;
    setAmountIsSet(true);
    return this;
  }

  public void unsetAmount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  public void setAmountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AMOUNT_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCurrency() {
    return this.currency;
  }

  public CreateProductDto setCurrency(@org.apache.thrift.annotation.Nullable java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  public void unsetCurrency() {
    this.currency = null;
  }

  /** Returns true if field currency is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrency() {
    return this.currency != null;
  }

  public void setCurrencyIsSet(boolean value) {
    if (!value) {
      this.currency = null;
    }
  }

  public boolean isActive() {
    return this.active;
  }

  public CreateProductDto setActive(boolean active) {
    this.active = active;
    setActiveIsSet(true);
    return this;
  }

  public void unsetActive() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ACTIVE_ISSET_ID);
  }

  /** Returns true if field active is set (has been assigned a value) and false otherwise */
  public boolean isSetActive() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ACTIVE_ISSET_ID);
  }

  public void setActiveIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ACTIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EXTERNAL_ID:
      if (value == null) {
        unsetExternalId();
      } else {
        setExternalId((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((ProductType)value);
      }
      break;

    case AGREEMENT_ID:
      if (value == null) {
        unsetAgreementId();
      } else {
        setAgreementId((java.lang.String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.Long)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((java.lang.Double)value);
      }
      break;

    case CURRENCY:
      if (value == null) {
        unsetCurrency();
      } else {
        setCurrency((java.lang.String)value);
      }
      break;

    case ACTIVE:
      if (value == null) {
        unsetActive();
      } else {
        setActive((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXTERNAL_ID:
      return getExternalId();

    case NAME:
      return getName();

    case TYPE:
      return getType();

    case AGREEMENT_ID:
      return getAgreementId();

    case USER_ID:
      return getUserId();

    case AMOUNT:
      return getAmount();

    case CURRENCY:
      return getCurrency();

    case ACTIVE:
      return isActive();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXTERNAL_ID:
      return isSetExternalId();
    case NAME:
      return isSetName();
    case TYPE:
      return isSetType();
    case AGREEMENT_ID:
      return isSetAgreementId();
    case USER_ID:
      return isSetUserId();
    case AMOUNT:
      return isSetAmount();
    case CURRENCY:
      return isSetCurrency();
    case ACTIVE:
      return isSetActive();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateProductDto)
      return this.equals((CreateProductDto)that);
    return false;
  }

  public boolean equals(CreateProductDto that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_externalId = true && this.isSetExternalId();
    boolean that_present_externalId = true && that.isSetExternalId();
    if (this_present_externalId || that_present_externalId) {
      if (!(this_present_externalId && that_present_externalId))
        return false;
      if (!this.externalId.equals(that.externalId))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_agreementId = true && this.isSetAgreementId();
    boolean that_present_agreementId = true && that.isSetAgreementId();
    if (this_present_agreementId || that_present_agreementId) {
      if (!(this_present_agreementId && that_present_agreementId))
        return false;
      if (!this.agreementId.equals(that.agreementId))
        return false;
    }

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_amount = true;
    boolean that_present_amount = true;
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    boolean this_present_currency = true && this.isSetCurrency();
    boolean that_present_currency = true && that.isSetCurrency();
    if (this_present_currency || that_present_currency) {
      if (!(this_present_currency && that_present_currency))
        return false;
      if (!this.currency.equals(that.currency))
        return false;
    }

    boolean this_present_active = true;
    boolean that_present_active = true;
    if (this_present_active || that_present_active) {
      if (!(this_present_active && that_present_active))
        return false;
      if (this.active != that.active)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetExternalId()) ? 131071 : 524287);
    if (isSetExternalId())
      hashCode = hashCode * 8191 + externalId.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetAgreementId()) ? 131071 : 524287);
    if (isSetAgreementId())
      hashCode = hashCode * 8191 + agreementId.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(userId);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(amount);

    hashCode = hashCode * 8191 + ((isSetCurrency()) ? 131071 : 524287);
    if (isSetCurrency())
      hashCode = hashCode * 8191 + currency.hashCode();

    hashCode = hashCode * 8191 + ((active) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(CreateProductDto other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetExternalId()).compareTo(other.isSetExternalId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternalId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.externalId, other.externalId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAgreementId()).compareTo(other.isSetAgreementId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgreementId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agreementId, other.agreementId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAmount()).compareTo(other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, other.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCurrency()).compareTo(other.isSetCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currency, other.currency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetActive()).compareTo(other.isSetActive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.active, other.active);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateProductDto(");
    boolean first = true;

    sb.append("externalId:");
    if (this.externalId == null) {
      sb.append("null");
    } else {
      sb.append(this.externalId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("agreementId:");
    if (this.agreementId == null) {
      sb.append("null");
    } else {
      sb.append(this.agreementId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    sb.append(this.amount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("currency:");
    if (this.currency == null) {
      sb.append("null");
    } else {
      sb.append(this.currency);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("active:");
    sb.append(this.active);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (externalId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'externalId' was not present! Struct: " + toString());
    }
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    if (agreementId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'agreementId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'amount' because it's a primitive and you chose the non-beans generator.
    if (currency == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'currency' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'active' because it's a primitive and you chose the non-beans generator.
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

  private static class CreateProductDtoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CreateProductDtoStandardScheme getScheme() {
      return new CreateProductDtoStandardScheme();
    }
  }

  private static class CreateProductDtoStandardScheme extends org.apache.thrift.scheme.StandardScheme<CreateProductDto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreateProductDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXTERNAL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.externalId = iprot.readString();
              struct.setExternalIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = ru.balmukanov.productmarketinterface.thrift.ProductType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AGREEMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.agreementId = iprot.readString();
              struct.setAgreementIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.userId = iprot.readI64();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.amount = iprot.readDouble();
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currency = iprot.readString();
              struct.setCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // ACTIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.active = iprot.readBool();
              struct.setActiveIsSet(true);
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
      if (!struct.isSetUserId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetAmount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'amount' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetActive()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'active' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreateProductDto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.externalId != null) {
        oprot.writeFieldBegin(EXTERNAL_ID_FIELD_DESC);
        oprot.writeString(struct.externalId);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.agreementId != null) {
        oprot.writeFieldBegin(AGREEMENT_ID_FIELD_DESC);
        oprot.writeString(struct.agreementId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI64(struct.userId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
      oprot.writeDouble(struct.amount);
      oprot.writeFieldEnd();
      if (struct.currency != null) {
        oprot.writeFieldBegin(CURRENCY_FIELD_DESC);
        oprot.writeString(struct.currency);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ACTIVE_FIELD_DESC);
      oprot.writeBool(struct.active);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateProductDtoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CreateProductDtoTupleScheme getScheme() {
      return new CreateProductDtoTupleScheme();
    }
  }

  private static class CreateProductDtoTupleScheme extends org.apache.thrift.scheme.TupleScheme<CreateProductDto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CreateProductDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.externalId);
      oprot.writeString(struct.name);
      oprot.writeI32(struct.type.getValue());
      oprot.writeString(struct.agreementId);
      oprot.writeI64(struct.userId);
      oprot.writeDouble(struct.amount);
      oprot.writeString(struct.currency);
      oprot.writeBool(struct.active);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CreateProductDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.externalId = iprot.readString();
      struct.setExternalIdIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.type = ru.balmukanov.productmarketinterface.thrift.ProductType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.agreementId = iprot.readString();
      struct.setAgreementIdIsSet(true);
      struct.userId = iprot.readI64();
      struct.setUserIdIsSet(true);
      struct.amount = iprot.readDouble();
      struct.setAmountIsSet(true);
      struct.currency = iprot.readString();
      struct.setCurrencyIsSet(true);
      struct.active = iprot.readBool();
      struct.setActiveIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

