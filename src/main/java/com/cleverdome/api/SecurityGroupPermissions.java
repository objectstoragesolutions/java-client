/**
 * SecurityGroupPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SecurityGroupPermissions  implements java.io.Serializable {
    private com.cleverdome.api.PermissionData permissions;

    private com.cleverdome.api.SecurityGroup securityGroup;

    public SecurityGroupPermissions() {
    }

    public SecurityGroupPermissions(
           com.cleverdome.api.PermissionData permissions,
           com.cleverdome.api.SecurityGroup securityGroup) {
           this.permissions = permissions;
           this.securityGroup = securityGroup;
    }


    /**
     * Gets the permissions value for this SecurityGroupPermissions.
     * 
     * @return permissions
     */
    public com.cleverdome.api.PermissionData getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this SecurityGroupPermissions.
     * 
     * @param permissions
     */
    public void setPermissions(com.cleverdome.api.PermissionData permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the securityGroup value for this SecurityGroupPermissions.
     * 
     * @return securityGroup
     */
    public com.cleverdome.api.SecurityGroup getSecurityGroup() {
        return securityGroup;
    }


    /**
     * Sets the securityGroup value for this SecurityGroupPermissions.
     * 
     * @param securityGroup
     */
    public void setSecurityGroup(com.cleverdome.api.SecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityGroupPermissions)) return false;
        SecurityGroupPermissions other = (SecurityGroupPermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions()))) &&
            ((this.securityGroup==null && other.getSecurityGroup()==null) || 
             (this.securityGroup!=null &&
              this.securityGroup.equals(other.getSecurityGroup())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        if (getSecurityGroup() != null) {
            _hashCode += getSecurityGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityGroupPermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SecurityGroupPermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.DocumentSharing.Entities", "PermissionData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SecurityGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SecurityGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
