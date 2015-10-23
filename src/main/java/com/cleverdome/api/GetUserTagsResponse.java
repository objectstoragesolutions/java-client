/**
 * GetUserTagsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetUserTagsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentTagwJCT_PyJf getUserTagsResult;

    public GetUserTagsResponse() {
    }

    public GetUserTagsResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentTagwJCT_PyJf getUserTagsResult) {
           this.getUserTagsResult = getUserTagsResult;
    }


    /**
     * Gets the getUserTagsResult value for this GetUserTagsResponse.
     * 
     * @return getUserTagsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTagwJCT_PyJf getGetUserTagsResult() {
        return getUserTagsResult;
    }


    /**
     * Sets the getUserTagsResult value for this GetUserTagsResponse.
     * 
     * @param getUserTagsResult
     */
    public void setGetUserTagsResult(com.cleverdome.api.OperationResultOfArrayOfDocumentTagwJCT_PyJf getUserTagsResult) {
        this.getUserTagsResult = getUserTagsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserTagsResponse)) return false;
        GetUserTagsResponse other = (GetUserTagsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUserTagsResult==null && other.getGetUserTagsResult()==null) || 
             (this.getUserTagsResult!=null &&
              this.getUserTagsResult.equals(other.getGetUserTagsResult())));
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
        if (getGetUserTagsResult() != null) {
            _hashCode += getGetUserTagsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserTagsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetUserTagsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUserTagsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetUserTagsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentTagwJCT_PyJf"));
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
