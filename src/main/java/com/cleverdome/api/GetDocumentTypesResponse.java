/**
 * GetDocumentTypesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentTypesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypesResult;

    public GetDocumentTypesResponse() {
    }

    public GetDocumentTypesResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypesResult) {
           this.getDocumentTypesResult = getDocumentTypesResult;
    }


    /**
     * Gets the getDocumentTypesResult value for this GetDocumentTypesResponse.
     * 
     * @return getDocumentTypesResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getGetDocumentTypesResult() {
        return getDocumentTypesResult;
    }


    /**
     * Sets the getDocumentTypesResult value for this GetDocumentTypesResponse.
     * 
     * @param getDocumentTypesResult
     */
    public void setGetDocumentTypesResult(com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypesResult) {
        this.getDocumentTypesResult = getDocumentTypesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentTypesResponse)) return false;
        GetDocumentTypesResponse other = (GetDocumentTypesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentTypesResult==null && other.getGetDocumentTypesResult()==null) || 
             (this.getDocumentTypesResult!=null &&
              this.getDocumentTypesResult.equals(other.getGetDocumentTypesResult())));
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
        if (getGetDocumentTypesResult() != null) {
            _hashCode += getGetDocumentTypesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentTypesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentTypesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentTypesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentTypesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentTypewJCT_PyJf"));
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
