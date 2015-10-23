/**
 * AddTrustedUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddTrustedUserResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfTrustedUser50La3KLP addTrustedUserResult;

    public AddTrustedUserResponse() {
    }

    public AddTrustedUserResponse(
           com.cleverdome.api.OperationResultOfTrustedUser50La3KLP addTrustedUserResult) {
           this.addTrustedUserResult = addTrustedUserResult;
    }


    /**
     * Gets the addTrustedUserResult value for this AddTrustedUserResponse.
     * 
     * @return addTrustedUserResult
     */
    public com.cleverdome.api.OperationResultOfTrustedUser50La3KLP getAddTrustedUserResult() {
        return addTrustedUserResult;
    }


    /**
     * Sets the addTrustedUserResult value for this AddTrustedUserResponse.
     * 
     * @param addTrustedUserResult
     */
    public void setAddTrustedUserResult(com.cleverdome.api.OperationResultOfTrustedUser50La3KLP addTrustedUserResult) {
        this.addTrustedUserResult = addTrustedUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddTrustedUserResponse)) return false;
        AddTrustedUserResponse other = (AddTrustedUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addTrustedUserResult==null && other.getAddTrustedUserResult()==null) || 
             (this.addTrustedUserResult!=null &&
              this.addTrustedUserResult.equals(other.getAddTrustedUserResult())));
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
        if (getAddTrustedUserResult() != null) {
            _hashCode += getAddTrustedUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddTrustedUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddTrustedUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTrustedUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddTrustedUserResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfTrustedUser50La3KLP"));
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
