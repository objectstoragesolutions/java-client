/**
 * AddDocumentRevisionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddDocumentRevisionResponse  implements java.io.Serializable {
    private com.cleverdome.api.DocumentRevision addDocumentRevisionResult;

    public AddDocumentRevisionResponse() {
    }

    public AddDocumentRevisionResponse(
           com.cleverdome.api.DocumentRevision addDocumentRevisionResult) {
           this.addDocumentRevisionResult = addDocumentRevisionResult;
    }


    /**
     * Gets the addDocumentRevisionResult value for this AddDocumentRevisionResponse.
     * 
     * @return addDocumentRevisionResult
     */
    public com.cleverdome.api.DocumentRevision getAddDocumentRevisionResult() {
        return addDocumentRevisionResult;
    }


    /**
     * Sets the addDocumentRevisionResult value for this AddDocumentRevisionResponse.
     * 
     * @param addDocumentRevisionResult
     */
    public void setAddDocumentRevisionResult(com.cleverdome.api.DocumentRevision addDocumentRevisionResult) {
        this.addDocumentRevisionResult = addDocumentRevisionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddDocumentRevisionResponse)) return false;
        AddDocumentRevisionResponse other = (AddDocumentRevisionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addDocumentRevisionResult==null && other.getAddDocumentRevisionResult()==null) || 
             (this.addDocumentRevisionResult!=null &&
              this.addDocumentRevisionResult.equals(other.getAddDocumentRevisionResult())));
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
        if (getAddDocumentRevisionResult() != null) {
            _hashCode += getAddDocumentRevisionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddDocumentRevisionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddDocumentRevisionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addDocumentRevisionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddDocumentRevisionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentRevision"));
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
