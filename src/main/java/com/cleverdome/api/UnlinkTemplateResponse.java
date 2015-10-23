/**
 * UnlinkTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UnlinkTemplateResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType unlinkTemplateResult;

    public UnlinkTemplateResponse() {
    }

    public UnlinkTemplateResponse(
           com.cleverdome.api.OperationResultOfanyType unlinkTemplateResult) {
           this.unlinkTemplateResult = unlinkTemplateResult;
    }


    /**
     * Gets the unlinkTemplateResult value for this UnlinkTemplateResponse.
     * 
     * @return unlinkTemplateResult
     */
    public com.cleverdome.api.OperationResultOfanyType getUnlinkTemplateResult() {
        return unlinkTemplateResult;
    }


    /**
     * Sets the unlinkTemplateResult value for this UnlinkTemplateResponse.
     * 
     * @param unlinkTemplateResult
     */
    public void setUnlinkTemplateResult(com.cleverdome.api.OperationResultOfanyType unlinkTemplateResult) {
        this.unlinkTemplateResult = unlinkTemplateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnlinkTemplateResponse)) return false;
        UnlinkTemplateResponse other = (UnlinkTemplateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unlinkTemplateResult==null && other.getUnlinkTemplateResult()==null) || 
             (this.unlinkTemplateResult!=null &&
              this.unlinkTemplateResult.equals(other.getUnlinkTemplateResult())));
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
        if (getUnlinkTemplateResult() != null) {
            _hashCode += getUnlinkTemplateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnlinkTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UnlinkTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlinkTemplateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnlinkTemplateResult"));
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
