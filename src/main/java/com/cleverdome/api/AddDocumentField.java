/**
 * AddDocumentField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddDocumentField  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String documentGuid;

    private java.lang.Integer fieldID;

    private java.lang.String fieldValue;

    public AddDocumentField() {
    }

    public AddDocumentField(
           java.lang.String sessionID,
           java.lang.String documentGuid,
           java.lang.Integer fieldID,
           java.lang.String fieldValue) {
           this.sessionID = sessionID;
           this.documentGuid = documentGuid;
           this.fieldID = fieldID;
           this.fieldValue = fieldValue;
    }


    /**
     * Gets the sessionID value for this AddDocumentField.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this AddDocumentField.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the documentGuid value for this AddDocumentField.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this AddDocumentField.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the fieldID value for this AddDocumentField.
     * 
     * @return fieldID
     */
    public java.lang.Integer getFieldID() {
        return fieldID;
    }


    /**
     * Sets the fieldID value for this AddDocumentField.
     * 
     * @param fieldID
     */
    public void setFieldID(java.lang.Integer fieldID) {
        this.fieldID = fieldID;
    }


    /**
     * Gets the fieldValue value for this AddDocumentField.
     * 
     * @return fieldValue
     */
    public java.lang.String getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this AddDocumentField.
     * 
     * @param fieldValue
     */
    public void setFieldValue(java.lang.String fieldValue) {
        this.fieldValue = fieldValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddDocumentField)) return false;
        AddDocumentField other = (AddDocumentField) obj;
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
            ((this.fieldID==null && other.getFieldID()==null) || 
             (this.fieldID!=null &&
              this.fieldID.equals(other.getFieldID()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              this.fieldValue.equals(other.getFieldValue())));
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
        if (getFieldID() != null) {
            _hashCode += getFieldID().hashCode();
        }
        if (getFieldValue() != null) {
            _hashCode += getFieldValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddDocumentField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddDocumentField"));
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
        elemField.setFieldName("fieldID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fieldID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
