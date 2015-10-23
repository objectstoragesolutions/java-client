/**
 * GetDocumentMetadataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentMetadataResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataEntrywJCT_PyJf getDocumentMetadataResult;

    public GetDocumentMetadataResponse() {
    }

    public GetDocumentMetadataResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataEntrywJCT_PyJf getDocumentMetadataResult) {
           this.getDocumentMetadataResult = getDocumentMetadataResult;
    }


    /**
     * Gets the getDocumentMetadataResult value for this GetDocumentMetadataResponse.
     * 
     * @return getDocumentMetadataResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataEntrywJCT_PyJf getGetDocumentMetadataResult() {
        return getDocumentMetadataResult;
    }


    /**
     * Sets the getDocumentMetadataResult value for this GetDocumentMetadataResponse.
     * 
     * @param getDocumentMetadataResult
     */
    public void setGetDocumentMetadataResult(com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataEntrywJCT_PyJf getDocumentMetadataResult) {
        this.getDocumentMetadataResult = getDocumentMetadataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentMetadataResponse)) return false;
        GetDocumentMetadataResponse other = (GetDocumentMetadataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentMetadataResult==null && other.getGetDocumentMetadataResult()==null) || 
             (this.getDocumentMetadataResult!=null &&
              this.getDocumentMetadataResult.equals(other.getGetDocumentMetadataResult())));
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
        if (getGetDocumentMetadataResult() != null) {
            _hashCode += getGetDocumentMetadataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentMetadataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentMetadataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentMetadataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentMetadataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentMetadataEntrywJCT_PyJf"));
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
