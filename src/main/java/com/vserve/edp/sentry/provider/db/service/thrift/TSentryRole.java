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

public class TSentryRole implements org.apache.thrift.TBase<TSentryRole, TSentryRole._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSentryRole");

  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("roleName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GROUPS_FIELD_DESC = new org.apache.thrift.protocol.TField("groups", org.apache.thrift.protocol.TType.SET, (short)2);
  private static final org.apache.thrift.protocol.TField GRANTOR_PRINCIPAL_FIELD_DESC = new org.apache.thrift.protocol.TField("grantorPrincipal", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSentryRoleStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSentryRoleTupleSchemeFactory());
  }

  public String roleName; // required
  public Set<TSentryGroup> groups; // required
  public String grantorPrincipal; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROLE_NAME((short)1, "roleName"),
    GROUPS((short)2, "groups"),
    GRANTOR_PRINCIPAL((short)3, "grantorPrincipal");

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
        case 1: // ROLE_NAME
          return ROLE_NAME;
        case 2: // GROUPS
          return GROUPS;
        case 3: // GRANTOR_PRINCIPAL
          return GRANTOR_PRINCIPAL;
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
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("roleName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUPS, new org.apache.thrift.meta_data.FieldMetaData("groups", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSentryGroup.class))));
    tmpMap.put(_Fields.GRANTOR_PRINCIPAL, new org.apache.thrift.meta_data.FieldMetaData("grantorPrincipal", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSentryRole.class, metaDataMap);
  }

  public TSentryRole() {
  }

  public TSentryRole(
    String roleName,
    Set<TSentryGroup> groups,
    String grantorPrincipal)
  {
    this();
    this.roleName = roleName;
    this.groups = groups;
    this.grantorPrincipal = grantorPrincipal;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSentryRole(TSentryRole other) {
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    if (other.isSetGroups()) {
      Set<TSentryGroup> __this__groups = new HashSet<TSentryGroup>();
      for (TSentryGroup other_element : other.groups) {
        __this__groups.add(new TSentryGroup(other_element));
      }
      this.groups = __this__groups;
    }
    if (other.isSetGrantorPrincipal()) {
      this.grantorPrincipal = other.grantorPrincipal;
    }
  }

  public TSentryRole deepCopy() {
    return new TSentryRole(this);
  }

  @Override
  public void clear() {
    this.roleName = null;
    this.groups = null;
    this.grantorPrincipal = null;
  }

  public String getRoleName() {
    return this.roleName;
  }

  public TSentryRole setRoleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  public void unsetRoleName() {
    this.roleName = null;
  }

  /** Returns true if field roleName is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleName() {
    return this.roleName != null;
  }

  public void setRoleNameIsSet(boolean value) {
    if (!value) {
      this.roleName = null;
    }
  }

  public int getGroupsSize() {
    return (this.groups == null) ? 0 : this.groups.size();
  }

  public java.util.Iterator<TSentryGroup> getGroupsIterator() {
    return (this.groups == null) ? null : this.groups.iterator();
  }

  public void addToGroups(TSentryGroup elem) {
    if (this.groups == null) {
      this.groups = new HashSet<TSentryGroup>();
    }
    this.groups.add(elem);
  }

  public Set<TSentryGroup> getGroups() {
    return this.groups;
  }

  public TSentryRole setGroups(Set<TSentryGroup> groups) {
    this.groups = groups;
    return this;
  }

  public void unsetGroups() {
    this.groups = null;
  }

  /** Returns true if field groups is set (has been assigned a value) and false otherwise */
  public boolean isSetGroups() {
    return this.groups != null;
  }

  public void setGroupsIsSet(boolean value) {
    if (!value) {
      this.groups = null;
    }
  }

  public String getGrantorPrincipal() {
    return this.grantorPrincipal;
  }

  public TSentryRole setGrantorPrincipal(String grantorPrincipal) {
    this.grantorPrincipal = grantorPrincipal;
    return this;
  }

  public void unsetGrantorPrincipal() {
    this.grantorPrincipal = null;
  }

  /** Returns true if field grantorPrincipal is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantorPrincipal() {
    return this.grantorPrincipal != null;
  }

  public void setGrantorPrincipalIsSet(boolean value) {
    if (!value) {
      this.grantorPrincipal = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((String)value);
      }
      break;

    case GROUPS:
      if (value == null) {
        unsetGroups();
      } else {
        setGroups((Set<TSentryGroup>)value);
      }
      break;

    case GRANTOR_PRINCIPAL:
      if (value == null) {
        unsetGrantorPrincipal();
      } else {
        setGrantorPrincipal((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE_NAME:
      return getRoleName();

    case GROUPS:
      return getGroups();

    case GRANTOR_PRINCIPAL:
      return getGrantorPrincipal();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROLE_NAME:
      return isSetRoleName();
    case GROUPS:
      return isSetGroups();
    case GRANTOR_PRINCIPAL:
      return isSetGrantorPrincipal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSentryRole)
      return this.equals((TSentryRole)that);
    return false;
  }

  public boolean equals(TSentryRole that) {
    if (that == null)
      return false;

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_groups = true && this.isSetGroups();
    boolean that_present_groups = true && that.isSetGroups();
    if (this_present_groups || that_present_groups) {
      if (!(this_present_groups && that_present_groups))
        return false;
      if (!this.groups.equals(that.groups))
        return false;
    }

    boolean this_present_grantorPrincipal = true && this.isSetGrantorPrincipal();
    boolean that_present_grantorPrincipal = true && that.isSetGrantorPrincipal();
    if (this_present_grantorPrincipal || that_present_grantorPrincipal) {
      if (!(this_present_grantorPrincipal && that_present_grantorPrincipal))
        return false;
      if (!this.grantorPrincipal.equals(that.grantorPrincipal))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TSentryRole other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TSentryRole typedOther = (TSentryRole)other;

    lastComparison = Boolean.valueOf(isSetRoleName()).compareTo(typedOther.isSetRoleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleName, typedOther.roleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroups()).compareTo(typedOther.isSetGroups());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroups()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groups, typedOther.groups);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantorPrincipal()).compareTo(typedOther.isSetGrantorPrincipal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantorPrincipal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantorPrincipal, typedOther.grantorPrincipal);
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
    StringBuilder sb = new StringBuilder("TSentryRole(");
    boolean first = true;

    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("groups:");
    if (this.groups == null) {
      sb.append("null");
    } else {
      sb.append(this.groups);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantorPrincipal:");
    if (this.grantorPrincipal == null) {
      sb.append("null");
    } else {
      sb.append(this.grantorPrincipal);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (roleName == null) {
      throw new TProtocolException("Required field 'roleName' was not present! Struct: " + toString());
    }
    if (groups == null) {
      throw new TProtocolException("Required field 'groups' was not present! Struct: " + toString());
    }
    if (grantorPrincipal == null) {
      throw new TProtocolException("Required field 'grantorPrincipal' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSentryRoleStandardSchemeFactory implements SchemeFactory {
    public TSentryRoleStandardScheme getScheme() {
      return new TSentryRoleStandardScheme();
    }
  }

  private static class TSentryRoleStandardScheme extends StandardScheme<TSentryRole> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSentryRole struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleName = iprot.readString();
              struct.setRoleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GROUPS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set40 = iprot.readSetBegin();
                struct.groups = new HashSet<TSentryGroup>(2*_set40.size);
                for (int _i41 = 0; _i41 < _set40.size; ++_i41)
                {
                  TSentryGroup _elem42; // required
                  _elem42 = new TSentryGroup();
                  _elem42.read(iprot);
                  struct.groups.add(_elem42);
                }
                iprot.readSetEnd();
              }
              struct.setGroupsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GRANTOR_PRINCIPAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.grantorPrincipal = iprot.readString();
              struct.setGrantorPrincipalIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSentryRole struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.roleName != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.roleName);
        oprot.writeFieldEnd();
      }
      if (struct.groups != null) {
        oprot.writeFieldBegin(GROUPS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.groups.size()));
          for (TSentryGroup _iter43 : struct.groups)
          {
            _iter43.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.grantorPrincipal != null) {
        oprot.writeFieldBegin(GRANTOR_PRINCIPAL_FIELD_DESC);
        oprot.writeString(struct.grantorPrincipal);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSentryRoleTupleSchemeFactory implements SchemeFactory {
    public TSentryRoleTupleScheme getScheme() {
      return new TSentryRoleTupleScheme();
    }
  }

  private static class TSentryRoleTupleScheme extends TupleScheme<TSentryRole> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSentryRole struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.roleName);
      {
        oprot.writeI32(struct.groups.size());
        for (TSentryGroup _iter44 : struct.groups)
        {
          _iter44.write(oprot);
        }
      }
      oprot.writeString(struct.grantorPrincipal);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSentryRole struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.roleName = iprot.readString();
      struct.setRoleNameIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set45 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.groups = new HashSet<TSentryGroup>(2*_set45.size);
        for (int _i46 = 0; _i46 < _set45.size; ++_i46)
        {
          TSentryGroup _elem47; // required
          _elem47 = new TSentryGroup();
          _elem47.read(iprot);
          struct.groups.add(_elem47);
        }
      }
      struct.setGroupsIsSet(true);
      struct.grantorPrincipal = iprot.readString();
      struct.setGrantorPrincipalIsSet(true);
    }
  }

}

