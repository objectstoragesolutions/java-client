/**
 * CreateUserTagAlertResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class CreateUserTagAlertResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfAlertE_P4QZOfs createUserTagAlertResult;

    public CreateUserTagAlertResponse() {
    }

    public CreateUserTagAlertResponse(
           com.cleverdome.api.OperationResultOfAlertE_P4QZOfs createUserTagAlertResult) {
           this.createUserTagAlertResult = createUserTagAlertResult;
    }


    /**
     * Gets the createUserTagAlertResult value for this CreateUserTagAlertResponse.
     * 
     * @return createUserTagAlertResult
     */
    public com.cleverdome.api.OperationResultOfAlertE_P4QZOfs getCreateUserTagAlertResult() {
        return createUserTagAlertResult;
    }


    /**
     * Sets the createUserTagAlertResult value for this CreateUserTagAlertResponse.
     * 
     * @param createUserTagAlertResult
     */
    public void setCreateUserTagAlertResult(com.cleverdome.api.OperationResultOfAlertE_P4QZOfs createUserTagAlertResult) {
        this.createUserTagAlertResult = createUserTagAlertResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateUserTagAlertResponse)) return false;
        CreateUserTagAlertResponse other = (CreateUserTagAlertResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createUserTagAlertResult==null && other.getCreateUserTagAlertResult()==null) || 
             (this.createUserTagAlertResult!=null &&
              this.createUserTagAlertResult.equals(other.getCreateUserTagAlertResult())));
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
        if (getCreateUserTagAlertResult() != null) {
            _hashCode += getCreateUserTagAlertResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateUserTagAlertResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CreateUserTagAlertResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createUserTagAlertResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CreateUserTagAlertResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfAlertE_P4QZOfs"));
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
