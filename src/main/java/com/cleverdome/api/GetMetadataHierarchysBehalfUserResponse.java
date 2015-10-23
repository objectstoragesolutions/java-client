/**
 * GetMetadataHierarchysBehalfUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetMetadataHierarchysBehalfUserResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getMetadataHierarchysBehalfUserResult;

    public GetMetadataHierarchysBehalfUserResponse() {
    }

    public GetMetadataHierarchysBehalfUserResponse(
           com.cleverdome.api.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getMetadataHierarchysBehalfUserResult) {
           this.getMetadataHierarchysBehalfUserResult = getMetadataHierarchysBehalfUserResult;
    }


    /**
     * Gets the getMetadataHierarchysBehalfUserResult value for this GetMetadataHierarchysBehalfUserResponse.
     * 
     * @return getMetadataHierarchysBehalfUserResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getGetMetadataHierarchysBehalfUserResult() {
        return getMetadataHierarchysBehalfUserResult;
    }


    /**
     * Sets the getMetadataHierarchysBehalfUserResult value for this GetMetadataHierarchysBehalfUserResponse.
     * 
     * @param getMetadataHierarchysBehalfUserResult
     */
    public void setGetMetadataHierarchysBehalfUserResult(com.cleverdome.api.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getMetadataHierarchysBehalfUserResult) {
        this.getMetadataHierarchysBehalfUserResult = getMetadataHierarchysBehalfUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMetadataHierarchysBehalfUserResponse)) return false;
        GetMetadataHierarchysBehalfUserResponse other = (GetMetadataHierarchysBehalfUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMetadataHierarchysBehalfUserResult==null && other.getGetMetadataHierarchysBehalfUserResult()==null) || 
             (this.getMetadataHierarchysBehalfUserResult!=null &&
              this.getMetadataHierarchysBehalfUserResult.equals(other.getGetMetadataHierarchysBehalfUserResult())));
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
        if (getGetMetadataHierarchysBehalfUserResult() != null) {
            _hashCode += getGetMetadataHierarchysBehalfUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMetadataHierarchysBehalfUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMetadataHierarchysBehalfUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMetadataHierarchysBehalfUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMetadataHierarchysBehalfUserResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfBaseDocument.MetadataHierarchyElementjJIl8QZi"));
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
