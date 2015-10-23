/**
 * GetDocumentsArchiveResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentsArchiveResponse  implements java.io.Serializable {
    private byte[] getDocumentsArchiveResult;

    public GetDocumentsArchiveResponse() {
    }

    public GetDocumentsArchiveResponse(
           byte[] getDocumentsArchiveResult) {
           this.getDocumentsArchiveResult = getDocumentsArchiveResult;
    }


    /**
     * Gets the getDocumentsArchiveResult value for this GetDocumentsArchiveResponse.
     * 
     * @return getDocumentsArchiveResult
     */
    public byte[] getGetDocumentsArchiveResult() {
        return getDocumentsArchiveResult;
    }


    /**
     * Sets the getDocumentsArchiveResult value for this GetDocumentsArchiveResponse.
     * 
     * @param getDocumentsArchiveResult
     */
    public void setGetDocumentsArchiveResult(byte[] getDocumentsArchiveResult) {
        this.getDocumentsArchiveResult = getDocumentsArchiveResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsArchiveResponse)) return false;
        GetDocumentsArchiveResponse other = (GetDocumentsArchiveResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentsArchiveResult==null && other.getGetDocumentsArchiveResult()==null) || 
             (this.getDocumentsArchiveResult!=null &&
              java.util.Arrays.equals(this.getDocumentsArchiveResult, other.getGetDocumentsArchiveResult())));
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
        if (getGetDocumentsArchiveResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetDocumentsArchiveResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetDocumentsArchiveResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentsArchiveResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsArchiveResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentsArchiveResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentsArchiveResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
