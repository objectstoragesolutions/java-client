/**
 * GetDocumensByTagsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumensByTagsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getDocumensByTagsResult;

    public GetDocumensByTagsResponse() {
    }

    public GetDocumensByTagsResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getDocumensByTagsResult) {
           this.getDocumensByTagsResult = getDocumensByTagsResult;
    }


    /**
     * Gets the getDocumensByTagsResult value for this GetDocumensByTagsResponse.
     * 
     * @return getDocumensByTagsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getGetDocumensByTagsResult() {
        return getDocumensByTagsResult;
    }


    /**
     * Sets the getDocumensByTagsResult value for this GetDocumensByTagsResponse.
     * 
     * @param getDocumensByTagsResult
     */
    public void setGetDocumensByTagsResult(com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getDocumensByTagsResult) {
        this.getDocumensByTagsResult = getDocumensByTagsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumensByTagsResponse)) return false;
        GetDocumensByTagsResponse other = (GetDocumensByTagsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumensByTagsResult==null && other.getGetDocumensByTagsResult()==null) || 
             (this.getDocumensByTagsResult!=null &&
              this.getDocumensByTagsResult.equals(other.getGetDocumensByTagsResult())));
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
        if (getGetDocumensByTagsResult() != null) {
            _hashCode += getGetDocumensByTagsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumensByTagsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumensByTagsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumensByTagsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumensByTagsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentwJCT_PyJf"));
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
