/**
 * GetDocumentDetailedWithoutPagesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentDetailedWithoutPagesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDocumentDetailswJCT_PyJf getDocumentDetailedWithoutPagesResult;

    public GetDocumentDetailedWithoutPagesResponse() {
    }

    public GetDocumentDetailedWithoutPagesResponse(
           com.cleverdome.api.OperationResultOfDocumentDetailswJCT_PyJf getDocumentDetailedWithoutPagesResult) {
           this.getDocumentDetailedWithoutPagesResult = getDocumentDetailedWithoutPagesResult;
    }


    /**
     * Gets the getDocumentDetailedWithoutPagesResult value for this GetDocumentDetailedWithoutPagesResponse.
     * 
     * @return getDocumentDetailedWithoutPagesResult
     */
    public com.cleverdome.api.OperationResultOfDocumentDetailswJCT_PyJf getGetDocumentDetailedWithoutPagesResult() {
        return getDocumentDetailedWithoutPagesResult;
    }


    /**
     * Sets the getDocumentDetailedWithoutPagesResult value for this GetDocumentDetailedWithoutPagesResponse.
     * 
     * @param getDocumentDetailedWithoutPagesResult
     */
    public void setGetDocumentDetailedWithoutPagesResult(com.cleverdome.api.OperationResultOfDocumentDetailswJCT_PyJf getDocumentDetailedWithoutPagesResult) {
        this.getDocumentDetailedWithoutPagesResult = getDocumentDetailedWithoutPagesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentDetailedWithoutPagesResponse)) return false;
        GetDocumentDetailedWithoutPagesResponse other = (GetDocumentDetailedWithoutPagesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentDetailedWithoutPagesResult==null && other.getGetDocumentDetailedWithoutPagesResult()==null) || 
             (this.getDocumentDetailedWithoutPagesResult!=null &&
              this.getDocumentDetailedWithoutPagesResult.equals(other.getGetDocumentDetailedWithoutPagesResult())));
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
        if (getGetDocumentDetailedWithoutPagesResult() != null) {
            _hashCode += getGetDocumentDetailedWithoutPagesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentDetailedWithoutPagesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentDetailedWithoutPagesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentDetailedWithoutPagesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentDetailedWithoutPagesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDocumentDetailswJCT_PyJf"));
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
