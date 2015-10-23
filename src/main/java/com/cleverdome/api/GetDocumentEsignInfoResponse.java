/**
 * GetDocumentEsignInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentEsignInfoResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfESignDataWOI_P4YU8 getDocumentEsignInfoResult;

    public GetDocumentEsignInfoResponse() {
    }

    public GetDocumentEsignInfoResponse(
           com.cleverdome.api.OperationResultOfESignDataWOI_P4YU8 getDocumentEsignInfoResult) {
           this.getDocumentEsignInfoResult = getDocumentEsignInfoResult;
    }


    /**
     * Gets the getDocumentEsignInfoResult value for this GetDocumentEsignInfoResponse.
     * 
     * @return getDocumentEsignInfoResult
     */
    public com.cleverdome.api.OperationResultOfESignDataWOI_P4YU8 getGetDocumentEsignInfoResult() {
        return getDocumentEsignInfoResult;
    }


    /**
     * Sets the getDocumentEsignInfoResult value for this GetDocumentEsignInfoResponse.
     * 
     * @param getDocumentEsignInfoResult
     */
    public void setGetDocumentEsignInfoResult(com.cleverdome.api.OperationResultOfESignDataWOI_P4YU8 getDocumentEsignInfoResult) {
        this.getDocumentEsignInfoResult = getDocumentEsignInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentEsignInfoResponse)) return false;
        GetDocumentEsignInfoResponse other = (GetDocumentEsignInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentEsignInfoResult==null && other.getGetDocumentEsignInfoResult()==null) || 
             (this.getDocumentEsignInfoResult!=null &&
              this.getDocumentEsignInfoResult.equals(other.getGetDocumentEsignInfoResult())));
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
        if (getGetDocumentEsignInfoResult() != null) {
            _hashCode += getGetDocumentEsignInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentEsignInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentEsignInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentEsignInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentEsignInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfESignDataWOI_P4yU8"));
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
