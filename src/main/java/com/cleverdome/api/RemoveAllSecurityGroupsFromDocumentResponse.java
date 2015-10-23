/**
 * RemoveAllSecurityGroupsFromDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveAllSecurityGroupsFromDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType removeAllSecurityGroupsFromDocumentResult;

    public RemoveAllSecurityGroupsFromDocumentResponse() {
    }

    public RemoveAllSecurityGroupsFromDocumentResponse(
           com.cleverdome.api.OperationResultOfanyType removeAllSecurityGroupsFromDocumentResult) {
           this.removeAllSecurityGroupsFromDocumentResult = removeAllSecurityGroupsFromDocumentResult;
    }


    /**
     * Gets the removeAllSecurityGroupsFromDocumentResult value for this RemoveAllSecurityGroupsFromDocumentResponse.
     * 
     * @return removeAllSecurityGroupsFromDocumentResult
     */
    public com.cleverdome.api.OperationResultOfanyType getRemoveAllSecurityGroupsFromDocumentResult() {
        return removeAllSecurityGroupsFromDocumentResult;
    }


    /**
     * Sets the removeAllSecurityGroupsFromDocumentResult value for this RemoveAllSecurityGroupsFromDocumentResponse.
     * 
     * @param removeAllSecurityGroupsFromDocumentResult
     */
    public void setRemoveAllSecurityGroupsFromDocumentResult(com.cleverdome.api.OperationResultOfanyType removeAllSecurityGroupsFromDocumentResult) {
        this.removeAllSecurityGroupsFromDocumentResult = removeAllSecurityGroupsFromDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveAllSecurityGroupsFromDocumentResponse)) return false;
        RemoveAllSecurityGroupsFromDocumentResponse other = (RemoveAllSecurityGroupsFromDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeAllSecurityGroupsFromDocumentResult==null && other.getRemoveAllSecurityGroupsFromDocumentResult()==null) || 
             (this.removeAllSecurityGroupsFromDocumentResult!=null &&
              this.removeAllSecurityGroupsFromDocumentResult.equals(other.getRemoveAllSecurityGroupsFromDocumentResult())));
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
        if (getRemoveAllSecurityGroupsFromDocumentResult() != null) {
            _hashCode += getRemoveAllSecurityGroupsFromDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveAllSecurityGroupsFromDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveAllSecurityGroupsFromDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeAllSecurityGroupsFromDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveAllSecurityGroupsFromDocumentResult"));
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
