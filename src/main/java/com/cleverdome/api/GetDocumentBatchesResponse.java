/**
 * GetDocumentBatchesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentBatchesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentBatchwJCT_PyJf getDocumentBatchesResult;

    public GetDocumentBatchesResponse() {
    }

    public GetDocumentBatchesResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentBatchwJCT_PyJf getDocumentBatchesResult) {
           this.getDocumentBatchesResult = getDocumentBatchesResult;
    }


    /**
     * Gets the getDocumentBatchesResult value for this GetDocumentBatchesResponse.
     * 
     * @return getDocumentBatchesResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentBatchwJCT_PyJf getGetDocumentBatchesResult() {
        return getDocumentBatchesResult;
    }


    /**
     * Sets the getDocumentBatchesResult value for this GetDocumentBatchesResponse.
     * 
     * @param getDocumentBatchesResult
     */
    public void setGetDocumentBatchesResult(com.cleverdome.api.OperationResultOfArrayOfDocumentBatchwJCT_PyJf getDocumentBatchesResult) {
        this.getDocumentBatchesResult = getDocumentBatchesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentBatchesResponse)) return false;
        GetDocumentBatchesResponse other = (GetDocumentBatchesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentBatchesResult==null && other.getGetDocumentBatchesResult()==null) || 
             (this.getDocumentBatchesResult!=null &&
              this.getDocumentBatchesResult.equals(other.getGetDocumentBatchesResult())));
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
        if (getGetDocumentBatchesResult() != null) {
            _hashCode += getGetDocumentBatchesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentBatchesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentBatchesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentBatchesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentBatchesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentBatchwJCT_PyJf"));
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
