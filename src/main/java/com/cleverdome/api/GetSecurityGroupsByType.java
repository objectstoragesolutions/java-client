/**
 * GetSecurityGroupsByType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetSecurityGroupsByType  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String documentGuid;

    private java.lang.Integer securityGroupType;

    public GetSecurityGroupsByType() {
    }

    public GetSecurityGroupsByType(
           java.lang.String sessionID,
           java.lang.String documentGuid,
           java.lang.Integer securityGroupType) {
           this.sessionID = sessionID;
           this.documentGuid = documentGuid;
           this.securityGroupType = securityGroupType;
    }


    /**
     * Gets the sessionID value for this GetSecurityGroupsByType.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetSecurityGroupsByType.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the documentGuid value for this GetSecurityGroupsByType.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this GetSecurityGroupsByType.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the securityGroupType value for this GetSecurityGroupsByType.
     * 
     * @return securityGroupType
     */
    public java.lang.Integer getSecurityGroupType() {
        return securityGroupType;
    }


    /**
     * Sets the securityGroupType value for this GetSecurityGroupsByType.
     * 
     * @param securityGroupType
     */
    public void setSecurityGroupType(java.lang.Integer securityGroupType) {
        this.securityGroupType = securityGroupType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSecurityGroupsByType)) return false;
        GetSecurityGroupsByType other = (GetSecurityGroupsByType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.documentGuid==null && other.getDocumentGuid()==null) || 
             (this.documentGuid!=null &&
              this.documentGuid.equals(other.getDocumentGuid()))) &&
            ((this.securityGroupType==null && other.getSecurityGroupType()==null) || 
             (this.securityGroupType!=null &&
              this.securityGroupType.equals(other.getSecurityGroupType())));
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
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getDocumentGuid() != null) {
            _hashCode += getDocumentGuid().hashCode();
        }
        if (getSecurityGroupType() != null) {
            _hashCode += getSecurityGroupType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSecurityGroupsByType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSecurityGroupsByType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "securityGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
