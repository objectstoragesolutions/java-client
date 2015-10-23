/**
 * GetDocumentLockInformationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentLockInformationResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDocumentLockInformationwJCT_PyJf getDocumentLockInformationResult;

    public GetDocumentLockInformationResponse() {
    }

    public GetDocumentLockInformationResponse(
           com.cleverdome.api.OperationResultOfDocumentLockInformationwJCT_PyJf getDocumentLockInformationResult) {
           this.getDocumentLockInformationResult = getDocumentLockInformationResult;
    }


    /**
     * Gets the getDocumentLockInformationResult value for this GetDocumentLockInformationResponse.
     * 
     * @return getDocumentLockInformationResult
     */
    public com.cleverdome.api.OperationResultOfDocumentLockInformationwJCT_PyJf getGetDocumentLockInformationResult() {
        return getDocumentLockInformationResult;
    }


    /**
     * Sets the getDocumentLockInformationResult value for this GetDocumentLockInformationResponse.
     * 
     * @param getDocumentLockInformationResult
     */
    public void setGetDocumentLockInformationResult(com.cleverdome.api.OperationResultOfDocumentLockInformationwJCT_PyJf getDocumentLockInformationResult) {
        this.getDocumentLockInformationResult = getDocumentLockInformationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentLockInformationResponse)) return false;
        GetDocumentLockInformationResponse other = (GetDocumentLockInformationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentLockInformationResult==null && other.getGetDocumentLockInformationResult()==null) || 
             (this.getDocumentLockInformationResult!=null &&
              this.getDocumentLockInformationResult.equals(other.getGetDocumentLockInformationResult())));
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
        if (getGetDocumentLockInformationResult() != null) {
            _hashCode += getGetDocumentLockInformationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentLockInformationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentLockInformationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentLockInformationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentLockInformationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDocumentLockInformationwJCT_PyJf"));
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
