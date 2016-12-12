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
 * A request to update the following instances of an existing job. Used by startUpdate.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-10")
public class JobUpdateRequest implements org.apache.thrift.TBase<JobUpdateRequest, JobUpdateRequest._Fields>, java.io.Serializable, Cloneable, Comparable<JobUpdateRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobUpdateRequest");

  private static final org.apache.thrift.protocol.TField TASK_CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("taskConfig", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INSTANCE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceCount", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("settings", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.SET, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobUpdateRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobUpdateRequestTupleSchemeFactory());
  }

  /**
   * Desired TaskConfig to apply.
   */
  public TaskConfig taskConfig; // required
  /**
   * Desired number of instances of the task config.
   */
  public int instanceCount; // required
  /**
   * Update settings and limits.
   */
  public JobUpdateSettings settings; // required
  /**
   * Update metadata supplied by the client issuing the JobUpdateRequest.
   */
  public Set<Metadata> metadata; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Desired TaskConfig to apply.
     */
    TASK_CONFIG((short)1, "taskConfig"),
    /**
     * Desired number of instances of the task config.
     */
    INSTANCE_COUNT((short)2, "instanceCount"),
    /**
     * Update settings and limits.
     */
    SETTINGS((short)3, "settings"),
    /**
     * Update metadata supplied by the client issuing the JobUpdateRequest.
     */
    METADATA((short)4, "metadata");

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
        case 1: // TASK_CONFIG
          return TASK_CONFIG;
        case 2: // INSTANCE_COUNT
          return INSTANCE_COUNT;
        case 3: // SETTINGS
          return SETTINGS;
        case 4: // METADATA
          return METADATA;
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
  private static final int __INSTANCECOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.METADATA};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_CONFIG, new org.apache.thrift.meta_data.FieldMetaData("taskConfig", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskConfig.class)));
    tmpMap.put(_Fields.INSTANCE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("instanceCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("settings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobUpdateSettings.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Metadata.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobUpdateRequest.class, metaDataMap);
  }

  public JobUpdateRequest() {
  }

  public JobUpdateRequest(
    TaskConfig taskConfig,
    int instanceCount,
    JobUpdateSettings settings)
  {
    this();
    this.taskConfig = taskConfig;
    this.instanceCount = instanceCount;
    setInstanceCountIsSet(true);
    this.settings = settings;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobUpdateRequest(JobUpdateRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTaskConfig()) {
      this.taskConfig = new TaskConfig(other.taskConfig);
    }
    this.instanceCount = other.instanceCount;
    if (other.isSetSettings()) {
      this.settings = new JobUpdateSettings(other.settings);
    }
    if (other.isSetMetadata()) {
      Set<Metadata> __this__metadata = new HashSet<Metadata>(other.metadata.size());
      for (Metadata other_element : other.metadata) {
        __this__metadata.add(new Metadata(other_element));
      }
      this.metadata = __this__metadata;
    }
  }

  public JobUpdateRequest deepCopy() {
    return new JobUpdateRequest(this);
  }

  @Override
  public void clear() {
    this.taskConfig = null;
    setInstanceCountIsSet(false);
    this.instanceCount = 0;
    this.settings = null;
    this.metadata = null;
  }

  /**
   * Desired TaskConfig to apply.
   */
  public TaskConfig getTaskConfig() {
    return this.taskConfig;
  }

  /**
   * Desired TaskConfig to apply.
   */
  public JobUpdateRequest setTaskConfig(TaskConfig taskConfig) {
    this.taskConfig = taskConfig;
    return this;
  }

  public void unsetTaskConfig() {
    this.taskConfig = null;
  }

  /** Returns true if field taskConfig is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskConfig() {
    return this.taskConfig != null;
  }

  public void setTaskConfigIsSet(boolean value) {
    if (!value) {
      this.taskConfig = null;
    }
  }

  /**
   * Desired number of instances of the task config.
   */
  public int getInstanceCount() {
    return this.instanceCount;
  }

  /**
   * Desired number of instances of the task config.
   */
  public JobUpdateRequest setInstanceCount(int instanceCount) {
    this.instanceCount = instanceCount;
    setInstanceCountIsSet(true);
    return this;
  }

  public void unsetInstanceCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INSTANCECOUNT_ISSET_ID);
  }

  /** Returns true if field instanceCount is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceCount() {
    return EncodingUtils.testBit(__isset_bitfield, __INSTANCECOUNT_ISSET_ID);
  }

  public void setInstanceCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INSTANCECOUNT_ISSET_ID, value);
  }

  /**
   * Update settings and limits.
   */
  public JobUpdateSettings getSettings() {
    return this.settings;
  }

  /**
   * Update settings and limits.
   */
  public JobUpdateRequest setSettings(JobUpdateSettings settings) {
    this.settings = settings;
    return this;
  }

  public void unsetSettings() {
    this.settings = null;
  }

  /** Returns true if field settings is set (has been assigned a value) and false otherwise */
  public boolean isSetSettings() {
    return this.settings != null;
  }

  public void setSettingsIsSet(boolean value) {
    if (!value) {
      this.settings = null;
    }
  }

  public int getMetadataSize() {
    return (this.metadata == null) ? 0 : this.metadata.size();
  }

  public java.util.Iterator<Metadata> getMetadataIterator() {
    return (this.metadata == null) ? null : this.metadata.iterator();
  }

  public void addToMetadata(Metadata elem) {
    if (this.metadata == null) {
      this.metadata = new HashSet<Metadata>();
    }
    this.metadata.add(elem);
  }

  /**
   * Update metadata supplied by the client issuing the JobUpdateRequest.
   */
  public Set<Metadata> getMetadata() {
    return this.metadata;
  }

  /**
   * Update metadata supplied by the client issuing the JobUpdateRequest.
   */
  public JobUpdateRequest setMetadata(Set<Metadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_CONFIG:
      if (value == null) {
        unsetTaskConfig();
      } else {
        setTaskConfig((TaskConfig)value);
      }
      break;

    case INSTANCE_COUNT:
      if (value == null) {
        unsetInstanceCount();
      } else {
        setInstanceCount((Integer)value);
      }
      break;

    case SETTINGS:
      if (value == null) {
        unsetSettings();
      } else {
        setSettings((JobUpdateSettings)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((Set<Metadata>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_CONFIG:
      return getTaskConfig();

    case INSTANCE_COUNT:
      return getInstanceCount();

    case SETTINGS:
      return getSettings();

    case METADATA:
      return getMetadata();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_CONFIG:
      return isSetTaskConfig();
    case INSTANCE_COUNT:
      return isSetInstanceCount();
    case SETTINGS:
      return isSetSettings();
    case METADATA:
      return isSetMetadata();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobUpdateRequest)
      return this.equals((JobUpdateRequest)that);
    return false;
  }

  public boolean equals(JobUpdateRequest that) {
    if (that == null)
      return false;

    boolean this_present_taskConfig = true && this.isSetTaskConfig();
    boolean that_present_taskConfig = true && that.isSetTaskConfig();
    if (this_present_taskConfig || that_present_taskConfig) {
      if (!(this_present_taskConfig && that_present_taskConfig))
        return false;
      if (!this.taskConfig.equals(that.taskConfig))
        return false;
    }

    boolean this_present_instanceCount = true;
    boolean that_present_instanceCount = true;
    if (this_present_instanceCount || that_present_instanceCount) {
      if (!(this_present_instanceCount && that_present_instanceCount))
        return false;
      if (this.instanceCount != that.instanceCount)
        return false;
    }

    boolean this_present_settings = true && this.isSetSettings();
    boolean that_present_settings = true && that.isSetSettings();
    if (this_present_settings || that_present_settings) {
      if (!(this_present_settings && that_present_settings))
        return false;
      if (!this.settings.equals(that.settings))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskConfig = true && (isSetTaskConfig());
    list.add(present_taskConfig);
    if (present_taskConfig)
      list.add(taskConfig);

    boolean present_instanceCount = true;
    list.add(present_instanceCount);
    if (present_instanceCount)
      list.add(instanceCount);

    boolean present_settings = true && (isSetSettings());
    list.add(present_settings);
    if (present_settings)
      list.add(settings);

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobUpdateRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskConfig()).compareTo(other.isSetTaskConfig());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskConfig()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskConfig, other.taskConfig);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstanceCount()).compareTo(other.isSetInstanceCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceCount, other.instanceCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSettings()).compareTo(other.isSetSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.settings, other.settings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
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
    StringBuilder sb = new StringBuilder("JobUpdateRequest(");
    boolean first = true;

    sb.append("taskConfig:");
    if (this.taskConfig == null) {
      sb.append("null");
    } else {
      sb.append(this.taskConfig);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("instanceCount:");
    sb.append(this.instanceCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("settings:");
    if (this.settings == null) {
      sb.append("null");
    } else {
      sb.append(this.settings);
    }
    first = false;
    if (isSetMetadata()) {
      if (!first) sb.append(", ");
      sb.append("metadata:");
      if (this.metadata == null) {
        sb.append("null");
      } else {
        sb.append(this.metadata);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (taskConfig != null) {
      taskConfig.validate();
    }
    if (settings != null) {
      settings.validate();
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobUpdateRequestStandardSchemeFactory implements SchemeFactory {
    public JobUpdateRequestStandardScheme getScheme() {
      return new JobUpdateRequestStandardScheme();
    }
  }

  private static class JobUpdateRequestStandardScheme extends StandardScheme<JobUpdateRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobUpdateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_CONFIG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskConfig = new TaskConfig();
              struct.taskConfig.read(iprot);
              struct.setTaskConfigIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INSTANCE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.instanceCount = iprot.readI32();
              struct.setInstanceCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.settings = new JobUpdateSettings();
              struct.settings.read(iprot);
              struct.setSettingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set246 = iprot.readSetBegin();
                struct.metadata = new HashSet<Metadata>(2*_set246.size);
                Metadata _elem247;
                for (int _i248 = 0; _i248 < _set246.size; ++_i248)
                {
                  _elem247 = new Metadata();
                  _elem247.read(iprot);
                  struct.metadata.add(_elem247);
                }
                iprot.readSetEnd();
              }
              struct.setMetadataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobUpdateRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskConfig != null) {
        oprot.writeFieldBegin(TASK_CONFIG_FIELD_DESC);
        struct.taskConfig.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INSTANCE_COUNT_FIELD_DESC);
      oprot.writeI32(struct.instanceCount);
      oprot.writeFieldEnd();
      if (struct.settings != null) {
        oprot.writeFieldBegin(SETTINGS_FIELD_DESC);
        struct.settings.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.metadata != null) {
        if (struct.isSetMetadata()) {
          oprot.writeFieldBegin(METADATA_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.metadata.size()));
            for (Metadata _iter249 : struct.metadata)
            {
              _iter249.write(oprot);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobUpdateRequestTupleSchemeFactory implements SchemeFactory {
    public JobUpdateRequestTupleScheme getScheme() {
      return new JobUpdateRequestTupleScheme();
    }
  }

  private static class JobUpdateRequestTupleScheme extends TupleScheme<JobUpdateRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobUpdateRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTaskConfig()) {
        optionals.set(0);
      }
      if (struct.isSetInstanceCount()) {
        optionals.set(1);
      }
      if (struct.isSetSettings()) {
        optionals.set(2);
      }
      if (struct.isSetMetadata()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTaskConfig()) {
        struct.taskConfig.write(oprot);
      }
      if (struct.isSetInstanceCount()) {
        oprot.writeI32(struct.instanceCount);
      }
      if (struct.isSetSettings()) {
        struct.settings.write(oprot);
      }
      if (struct.isSetMetadata()) {
        {
          oprot.writeI32(struct.metadata.size());
          for (Metadata _iter250 : struct.metadata)
          {
            _iter250.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobUpdateRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.taskConfig = new TaskConfig();
        struct.taskConfig.read(iprot);
        struct.setTaskConfigIsSet(true);
      }
      if (incoming.get(1)) {
        struct.instanceCount = iprot.readI32();
        struct.setInstanceCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.settings = new JobUpdateSettings();
        struct.settings.read(iprot);
        struct.setSettingsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TSet _set251 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.metadata = new HashSet<Metadata>(2*_set251.size);
          Metadata _elem252;
          for (int _i253 = 0; _i253 < _set251.size; ++_i253)
          {
            _elem252 = new Metadata();
            _elem252.read(iprot);
            struct.metadata.add(_elem252);
          }
        }
        struct.setMetadataIsSet(true);
      }
    }
  }

}

