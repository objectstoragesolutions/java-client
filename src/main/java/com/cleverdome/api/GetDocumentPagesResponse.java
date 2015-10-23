/**
 * GetDocumentPagesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentPagesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDisplayDocumentInfowJCT_PyJf getDocumentPagesResult;

    public GetDocumentPagesResponse() {
    }

    public GetDocumentPagesResponse(
           com.cleverdome.api.OperationResultOfDisplayDocumentInfowJCT_PyJf getDocumentPagesResult) {
           this.getDocumentPagesResult = getDocumentPagesResult;
    }


    /**
     * Gets the getDocumentPagesResult value for this GetDocumentPagesResponse.
     * 
     * @return getDocumentPagesResult
     */
    public com.cleverdome.api.OperationResultOfDisplayDocumentInfowJCT_PyJf getGetDocumentPagesResult() {
        return getDocumentPagesResult;
    }


    /**
     * Sets the getDocumentPagesResult value for this GetDocumentPagesResponse.
     * 
     * @param getDocumentPagesResult
     */
    public void setGetDocumentPagesResult(com.cleverdome.api.OperationResultOfDisplayDocumentInfowJCT_PyJf getDocumentPagesResult) {
        this.getDocumentPagesResult = getDocumentPagesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentPagesResponse)) return false;
        GetDocumentPagesResponse other = (GetDocumentPagesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentPagesResult==null && other.getGetDocumentPagesResult()==null) || 
             (this.getDocumentPagesResult!=null &&
              this.getDocumentPagesResult.equals(other.getGetDocumentPagesResult())));
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
        if (getGetDocumentPagesResult() != null) {
            _hashCode += getGetDocumentPagesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentPagesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentPagesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentPagesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentPagesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDisplayDocumentInfowJCT_PyJf"));
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
