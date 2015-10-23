/**
 * GetAllFilteredDocsDownloadIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetAllFilteredDocsDownloadIDResponse  implements java.io.Serializable {
    private java.lang.String getAllFilteredDocsDownloadIDResult;

    public GetAllFilteredDocsDownloadIDResponse() {
    }

    public GetAllFilteredDocsDownloadIDResponse(
           java.lang.String getAllFilteredDocsDownloadIDResult) {
           this.getAllFilteredDocsDownloadIDResult = getAllFilteredDocsDownloadIDResult;
    }


    /**
     * Gets the getAllFilteredDocsDownloadIDResult value for this GetAllFilteredDocsDownloadIDResponse.
     * 
     * @return getAllFilteredDocsDownloadIDResult
     */
    public java.lang.String getGetAllFilteredDocsDownloadIDResult() {
        return getAllFilteredDocsDownloadIDResult;
    }


    /**
     * Sets the getAllFilteredDocsDownloadIDResult value for this GetAllFilteredDocsDownloadIDResponse.
     * 
     * @param getAllFilteredDocsDownloadIDResult
     */
    public void setGetAllFilteredDocsDownloadIDResult(java.lang.String getAllFilteredDocsDownloadIDResult) {
        this.getAllFilteredDocsDownloadIDResult = getAllFilteredDocsDownloadIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllFilteredDocsDownloadIDResponse)) return false;
        GetAllFilteredDocsDownloadIDResponse other = (GetAllFilteredDocsDownloadIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllFilteredDocsDownloadIDResult==null && other.getGetAllFilteredDocsDownloadIDResult()==null) || 
             (this.getAllFilteredDocsDownloadIDResult!=null &&
              this.getAllFilteredDocsDownloadIDResult.equals(other.getGetAllFilteredDocsDownloadIDResult())));
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
        if (getGetAllFilteredDocsDownloadIDResult() != null) {
            _hashCode += getGetAllFilteredDocsDownloadIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllFilteredDocsDownloadIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllFilteredDocsDownloadIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllFilteredDocsDownloadIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllFilteredDocsDownloadIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
