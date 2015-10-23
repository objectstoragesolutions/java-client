/**
 * GetDocumentPreviewInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentPreviewInfoResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDocumentPreviewDatawJCT_PyJf getDocumentPreviewInfoResult;

    public GetDocumentPreviewInfoResponse() {
    }

    public GetDocumentPreviewInfoResponse(
           com.cleverdome.api.OperationResultOfDocumentPreviewDatawJCT_PyJf getDocumentPreviewInfoResult) {
           this.getDocumentPreviewInfoResult = getDocumentPreviewInfoResult;
    }


    /**
     * Gets the getDocumentPreviewInfoResult value for this GetDocumentPreviewInfoResponse.
     * 
     * @return getDocumentPreviewInfoResult
     */
    public com.cleverdome.api.OperationResultOfDocumentPreviewDatawJCT_PyJf getGetDocumentPreviewInfoResult() {
        return getDocumentPreviewInfoResult;
    }


    /**
     * Sets the getDocumentPreviewInfoResult value for this GetDocumentPreviewInfoResponse.
     * 
     * @param getDocumentPreviewInfoResult
     */
    public void setGetDocumentPreviewInfoResult(com.cleverdome.api.OperationResultOfDocumentPreviewDatawJCT_PyJf getDocumentPreviewInfoResult) {
        this.getDocumentPreviewInfoResult = getDocumentPreviewInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentPreviewInfoResponse)) return false;
        GetDocumentPreviewInfoResponse other = (GetDocumentPreviewInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentPreviewInfoResult==null && other.getGetDocumentPreviewInfoResult()==null) || 
             (this.getDocumentPreviewInfoResult!=null &&
              this.getDocumentPreviewInfoResult.equals(other.getGetDocumentPreviewInfoResult())));
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
        if (getGetDocumentPreviewInfoResult() != null) {
            _hashCode += getGetDocumentPreviewInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentPreviewInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentPreviewInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentPreviewInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentPreviewInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDocumentPreviewDatawJCT_PyJf"));
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
