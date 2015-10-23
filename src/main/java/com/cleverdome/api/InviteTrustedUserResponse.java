/**
 * InviteTrustedUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class InviteTrustedUserResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfTrustedUser50La3KLP inviteTrustedUserResult;

    public InviteTrustedUserResponse() {
    }

    public InviteTrustedUserResponse(
           com.cleverdome.api.OperationResultOfTrustedUser50La3KLP inviteTrustedUserResult) {
           this.inviteTrustedUserResult = inviteTrustedUserResult;
    }


    /**
     * Gets the inviteTrustedUserResult value for this InviteTrustedUserResponse.
     * 
     * @return inviteTrustedUserResult
     */
    public com.cleverdome.api.OperationResultOfTrustedUser50La3KLP getInviteTrustedUserResult() {
        return inviteTrustedUserResult;
    }


    /**
     * Sets the inviteTrustedUserResult value for this InviteTrustedUserResponse.
     * 
     * @param inviteTrustedUserResult
     */
    public void setInviteTrustedUserResult(com.cleverdome.api.OperationResultOfTrustedUser50La3KLP inviteTrustedUserResult) {
        this.inviteTrustedUserResult = inviteTrustedUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InviteTrustedUserResponse)) return false;
        InviteTrustedUserResponse other = (InviteTrustedUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inviteTrustedUserResult==null && other.getInviteTrustedUserResult()==null) || 
             (this.inviteTrustedUserResult!=null &&
              this.inviteTrustedUserResult.equals(other.getInviteTrustedUserResult())));
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
        if (getInviteTrustedUserResult() != null) {
            _hashCode += getInviteTrustedUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InviteTrustedUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InviteTrustedUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteTrustedUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InviteTrustedUserResult"));
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
