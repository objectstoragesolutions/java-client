/**
 * GetLackDeletePermissionDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetLackDeletePermissionDocumentsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getLackDeletePermissionDocumentsResult;

    public GetLackDeletePermissionDocumentsResponse() {
    }

    public GetLackDeletePermissionDocumentsResponse(
           com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getLackDeletePermissionDocumentsResult) {
           this.getLackDeletePermissionDocumentsResult = getLackDeletePermissionDocumentsResult;
    }


    /**
     * Gets the getLackDeletePermissionDocumentsResult value for this GetLackDeletePermissionDocumentsResponse.
     * 
     * @return getLackDeletePermissionDocumentsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getGetLackDeletePermissionDocumentsResult() {
        return getLackDeletePermissionDocumentsResult;
    }


    /**
     * Sets the getLackDeletePermissionDocumentsResult value for this GetLackDeletePermissionDocumentsResponse.
     * 
     * @param getLackDeletePermissionDocumentsResult
     */
    public void setGetLackDeletePermissionDocumentsResult(com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getLackDeletePermissionDocumentsResult) {
        this.getLackDeletePermissionDocumentsResult = getLackDeletePermissionDocumentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLackDeletePermissionDocumentsResponse)) return false;
        GetLackDeletePermissionDocumentsResponse other = (GetLackDeletePermissionDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLackDeletePermissionDocumentsResult==null && other.getGetLackDeletePermissionDocumentsResult()==null) || 
             (this.getLackDeletePermissionDocumentsResult!=null &&
              this.getLackDeletePermissionDocumentsResult.equals(other.getGetLackDeletePermissionDocumentsResult())));
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
        if (getGetLackDeletePermissionDocumentsResult() != null) {
            _hashCode += getGetLackDeletePermissionDocumentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLackDeletePermissionDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetLackDeletePermissionDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLackDeletePermissionDocumentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetLackDeletePermissionDocumentsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfguiduHEDJ7Dj"));
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
