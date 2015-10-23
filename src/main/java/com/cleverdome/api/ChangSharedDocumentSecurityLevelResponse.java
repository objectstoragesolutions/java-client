/**
 * ChangSharedDocumentSecurityLevelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class ChangSharedDocumentSecurityLevelResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType changSharedDocumentSecurityLevelResult;

    public ChangSharedDocumentSecurityLevelResponse() {
    }

    public ChangSharedDocumentSecurityLevelResponse(
           com.cleverdome.api.OperationResultOfanyType changSharedDocumentSecurityLevelResult) {
           this.changSharedDocumentSecurityLevelResult = changSharedDocumentSecurityLevelResult;
    }


    /**
     * Gets the changSharedDocumentSecurityLevelResult value for this ChangSharedDocumentSecurityLevelResponse.
     * 
     * @return changSharedDocumentSecurityLevelResult
     */
    public com.cleverdome.api.OperationResultOfanyType getChangSharedDocumentSecurityLevelResult() {
        return changSharedDocumentSecurityLevelResult;
    }


    /**
     * Sets the changSharedDocumentSecurityLevelResult value for this ChangSharedDocumentSecurityLevelResponse.
     * 
     * @param changSharedDocumentSecurityLevelResult
     */
    public void setChangSharedDocumentSecurityLevelResult(com.cleverdome.api.OperationResultOfanyType changSharedDocumentSecurityLevelResult) {
        this.changSharedDocumentSecurityLevelResult = changSharedDocumentSecurityLevelResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangSharedDocumentSecurityLevelResponse)) return false;
        ChangSharedDocumentSecurityLevelResponse other = (ChangSharedDocumentSecurityLevelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changSharedDocumentSecurityLevelResult==null && other.getChangSharedDocumentSecurityLevelResult()==null) || 
             (this.changSharedDocumentSecurityLevelResult!=null &&
              this.changSharedDocumentSecurityLevelResult.equals(other.getChangSharedDocumentSecurityLevelResult())));
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
        if (getChangSharedDocumentSecurityLevelResult() != null) {
            _hashCode += getChangSharedDocumentSecurityLevelResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangSharedDocumentSecurityLevelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ChangSharedDocumentSecurityLevelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changSharedDocumentSecurityLevelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ChangSharedDocumentSecurityLevelResult"));
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
