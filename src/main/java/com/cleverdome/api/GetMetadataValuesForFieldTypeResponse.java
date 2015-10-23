/**
 * GetMetadataValuesForFieldTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetMetadataValuesForFieldTypeResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getMetadataValuesForFieldTypeResult;

    public GetMetadataValuesForFieldTypeResponse() {
    }

    public GetMetadataValuesForFieldTypeResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getMetadataValuesForFieldTypeResult) {
           this.getMetadataValuesForFieldTypeResult = getMetadataValuesForFieldTypeResult;
    }


    /**
     * Gets the getMetadataValuesForFieldTypeResult value for this GetMetadataValuesForFieldTypeResponse.
     * 
     * @return getMetadataValuesForFieldTypeResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getGetMetadataValuesForFieldTypeResult() {
        return getMetadataValuesForFieldTypeResult;
    }


    /**
     * Sets the getMetadataValuesForFieldTypeResult value for this GetMetadataValuesForFieldTypeResponse.
     * 
     * @param getMetadataValuesForFieldTypeResult
     */
    public void setGetMetadataValuesForFieldTypeResult(com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getMetadataValuesForFieldTypeResult) {
        this.getMetadataValuesForFieldTypeResult = getMetadataValuesForFieldTypeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMetadataValuesForFieldTypeResponse)) return false;
        GetMetadataValuesForFieldTypeResponse other = (GetMetadataValuesForFieldTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMetadataValuesForFieldTypeResult==null && other.getGetMetadataValuesForFieldTypeResult()==null) || 
             (this.getMetadataValuesForFieldTypeResult!=null &&
              this.getMetadataValuesForFieldTypeResult.equals(other.getGetMetadataValuesForFieldTypeResult())));
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
        if (getGetMetadataValuesForFieldTypeResult() != null) {
            _hashCode += getGetMetadataValuesForFieldTypeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMetadataValuesForFieldTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMetadataValuesForFieldTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMetadataValuesForFieldTypeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMetadataValuesForFieldTypeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf"));
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
