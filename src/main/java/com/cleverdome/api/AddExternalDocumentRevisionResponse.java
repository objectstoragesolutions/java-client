/**
 * AddExternalDocumentRevisionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddExternalDocumentRevisionResponse  implements java.io.Serializable {
    private java.lang.String addExternalDocumentRevisionResult;

    public AddExternalDocumentRevisionResponse() {
    }

    public AddExternalDocumentRevisionResponse(
           java.lang.String addExternalDocumentRevisionResult) {
           this.addExternalDocumentRevisionResult = addExternalDocumentRevisionResult;
    }


    /**
     * Gets the addExternalDocumentRevisionResult value for this AddExternalDocumentRevisionResponse.
     * 
     * @return addExternalDocumentRevisionResult
     */
    public java.lang.String getAddExternalDocumentRevisionResult() {
        return addExternalDocumentRevisionResult;
    }


    /**
     * Sets the addExternalDocumentRevisionResult value for this AddExternalDocumentRevisionResponse.
     * 
     * @param addExternalDocumentRevisionResult
     */
    public void setAddExternalDocumentRevisionResult(java.lang.String addExternalDocumentRevisionResult) {
        this.addExternalDocumentRevisionResult = addExternalDocumentRevisionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddExternalDocumentRevisionResponse)) return false;
        AddExternalDocumentRevisionResponse other = (AddExternalDocumentRevisionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addExternalDocumentRevisionResult==null && other.getAddExternalDocumentRevisionResult()==null) || 
             (this.addExternalDocumentRevisionResult!=null &&
              this.addExternalDocumentRevisionResult.equals(other.getAddExternalDocumentRevisionResult())));
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
        if (getAddExternalDocumentRevisionResult() != null) {
            _hashCode += getAddExternalDocumentRevisionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddExternalDocumentRevisionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddExternalDocumentRevisionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addExternalDocumentRevisionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddExternalDocumentRevisionResult"));
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
