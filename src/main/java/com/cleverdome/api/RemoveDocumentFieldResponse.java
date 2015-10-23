/**
 * RemoveDocumentFieldResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveDocumentFieldResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType removeDocumentFieldResult;

    public RemoveDocumentFieldResponse() {
    }

    public RemoveDocumentFieldResponse(
           com.cleverdome.api.OperationResultOfanyType removeDocumentFieldResult) {
           this.removeDocumentFieldResult = removeDocumentFieldResult;
    }


    /**
     * Gets the removeDocumentFieldResult value for this RemoveDocumentFieldResponse.
     * 
     * @return removeDocumentFieldResult
     */
    public com.cleverdome.api.OperationResultOfanyType getRemoveDocumentFieldResult() {
        return removeDocumentFieldResult;
    }


    /**
     * Sets the removeDocumentFieldResult value for this RemoveDocumentFieldResponse.
     * 
     * @param removeDocumentFieldResult
     */
    public void setRemoveDocumentFieldResult(com.cleverdome.api.OperationResultOfanyType removeDocumentFieldResult) {
        this.removeDocumentFieldResult = removeDocumentFieldResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveDocumentFieldResponse)) return false;
        RemoveDocumentFieldResponse other = (RemoveDocumentFieldResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeDocumentFieldResult==null && other.getRemoveDocumentFieldResult()==null) || 
             (this.removeDocumentFieldResult!=null &&
              this.removeDocumentFieldResult.equals(other.getRemoveDocumentFieldResult())));
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
        if (getRemoveDocumentFieldResult() != null) {
            _hashCode += getRemoveDocumentFieldResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveDocumentFieldResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveDocumentFieldResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeDocumentFieldResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveDocumentFieldResult"));
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
