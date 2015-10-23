/**
 * RemoveDocumentTagByNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveDocumentTagByNameResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType removeDocumentTagByNameResult;

    public RemoveDocumentTagByNameResponse() {
    }

    public RemoveDocumentTagByNameResponse(
           com.cleverdome.api.OperationResultOfanyType removeDocumentTagByNameResult) {
           this.removeDocumentTagByNameResult = removeDocumentTagByNameResult;
    }


    /**
     * Gets the removeDocumentTagByNameResult value for this RemoveDocumentTagByNameResponse.
     * 
     * @return removeDocumentTagByNameResult
     */
    public com.cleverdome.api.OperationResultOfanyType getRemoveDocumentTagByNameResult() {
        return removeDocumentTagByNameResult;
    }


    /**
     * Sets the removeDocumentTagByNameResult value for this RemoveDocumentTagByNameResponse.
     * 
     * @param removeDocumentTagByNameResult
     */
    public void setRemoveDocumentTagByNameResult(com.cleverdome.api.OperationResultOfanyType removeDocumentTagByNameResult) {
        this.removeDocumentTagByNameResult = removeDocumentTagByNameResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveDocumentTagByNameResponse)) return false;
        RemoveDocumentTagByNameResponse other = (RemoveDocumentTagByNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeDocumentTagByNameResult==null && other.getRemoveDocumentTagByNameResult()==null) || 
             (this.removeDocumentTagByNameResult!=null &&
              this.removeDocumentTagByNameResult.equals(other.getRemoveDocumentTagByNameResult())));
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
        if (getRemoveDocumentTagByNameResult() != null) {
            _hashCode += getRemoveDocumentTagByNameResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveDocumentTagByNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveDocumentTagByNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeDocumentTagByNameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveDocumentTagByNameResult"));
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
