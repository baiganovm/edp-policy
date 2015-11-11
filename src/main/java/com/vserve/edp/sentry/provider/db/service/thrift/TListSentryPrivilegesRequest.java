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

public class TListSentryPrivilegesRequest implements org.apache.thrift.TBase<TListSentryPrivilegesRequest, TListSentryPrivilegesRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TListSentryPrivilegesRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REQUESTOR_USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("requestorUserName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("roleName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField AUTHORIZABLE_HIERARCHY_FIELD_DESC = new org.apache.thrift.protocol.TField("authorizableHierarchy", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TListSentryPrivilegesRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TListSentryPrivilegesRequestTupleSchemeFactory());
  }

  public int protocol_version; // required
  public String requestorUserName; // required
  public String roleName; // required
  public TSentryAuthorizable authorizableHierarchy; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROTOCOL_VERSION((short)1, "protocol_version"),
    REQUESTOR_USER_NAME((short)2, "requestorUserName"),
    ROLE_NAME((short)4, "roleName"),
    AUTHORIZABLE_HIERARCHY((short)5, "authorizableHierarchy");

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
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // REQUESTOR_USER_NAME
          return REQUESTOR_USER_NAME;
        case 4: // ROLE_NAME
          return ROLE_NAME;
        case 5: // AUTHORIZABLE_HIERARCHY
          return AUTHORIZABLE_HIERARCHY;
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
  private static final int __PROTOCOL_VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.AUTHORIZABLE_HIERARCHY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUESTOR_USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("requestorUserName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("roleName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AUTHORIZABLE_HIERARCHY, new org.apache.thrift.meta_data.FieldMetaData("authorizableHierarchy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSentryAuthorizable.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TListSentryPrivilegesRequest.class, metaDataMap);
  }

  public TListSentryPrivilegesRequest() {
    this.protocol_version = 2;

  }

  public TListSentryPrivilegesRequest(
    int protocol_version,
    String requestorUserName,
    String roleName)
  {
    this();
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
    this.requestorUserName = requestorUserName;
    this.roleName = roleName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TListSentryPrivilegesRequest(TListSentryPrivilegesRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.protocol_version = other.protocol_version;
    if (other.isSetRequestorUserName()) {
      this.requestorUserName = other.requestorUserName;
    }
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    if (other.isSetAuthorizableHierarchy()) {
      this.authorizableHierarchy = new TSentryAuthorizable(other.authorizableHierarchy);
    }
  }

  public TListSentryPrivilegesRequest deepCopy() {
    return new TListSentryPrivilegesRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = 2;

    this.requestorUserName = null;
    this.roleName = null;
    this.authorizableHierarchy = null;
  }

  public int getProtocol_version() {
    return this.protocol_version;
  }

  public TListSentryPrivilegesRequest setProtocol_version(int protocol_version) {
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
    return this;
  }

  public void unsetProtocol_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return EncodingUtils.testBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  public void setProtocol_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID, value);
  }

  public String getRequestorUserName() {
    return this.requestorUserName;
  }

  public TListSentryPrivilegesRequest setRequestorUserName(String requestorUserName) {
    this.requestorUserName = requestorUserName;
    return this;
  }

  public void unsetRequestorUserName() {
    this.requestorUserName = null;
  }

  /** Returns true if field requestorUserName is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestorUserName() {
    return this.requestorUserName != null;
  }

  public void setRequestorUserNameIsSet(boolean value) {
    if (!value) {
      this.requestorUserName = null;
    }
  }

  public String getRoleName() {
    return this.roleName;
  }

  public TListSentryPrivilegesRequest setRoleName(String roleName) {
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

  public TSentryAuthorizable getAuthorizableHierarchy() {
    return this.authorizableHierarchy;
  }

  public TListSentryPrivilegesRequest setAuthorizableHierarchy(TSentryAuthorizable authorizableHierarchy) {
    this.authorizableHierarchy = authorizableHierarchy;
    return this;
  }

  public void unsetAuthorizableHierarchy() {
    this.authorizableHierarchy = null;
  }

  /** Returns true if field authorizableHierarchy is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthorizableHierarchy() {
    return this.authorizableHierarchy != null;
  }

  public void setAuthorizableHierarchyIsSet(boolean value) {
    if (!value) {
      this.authorizableHierarchy = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((Integer)value);
      }
      break;

    case REQUESTOR_USER_NAME:
      if (value == null) {
        unsetRequestorUserName();
      } else {
        setRequestorUserName((String)value);
      }
      break;

    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((String)value);
      }
      break;

    case AUTHORIZABLE_HIERARCHY:
      if (value == null) {
        unsetAuthorizableHierarchy();
      } else {
        setAuthorizableHierarchy((TSentryAuthorizable)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return Integer.valueOf(getProtocol_version());

    case REQUESTOR_USER_NAME:
      return getRequestorUserName();

    case ROLE_NAME:
      return getRoleName();

    case AUTHORIZABLE_HIERARCHY:
      return getAuthorizableHierarchy();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case REQUESTOR_USER_NAME:
      return isSetRequestorUserName();
    case ROLE_NAME:
      return isSetRoleName();
    case AUTHORIZABLE_HIERARCHY:
      return isSetAuthorizableHierarchy();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TListSentryPrivilegesRequest)
      return this.equals((TListSentryPrivilegesRequest)that);
    return false;
  }

  public boolean equals(TListSentryPrivilegesRequest that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true;
    boolean that_present_protocol_version = true;
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (this.protocol_version != that.protocol_version)
        return false;
    }

    boolean this_present_requestorUserName = true && this.isSetRequestorUserName();
    boolean that_present_requestorUserName = true && that.isSetRequestorUserName();
    if (this_present_requestorUserName || that_present_requestorUserName) {
      if (!(this_present_requestorUserName && that_present_requestorUserName))
        return false;
      if (!this.requestorUserName.equals(that.requestorUserName))
        return false;
    }

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_authorizableHierarchy = true && this.isSetAuthorizableHierarchy();
    boolean that_present_authorizableHierarchy = true && that.isSetAuthorizableHierarchy();
    if (this_present_authorizableHierarchy || that_present_authorizableHierarchy) {
      if (!(this_present_authorizableHierarchy && that_present_authorizableHierarchy))
        return false;
      if (!this.authorizableHierarchy.equals(that.authorizableHierarchy))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TListSentryPrivilegesRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TListSentryPrivilegesRequest typedOther = (TListSentryPrivilegesRequest)other;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(typedOther.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, typedOther.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestorUserName()).compareTo(typedOther.isSetRequestorUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestorUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestorUserName, typedOther.requestorUserName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetAuthorizableHierarchy()).compareTo(typedOther.isSetAuthorizableHierarchy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthorizableHierarchy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authorizableHierarchy, typedOther.authorizableHierarchy);
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
    StringBuilder sb = new StringBuilder("TListSentryPrivilegesRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    sb.append(this.protocol_version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestorUserName:");
    if (this.requestorUserName == null) {
      sb.append("null");
    } else {
      sb.append(this.requestorUserName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (isSetAuthorizableHierarchy()) {
      if (!first) sb.append(", ");
      sb.append("authorizableHierarchy:");
      if (this.authorizableHierarchy == null) {
        sb.append("null");
      } else {
        sb.append(this.authorizableHierarchy);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'protocol_version' because it's a primitive and you chose the non-beans generator.
    if (requestorUserName == null) {
      throw new TProtocolException("Required field 'requestorUserName' was not present! Struct: " + toString());
    }
    if (roleName == null) {
      throw new TProtocolException("Required field 'roleName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (authorizableHierarchy != null) {
      authorizableHierarchy.validate();
    }
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

  private static class TListSentryPrivilegesRequestStandardSchemeFactory implements SchemeFactory {
    public TListSentryPrivilegesRequestStandardScheme getScheme() {
      return new TListSentryPrivilegesRequestStandardScheme();
    }
  }

  private static class TListSentryPrivilegesRequestStandardScheme extends StandardScheme<TListSentryPrivilegesRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TListSentryPrivilegesRequest struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = iprot.readI32();
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUESTOR_USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestorUserName = iprot.readString();
              struct.setRequestorUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleName = iprot.readString();
              struct.setRoleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AUTHORIZABLE_HIERARCHY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.authorizableHierarchy = new TSentryAuthorizable();
              struct.authorizableHierarchy.read(iprot);
              struct.setAuthorizableHierarchyIsSet(true);
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
      if (!struct.isSetProtocol_version()) {
        throw new TProtocolException("Required field 'protocol_version' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TListSentryPrivilegesRequest struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
      oprot.writeI32(struct.protocol_version);
      oprot.writeFieldEnd();
      if (struct.requestorUserName != null) {
        oprot.writeFieldBegin(REQUESTOR_USER_NAME_FIELD_DESC);
        oprot.writeString(struct.requestorUserName);
        oprot.writeFieldEnd();
      }
      if (struct.roleName != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.roleName);
        oprot.writeFieldEnd();
      }
      if (struct.authorizableHierarchy != null) {
        if (struct.isSetAuthorizableHierarchy()) {
          oprot.writeFieldBegin(AUTHORIZABLE_HIERARCHY_FIELD_DESC);
          struct.authorizableHierarchy.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TListSentryPrivilegesRequestTupleSchemeFactory implements SchemeFactory {
    public TListSentryPrivilegesRequestTupleScheme getScheme() {
      return new TListSentryPrivilegesRequestTupleScheme();
    }
  }

  private static class TListSentryPrivilegesRequestTupleScheme extends TupleScheme<TListSentryPrivilegesRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TListSentryPrivilegesRequest struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version);
      oprot.writeString(struct.requestorUserName);
      oprot.writeString(struct.roleName);
      BitSet optionals = new BitSet();
      if (struct.isSetAuthorizableHierarchy()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAuthorizableHierarchy()) {
        struct.authorizableHierarchy.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TListSentryPrivilegesRequest struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = iprot.readI32();
      struct.setProtocol_versionIsSet(true);
      struct.requestorUserName = iprot.readString();
      struct.setRequestorUserNameIsSet(true);
      struct.roleName = iprot.readString();
      struct.setRoleNameIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.authorizableHierarchy = new TSentryAuthorizable();
        struct.authorizableHierarchy.read(iprot);
        struct.setAuthorizableHierarchyIsSet(true);
      }
    }
  }

}

