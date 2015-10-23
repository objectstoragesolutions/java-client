/**
 * SetupBatchForDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SetupBatchForDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType setupBatchForDocumentResult;

    public SetupBatchForDocumentResponse() {
    }

    public SetupBatchForDocumentResponse(
           com.cleverdome.api.OperationResultOfanyType setupBatchForDocumentResult) {
           this.setupBatchForDocumentResult = setupBatchForDocumentResult;
    }


    /**
     * Gets the setupBatchForDocumentResult value for this SetupBatchForDocumentResponse.
     * 
     * @return setupBatchForDocumentResult
     */
    public com.cleverdome.api.OperationResultOfanyType getSetupBatchForDocumentResult() {
        return setupBatchForDocumentResult;
    }


    /**
     * Sets the setupBatchForDocumentResult value for this SetupBatchForDocumentResponse.
     * 
     * @param setupBatchForDocumentResult
     */
    public void setSetupBatchForDocumentResult(com.cleverdome.api.OperationResultOfanyType setupBatchForDocumentResult) {
        this.setupBatchForDocumentResult = setupBatchForDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetupBatchForDocumentResponse)) return false;
        SetupBatchForDocumentResponse other = (SetupBatchForDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setupBatchForDocumentResult==null && other.getSetupBatchForDocumentResult()==null) || 
             (this.setupBatchForDocumentResult!=null &&
              this.setupBatchForDocumentResult.equals(other.getSetupBatchForDocumentResult())));
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
        if (getSetupBatchForDocumentResult() != null) {
            _hashCode += getSetupBatchForDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetupBatchForDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetupBatchForDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupBatchForDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SetupBatchForDocumentResult"));
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
