/**
 * FlxFileUploadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class FlxFileUploadResponse  implements java.io.Serializable {
    private java.lang.String flxFileUploadResult;

    public FlxFileUploadResponse() {
    }

    public FlxFileUploadResponse(
           java.lang.String flxFileUploadResult) {
           this.flxFileUploadResult = flxFileUploadResult;
    }


    /**
     * Gets the flxFileUploadResult value for this FlxFileUploadResponse.
     * 
     * @return flxFileUploadResult
     */
    public java.lang.String getFlxFileUploadResult() {
        return flxFileUploadResult;
    }


    /**
     * Sets the flxFileUploadResult value for this FlxFileUploadResponse.
     * 
     * @param flxFileUploadResult
     */
    public void setFlxFileUploadResult(java.lang.String flxFileUploadResult) {
        this.flxFileUploadResult = flxFileUploadResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlxFileUploadResponse)) return false;
        FlxFileUploadResponse other = (FlxFileUploadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flxFileUploadResult==null && other.getFlxFileUploadResult()==null) || 
             (this.flxFileUploadResult!=null &&
              this.flxFileUploadResult.equals(other.getFlxFileUploadResult())));
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
        if (getFlxFileUploadResult() != null) {
            _hashCode += getFlxFileUploadResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlxFileUploadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">FlxFileUploadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flxFileUploadResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FlxFileUploadResult"));
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
