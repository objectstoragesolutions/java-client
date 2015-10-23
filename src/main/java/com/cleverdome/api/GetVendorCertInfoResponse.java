/**
 * GetVendorCertInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetVendorCertInfoResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfVendorInfo52SKXdDF getVendorCertInfoResult;

    public GetVendorCertInfoResponse() {
    }

    public GetVendorCertInfoResponse(
           com.cleverdome.api.OperationResultOfVendorInfo52SKXdDF getVendorCertInfoResult) {
           this.getVendorCertInfoResult = getVendorCertInfoResult;
    }


    /**
     * Gets the getVendorCertInfoResult value for this GetVendorCertInfoResponse.
     * 
     * @return getVendorCertInfoResult
     */
    public com.cleverdome.api.OperationResultOfVendorInfo52SKXdDF getGetVendorCertInfoResult() {
        return getVendorCertInfoResult;
    }


    /**
     * Sets the getVendorCertInfoResult value for this GetVendorCertInfoResponse.
     * 
     * @param getVendorCertInfoResult
     */
    public void setGetVendorCertInfoResult(com.cleverdome.api.OperationResultOfVendorInfo52SKXdDF getVendorCertInfoResult) {
        this.getVendorCertInfoResult = getVendorCertInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetVendorCertInfoResponse)) return false;
        GetVendorCertInfoResponse other = (GetVendorCertInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getVendorCertInfoResult==null && other.getGetVendorCertInfoResult()==null) || 
             (this.getVendorCertInfoResult!=null &&
              this.getVendorCertInfoResult.equals(other.getGetVendorCertInfoResult())));
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
        if (getGetVendorCertInfoResult() != null) {
            _hashCode += getGetVendorCertInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVendorCertInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetVendorCertInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVendorCertInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetVendorCertInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfVendorInfo52SKXdDF"));
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
