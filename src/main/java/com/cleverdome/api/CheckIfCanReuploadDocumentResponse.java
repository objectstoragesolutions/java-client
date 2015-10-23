/**
 * CheckIfCanReuploadDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class CheckIfCanReuploadDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF checkIfCanReuploadDocumentResult;

    public CheckIfCanReuploadDocumentResponse() {
    }

    public CheckIfCanReuploadDocumentResponse(
           com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF checkIfCanReuploadDocumentResult) {
           this.checkIfCanReuploadDocumentResult = checkIfCanReuploadDocumentResult;
    }


    /**
     * Gets the checkIfCanReuploadDocumentResult value for this CheckIfCanReuploadDocumentResponse.
     * 
     * @return checkIfCanReuploadDocumentResult
     */
    public com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF getCheckIfCanReuploadDocumentResult() {
        return checkIfCanReuploadDocumentResult;
    }


    /**
     * Sets the checkIfCanReuploadDocumentResult value for this CheckIfCanReuploadDocumentResponse.
     * 
     * @param checkIfCanReuploadDocumentResult
     */
    public void setCheckIfCanReuploadDocumentResult(com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF checkIfCanReuploadDocumentResult) {
        this.checkIfCanReuploadDocumentResult = checkIfCanReuploadDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckIfCanReuploadDocumentResponse)) return false;
        CheckIfCanReuploadDocumentResponse other = (CheckIfCanReuploadDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkIfCanReuploadDocumentResult==null && other.getCheckIfCanReuploadDocumentResult()==null) || 
             (this.checkIfCanReuploadDocumentResult!=null &&
              this.checkIfCanReuploadDocumentResult.equals(other.getCheckIfCanReuploadDocumentResult())));
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
        if (getCheckIfCanReuploadDocumentResult() != null) {
            _hashCode += getCheckIfCanReuploadDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckIfCanReuploadDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CheckIfCanReuploadDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkIfCanReuploadDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckIfCanReuploadDocumentResult"));
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
