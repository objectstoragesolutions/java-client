/**
 * RemoveSecurityGroupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveSecurityGroupResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResult removeSecurityGroupResult;

    public RemoveSecurityGroupResponse() {
    }

    public RemoveSecurityGroupResponse(
           com.cleverdome.api.OperationResult removeSecurityGroupResult) {
           this.removeSecurityGroupResult = removeSecurityGroupResult;
    }


    /**
     * Gets the removeSecurityGroupResult value for this RemoveSecurityGroupResponse.
     * 
     * @return removeSecurityGroupResult
     */
    public com.cleverdome.api.OperationResult getRemoveSecurityGroupResult() {
        return removeSecurityGroupResult;
    }


    /**
     * Sets the removeSecurityGroupResult value for this RemoveSecurityGroupResponse.
     * 
     * @param removeSecurityGroupResult
     */
    public void setRemoveSecurityGroupResult(com.cleverdome.api.OperationResult removeSecurityGroupResult) {
        this.removeSecurityGroupResult = removeSecurityGroupResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveSecurityGroupResponse)) return false;
        RemoveSecurityGroupResponse other = (RemoveSecurityGroupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeSecurityGroupResult==null && other.getRemoveSecurityGroupResult()==null) || 
             (this.removeSecurityGroupResult!=null &&
              this.removeSecurityGroupResult.equals(other.getRemoveSecurityGroupResult())));
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
        if (getRemoveSecurityGroupResult() != null) {
            _hashCode += getRemoveSecurityGroupResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveSecurityGroupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveSecurityGroupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeSecurityGroupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveSecurityGroupResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResult"));
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
