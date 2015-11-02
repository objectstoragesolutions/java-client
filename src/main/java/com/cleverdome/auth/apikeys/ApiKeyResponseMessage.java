/**
 * ApiKeyResponseMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.auth.apikeys;

public class ApiKeyResponseMessage  implements java.io.Serializable {
    private java.lang.String errorMessage;

    private java.lang.Boolean isSuccess;

    private java.lang.String sessionID;

    private java.lang.Integer sessionTimeOut;

    public ApiKeyResponseMessage() {
    }

    public ApiKeyResponseMessage(
           java.lang.String errorMessage,
           java.lang.Boolean isSuccess,
           java.lang.String sessionID,
           java.lang.Integer sessionTimeOut) {
           this.errorMessage = errorMessage;
           this.isSuccess = isSuccess;
           this.sessionID = sessionID;
           this.sessionTimeOut = sessionTimeOut;
    }


    /**
     * Gets the errorMessage value for this ApiKeyResponseMessage.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ApiKeyResponseMessage.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the isSuccess value for this ApiKeyResponseMessage.
     * 
     * @return isSuccess
     */
    public java.lang.Boolean getIsSuccess() {
        return isSuccess;
    }


    /**
     * Sets the isSuccess value for this ApiKeyResponseMessage.
     * 
     * @param isSuccess
     */
    public void setIsSuccess(java.lang.Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }


    /**
     * Gets the sessionID value for this ApiKeyResponseMessage.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this ApiKeyResponseMessage.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the sessionTimeOut value for this ApiKeyResponseMessage.
     * 
     * @return sessionTimeOut
     */
    public java.lang.Integer getSessionTimeOut() {
        return sessionTimeOut;
    }


    /**
     * Sets the sessionTimeOut value for this ApiKeyResponseMessage.
     * 
     * @param sessionTimeOut
     */
    public void setSessionTimeOut(java.lang.Integer sessionTimeOut) {
        this.sessionTimeOut = sessionTimeOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiKeyResponseMessage)) return false;
        ApiKeyResponseMessage other = (ApiKeyResponseMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.isSuccess==null && other.getIsSuccess()==null) || 
             (this.isSuccess!=null &&
              this.isSuccess.equals(other.getIsSuccess()))) &&
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.sessionTimeOut==null && other.getSessionTimeOut()==null) || 
             (this.sessionTimeOut!=null &&
              this.sessionTimeOut.equals(other.getSessionTimeOut())));
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
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getIsSuccess() != null) {
            _hashCode += getIsSuccess().hashCode();
        }
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getSessionTimeOut() != null) {
            _hashCode += getSessionTimeOut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiKeyResponseMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", ">ApiKeyResponseMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "IsSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "SessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionTimeOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "SessionTimeOut"));
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
