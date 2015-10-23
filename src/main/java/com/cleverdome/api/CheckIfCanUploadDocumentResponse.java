/**
 * CheckIfCanUploadDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class CheckIfCanUploadDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF checkIfCanUploadDocumentResult;

    public CheckIfCanUploadDocumentResponse() {
    }

    public CheckIfCanUploadDocumentResponse(
           com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF checkIfCanUploadDocumentResult) {
           this.checkIfCanUploadDocumentResult = checkIfCanUploadDocumentResult;
    }


    /**
     * Gets the checkIfCanUploadDocumentResult value for this CheckIfCanUploadDocumentResponse.
     * 
     * @return checkIfCanUploadDocumentResult
     */
    public com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF getCheckIfCanUploadDocumentResult() {
        return checkIfCanUploadDocumentResult;
    }


    /**
     * Sets the checkIfCanUploadDocumentResult value for this CheckIfCanUploadDocumentResponse.
     * 
     * @param checkIfCanUploadDocumentResult
     */
    public void setCheckIfCanUploadDocumentResult(com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF checkIfCanUploadDocumentResult) {
        this.checkIfCanUploadDocumentResult = checkIfCanUploadDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckIfCanUploadDocumentResponse)) return false;
        CheckIfCanUploadDocumentResponse other = (CheckIfCanUploadDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkIfCanUploadDocumentResult==null && other.getCheckIfCanUploadDocumentResult()==null) || 
             (this.checkIfCanUploadDocumentResult!=null &&
              this.checkIfCanUploadDocumentResult.equals(other.getCheckIfCanUploadDocumentResult())));
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
        if (getCheckIfCanUploadDocumentResult() != null) {
            _hashCode += getCheckIfCanUploadDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckIfCanUploadDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CheckIfCanUploadDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkIfCanUploadDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckIfCanUploadDocumentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfUploadCheckResult52SKXdDF"));
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
