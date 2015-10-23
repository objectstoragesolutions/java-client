/**
 * RemoveAllDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveAllDocumentsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfint removeAllDocumentsResult;

    public RemoveAllDocumentsResponse() {
    }

    public RemoveAllDocumentsResponse(
           com.cleverdome.api.OperationResultOfint removeAllDocumentsResult) {
           this.removeAllDocumentsResult = removeAllDocumentsResult;
    }


    /**
     * Gets the removeAllDocumentsResult value for this RemoveAllDocumentsResponse.
     * 
     * @return removeAllDocumentsResult
     */
    public com.cleverdome.api.OperationResultOfint getRemoveAllDocumentsResult() {
        return removeAllDocumentsResult;
    }


    /**
     * Sets the removeAllDocumentsResult value for this RemoveAllDocumentsResponse.
     * 
     * @param removeAllDocumentsResult
     */
    public void setRemoveAllDocumentsResult(com.cleverdome.api.OperationResultOfint removeAllDocumentsResult) {
        this.removeAllDocumentsResult = removeAllDocumentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveAllDocumentsResponse)) return false;
        RemoveAllDocumentsResponse other = (RemoveAllDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeAllDocumentsResult==null && other.getRemoveAllDocumentsResult()==null) || 
             (this.removeAllDocumentsResult!=null &&
              this.removeAllDocumentsResult.equals(other.getRemoveAllDocumentsResult())));
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
        if (getRemoveAllDocumentsResult() != null) {
            _hashCode += getRemoveAllDocumentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveAllDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveAllDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeAllDocumentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveAllDocumentsResult"));
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
