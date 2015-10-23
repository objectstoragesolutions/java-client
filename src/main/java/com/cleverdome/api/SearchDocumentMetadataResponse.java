/**
 * SearchDocumentMetadataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SearchDocumentMetadataResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfstring searchDocumentMetadataResult;

    public SearchDocumentMetadataResponse() {
    }

    public SearchDocumentMetadataResponse(
           com.cleverdome.api.OperationResultOfstring searchDocumentMetadataResult) {
           this.searchDocumentMetadataResult = searchDocumentMetadataResult;
    }


    /**
     * Gets the searchDocumentMetadataResult value for this SearchDocumentMetadataResponse.
     * 
     * @return searchDocumentMetadataResult
     */
    public com.cleverdome.api.OperationResultOfstring getSearchDocumentMetadataResult() {
        return searchDocumentMetadataResult;
    }


    /**
     * Sets the searchDocumentMetadataResult value for this SearchDocumentMetadataResponse.
     * 
     * @param searchDocumentMetadataResult
     */
    public void setSearchDocumentMetadataResult(com.cleverdome.api.OperationResultOfstring searchDocumentMetadataResult) {
        this.searchDocumentMetadataResult = searchDocumentMetadataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchDocumentMetadataResponse)) return false;
        SearchDocumentMetadataResponse other = (SearchDocumentMetadataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchDocumentMetadataResult==null && other.getSearchDocumentMetadataResult()==null) || 
             (this.searchDocumentMetadataResult!=null &&
              this.searchDocumentMetadataResult.equals(other.getSearchDocumentMetadataResult())));
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
        if (getSearchDocumentMetadataResult() != null) {
            _hashCode += getSearchDocumentMetadataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchDocumentMetadataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SearchDocumentMetadataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchDocumentMetadataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SearchDocumentMetadataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfstring"));
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
