/**
 * BulkUploadDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class BulkUploadDocumentsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfBulkUploadResponseMh1QQS5Z bulkUploadDocumentsResult;

    public BulkUploadDocumentsResponse() {
    }

    public BulkUploadDocumentsResponse(
           com.cleverdome.api.OperationResultOfArrayOfBulkUploadResponseMh1QQS5Z bulkUploadDocumentsResult) {
           this.bulkUploadDocumentsResult = bulkUploadDocumentsResult;
    }


    /**
     * Gets the bulkUploadDocumentsResult value for this BulkUploadDocumentsResponse.
     * 
     * @return bulkUploadDocumentsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfBulkUploadResponseMh1QQS5Z getBulkUploadDocumentsResult() {
        return bulkUploadDocumentsResult;
    }


    /**
     * Sets the bulkUploadDocumentsResult value for this BulkUploadDocumentsResponse.
     * 
     * @param bulkUploadDocumentsResult
     */
    public void setBulkUploadDocumentsResult(com.cleverdome.api.OperationResultOfArrayOfBulkUploadResponseMh1QQS5Z bulkUploadDocumentsResult) {
        this.bulkUploadDocumentsResult = bulkUploadDocumentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkUploadDocumentsResponse)) return false;
        BulkUploadDocumentsResponse other = (BulkUploadDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkUploadDocumentsResult==null && other.getBulkUploadDocumentsResult()==null) || 
             (this.bulkUploadDocumentsResult!=null &&
              this.bulkUploadDocumentsResult.equals(other.getBulkUploadDocumentsResult())));
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
        if (getBulkUploadDocumentsResult() != null) {
            _hashCode += getBulkUploadDocumentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkUploadDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BulkUploadDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkUploadDocumentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BulkUploadDocumentsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfBulkUploadResponseMh1qQS5Z"));
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
