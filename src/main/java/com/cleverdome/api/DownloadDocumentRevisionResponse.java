/**
 * DownloadDocumentRevisionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DownloadDocumentRevisionResponse  implements java.io.Serializable {
    private byte[] downloadDocumentRevisionResult;

    public DownloadDocumentRevisionResponse() {
    }

    public DownloadDocumentRevisionResponse(
           byte[] downloadDocumentRevisionResult) {
           this.downloadDocumentRevisionResult = downloadDocumentRevisionResult;
    }


    /**
     * Gets the downloadDocumentRevisionResult value for this DownloadDocumentRevisionResponse.
     * 
     * @return downloadDocumentRevisionResult
     */
    public byte[] getDownloadDocumentRevisionResult() {
        return downloadDocumentRevisionResult;
    }


    /**
     * Sets the downloadDocumentRevisionResult value for this DownloadDocumentRevisionResponse.
     * 
     * @param downloadDocumentRevisionResult
     */
    public void setDownloadDocumentRevisionResult(byte[] downloadDocumentRevisionResult) {
        this.downloadDocumentRevisionResult = downloadDocumentRevisionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DownloadDocumentRevisionResponse)) return false;
        DownloadDocumentRevisionResponse other = (DownloadDocumentRevisionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.downloadDocumentRevisionResult==null && other.getDownloadDocumentRevisionResult()==null) || 
             (this.downloadDocumentRevisionResult!=null &&
              java.util.Arrays.equals(this.downloadDocumentRevisionResult, other.getDownloadDocumentRevisionResult())));
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
        if (getDownloadDocumentRevisionResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDownloadDocumentRevisionResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDownloadDocumentRevisionResult(), i);
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
        new org.apache.axis.description.TypeDesc(DownloadDocumentRevisionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DownloadDocumentRevisionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadDocumentRevisionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DownloadDocumentRevisionResult"));
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
