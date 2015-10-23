/**
 * GetDocumentMetadataBaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentMetadataBaseResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getDocumentMetadataBaseResult;

    public GetDocumentMetadataBaseResponse() {
    }

    public GetDocumentMetadataBaseResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getDocumentMetadataBaseResult) {
           this.getDocumentMetadataBaseResult = getDocumentMetadataBaseResult;
    }


    /**
     * Gets the getDocumentMetadataBaseResult value for this GetDocumentMetadataBaseResponse.
     * 
     * @return getDocumentMetadataBaseResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getGetDocumentMetadataBaseResult() {
        return getDocumentMetadataBaseResult;
    }


    /**
     * Sets the getDocumentMetadataBaseResult value for this GetDocumentMetadataBaseResponse.
     * 
     * @param getDocumentMetadataBaseResult
     */
    public void setGetDocumentMetadataBaseResult(com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getDocumentMetadataBaseResult) {
        this.getDocumentMetadataBaseResult = getDocumentMetadataBaseResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentMetadataBaseResponse)) return false;
        GetDocumentMetadataBaseResponse other = (GetDocumentMetadataBaseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentMetadataBaseResult==null && other.getGetDocumentMetadataBaseResult()==null) || 
             (this.getDocumentMetadataBaseResult!=null &&
              this.getDocumentMetadataBaseResult.equals(other.getGetDocumentMetadataBaseResult())));
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
        if (getGetDocumentMetadataBaseResult() != null) {
            _hashCode += getGetDocumentMetadataBaseResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentMetadataBaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentMetadataBaseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentMetadataBaseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentMetadataBaseResult"));
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
