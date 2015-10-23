/**
 * AttachSecurityGroupsToDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AttachSecurityGroupsToDocument  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String documentGuid;

    private int[] securityGroupIDs;

    private java.lang.Integer securityLevel;

    public AttachSecurityGroupsToDocument() {
    }

    public AttachSecurityGroupsToDocument(
           java.lang.String sessionID,
           java.lang.String documentGuid,
           int[] securityGroupIDs,
           java.lang.Integer securityLevel) {
           this.sessionID = sessionID;
           this.documentGuid = documentGuid;
           this.securityGroupIDs = securityGroupIDs;
           this.securityLevel = securityLevel;
    }


    /**
     * Gets the sessionID value for this AttachSecurityGroupsToDocument.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this AttachSecurityGroupsToDocument.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the documentGuid value for this AttachSecurityGroupsToDocument.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this AttachSecurityGroupsToDocument.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the securityGroupIDs value for this AttachSecurityGroupsToDocument.
     * 
     * @return securityGroupIDs
     */
    public int[] getSecurityGroupIDs() {
        return securityGroupIDs;
    }


    /**
     * Sets the securityGroupIDs value for this AttachSecurityGroupsToDocument.
     * 
     * @param securityGroupIDs
     */
    public void setSecurityGroupIDs(int[] securityGroupIDs) {
        this.securityGroupIDs = securityGroupIDs;
    }


    /**
     * Gets the securityLevel value for this AttachSecurityGroupsToDocument.
     * 
     * @return securityLevel
     */
    public java.lang.Integer getSecurityLevel() {
        return securityLevel;
    }


    /**
     * Sets the securityLevel value for this AttachSecurityGroupsToDocument.
     * 
     * @param securityLevel
     */
    public void setSecurityLevel(java.lang.Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachSecurityGroupsToDocument)) return false;
        AttachSecurityGroupsToDocument other = (AttachSecurityGroupsToDocument) obj;
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
            ((this.securityGroupIDs==null && other.getSecurityGroupIDs()==null) || 
             (this.securityGroupIDs!=null &&
              java.util.Arrays.equals(this.securityGroupIDs, other.getSecurityGroupIDs()))) &&
            ((this.securityLevel==null && other.getSecurityLevel()==null) || 
             (this.securityLevel!=null &&
              this.securityLevel.equals(other.getSecurityLevel())));
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
        if (getSecurityGroupIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityGroupIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityGroupIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecurityLevel() != null) {
            _hashCode += getSecurityLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachSecurityGroupsToDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AttachSecurityGroupsToDocument"));
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
        elemField.setFieldName("securityGroupIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "securityGroupIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "securityLevel"));
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
