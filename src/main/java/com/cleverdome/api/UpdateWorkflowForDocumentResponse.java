/**
 * UpdateWorkflowForDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UpdateWorkflowForDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType updateWorkflowForDocumentResult;

    public UpdateWorkflowForDocumentResponse() {
    }

    public UpdateWorkflowForDocumentResponse(
           com.cleverdome.api.OperationResultOfanyType updateWorkflowForDocumentResult) {
           this.updateWorkflowForDocumentResult = updateWorkflowForDocumentResult;
    }


    /**
     * Gets the updateWorkflowForDocumentResult value for this UpdateWorkflowForDocumentResponse.
     * 
     * @return updateWorkflowForDocumentResult
     */
    public com.cleverdome.api.OperationResultOfanyType getUpdateWorkflowForDocumentResult() {
        return updateWorkflowForDocumentResult;
    }


    /**
     * Sets the updateWorkflowForDocumentResult value for this UpdateWorkflowForDocumentResponse.
     * 
     * @param updateWorkflowForDocumentResult
     */
    public void setUpdateWorkflowForDocumentResult(com.cleverdome.api.OperationResultOfanyType updateWorkflowForDocumentResult) {
        this.updateWorkflowForDocumentResult = updateWorkflowForDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateWorkflowForDocumentResponse)) return false;
        UpdateWorkflowForDocumentResponse other = (UpdateWorkflowForDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateWorkflowForDocumentResult==null && other.getUpdateWorkflowForDocumentResult()==null) || 
             (this.updateWorkflowForDocumentResult!=null &&
              this.updateWorkflowForDocumentResult.equals(other.getUpdateWorkflowForDocumentResult())));
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
        if (getUpdateWorkflowForDocumentResult() != null) {
            _hashCode += getUpdateWorkflowForDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateWorkflowForDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateWorkflowForDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateWorkflowForDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateWorkflowForDocumentResult"));
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
