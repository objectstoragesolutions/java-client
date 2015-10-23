/**
 * RemoveFieldFromDocumentTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveFieldFromDocumentTypeResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType removeFieldFromDocumentTypeResult;

    public RemoveFieldFromDocumentTypeResponse() {
    }

    public RemoveFieldFromDocumentTypeResponse(
           com.cleverdome.api.OperationResultOfanyType removeFieldFromDocumentTypeResult) {
           this.removeFieldFromDocumentTypeResult = removeFieldFromDocumentTypeResult;
    }


    /**
     * Gets the removeFieldFromDocumentTypeResult value for this RemoveFieldFromDocumentTypeResponse.
     * 
     * @return removeFieldFromDocumentTypeResult
     */
    public com.cleverdome.api.OperationResultOfanyType getRemoveFieldFromDocumentTypeResult() {
        return removeFieldFromDocumentTypeResult;
    }


    /**
     * Sets the removeFieldFromDocumentTypeResult value for this RemoveFieldFromDocumentTypeResponse.
     * 
     * @param removeFieldFromDocumentTypeResult
     */
    public void setRemoveFieldFromDocumentTypeResult(com.cleverdome.api.OperationResultOfanyType removeFieldFromDocumentTypeResult) {
        this.removeFieldFromDocumentTypeResult = removeFieldFromDocumentTypeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveFieldFromDocumentTypeResponse)) return false;
        RemoveFieldFromDocumentTypeResponse other = (RemoveFieldFromDocumentTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeFieldFromDocumentTypeResult==null && other.getRemoveFieldFromDocumentTypeResult()==null) || 
             (this.removeFieldFromDocumentTypeResult!=null &&
              this.removeFieldFromDocumentTypeResult.equals(other.getRemoveFieldFromDocumentTypeResult())));
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
        if (getRemoveFieldFromDocumentTypeResult() != null) {
            _hashCode += getRemoveFieldFromDocumentTypeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveFieldFromDocumentTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveFieldFromDocumentTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeFieldFromDocumentTypeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveFieldFromDocumentTypeResult"));
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
