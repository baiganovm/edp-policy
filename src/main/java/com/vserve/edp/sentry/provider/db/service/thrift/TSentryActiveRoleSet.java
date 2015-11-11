/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vserve.edp.sentry.provider.db.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TSentryActiveRoleSet implements org.apache.thrift.TBase<TSentryActiveRoleSet, TSentryActiveRoleSet._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSentryActiveRoleSet");

  private static final org.apache.thrift.protocol.TField ALL_FIELD_DESC = new org.apache.thrift.protocol.TField("all", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField("roles", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSentryActiveRoleSetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSentryActiveRoleSetTupleSchemeFactory());
  }

  public boolean all; // required
  public Set<String> roles; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ALL((short)1, "all"),
    ROLES((short)2, "roles");

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
        case 1: // ALL
          return ALL;
        case 2: // ROLES
          return ROLES;
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
  private static final int __ALL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ALL, new org.apache.thrift.meta_data.FieldMetaData("all", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ROLES, new org.apache.thrift.meta_data.FieldMetaData("roles", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSentryActiveRoleSet.class, metaDataMap);
  }

  public TSentryActiveRoleSet() {
  }

  public TSentryActiveRoleSet(
    boolean all,
    Set<String> roles)
  {
    this();
    this.all = all;
    setAllIsSet(true);
    this.roles = roles;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSentryActiveRoleSet(TSentryActiveRoleSet other) {
    __isset_bitfield = other.__isset_bitfield;
    this.all = other.all;
    if (other.isSetRoles()) {
      Set<String> __this__roles = new HashSet<String>();
      for (String other_element : other.roles) {
        __this__roles.add(other_element);
      }
      this.roles = __this__roles;
    }
  }

  public TSentryActiveRoleSet deepCopy() {
    return new TSentryActiveRoleSet(this);
  }

  @Override
  public void clear() {
    setAllIsSet(false);
    this.all = false;
    this.roles = null;
  }

  public boolean isAll() {
    return this.all;
  }

  public TSentryActiveRoleSet setAll(boolean all) {
    this.all = all;
    setAllIsSet(true);
    return this;
  }

  public void unsetAll() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ALL_ISSET_ID);
  }

  /** Returns true if field all is set (has been assigned a value) and false otherwise */
  public boolean isSetAll() {
    return EncodingUtils.testBit(__isset_bitfield, __ALL_ISSET_ID);
  }

  public void setAllIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ALL_ISSET_ID, value);
  }

  public int getRolesSize() {
    return (this.roles == null) ? 0 : this.roles.size();
  }

  public java.util.Iterator<String> getRolesIterator() {
    return (this.roles == null) ? null : this.roles.iterator();
  }

  public void addToRoles(String elem) {
    if (this.roles == null) {
      this.roles = new HashSet<String>();
    }
    this.roles.add(elem);
  }

  public Set<String> getRoles() {
    return this.roles;
  }

  public TSentryActiveRoleSet setRoles(Set<String> roles) {
    this.roles = roles;
    return this;
  }

  public void unsetRoles() {
    this.roles = null;
  }

  /** Returns true if field roles is set (has been assigned a value) and false otherwise */
  public boolean isSetRoles() {
    return this.roles != null;
  }

  public void setRolesIsSet(boolean value) {
    if (!value) {
      this.roles = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ALL:
      if (value == null) {
        unsetAll();
      } else {
        setAll((Boolean)value);
      }
      break;

    case ROLES:
      if (value == null) {
        unsetRoles();
      } else {
        setRoles((Set<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ALL:
      return Boolean.valueOf(isAll());

    case ROLES:
      return getRoles();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ALL:
      return isSetAll();
    case ROLES:
      return isSetRoles();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSentryActiveRoleSet)
      return this.equals((TSentryActiveRoleSet)that);
    return false;
  }

  public boolean equals(TSentryActiveRoleSet that) {
    if (that == null)
      return false;

    boolean this_present_all = true;
    boolean that_present_all = true;
    if (this_present_all || that_present_all) {
      if (!(this_present_all && that_present_all))
        return false;
      if (this.all != that.all)
        return false;
    }

    boolean this_present_roles = true && this.isSetRoles();
    boolean that_present_roles = true && that.isSetRoles();
    if (this_present_roles || that_present_roles) {
      if (!(this_present_roles && that_present_roles))
        return false;
      if (!this.roles.equals(that.roles))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TSentryActiveRoleSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TSentryActiveRoleSet typedOther = (TSentryActiveRoleSet)other;

    lastComparison = Boolean.valueOf(isSetAll()).compareTo(typedOther.isSetAll());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAll()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.all, typedOther.all);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoles()).compareTo(typedOther.isSetRoles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roles, typedOther.roles);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TSentryActiveRoleSet(");
    boolean first = true;

    sb.append("all:");
    sb.append(this.all);
    first = false;
    if (!first) sb.append(", ");
    sb.append("roles:");
    if (this.roles == null) {
      sb.append("null");
    } else {
      sb.append(this.roles);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'all' because it's a primitive and you chose the non-beans generator.
    if (roles == null) {
      throw new TProtocolException("Required field 'roles' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSentryActiveRoleSetStandardSchemeFactory implements SchemeFactory {
    public TSentryActiveRoleSetStandardScheme getScheme() {
      return new TSentryActiveRoleSetStandardScheme();
    }
  }

  private static class TSentryActiveRoleSetStandardScheme extends StandardScheme<TSentryActiveRoleSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSentryActiveRoleSet struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ALL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.all = iprot.readBool();
              struct.setAllIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROLES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set64 = iprot.readSetBegin();
                struct.roles = new HashSet<String>(2*_set64.size);
                for (int _i65 = 0; _i65 < _set64.size; ++_i65)
                {
                  String _elem66; // required
                  _elem66 = iprot.readString();
                  struct.roles.add(_elem66);
                }
                iprot.readSetEnd();
              }
              struct.setRolesIsSet(true);
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
      if (!struct.isSetAll()) {
        throw new TProtocolException("Required field 'all' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSentryActiveRoleSet struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ALL_FIELD_DESC);
      oprot.writeBool(struct.all);
      oprot.writeFieldEnd();
      if (struct.roles != null) {
        oprot.writeFieldBegin(ROLES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.roles.size()));
          for (String _iter67 : struct.roles)
          {
            oprot.writeString(_iter67);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSentryActiveRoleSetTupleSchemeFactory implements SchemeFactory {
    public TSentryActiveRoleSetTupleScheme getScheme() {
      return new TSentryActiveRoleSetTupleScheme();
    }
  }

  private static class TSentryActiveRoleSetTupleScheme extends TupleScheme<TSentryActiveRoleSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSentryActiveRoleSet struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.all);
      {
        oprot.writeI32(struct.roles.size());
        for (String _iter68 : struct.roles)
        {
          oprot.writeString(_iter68);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSentryActiveRoleSet struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.all = iprot.readBool();
      struct.setAllIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set69 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.roles = new HashSet<String>(2*_set69.size);
        for (int _i70 = 0; _i70 < _set69.size; ++_i70)
        {
          String _elem71; // required
          _elem71 = iprot.readString();
          struct.roles.add(_elem71);
        }
      }
      struct.setRolesIsSet(true);
    }
  }

}
