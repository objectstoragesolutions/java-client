/**
 * GetAvailableFieldTypesForDocumentTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetAvailableFieldTypesForDocumentTypeResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf getAvailableFieldTypesForDocumentTypeResult;

    public GetAvailableFieldTypesForDocumentTypeResponse() {
    }

    public GetAvailableFieldTypesForDocumentTypeResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf getAvailableFieldTypesForDocumentTypeResult) {
           this.getAvailableFieldTypesForDocumentTypeResult = getAvailableFieldTypesForDocumentTypeResult;
    }


    /**
     * Gets the getAvailableFieldTypesForDocumentTypeResult value for this GetAvailableFieldTypesForDocumentTypeResponse.
     * 
     * @return getAvailableFieldTypesForDocumentTypeResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf getGetAvailableFieldTypesForDocumentTypeResult() {
        return getAvailableFieldTypesForDocumentTypeResult;
    }


    /**
     * Sets the getAvailableFieldTypesForDocumentTypeResult value for this GetAvailableFieldTypesForDocumentTypeResponse.
     * 
     * @param getAvailableFieldTypesForDocumentTypeResult
     */
    public void setGetAvailableFieldTypesForDocumentTypeResult(com.cleverdome.api.OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf getAvailableFieldTypesForDocumentTypeResult) {
        this.getAvailableFieldTypesForDocumentTypeResult = getAvailableFieldTypesForDocumentTypeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableFieldTypesForDocumentTypeResponse)) return false;
        GetAvailableFieldTypesForDocumentTypeResponse other = (GetAvailableFieldTypesForDocumentTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAvailableFieldTypesForDocumentTypeResult==null && other.getGetAvailableFieldTypesForDocumentTypeResult()==null) || 
             (this.getAvailableFieldTypesForDocumentTypeResult!=null &&
              this.getAvailableFieldTypesForDocumentTypeResult.equals(other.getGetAvailableFieldTypesForDocumentTypeResult())));
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
        if (getGetAvailableFieldTypesForDocumentTypeResult() != null) {
            _hashCode += getGetAvailableFieldTypesForDocumentTypeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAvailableFieldTypesForDocumentTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAvailableFieldTypesForDocumentTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAvailableFieldTypesForDocumentTypeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAvailableFieldTypesForDocumentTypeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf"));
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
