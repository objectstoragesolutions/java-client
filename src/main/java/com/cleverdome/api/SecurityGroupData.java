/**
 * SecurityGroupData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SecurityGroupData  implements java.io.Serializable {
    private com.cleverdome.api.PermissionData[] allPermissions;

    private com.cleverdome.api.SecurityGroupPermissions[] documentSecurityData;

    public SecurityGroupData() {
    }

    public SecurityGroupData(
           com.cleverdome.api.PermissionData[] allPermissions,
           com.cleverdome.api.SecurityGroupPermissions[] documentSecurityData) {
           this.allPermissions = allPermissions;
           this.documentSecurityData = documentSecurityData;
    }


    /**
     * Gets the allPermissions value for this SecurityGroupData.
     * 
     * @return allPermissions
     */
    public com.cleverdome.api.PermissionData[] getAllPermissions() {
        return allPermissions;
    }


    /**
     * Sets the allPermissions value for this SecurityGroupData.
     * 
     * @param allPermissions
     */
    public void setAllPermissions(com.cleverdome.api.PermissionData[] allPermissions) {
        this.allPermissions = allPermissions;
    }


    /**
     * Gets the documentSecurityData value for this SecurityGroupData.
     * 
     * @return documentSecurityData
     */
    public com.cleverdome.api.SecurityGroupPermissions[] getDocumentSecurityData() {
        return documentSecurityData;
    }


    /**
     * Sets the documentSecurityData value for this SecurityGroupData.
     * 
     * @param documentSecurityData
     */
    public void setDocumentSecurityData(com.cleverdome.api.SecurityGroupPermissions[] documentSecurityData) {
        this.documentSecurityData = documentSecurityData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityGroupData)) return false;
        SecurityGroupData other = (SecurityGroupData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allPermissions==null && other.getAllPermissions()==null) || 
             (this.allPermissions!=null &&
              java.util.Arrays.equals(this.allPermissions, other.getAllPermissions()))) &&
            ((this.documentSecurityData==null && other.getDocumentSecurityData()==null) || 
             (this.documentSecurityData!=null &&
              java.util.Arrays.equals(this.documentSecurityData, other.getDocumentSecurityData())));
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
        if (getAllPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentSecurityData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentSecurityData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentSecurityData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityGroupData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SecurityGroupData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "AllPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.DocumentSharing.Entities", "PermissionData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.DocumentSharing.Entities", "PermissionData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentSecurityData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentSecurityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SecurityGroupPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SecurityGroupPermissions"));
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
