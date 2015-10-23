/**
 * GetRecentDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetRecentDocumentsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfRecentDocumentsInfowJCT_PyJf getRecentDocumentsResult;

    public GetRecentDocumentsResponse() {
    }

    public GetRecentDocumentsResponse(
           com.cleverdome.api.OperationResultOfRecentDocumentsInfowJCT_PyJf getRecentDocumentsResult) {
           this.getRecentDocumentsResult = getRecentDocumentsResult;
    }


    /**
     * Gets the getRecentDocumentsResult value for this GetRecentDocumentsResponse.
     * 
     * @return getRecentDocumentsResult
     */
    public com.cleverdome.api.OperationResultOfRecentDocumentsInfowJCT_PyJf getGetRecentDocumentsResult() {
        return getRecentDocumentsResult;
    }


    /**
     * Sets the getRecentDocumentsResult value for this GetRecentDocumentsResponse.
     * 
     * @param getRecentDocumentsResult
     */
    public void setGetRecentDocumentsResult(com.cleverdome.api.OperationResultOfRecentDocumentsInfowJCT_PyJf getRecentDocumentsResult) {
        this.getRecentDocumentsResult = getRecentDocumentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRecentDocumentsResponse)) return false;
        GetRecentDocumentsResponse other = (GetRecentDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRecentDocumentsResult==null && other.getGetRecentDocumentsResult()==null) || 
             (this.getRecentDocumentsResult!=null &&
              this.getRecentDocumentsResult.equals(other.getGetRecentDocumentsResult())));
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
        if (getGetRecentDocumentsResult() != null) {
            _hashCode += getGetRecentDocumentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRecentDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRecentDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRecentDocumentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetRecentDocumentsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfRecentDocumentsInfowJCT_PyJf"));
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
