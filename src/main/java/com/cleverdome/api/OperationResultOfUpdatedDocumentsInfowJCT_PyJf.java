/**
 * OperationResultOfUpdatedDocumentsInfowJCT_PyJf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class OperationResultOfUpdatedDocumentsInfowJCT_PyJf  extends com.cleverdome.api.OperationResult  implements java.io.Serializable {
    private com.cleverdome.api.UserPermissions permissions;

    private com.cleverdome.api.UpdatedDocumentsInfo returnValue;

    public OperationResultOfUpdatedDocumentsInfowJCT_PyJf() {
    }

    public OperationResultOfUpdatedDocumentsInfowJCT_PyJf(
           java.lang.String message,
           com.cleverdome.api.ResultType result,
           com.cleverdome.api.UserPermissions permissions,
           com.cleverdome.api.UpdatedDocumentsInfo returnValue) {
        super(
            message,
            result);
        this.permissions = permissions;
        this.returnValue = returnValue;
    }


    /**
     * Gets the permissions value for this OperationResultOfUpdatedDocumentsInfowJCT_PyJf.
     * 
     * @return permissions
     */
    public com.cleverdome.api.UserPermissions getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this OperationResultOfUpdatedDocumentsInfowJCT_PyJf.
     * 
     * @param permissions
     */
    public void setPermissions(com.cleverdome.api.UserPermissions permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the returnValue value for this OperationResultOfUpdatedDocumentsInfowJCT_PyJf.
     * 
     * @return returnValue
     */
    public com.cleverdome.api.UpdatedDocumentsInfo getReturnValue() {
        return returnValue;
    }


    /**
     * Sets the returnValue value for this OperationResultOfUpdatedDocumentsInfowJCT_PyJf.
     * 
     * @param returnValue
     */
    public void setReturnValue(com.cleverdome.api.UpdatedDocumentsInfo returnValue) {
        this.returnValue = returnValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResultOfUpdatedDocumentsInfowJCT_PyJf)) return false;
        OperationResultOfUpdatedDocumentsInfowJCT_PyJf other = (OperationResultOfUpdatedDocumentsInfowJCT_PyJf) obj;
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
              this.returnValue.equals(other.getReturnValue())));
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
            _hashCode += getReturnValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationResultOfUpdatedDocumentsInfowJCT_PyJf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfUpdatedDocumentsInfowJCT_PyJf"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UpdatedDocumentsInfo"));
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
