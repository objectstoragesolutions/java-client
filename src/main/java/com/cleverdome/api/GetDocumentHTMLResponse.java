/**
 * GetDocumentHTMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentHTMLResponse  implements java.io.Serializable {
    private byte[] getDocumentHTMLResult;

    public GetDocumentHTMLResponse() {
    }

    public GetDocumentHTMLResponse(
           byte[] getDocumentHTMLResult) {
           this.getDocumentHTMLResult = getDocumentHTMLResult;
    }


    /**
     * Gets the getDocumentHTMLResult value for this GetDocumentHTMLResponse.
     * 
     * @return getDocumentHTMLResult
     */
    public byte[] getGetDocumentHTMLResult() {
        return getDocumentHTMLResult;
    }


    /**
     * Sets the getDocumentHTMLResult value for this GetDocumentHTMLResponse.
     * 
     * @param getDocumentHTMLResult
     */
    public void setGetDocumentHTMLResult(byte[] getDocumentHTMLResult) {
        this.getDocumentHTMLResult = getDocumentHTMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentHTMLResponse)) return false;
        GetDocumentHTMLResponse other = (GetDocumentHTMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentHTMLResult==null && other.getGetDocumentHTMLResult()==null) || 
             (this.getDocumentHTMLResult!=null &&
              java.util.Arrays.equals(this.getDocumentHTMLResult, other.getGetDocumentHTMLResult())));
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
        if (getGetDocumentHTMLResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetDocumentHTMLResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetDocumentHTMLResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetDocumentHTMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentHTMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentHTMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentHTMLResult"));
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
