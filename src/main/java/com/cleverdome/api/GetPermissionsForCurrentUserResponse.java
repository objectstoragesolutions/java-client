/**
 * GetPermissionsForCurrentUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetPermissionsForCurrentUserResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfint getPermissionsForCurrentUserResult;

    public GetPermissionsForCurrentUserResponse() {
    }

    public GetPermissionsForCurrentUserResponse(
           com.cleverdome.api.OperationResultOfint getPermissionsForCurrentUserResult) {
           this.getPermissionsForCurrentUserResult = getPermissionsForCurrentUserResult;
    }


    /**
     * Gets the getPermissionsForCurrentUserResult value for this GetPermissionsForCurrentUserResponse.
     * 
     * @return getPermissionsForCurrentUserResult
     */
    public com.cleverdome.api.OperationResultOfint getGetPermissionsForCurrentUserResult() {
        return getPermissionsForCurrentUserResult;
    }


    /**
     * Sets the getPermissionsForCurrentUserResult value for this GetPermissionsForCurrentUserResponse.
     * 
     * @param getPermissionsForCurrentUserResult
     */
    public void setGetPermissionsForCurrentUserResult(com.cleverdome.api.OperationResultOfint getPermissionsForCurrentUserResult) {
        this.getPermissionsForCurrentUserResult = getPermissionsForCurrentUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPermissionsForCurrentUserResponse)) return false;
        GetPermissionsForCurrentUserResponse other = (GetPermissionsForCurrentUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPermissionsForCurrentUserResult==null && other.getGetPermissionsForCurrentUserResult()==null) || 
             (this.getPermissionsForCurrentUserResult!=null &&
              this.getPermissionsForCurrentUserResult.equals(other.getGetPermissionsForCurrentUserResult())));
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
        if (getGetPermissionsForCurrentUserResult() != null) {
            _hashCode += getGetPermissionsForCurrentUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPermissionsForCurrentUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPermissionsForCurrentUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPermissionsForCurrentUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPermissionsForCurrentUserResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfint"));
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
