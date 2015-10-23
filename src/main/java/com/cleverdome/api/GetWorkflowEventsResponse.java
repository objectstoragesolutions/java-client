/**
 * GetWorkflowEventsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetWorkflowEventsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfBaseDocumentDocumentEventjJIl8QZi getWorkflowEventsResult;

    public GetWorkflowEventsResponse() {
    }

    public GetWorkflowEventsResponse(
           com.cleverdome.api.OperationResultOfArrayOfBaseDocumentDocumentEventjJIl8QZi getWorkflowEventsResult) {
           this.getWorkflowEventsResult = getWorkflowEventsResult;
    }


    /**
     * Gets the getWorkflowEventsResult value for this GetWorkflowEventsResponse.
     * 
     * @return getWorkflowEventsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentDocumentEventjJIl8QZi getGetWorkflowEventsResult() {
        return getWorkflowEventsResult;
    }


    /**
     * Sets the getWorkflowEventsResult value for this GetWorkflowEventsResponse.
     * 
     * @param getWorkflowEventsResult
     */
    public void setGetWorkflowEventsResult(com.cleverdome.api.OperationResultOfArrayOfBaseDocumentDocumentEventjJIl8QZi getWorkflowEventsResult) {
        this.getWorkflowEventsResult = getWorkflowEventsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWorkflowEventsResponse)) return false;
        GetWorkflowEventsResponse other = (GetWorkflowEventsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWorkflowEventsResult==null && other.getGetWorkflowEventsResult()==null) || 
             (this.getWorkflowEventsResult!=null &&
              this.getWorkflowEventsResult.equals(other.getGetWorkflowEventsResult())));
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
        if (getGetWorkflowEventsResult() != null) {
            _hashCode += getGetWorkflowEventsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWorkflowEventsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetWorkflowEventsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWorkflowEventsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetWorkflowEventsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfBaseDocument.DocumentEventjJIl8QZi"));
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
