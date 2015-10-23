/**
 * GetTrustedUsersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetTrustedUsersResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfTrustedUser50La3KLP getTrustedUsersResult;

    public GetTrustedUsersResponse() {
    }

    public GetTrustedUsersResponse(
           com.cleverdome.api.OperationResultOfArrayOfTrustedUser50La3KLP getTrustedUsersResult) {
           this.getTrustedUsersResult = getTrustedUsersResult;
    }


    /**
     * Gets the getTrustedUsersResult value for this GetTrustedUsersResponse.
     * 
     * @return getTrustedUsersResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfTrustedUser50La3KLP getGetTrustedUsersResult() {
        return getTrustedUsersResult;
    }


    /**
     * Sets the getTrustedUsersResult value for this GetTrustedUsersResponse.
     * 
     * @param getTrustedUsersResult
     */
    public void setGetTrustedUsersResult(com.cleverdome.api.OperationResultOfArrayOfTrustedUser50La3KLP getTrustedUsersResult) {
        this.getTrustedUsersResult = getTrustedUsersResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTrustedUsersResponse)) return false;
        GetTrustedUsersResponse other = (GetTrustedUsersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTrustedUsersResult==null && other.getGetTrustedUsersResult()==null) || 
             (this.getTrustedUsersResult!=null &&
              this.getTrustedUsersResult.equals(other.getGetTrustedUsersResult())));
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
        if (getGetTrustedUsersResult() != null) {
            _hashCode += getGetTrustedUsersResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTrustedUsersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTrustedUsersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTrustedUsersResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTrustedUsersResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfTrustedUser50La3KLP"));
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
