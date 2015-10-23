/**
 * ChangSharedDocumentExpirationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class ChangSharedDocumentExpirationResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType changSharedDocumentExpirationResult;

    public ChangSharedDocumentExpirationResponse() {
    }

    public ChangSharedDocumentExpirationResponse(
           com.cleverdome.api.OperationResultOfanyType changSharedDocumentExpirationResult) {
           this.changSharedDocumentExpirationResult = changSharedDocumentExpirationResult;
    }


    /**
     * Gets the changSharedDocumentExpirationResult value for this ChangSharedDocumentExpirationResponse.
     * 
     * @return changSharedDocumentExpirationResult
     */
    public com.cleverdome.api.OperationResultOfanyType getChangSharedDocumentExpirationResult() {
        return changSharedDocumentExpirationResult;
    }


    /**
     * Sets the changSharedDocumentExpirationResult value for this ChangSharedDocumentExpirationResponse.
     * 
     * @param changSharedDocumentExpirationResult
     */
    public void setChangSharedDocumentExpirationResult(com.cleverdome.api.OperationResultOfanyType changSharedDocumentExpirationResult) {
        this.changSharedDocumentExpirationResult = changSharedDocumentExpirationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangSharedDocumentExpirationResponse)) return false;
        ChangSharedDocumentExpirationResponse other = (ChangSharedDocumentExpirationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changSharedDocumentExpirationResult==null && other.getChangSharedDocumentExpirationResult()==null) || 
             (this.changSharedDocumentExpirationResult!=null &&
              this.changSharedDocumentExpirationResult.equals(other.getChangSharedDocumentExpirationResult())));
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
        if (getChangSharedDocumentExpirationResult() != null) {
            _hashCode += getChangSharedDocumentExpirationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangSharedDocumentExpirationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ChangSharedDocumentExpirationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changSharedDocumentExpirationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ChangSharedDocumentExpirationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfanyType"));
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
