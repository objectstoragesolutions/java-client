/**
 * RemoveUserFromSecurityGroupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RemoveUserFromSecurityGroupResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType removeUserFromSecurityGroupResult;

    public RemoveUserFromSecurityGroupResponse() {
    }

    public RemoveUserFromSecurityGroupResponse(
           com.cleverdome.api.OperationResultOfanyType removeUserFromSecurityGroupResult) {
           this.removeUserFromSecurityGroupResult = removeUserFromSecurityGroupResult;
    }


    /**
     * Gets the removeUserFromSecurityGroupResult value for this RemoveUserFromSecurityGroupResponse.
     * 
     * @return removeUserFromSecurityGroupResult
     */
    public com.cleverdome.api.OperationResultOfanyType getRemoveUserFromSecurityGroupResult() {
        return removeUserFromSecurityGroupResult;
    }


    /**
     * Sets the removeUserFromSecurityGroupResult value for this RemoveUserFromSecurityGroupResponse.
     * 
     * @param removeUserFromSecurityGroupResult
     */
    public void setRemoveUserFromSecurityGroupResult(com.cleverdome.api.OperationResultOfanyType removeUserFromSecurityGroupResult) {
        this.removeUserFromSecurityGroupResult = removeUserFromSecurityGroupResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveUserFromSecurityGroupResponse)) return false;
        RemoveUserFromSecurityGroupResponse other = (RemoveUserFromSecurityGroupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeUserFromSecurityGroupResult==null && other.getRemoveUserFromSecurityGroupResult()==null) || 
             (this.removeUserFromSecurityGroupResult!=null &&
              this.removeUserFromSecurityGroupResult.equals(other.getRemoveUserFromSecurityGroupResult())));
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
        if (getRemoveUserFromSecurityGroupResult() != null) {
            _hashCode += getRemoveUserFromSecurityGroupResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveUserFromSecurityGroupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemoveUserFromSecurityGroupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeUserFromSecurityGroupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemoveUserFromSecurityGroupResult"));
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
