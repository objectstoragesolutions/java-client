/**
 * OperationResultOfBaseDocumentEventjJIl8QZi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class OperationResultOfBaseDocumentEventjJIl8QZi  implements java.io.Serializable {
    private java.lang.String message;

    private com.cleverdome.api.UserPermissions permissions;

    private com.cleverdome.api.ResultType result;

    private com.cleverdome.api.BaseDocumentEvent returnValue;

    public OperationResultOfBaseDocumentEventjJIl8QZi() {
    }

    public OperationResultOfBaseDocumentEventjJIl8QZi(
           java.lang.String message,
           com.cleverdome.api.UserPermissions permissions,
           com.cleverdome.api.ResultType result,
           com.cleverdome.api.BaseDocumentEvent returnValue) {
           this.message = message;
           this.permissions = permissions;
           this.result = result;
           this.returnValue = returnValue;
    }


    /**
     * Gets the message value for this OperationResultOfBaseDocumentEventjJIl8QZi.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this OperationResultOfBaseDocumentEventjJIl8QZi.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the permissions value for this OperationResultOfBaseDocumentEventjJIl8QZi.
     * 
     * @return permissions
     */
    public com.cleverdome.api.UserPermissions getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this OperationResultOfBaseDocumentEventjJIl8QZi.
     * 
     * @param permissions
     */
    public void setPermissions(com.cleverdome.api.UserPermissions permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the result value for this OperationResultOfBaseDocumentEventjJIl8QZi.
     * 
     * @return result
     */
    public com.cleverdome.api.ResultType getResult() {
        return result;
    }


    /**
     * Sets the result value for this OperationResultOfBaseDocumentEventjJIl8QZi.
     * 
     * @param result
     */
    public void setResult(com.cleverdome.api.ResultType result) {
        this.result = result;
    }


    /**
     * Gets the returnValue value for this OperationResultOfBaseDocumentEventjJIl8QZi.
     * 
     * @return returnValue
     */
    public com.cleverdome.api.BaseDocumentEvent getReturnValue() {
        return returnValue;
    }


    /**
     * Sets the returnValue value for this OperationResultOfBaseDocumentEventjJIl8QZi.
     * 
     * @param returnValue
     */
    public void setReturnValue(com.cleverdome.api.BaseDocumentEvent returnValue) {
        this.returnValue = returnValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResultOfBaseDocumentEventjJIl8QZi)) return false;
        OperationResultOfBaseDocumentEventjJIl8QZi other = (OperationResultOfBaseDocumentEventjJIl8QZi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.returnValue==null && other.getReturnValue()==null) || 
             (this.returnValue!=null &&
              this.returnValue.equals(other.getReturnValue())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getReturnValue() != null) {
            _hashCode += getReturnValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationResultOfBaseDocumentEventjJIl8QZi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfBaseDocument.EventjJIl8QZi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ResultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ReturnValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "BaseDocument.Event"));
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