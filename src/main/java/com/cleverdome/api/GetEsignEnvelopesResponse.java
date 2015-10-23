/**
 * GetEsignEnvelopesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetEsignEnvelopesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfListPageDataOfESignDataWOI_P4YU8Ybvldztq getEsignEnvelopesResult;

    public GetEsignEnvelopesResponse() {
    }

    public GetEsignEnvelopesResponse(
           com.cleverdome.api.OperationResultOfListPageDataOfESignDataWOI_P4YU8Ybvldztq getEsignEnvelopesResult) {
           this.getEsignEnvelopesResult = getEsignEnvelopesResult;
    }


    /**
     * Gets the getEsignEnvelopesResult value for this GetEsignEnvelopesResponse.
     * 
     * @return getEsignEnvelopesResult
     */
    public com.cleverdome.api.OperationResultOfListPageDataOfESignDataWOI_P4YU8Ybvldztq getGetEsignEnvelopesResult() {
        return getEsignEnvelopesResult;
    }


    /**
     * Sets the getEsignEnvelopesResult value for this GetEsignEnvelopesResponse.
     * 
     * @param getEsignEnvelopesResult
     */
    public void setGetEsignEnvelopesResult(com.cleverdome.api.OperationResultOfListPageDataOfESignDataWOI_P4YU8Ybvldztq getEsignEnvelopesResult) {
        this.getEsignEnvelopesResult = getEsignEnvelopesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEsignEnvelopesResponse)) return false;
        GetEsignEnvelopesResponse other = (GetEsignEnvelopesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEsignEnvelopesResult==null && other.getGetEsignEnvelopesResult()==null) || 
             (this.getEsignEnvelopesResult!=null &&
              this.getEsignEnvelopesResult.equals(other.getGetEsignEnvelopesResult())));
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
        if (getGetEsignEnvelopesResult() != null) {
            _hashCode += getGetEsignEnvelopesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEsignEnvelopesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetEsignEnvelopesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEsignEnvelopesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetEsignEnvelopesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfListPageDataOfESignDataWOI_P4yU8Ybvldztq"));
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
