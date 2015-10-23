/**
 * GetDocumentActiveBarcodesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentActiveBarcodesResponse  implements java.io.Serializable {
    private com.cleverdome.api.BarcodesDataList getDocumentActiveBarcodesResult;

    public GetDocumentActiveBarcodesResponse() {
    }

    public GetDocumentActiveBarcodesResponse(
           com.cleverdome.api.BarcodesDataList getDocumentActiveBarcodesResult) {
           this.getDocumentActiveBarcodesResult = getDocumentActiveBarcodesResult;
    }


    /**
     * Gets the getDocumentActiveBarcodesResult value for this GetDocumentActiveBarcodesResponse.
     * 
     * @return getDocumentActiveBarcodesResult
     */
    public com.cleverdome.api.BarcodesDataList getGetDocumentActiveBarcodesResult() {
        return getDocumentActiveBarcodesResult;
    }


    /**
     * Sets the getDocumentActiveBarcodesResult value for this GetDocumentActiveBarcodesResponse.
     * 
     * @param getDocumentActiveBarcodesResult
     */
    public void setGetDocumentActiveBarcodesResult(com.cleverdome.api.BarcodesDataList getDocumentActiveBarcodesResult) {
        this.getDocumentActiveBarcodesResult = getDocumentActiveBarcodesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentActiveBarcodesResponse)) return false;
        GetDocumentActiveBarcodesResponse other = (GetDocumentActiveBarcodesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentActiveBarcodesResult==null && other.getGetDocumentActiveBarcodesResult()==null) || 
             (this.getDocumentActiveBarcodesResult!=null &&
              this.getDocumentActiveBarcodesResult.equals(other.getGetDocumentActiveBarcodesResult())));
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
        if (getGetDocumentActiveBarcodesResult() != null) {
            _hashCode += getGetDocumentActiveBarcodesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentActiveBarcodesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentActiveBarcodesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentActiveBarcodesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentActiveBarcodesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "BarcodesDataList"));
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
