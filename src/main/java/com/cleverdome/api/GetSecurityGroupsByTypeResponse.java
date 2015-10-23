/**
 * GetSecurityGroupsByTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetSecurityGroupsByTypeResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getSecurityGroupsByTypeResult;

    public GetSecurityGroupsByTypeResponse() {
    }

    public GetSecurityGroupsByTypeResponse(
           com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getSecurityGroupsByTypeResult) {
           this.getSecurityGroupsByTypeResult = getSecurityGroupsByTypeResult;
    }


    /**
     * Gets the getSecurityGroupsByTypeResult value for this GetSecurityGroupsByTypeResponse.
     * 
     * @return getSecurityGroupsByTypeResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getGetSecurityGroupsByTypeResult() {
        return getSecurityGroupsByTypeResult;
    }


    /**
     * Sets the getSecurityGroupsByTypeResult value for this GetSecurityGroupsByTypeResponse.
     * 
     * @param getSecurityGroupsByTypeResult
     */
    public void setGetSecurityGroupsByTypeResult(com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getSecurityGroupsByTypeResult) {
        this.getSecurityGroupsByTypeResult = getSecurityGroupsByTypeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSecurityGroupsByTypeResponse)) return false;
        GetSecurityGroupsByTypeResponse other = (GetSecurityGroupsByTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSecurityGroupsByTypeResult==null && other.getGetSecurityGroupsByTypeResult()==null) || 
             (this.getSecurityGroupsByTypeResult!=null &&
              this.getSecurityGroupsByTypeResult.equals(other.getGetSecurityGroupsByTypeResult())));
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
        if (getGetSecurityGroupsByTypeResult() != null) {
            _hashCode += getGetSecurityGroupsByTypeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSecurityGroupsByTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSecurityGroupsByTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSecurityGroupsByTypeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSecurityGroupsByTypeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfSecurityGroupwJCT_PyJf"));
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
