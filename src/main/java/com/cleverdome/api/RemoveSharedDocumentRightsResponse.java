/**
 * RemoveSharedDocumentRightsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveSharedDocumentRightsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType removeSharedDocumentRightsResult;

    public RemoveSharedDocumentRightsResponse() {
    }

    public RemoveSharedDocumentRightsResponse(
           com.cleverdome.api.OperationResultOfanyType removeSharedDocumentRightsResult) {
           this.removeSharedDocumentRightsResult = removeSharedDocumentRightsResult;
    }


    /**
     * Gets the removeSharedDocumentRightsResult value for this RemoveSharedDocumentRightsResponse.
     * 
     * @return removeSharedDocumentRightsResult
     */
    public com.cleverdome.api.OperationResultOfanyType getRemoveSharedDocumentRightsResult() {
        return removeSharedDocumentRightsResult;
    }


    /**
     * Sets the removeSharedDocumentRightsResult value for this RemoveSharedDocumentRightsResponse.
     * 
     * @param removeSharedDocumentRightsResult
     */
    public void setRemoveSharedDocumentRightsResult(com.cleverdome.api.OperationResultOfanyType removeSharedDocumentRightsResult) {
        this.removeSharedDocumentRightsResult = removeSharedDocumentRightsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveSharedDocumentRightsResponse)) return false;
        RemoveSharedDocumentRightsResponse other = (RemoveSharedDocumentRightsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeSharedDocumentRightsResult==null && other.getRemoveSharedDocumentRightsResult()==null) || 
             (this.removeSharedDocumentRightsResult!=null &&
              this.removeSharedDocumentRightsResult.equals(other.getRemoveSharedDocumentRightsResult())));
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
        if (getRemoveSharedDocumentRightsResult() != null) {
            _hashCode += getRemoveSharedDocumentRightsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveSharedDocumentRightsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveSharedDocumentRightsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeSharedDocumentRightsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveSharedDocumentRightsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfanyType"));
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
