/**
 * GetAllEsignStatusesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetAllEsignStatusesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfstringuHEDJ7Dj getAllEsignStatusesResult;

    public GetAllEsignStatusesResponse() {
    }

    public GetAllEsignStatusesResponse(
           com.cleverdome.api.OperationResultOfArrayOfstringuHEDJ7Dj getAllEsignStatusesResult) {
           this.getAllEsignStatusesResult = getAllEsignStatusesResult;
    }


    /**
     * Gets the getAllEsignStatusesResult value for this GetAllEsignStatusesResponse.
     * 
     * @return getAllEsignStatusesResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfstringuHEDJ7Dj getGetAllEsignStatusesResult() {
        return getAllEsignStatusesResult;
    }


    /**
     * Sets the getAllEsignStatusesResult value for this GetAllEsignStatusesResponse.
     * 
     * @param getAllEsignStatusesResult
     */
    public void setGetAllEsignStatusesResult(com.cleverdome.api.OperationResultOfArrayOfstringuHEDJ7Dj getAllEsignStatusesResult) {
        this.getAllEsignStatusesResult = getAllEsignStatusesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllEsignStatusesResponse)) return false;
        GetAllEsignStatusesResponse other = (GetAllEsignStatusesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllEsignStatusesResult==null && other.getGetAllEsignStatusesResult()==null) || 
             (this.getAllEsignStatusesResult!=null &&
              this.getAllEsignStatusesResult.equals(other.getGetAllEsignStatusesResult())));
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
        if (getGetAllEsignStatusesResult() != null) {
            _hashCode += getGetAllEsignStatusesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllEsignStatusesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllEsignStatusesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllEsignStatusesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllEsignStatusesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfstringuHEDJ7Dj"));
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
