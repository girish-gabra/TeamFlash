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
import java.util.EnumSet;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Describes resource value required to run a task.
 */
public class Resource extends org.apache.thrift.TUnion<Resource, Resource._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Resource");
  private static final org.apache.thrift.protocol.TField NUM_CPUS_FIELD_DESC = new org.apache.thrift.protocol.TField("numCpus", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField RAM_MB_FIELD_DESC = new org.apache.thrift.protocol.TField("ramMb", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DISK_MB_FIELD_DESC = new org.apache.thrift.protocol.TField("diskMb", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField NAMED_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("namedPort", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NUM_GPUS_FIELD_DESC = new org.apache.thrift.protocol.TField("numGpus", org.apache.thrift.protocol.TType.I64, (short)5);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_CPUS((short)1, "numCpus"),
    RAM_MB((short)2, "ramMb"),
    DISK_MB((short)3, "diskMb"),
    NAMED_PORT((short)4, "namedPort"),
    NUM_GPUS((short)5, "numGpus");

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
        case 1: // NUM_CPUS
          return NUM_CPUS;
        case 2: // RAM_MB
          return RAM_MB;
        case 3: // DISK_MB
          return DISK_MB;
        case 4: // NAMED_PORT
          return NAMED_PORT;
        case 5: // NUM_GPUS
          return NUM_GPUS;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_CPUS, new org.apache.thrift.meta_data.FieldMetaData("numCpus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.RAM_MB, new org.apache.thrift.meta_data.FieldMetaData("ramMb", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DISK_MB, new org.apache.thrift.meta_data.FieldMetaData("diskMb", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAMED_PORT, new org.apache.thrift.meta_data.FieldMetaData("namedPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUM_GPUS, new org.apache.thrift.meta_data.FieldMetaData("numGpus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Resource.class, metaDataMap);
  }

  public Resource() {
    super();
  }

  public Resource(_Fields setField, Object value) {
    super(setField, value);
  }

  public Resource(Resource other) {
    super(other);
  }
  public Resource deepCopy() {
    return new Resource(this);
  }

  public static Resource numCpus(double value) {
    Resource x = new Resource();
    x.setNumCpus(value);
    return x;
  }

  public static Resource ramMb(long value) {
    Resource x = new Resource();
    x.setRamMb(value);
    return x;
  }

  public static Resource diskMb(long value) {
    Resource x = new Resource();
    x.setDiskMb(value);
    return x;
  }

  public static Resource namedPort(String value) {
    Resource x = new Resource();
    x.setNamedPort(value);
    return x;
  }

  public static Resource numGpus(long value) {
    Resource x = new Resource();
    x.setNumGpus(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case NUM_CPUS:
        if (value instanceof Double) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Double for field 'numCpus', but got " + value.getClass().getSimpleName());
      case RAM_MB:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'ramMb', but got " + value.getClass().getSimpleName());
      case DISK_MB:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'diskMb', but got " + value.getClass().getSimpleName());
      case NAMED_PORT:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'namedPort', but got " + value.getClass().getSimpleName());
      case NUM_GPUS:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'numGpus', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case NUM_CPUS:
          if (field.type == NUM_CPUS_FIELD_DESC.type) {
            Double numCpus;
            numCpus = iprot.readDouble();
            return numCpus;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case RAM_MB:
          if (field.type == RAM_MB_FIELD_DESC.type) {
            Long ramMb;
            ramMb = iprot.readI64();
            return ramMb;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DISK_MB:
          if (field.type == DISK_MB_FIELD_DESC.type) {
            Long diskMb;
            diskMb = iprot.readI64();
            return diskMb;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case NAMED_PORT:
          if (field.type == NAMED_PORT_FIELD_DESC.type) {
            String namedPort;
            namedPort = iprot.readString();
            return namedPort;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case NUM_GPUS:
          if (field.type == NUM_GPUS_FIELD_DESC.type) {
            Long numGpus;
            numGpus = iprot.readI64();
            return numGpus;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case NUM_CPUS:
        Double numCpus = (Double)value_;
        oprot.writeDouble(numCpus);
        return;
      case RAM_MB:
        Long ramMb = (Long)value_;
        oprot.writeI64(ramMb);
        return;
      case DISK_MB:
        Long diskMb = (Long)value_;
        oprot.writeI64(diskMb);
        return;
      case NAMED_PORT:
        String namedPort = (String)value_;
        oprot.writeString(namedPort);
        return;
      case NUM_GPUS:
        Long numGpus = (Long)value_;
        oprot.writeI64(numGpus);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case NUM_CPUS:
          Double numCpus;
          numCpus = iprot.readDouble();
          return numCpus;
        case RAM_MB:
          Long ramMb;
          ramMb = iprot.readI64();
          return ramMb;
        case DISK_MB:
          Long diskMb;
          diskMb = iprot.readI64();
          return diskMb;
        case NAMED_PORT:
          String namedPort;
          namedPort = iprot.readString();
          return namedPort;
        case NUM_GPUS:
          Long numGpus;
          numGpus = iprot.readI64();
          return numGpus;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case NUM_CPUS:
        Double numCpus = (Double)value_;
        oprot.writeDouble(numCpus);
        return;
      case RAM_MB:
        Long ramMb = (Long)value_;
        oprot.writeI64(ramMb);
        return;
      case DISK_MB:
        Long diskMb = (Long)value_;
        oprot.writeI64(diskMb);
        return;
      case NAMED_PORT:
        String namedPort = (String)value_;
        oprot.writeString(namedPort);
        return;
      case NUM_GPUS:
        Long numGpus = (Long)value_;
        oprot.writeI64(numGpus);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case NUM_CPUS:
        return NUM_CPUS_FIELD_DESC;
      case RAM_MB:
        return RAM_MB_FIELD_DESC;
      case DISK_MB:
        return DISK_MB_FIELD_DESC;
      case NAMED_PORT:
        return NAMED_PORT_FIELD_DESC;
      case NUM_GPUS:
        return NUM_GPUS_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
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

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public double getNumCpus() {
    if (getSetField() == _Fields.NUM_CPUS) {
      return (Double)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'numCpus' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNumCpus(double value) {
    setField_ = _Fields.NUM_CPUS;
    value_ = value;
  }

  public long getRamMb() {
    if (getSetField() == _Fields.RAM_MB) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'ramMb' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRamMb(long value) {
    setField_ = _Fields.RAM_MB;
    value_ = value;
  }

  public long getDiskMb() {
    if (getSetField() == _Fields.DISK_MB) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'diskMb' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDiskMb(long value) {
    setField_ = _Fields.DISK_MB;
    value_ = value;
  }

  public String getNamedPort() {
    if (getSetField() == _Fields.NAMED_PORT) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'namedPort' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNamedPort(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.NAMED_PORT;
    value_ = value;
  }

  public long getNumGpus() {
    if (getSetField() == _Fields.NUM_GPUS) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'numGpus' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNumGpus(long value) {
    setField_ = _Fields.NUM_GPUS;
    value_ = value;
  }

  public boolean isSetNumCpus() {
    return setField_ == _Fields.NUM_CPUS;
  }


  public boolean isSetRamMb() {
    return setField_ == _Fields.RAM_MB;
  }


  public boolean isSetDiskMb() {
    return setField_ == _Fields.DISK_MB;
  }


  public boolean isSetNamedPort() {
    return setField_ == _Fields.NAMED_PORT;
  }


  public boolean isSetNumGpus() {
    return setField_ == _Fields.NUM_GPUS;
  }


  public boolean equals(Object other) {
    if (other instanceof Resource) {
      return equals((Resource)other);
    } else {
      return false;
    }
  }

  public boolean equals(Resource other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(Resource other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
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


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
