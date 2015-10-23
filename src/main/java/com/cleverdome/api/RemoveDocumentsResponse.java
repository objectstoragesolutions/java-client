/**
 * RemoveDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveDocumentsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType removeDocumentsResult;

    public RemoveDocumentsResponse() {
    }

    public RemoveDocumentsResponse(
           com.cleverdome.api.OperationResultOfanyType removeDocumentsResult) {
           this.removeDocumentsResult = removeDocumentsResult;
    }


    /**
     * Gets the removeDocumentsResult value for this RemoveDocumentsResponse.
     * 
     * @return removeDocumentsResult
     */
    public com.cleverdome.api.OperationResultOfanyType getRemoveDocumentsResult() {
        return removeDocumentsResult;
    }


    /**
     * Sets the removeDocumentsResult value for this RemoveDocumentsResponse.
     * 
     * @param removeDocumentsResult
     */
    public void setRemoveDocumentsResult(com.cleverdome.api.OperationResultOfanyType removeDocumentsResult) {
        this.removeDocumentsResult = removeDocumentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveDocumentsResponse)) return false;
        RemoveDocumentsResponse other = (RemoveDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeDocumentsResult==null && other.getRemoveDocumentsResult()==null) || 
             (this.removeDocumentsResult!=null &&
              this.removeDocumentsResult.equals(other.getRemoveDocumentsResult())));
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
        if (getRemoveDocumentsResult() != null) {
            _hashCode += getRemoveDocumentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeDocumentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveDocumentsResult"));
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
