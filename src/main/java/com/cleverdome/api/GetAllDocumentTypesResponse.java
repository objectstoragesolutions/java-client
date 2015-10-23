/**
 * GetAllDocumentTypesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetAllDocumentTypesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getAllDocumentTypesResult;

    public GetAllDocumentTypesResponse() {
    }

    public GetAllDocumentTypesResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getAllDocumentTypesResult) {
           this.getAllDocumentTypesResult = getAllDocumentTypesResult;
    }


    /**
     * Gets the getAllDocumentTypesResult value for this GetAllDocumentTypesResponse.
     * 
     * @return getAllDocumentTypesResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getGetAllDocumentTypesResult() {
        return getAllDocumentTypesResult;
    }


    /**
     * Sets the getAllDocumentTypesResult value for this GetAllDocumentTypesResponse.
     * 
     * @param getAllDocumentTypesResult
     */
    public void setGetAllDocumentTypesResult(com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getAllDocumentTypesResult) {
        this.getAllDocumentTypesResult = getAllDocumentTypesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllDocumentTypesResponse)) return false;
        GetAllDocumentTypesResponse other = (GetAllDocumentTypesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllDocumentTypesResult==null && other.getGetAllDocumentTypesResult()==null) || 
             (this.getAllDocumentTypesResult!=null &&
              this.getAllDocumentTypesResult.equals(other.getGetAllDocumentTypesResult())));
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
        if (getGetAllDocumentTypesResult() != null) {
            _hashCode += getGetAllDocumentTypesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllDocumentTypesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDocumentTypesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllDocumentTypesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDocumentTypesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentTypewJCT_PyJf"));
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
