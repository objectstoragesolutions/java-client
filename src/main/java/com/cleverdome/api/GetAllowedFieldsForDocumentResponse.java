/**
 * GetAllowedFieldsForDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetAllowedFieldsForDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getAllowedFieldsForDocumentResult;

    public GetAllowedFieldsForDocumentResponse() {
    }

    public GetAllowedFieldsForDocumentResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getAllowedFieldsForDocumentResult) {
           this.getAllowedFieldsForDocumentResult = getAllowedFieldsForDocumentResult;
    }


    /**
     * Gets the getAllowedFieldsForDocumentResult value for this GetAllowedFieldsForDocumentResponse.
     * 
     * @return getAllowedFieldsForDocumentResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getGetAllowedFieldsForDocumentResult() {
        return getAllowedFieldsForDocumentResult;
    }


    /**
     * Sets the getAllowedFieldsForDocumentResult value for this GetAllowedFieldsForDocumentResponse.
     * 
     * @param getAllowedFieldsForDocumentResult
     */
    public void setGetAllowedFieldsForDocumentResult(com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getAllowedFieldsForDocumentResult) {
        this.getAllowedFieldsForDocumentResult = getAllowedFieldsForDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllowedFieldsForDocumentResponse)) return false;
        GetAllowedFieldsForDocumentResponse other = (GetAllowedFieldsForDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllowedFieldsForDocumentResult==null && other.getGetAllowedFieldsForDocumentResult()==null) || 
             (this.getAllowedFieldsForDocumentResult!=null &&
              this.getAllowedFieldsForDocumentResult.equals(other.getGetAllowedFieldsForDocumentResult())));
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
        if (getGetAllowedFieldsForDocumentResult() != null) {
            _hashCode += getGetAllowedFieldsForDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllowedFieldsForDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllowedFieldsForDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllowedFieldsForDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllowedFieldsForDocumentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentFieldwJCT_PyJf"));
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
