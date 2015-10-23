/**
 * GetFilterDocumentsWithMetadataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetFilterDocumentsWithMetadataResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentDetailedMetadataInfowJCT_PyJf getFilterDocumentsWithMetadataResult;

    public GetFilterDocumentsWithMetadataResponse() {
    }

    public GetFilterDocumentsWithMetadataResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentDetailedMetadataInfowJCT_PyJf getFilterDocumentsWithMetadataResult) {
           this.getFilterDocumentsWithMetadataResult = getFilterDocumentsWithMetadataResult;
    }


    /**
     * Gets the getFilterDocumentsWithMetadataResult value for this GetFilterDocumentsWithMetadataResponse.
     * 
     * @return getFilterDocumentsWithMetadataResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentDetailedMetadataInfowJCT_PyJf getGetFilterDocumentsWithMetadataResult() {
        return getFilterDocumentsWithMetadataResult;
    }


    /**
     * Sets the getFilterDocumentsWithMetadataResult value for this GetFilterDocumentsWithMetadataResponse.
     * 
     * @param getFilterDocumentsWithMetadataResult
     */
    public void setGetFilterDocumentsWithMetadataResult(com.cleverdome.api.OperationResultOfArrayOfDocumentDetailedMetadataInfowJCT_PyJf getFilterDocumentsWithMetadataResult) {
        this.getFilterDocumentsWithMetadataResult = getFilterDocumentsWithMetadataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFilterDocumentsWithMetadataResponse)) return false;
        GetFilterDocumentsWithMetadataResponse other = (GetFilterDocumentsWithMetadataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFilterDocumentsWithMetadataResult==null && other.getGetFilterDocumentsWithMetadataResult()==null) || 
             (this.getFilterDocumentsWithMetadataResult!=null &&
              this.getFilterDocumentsWithMetadataResult.equals(other.getGetFilterDocumentsWithMetadataResult())));
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
        if (getGetFilterDocumentsWithMetadataResult() != null) {
            _hashCode += getGetFilterDocumentsWithMetadataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFilterDocumentsWithMetadataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFilterDocumentsWithMetadataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFilterDocumentsWithMetadataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFilterDocumentsWithMetadataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentDetailedMetadataInfowJCT_PyJf"));
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
