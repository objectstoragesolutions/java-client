/**
 * UpdateUserTagAlertResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UpdateUserTagAlertResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfboolean updateUserTagAlertResult;

    public UpdateUserTagAlertResponse() {
    }

    public UpdateUserTagAlertResponse(
           com.cleverdome.api.OperationResultOfboolean updateUserTagAlertResult) {
           this.updateUserTagAlertResult = updateUserTagAlertResult;
    }


    /**
     * Gets the updateUserTagAlertResult value for this UpdateUserTagAlertResponse.
     * 
     * @return updateUserTagAlertResult
     */
    public com.cleverdome.api.OperationResultOfboolean getUpdateUserTagAlertResult() {
        return updateUserTagAlertResult;
    }


    /**
     * Sets the updateUserTagAlertResult value for this UpdateUserTagAlertResponse.
     * 
     * @param updateUserTagAlertResult
     */
    public void setUpdateUserTagAlertResult(com.cleverdome.api.OperationResultOfboolean updateUserTagAlertResult) {
        this.updateUserTagAlertResult = updateUserTagAlertResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUserTagAlertResponse)) return false;
        UpdateUserTagAlertResponse other = (UpdateUserTagAlertResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateUserTagAlertResult==null && other.getUpdateUserTagAlertResult()==null) || 
             (this.updateUserTagAlertResult!=null &&
              this.updateUserTagAlertResult.equals(other.getUpdateUserTagAlertResult())));
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
        if (getUpdateUserTagAlertResult() != null) {
            _hashCode += getUpdateUserTagAlertResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateUserTagAlertResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateUserTagAlertResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateUserTagAlertResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateUserTagAlertResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfboolean"));
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
