/**
 * GetEventsForDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetEventsForDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionHistorywJCT_PyJf getEventsForDocumentResult;

    public GetEventsForDocumentResponse() {
    }

    public GetEventsForDocumentResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionHistorywJCT_PyJf getEventsForDocumentResult) {
           this.getEventsForDocumentResult = getEventsForDocumentResult;
    }


    /**
     * Gets the getEventsForDocumentResult value for this GetEventsForDocumentResponse.
     * 
     * @return getEventsForDocumentResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionHistorywJCT_PyJf getGetEventsForDocumentResult() {
        return getEventsForDocumentResult;
    }


    /**
     * Sets the getEventsForDocumentResult value for this GetEventsForDocumentResponse.
     * 
     * @param getEventsForDocumentResult
     */
    public void setGetEventsForDocumentResult(com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionHistorywJCT_PyJf getEventsForDocumentResult) {
        this.getEventsForDocumentResult = getEventsForDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEventsForDocumentResponse)) return false;
        GetEventsForDocumentResponse other = (GetEventsForDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEventsForDocumentResult==null && other.getGetEventsForDocumentResult()==null) || 
             (this.getEventsForDocumentResult!=null &&
              this.getEventsForDocumentResult.equals(other.getGetEventsForDocumentResult())));
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
        if (getGetEventsForDocumentResult() != null) {
            _hashCode += getGetEventsForDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEventsForDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetEventsForDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEventsForDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetEventsForDocumentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentRevisionHistorywJCT_PyJf"));
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
