/**
 * BurnAnnotationsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class BurnAnnotationsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType burnAnnotationsResult;

    public BurnAnnotationsResponse() {
    }

    public BurnAnnotationsResponse(
           com.cleverdome.api.OperationResultOfanyType burnAnnotationsResult) {
           this.burnAnnotationsResult = burnAnnotationsResult;
    }


    /**
     * Gets the burnAnnotationsResult value for this BurnAnnotationsResponse.
     * 
     * @return burnAnnotationsResult
     */
    public com.cleverdome.api.OperationResultOfanyType getBurnAnnotationsResult() {
        return burnAnnotationsResult;
    }


    /**
     * Sets the burnAnnotationsResult value for this BurnAnnotationsResponse.
     * 
     * @param burnAnnotationsResult
     */
    public void setBurnAnnotationsResult(com.cleverdome.api.OperationResultOfanyType burnAnnotationsResult) {
        this.burnAnnotationsResult = burnAnnotationsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BurnAnnotationsResponse)) return false;
        BurnAnnotationsResponse other = (BurnAnnotationsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.burnAnnotationsResult==null && other.getBurnAnnotationsResult()==null) || 
             (this.burnAnnotationsResult!=null &&
              this.burnAnnotationsResult.equals(other.getBurnAnnotationsResult())));
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
        if (getBurnAnnotationsResult() != null) {
            _hashCode += getBurnAnnotationsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BurnAnnotationsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BurnAnnotationsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("burnAnnotationsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BurnAnnotationsResult"));
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
