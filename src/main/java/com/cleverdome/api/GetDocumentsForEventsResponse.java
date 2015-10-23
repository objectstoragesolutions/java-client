/**
 * GetDocumentsForEventsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentsForEventsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEventsResult;

    public GetDocumentsForEventsResponse() {
    }

    public GetDocumentsForEventsResponse(
           com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEventsResult) {
           this.getDocumentsForEventsResult = getDocumentsForEventsResult;
    }


    /**
     * Gets the getDocumentsForEventsResult value for this GetDocumentsForEventsResponse.
     * 
     * @return getDocumentsForEventsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getGetDocumentsForEventsResult() {
        return getDocumentsForEventsResult;
    }


    /**
     * Sets the getDocumentsForEventsResult value for this GetDocumentsForEventsResponse.
     * 
     * @param getDocumentsForEventsResult
     */
    public void setGetDocumentsForEventsResult(com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEventsResult) {
        this.getDocumentsForEventsResult = getDocumentsForEventsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsForEventsResponse)) return false;
        GetDocumentsForEventsResponse other = (GetDocumentsForEventsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentsForEventsResult==null && other.getGetDocumentsForEventsResult()==null) || 
             (this.getDocumentsForEventsResult!=null &&
              this.getDocumentsForEventsResult.equals(other.getGetDocumentsForEventsResult())));
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
        if (getGetDocumentsForEventsResult() != null) {
            _hashCode += getGetDocumentsForEventsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentsForEventsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsForEventsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentsForEventsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentsForEventsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfguiduHEDJ7Dj"));
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
