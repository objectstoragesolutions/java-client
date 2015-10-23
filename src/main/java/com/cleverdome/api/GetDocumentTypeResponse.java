/**
 * GetDocumentTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentTypeResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDocumentTypewJCT_PyJf getDocumentTypeResult;

    public GetDocumentTypeResponse() {
    }

    public GetDocumentTypeResponse(
           com.cleverdome.api.OperationResultOfDocumentTypewJCT_PyJf getDocumentTypeResult) {
           this.getDocumentTypeResult = getDocumentTypeResult;
    }


    /**
     * Gets the getDocumentTypeResult value for this GetDocumentTypeResponse.
     * 
     * @return getDocumentTypeResult
     */
    public com.cleverdome.api.OperationResultOfDocumentTypewJCT_PyJf getGetDocumentTypeResult() {
        return getDocumentTypeResult;
    }


    /**
     * Sets the getDocumentTypeResult value for this GetDocumentTypeResponse.
     * 
     * @param getDocumentTypeResult
     */
    public void setGetDocumentTypeResult(com.cleverdome.api.OperationResultOfDocumentTypewJCT_PyJf getDocumentTypeResult) {
        this.getDocumentTypeResult = getDocumentTypeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentTypeResponse)) return false;
        GetDocumentTypeResponse other = (GetDocumentTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentTypeResult==null && other.getGetDocumentTypeResult()==null) || 
             (this.getDocumentTypeResult!=null &&
              this.getDocumentTypeResult.equals(other.getGetDocumentTypeResult())));
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
        if (getGetDocumentTypeResult() != null) {
            _hashCode += getGetDocumentTypeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentTypeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentTypeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDocumentTypewJCT_PyJf"));
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
