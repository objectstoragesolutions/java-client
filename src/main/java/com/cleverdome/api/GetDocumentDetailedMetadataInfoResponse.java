/**
 * GetDocumentDetailedMetadataInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentDetailedMetadataInfoResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDocumentDetailedMetadataInfowJCT_PyJf getDocumentDetailedMetadataInfoResult;

    public GetDocumentDetailedMetadataInfoResponse() {
    }

    public GetDocumentDetailedMetadataInfoResponse(
           com.cleverdome.api.OperationResultOfDocumentDetailedMetadataInfowJCT_PyJf getDocumentDetailedMetadataInfoResult) {
           this.getDocumentDetailedMetadataInfoResult = getDocumentDetailedMetadataInfoResult;
    }


    /**
     * Gets the getDocumentDetailedMetadataInfoResult value for this GetDocumentDetailedMetadataInfoResponse.
     * 
     * @return getDocumentDetailedMetadataInfoResult
     */
    public com.cleverdome.api.OperationResultOfDocumentDetailedMetadataInfowJCT_PyJf getGetDocumentDetailedMetadataInfoResult() {
        return getDocumentDetailedMetadataInfoResult;
    }


    /**
     * Sets the getDocumentDetailedMetadataInfoResult value for this GetDocumentDetailedMetadataInfoResponse.
     * 
     * @param getDocumentDetailedMetadataInfoResult
     */
    public void setGetDocumentDetailedMetadataInfoResult(com.cleverdome.api.OperationResultOfDocumentDetailedMetadataInfowJCT_PyJf getDocumentDetailedMetadataInfoResult) {
        this.getDocumentDetailedMetadataInfoResult = getDocumentDetailedMetadataInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentDetailedMetadataInfoResponse)) return false;
        GetDocumentDetailedMetadataInfoResponse other = (GetDocumentDetailedMetadataInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentDetailedMetadataInfoResult==null && other.getGetDocumentDetailedMetadataInfoResult()==null) || 
             (this.getDocumentDetailedMetadataInfoResult!=null &&
              this.getDocumentDetailedMetadataInfoResult.equals(other.getGetDocumentDetailedMetadataInfoResult())));
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
        if (getGetDocumentDetailedMetadataInfoResult() != null) {
            _hashCode += getGetDocumentDetailedMetadataInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentDetailedMetadataInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentDetailedMetadataInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentDetailedMetadataInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentDetailedMetadataInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDocumentDetailedMetadataInfowJCT_PyJf"));
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
