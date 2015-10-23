/**
 * SetDefaultDescriptionForApplicationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SetDefaultDescriptionForApplicationResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType setDefaultDescriptionForApplicationResult;

    public SetDefaultDescriptionForApplicationResponse() {
    }

    public SetDefaultDescriptionForApplicationResponse(
           com.cleverdome.api.OperationResultOfanyType setDefaultDescriptionForApplicationResult) {
           this.setDefaultDescriptionForApplicationResult = setDefaultDescriptionForApplicationResult;
    }


    /**
     * Gets the setDefaultDescriptionForApplicationResult value for this SetDefaultDescriptionForApplicationResponse.
     * 
     * @return setDefaultDescriptionForApplicationResult
     */
    public com.cleverdome.api.OperationResultOfanyType getSetDefaultDescriptionForApplicationResult() {
        return setDefaultDescriptionForApplicationResult;
    }


    /**
     * Sets the setDefaultDescriptionForApplicationResult value for this SetDefaultDescriptionForApplicationResponse.
     * 
     * @param setDefaultDescriptionForApplicationResult
     */
    public void setSetDefaultDescriptionForApplicationResult(com.cleverdome.api.OperationResultOfanyType setDefaultDescriptionForApplicationResult) {
        this.setDefaultDescriptionForApplicationResult = setDefaultDescriptionForApplicationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetDefaultDescriptionForApplicationResponse)) return false;
        SetDefaultDescriptionForApplicationResponse other = (SetDefaultDescriptionForApplicationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setDefaultDescriptionForApplicationResult==null && other.getSetDefaultDescriptionForApplicationResult()==null) || 
             (this.setDefaultDescriptionForApplicationResult!=null &&
              this.setDefaultDescriptionForApplicationResult.equals(other.getSetDefaultDescriptionForApplicationResult())));
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
        if (getSetDefaultDescriptionForApplicationResult() != null) {
            _hashCode += getSetDefaultDescriptionForApplicationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetDefaultDescriptionForApplicationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetDefaultDescriptionForApplicationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setDefaultDescriptionForApplicationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SetDefaultDescriptionForApplicationResult"));
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
