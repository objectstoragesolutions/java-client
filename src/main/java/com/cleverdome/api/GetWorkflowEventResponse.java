/**
 * GetWorkflowEventResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetWorkflowEventResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfBaseDocumentEventjJIl8QZi getWorkflowEventResult;

    public GetWorkflowEventResponse() {
    }

    public GetWorkflowEventResponse(
           com.cleverdome.api.OperationResultOfBaseDocumentEventjJIl8QZi getWorkflowEventResult) {
           this.getWorkflowEventResult = getWorkflowEventResult;
    }


    /**
     * Gets the getWorkflowEventResult value for this GetWorkflowEventResponse.
     * 
     * @return getWorkflowEventResult
     */
    public com.cleverdome.api.OperationResultOfBaseDocumentEventjJIl8QZi getGetWorkflowEventResult() {
        return getWorkflowEventResult;
    }


    /**
     * Sets the getWorkflowEventResult value for this GetWorkflowEventResponse.
     * 
     * @param getWorkflowEventResult
     */
    public void setGetWorkflowEventResult(com.cleverdome.api.OperationResultOfBaseDocumentEventjJIl8QZi getWorkflowEventResult) {
        this.getWorkflowEventResult = getWorkflowEventResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWorkflowEventResponse)) return false;
        GetWorkflowEventResponse other = (GetWorkflowEventResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWorkflowEventResult==null && other.getGetWorkflowEventResult()==null) || 
             (this.getWorkflowEventResult!=null &&
              this.getWorkflowEventResult.equals(other.getGetWorkflowEventResult())));
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
        if (getGetWorkflowEventResult() != null) {
            _hashCode += getGetWorkflowEventResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWorkflowEventResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetWorkflowEventResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWorkflowEventResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetWorkflowEventResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfBaseDocument.EventjJIl8QZi"));
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
