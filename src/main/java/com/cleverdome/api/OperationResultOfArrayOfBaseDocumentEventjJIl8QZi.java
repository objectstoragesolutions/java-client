/**
 * OperationResultOfArrayOfBaseDocumentEventjJIl8QZi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class OperationResultOfArrayOfBaseDocumentEventjJIl8QZi  extends com.cleverdome.api.OperationResult  implements java.io.Serializable {
    private com.cleverdome.api.UserPermissions permissions;

    private com.cleverdome.api.BaseDocumentEvent[] returnValue;

    public OperationResultOfArrayOfBaseDocumentEventjJIl8QZi() {
    }

    public OperationResultOfArrayOfBaseDocumentEventjJIl8QZi(
           java.lang.String message,
           com.cleverdome.api.ResultType result,
           com.cleverdome.api.UserPermissions permissions,
           com.cleverdome.api.BaseDocumentEvent[] returnValue) {
        super(
            message,
            result);
        this.permissions = permissions;
        this.returnValue = returnValue;
    }


    /**
     * Gets the permissions value for this OperationResultOfArrayOfBaseDocumentEventjJIl8QZi.
     * 
     * @return permissions
     */
    public com.cleverdome.api.UserPermissions getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this OperationResultOfArrayOfBaseDocumentEventjJIl8QZi.
     * 
     * @param permissions
     */
    public void setPermissions(com.cleverdome.api.UserPermissions permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the returnValue value for this OperationResultOfArrayOfBaseDocumentEventjJIl8QZi.
     * 
     * @return returnValue
     */
    public com.cleverdome.api.BaseDocumentEvent[] getReturnValue() {
        return returnValue;
    }


    /**
     * Sets the returnValue value for this OperationResultOfArrayOfBaseDocumentEventjJIl8QZi.
     * 
     * @param returnValue
     */
    public void setReturnValue(com.cleverdome.api.BaseDocumentEvent[] returnValue) {
        this.returnValue = returnValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResultOfArrayOfBaseDocumentEventjJIl8QZi)) return false;
        OperationResultOfArrayOfBaseDocumentEventjJIl8QZi other = (OperationResultOfArrayOfBaseDocumentEventjJIl8QZi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions()))) &&
            ((this.returnValue==null && other.getReturnValue()==null) || 
             (this.returnValue!=null &&
              java.util.Arrays.equals(this.returnValue, other.getReturnValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        if (getReturnValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationResultOfArrayOfBaseDocumentEventjJIl8QZi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfBaseDocument.EventjJIl8QZi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ReturnValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "BaseDocument.Event"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "BaseDocument.Event"));
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
