/**
 * UploadFileJavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UploadFileJavaResponse  implements java.io.Serializable {
    private java.lang.String uploadFileJavaResult;

    public UploadFileJavaResponse() {
    }

    public UploadFileJavaResponse(
           java.lang.String uploadFileJavaResult) {
           this.uploadFileJavaResult = uploadFileJavaResult;
    }


    /**
     * Gets the uploadFileJavaResult value for this UploadFileJavaResponse.
     * 
     * @return uploadFileJavaResult
     */
    public java.lang.String getUploadFileJavaResult() {
        return uploadFileJavaResult;
    }


    /**
     * Sets the uploadFileJavaResult value for this UploadFileJavaResponse.
     * 
     * @param uploadFileJavaResult
     */
    public void setUploadFileJavaResult(java.lang.String uploadFileJavaResult) {
        this.uploadFileJavaResult = uploadFileJavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadFileJavaResponse)) return false;
        UploadFileJavaResponse other = (UploadFileJavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uploadFileJavaResult==null && other.getUploadFileJavaResult()==null) || 
             (this.uploadFileJavaResult!=null &&
              this.uploadFileJavaResult.equals(other.getUploadFileJavaResult())));
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
        if (getUploadFileJavaResult() != null) {
            _hashCode += getUploadFileJavaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadFileJavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UploadFileJavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadFileJavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UploadFileJavaResult"));
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
