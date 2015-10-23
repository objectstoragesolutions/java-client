/**
 * GetIntegratedFieldTypesForDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetIntegratedFieldTypesForDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getIntegratedFieldTypesForDocumentResult;

    public GetIntegratedFieldTypesForDocumentResponse() {
    }

    public GetIntegratedFieldTypesForDocumentResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getIntegratedFieldTypesForDocumentResult) {
           this.getIntegratedFieldTypesForDocumentResult = getIntegratedFieldTypesForDocumentResult;
    }


    /**
     * Gets the getIntegratedFieldTypesForDocumentResult value for this GetIntegratedFieldTypesForDocumentResponse.
     * 
     * @return getIntegratedFieldTypesForDocumentResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getGetIntegratedFieldTypesForDocumentResult() {
        return getIntegratedFieldTypesForDocumentResult;
    }


    /**
     * Sets the getIntegratedFieldTypesForDocumentResult value for this GetIntegratedFieldTypesForDocumentResponse.
     * 
     * @param getIntegratedFieldTypesForDocumentResult
     */
    public void setGetIntegratedFieldTypesForDocumentResult(com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getIntegratedFieldTypesForDocumentResult) {
        this.getIntegratedFieldTypesForDocumentResult = getIntegratedFieldTypesForDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIntegratedFieldTypesForDocumentResponse)) return false;
        GetIntegratedFieldTypesForDocumentResponse other = (GetIntegratedFieldTypesForDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getIntegratedFieldTypesForDocumentResult==null && other.getGetIntegratedFieldTypesForDocumentResult()==null) || 
             (this.getIntegratedFieldTypesForDocumentResult!=null &&
              this.getIntegratedFieldTypesForDocumentResult.equals(other.getGetIntegratedFieldTypesForDocumentResult())));
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
        if (getGetIntegratedFieldTypesForDocumentResult() != null) {
            _hashCode += getGetIntegratedFieldTypesForDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIntegratedFieldTypesForDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetIntegratedFieldTypesForDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getIntegratedFieldTypesForDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetIntegratedFieldTypesForDocumentResult"));
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
