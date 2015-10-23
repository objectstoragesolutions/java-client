/**
 * GetAllDocumentEventsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetAllDocumentEventsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAllDocumentEventsResult;

    public GetAllDocumentEventsResponse() {
    }

    public GetAllDocumentEventsResponse(
           com.cleverdome.api.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAllDocumentEventsResult) {
           this.getAllDocumentEventsResult = getAllDocumentEventsResult;
    }


    /**
     * Gets the getAllDocumentEventsResult value for this GetAllDocumentEventsResponse.
     * 
     * @return getAllDocumentEventsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getGetAllDocumentEventsResult() {
        return getAllDocumentEventsResult;
    }


    /**
     * Sets the getAllDocumentEventsResult value for this GetAllDocumentEventsResponse.
     * 
     * @param getAllDocumentEventsResult
     */
    public void setGetAllDocumentEventsResult(com.cleverdome.api.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAllDocumentEventsResult) {
        this.getAllDocumentEventsResult = getAllDocumentEventsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllDocumentEventsResponse)) return false;
        GetAllDocumentEventsResponse other = (GetAllDocumentEventsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllDocumentEventsResult==null && other.getGetAllDocumentEventsResult()==null) || 
             (this.getAllDocumentEventsResult!=null &&
              this.getAllDocumentEventsResult.equals(other.getGetAllDocumentEventsResult())));
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
        if (getGetAllDocumentEventsResult() != null) {
            _hashCode += getGetAllDocumentEventsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllDocumentEventsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDocumentEventsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllDocumentEventsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDocumentEventsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfBaseDocument.EventjJIl8QZi"));
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
