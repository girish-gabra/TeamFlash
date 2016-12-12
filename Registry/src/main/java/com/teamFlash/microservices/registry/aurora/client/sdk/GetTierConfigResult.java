/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.teamFlash.microservices.registry.aurora.client.sdk;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Result of the getTierConfigResult call.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-10")
public class GetTierConfigResult implements org.apache.thrift.TBase<GetTierConfigResult, GetTierConfigResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetTierConfigResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetTierConfigResult");

  private static final org.apache.thrift.protocol.TField DEFAULT_TIER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultTierName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TIERS_FIELD_DESC = new org.apache.thrift.protocol.TField("tiers", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetTierConfigResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetTierConfigResultTupleSchemeFactory());
  }

  /**
   * Name of the default tier.
   */
  public String defaultTierName; // required
  /**
   * Set of tier configurations.
   */
  public Set<TierConfig> tiers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Name of the default tier.
     */
    DEFAULT_TIER_NAME((short)1, "defaultTierName"),
    /**
     * Set of tier configurations.
     */
    TIERS((short)2, "tiers");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DEFAULT_TIER_NAME
          return DEFAULT_TIER_NAME;
        case 2: // TIERS
          return TIERS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEFAULT_TIER_NAME, new org.apache.thrift.meta_data.FieldMetaData("defaultTierName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIERS, new org.apache.thrift.meta_data.FieldMetaData("tiers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TierConfig.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetTierConfigResult.class, metaDataMap);
  }

  public GetTierConfigResult() {
  }

  public GetTierConfigResult(
    String defaultTierName,
    Set<TierConfig> tiers)
  {
    this();
    this.defaultTierName = defaultTierName;
    this.tiers = tiers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetTierConfigResult(GetTierConfigResult other) {
    if (other.isSetDefaultTierName()) {
      this.defaultTierName = other.defaultTierName;
    }
    if (other.isSetTiers()) {
      Set<TierConfig> __this__tiers = new HashSet<TierConfig>(other.tiers.size());
      for (TierConfig other_element : other.tiers) {
        __this__tiers.add(new TierConfig(other_element));
      }
      this.tiers = __this__tiers;
    }
  }

  public GetTierConfigResult deepCopy() {
    return new GetTierConfigResult(this);
  }

  @Override
  public void clear() {
    this.defaultTierName = null;
    this.tiers = null;
  }

  /**
   * Name of the default tier.
   */
  public String getDefaultTierName() {
    return this.defaultTierName;
  }

  /**
   * Name of the default tier.
   */
  public GetTierConfigResult setDefaultTierName(String defaultTierName) {
    this.defaultTierName = defaultTierName;
    return this;
  }

  public void unsetDefaultTierName() {
    this.defaultTierName = null;
  }

  /** Returns true if field defaultTierName is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultTierName() {
    return this.defaultTierName != null;
  }

  public void setDefaultTierNameIsSet(boolean value) {
    if (!value) {
      this.defaultTierName = null;
    }
  }

  public int getTiersSize() {
    return (this.tiers == null) ? 0 : this.tiers.size();
  }

  public java.util.Iterator<TierConfig> getTiersIterator() {
    return (this.tiers == null) ? null : this.tiers.iterator();
  }

  public void addToTiers(TierConfig elem) {
    if (this.tiers == null) {
      this.tiers = new HashSet<TierConfig>();
    }
    this.tiers.add(elem);
  }

  /**
   * Set of tier configurations.
   */
  public Set<TierConfig> getTiers() {
    return this.tiers;
  }

  /**
   * Set of tier configurations.
   */
  public GetTierConfigResult setTiers(Set<TierConfig> tiers) {
    this.tiers = tiers;
    return this;
  }

  public void unsetTiers() {
    this.tiers = null;
  }

  /** Returns true if field tiers is set (has been assigned a value) and false otherwise */
  public boolean isSetTiers() {
    return this.tiers != null;
  }

  public void setTiersIsSet(boolean value) {
    if (!value) {
      this.tiers = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEFAULT_TIER_NAME:
      if (value == null) {
        unsetDefaultTierName();
      } else {
        setDefaultTierName((String)value);
      }
      break;

    case TIERS:
      if (value == null) {
        unsetTiers();
      } else {
        setTiers((Set<TierConfig>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEFAULT_TIER_NAME:
      return getDefaultTierName();

    case TIERS:
      return getTiers();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEFAULT_TIER_NAME:
      return isSetDefaultTierName();
    case TIERS:
      return isSetTiers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetTierConfigResult)
      return this.equals((GetTierConfigResult)that);
    return false;
  }

  public boolean equals(GetTierConfigResult that) {
    if (that == null)
      return false;

    boolean this_present_defaultTierName = true && this.isSetDefaultTierName();
    boolean that_present_defaultTierName = true && that.isSetDefaultTierName();
    if (this_present_defaultTierName || that_present_defaultTierName) {
      if (!(this_present_defaultTierName && that_present_defaultTierName))
        return false;
      if (!this.defaultTierName.equals(that.defaultTierName))
        return false;
    }

    boolean this_present_tiers = true && this.isSetTiers();
    boolean that_present_tiers = true && that.isSetTiers();
    if (this_present_tiers || that_present_tiers) {
      if (!(this_present_tiers && that_present_tiers))
        return false;
      if (!this.tiers.equals(that.tiers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_defaultTierName = true && (isSetDefaultTierName());
    list.add(present_defaultTierName);
    if (present_defaultTierName)
      list.add(defaultTierName);

    boolean present_tiers = true && (isSetTiers());
    list.add(present_tiers);
    if (present_tiers)
      list.add(tiers);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetTierConfigResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDefaultTierName()).compareTo(other.isSetDefaultTierName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultTierName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultTierName, other.defaultTierName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTiers()).compareTo(other.isSetTiers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTiers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tiers, other.tiers);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetTierConfigResult(");
    boolean first = true;

    sb.append("defaultTierName:");
    if (this.defaultTierName == null) {
      sb.append("null");
    } else {
      sb.append(this.defaultTierName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tiers:");
    if (this.tiers == null) {
      sb.append("null");
    } else {
      sb.append(this.tiers);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetTierConfigResultStandardSchemeFactory implements SchemeFactory {
    public GetTierConfigResultStandardScheme getScheme() {
      return new GetTierConfigResultStandardScheme();
    }
  }

  private static class GetTierConfigResultStandardScheme extends StandardScheme<GetTierConfigResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetTierConfigResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEFAULT_TIER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.defaultTierName = iprot.readString();
              struct.setDefaultTierNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIERS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set392 = iprot.readSetBegin();
                struct.tiers = new HashSet<TierConfig>(2*_set392.size);
                TierConfig _elem393;
                for (int _i394 = 0; _i394 < _set392.size; ++_i394)
                {
                  _elem393 = new TierConfig();
                  _elem393.read(iprot);
                  struct.tiers.add(_elem393);
                }
                iprot.readSetEnd();
              }
              struct.setTiersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetTierConfigResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.defaultTierName != null) {
        oprot.writeFieldBegin(DEFAULT_TIER_NAME_FIELD_DESC);
        oprot.writeString(struct.defaultTierName);
        oprot.writeFieldEnd();
      }
      if (struct.tiers != null) {
        oprot.writeFieldBegin(TIERS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.tiers.size()));
          for (TierConfig _iter395 : struct.tiers)
          {
            _iter395.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetTierConfigResultTupleSchemeFactory implements SchemeFactory {
    public GetTierConfigResultTupleScheme getScheme() {
      return new GetTierConfigResultTupleScheme();
    }
  }

  private static class GetTierConfigResultTupleScheme extends TupleScheme<GetTierConfigResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetTierConfigResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDefaultTierName()) {
        optionals.set(0);
      }
      if (struct.isSetTiers()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDefaultTierName()) {
        oprot.writeString(struct.defaultTierName);
      }
      if (struct.isSetTiers()) {
        {
          oprot.writeI32(struct.tiers.size());
          for (TierConfig _iter396 : struct.tiers)
          {
            _iter396.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetTierConfigResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.defaultTierName = iprot.readString();
        struct.setDefaultTierNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TSet _set397 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.tiers = new HashSet<TierConfig>(2*_set397.size);
          TierConfig _elem398;
          for (int _i399 = 0; _i399 < _set397.size; ++_i399)
          {
            _elem398 = new TierConfig();
            _elem398.read(iprot);
            struct.tiers.add(_elem398);
          }
        }
        struct.setTiersIsSet(true);
      }
    }
  }

}

