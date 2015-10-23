/**
 * GetSecurityGroupByIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetSecurityGroupByIDResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfSecurityGroupwJCT_PyJf getSecurityGroupByIDResult;

    public GetSecurityGroupByIDResponse() {
    }

    public GetSecurityGroupByIDResponse(
           com.cleverdome.api.OperationResultOfSecurityGroupwJCT_PyJf getSecurityGroupByIDResult) {
           this.getSecurityGroupByIDResult = getSecurityGroupByIDResult;
    }


    /**
     * Gets the getSecurityGroupByIDResult value for this GetSecurityGroupByIDResponse.
     * 
     * @return getSecurityGroupByIDResult
     */
    public com.cleverdome.api.OperationResultOfSecurityGroupwJCT_PyJf getGetSecurityGroupByIDResult() {
        return getSecurityGroupByIDResult;
    }


    /**
     * Sets the getSecurityGroupByIDResult value for this GetSecurityGroupByIDResponse.
     * 
     * @param getSecurityGroupByIDResult
     */
    public void setGetSecurityGroupByIDResult(com.cleverdome.api.OperationResultOfSecurityGroupwJCT_PyJf getSecurityGroupByIDResult) {
        this.getSecurityGroupByIDResult = getSecurityGroupByIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSecurityGroupByIDResponse)) return false;
        GetSecurityGroupByIDResponse other = (GetSecurityGroupByIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSecurityGroupByIDResult==null && other.getGetSecurityGroupByIDResult()==null) || 
             (this.getSecurityGroupByIDResult!=null &&
              this.getSecurityGroupByIDResult.equals(other.getGetSecurityGroupByIDResult())));
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
        if (getGetSecurityGroupByIDResult() != null) {
            _hashCode += getGetSecurityGroupByIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSecurityGroupByIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSecurityGroupByIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSecurityGroupByIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSecurityGroupByIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfSecurityGroupwJCT_PyJf"));
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
