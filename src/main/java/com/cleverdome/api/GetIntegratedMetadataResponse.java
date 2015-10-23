/**
 * GetIntegratedMetadataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetIntegratedMetadataResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getIntegratedMetadataResult;

    public GetIntegratedMetadataResponse() {
    }

    public GetIntegratedMetadataResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getIntegratedMetadataResult) {
           this.getIntegratedMetadataResult = getIntegratedMetadataResult;
    }


    /**
     * Gets the getIntegratedMetadataResult value for this GetIntegratedMetadataResponse.
     * 
     * @return getIntegratedMetadataResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getGetIntegratedMetadataResult() {
        return getIntegratedMetadataResult;
    }


    /**
     * Sets the getIntegratedMetadataResult value for this GetIntegratedMetadataResponse.
     * 
     * @param getIntegratedMetadataResult
     */
    public void setGetIntegratedMetadataResult(com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getIntegratedMetadataResult) {
        this.getIntegratedMetadataResult = getIntegratedMetadataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIntegratedMetadataResponse)) return false;
        GetIntegratedMetadataResponse other = (GetIntegratedMetadataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getIntegratedMetadataResult==null && other.getGetIntegratedMetadataResult()==null) || 
             (this.getIntegratedMetadataResult!=null &&
              this.getIntegratedMetadataResult.equals(other.getGetIntegratedMetadataResult())));
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
        if (getGetIntegratedMetadataResult() != null) {
            _hashCode += getGetIntegratedMetadataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIntegratedMetadataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetIntegratedMetadataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getIntegratedMetadataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetIntegratedMetadataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf"));
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
