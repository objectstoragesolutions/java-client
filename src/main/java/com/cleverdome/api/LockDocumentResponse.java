/**
 * LockDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class LockDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType lockDocumentResult;

    public LockDocumentResponse() {
    }

    public LockDocumentResponse(
           com.cleverdome.api.OperationResultOfanyType lockDocumentResult) {
           this.lockDocumentResult = lockDocumentResult;
    }


    /**
     * Gets the lockDocumentResult value for this LockDocumentResponse.
     * 
     * @return lockDocumentResult
     */
    public com.cleverdome.api.OperationResultOfanyType getLockDocumentResult() {
        return lockDocumentResult;
    }


    /**
     * Sets the lockDocumentResult value for this LockDocumentResponse.
     * 
     * @param lockDocumentResult
     */
    public void setLockDocumentResult(com.cleverdome.api.OperationResultOfanyType lockDocumentResult) {
        this.lockDocumentResult = lockDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LockDocumentResponse)) return false;
        LockDocumentResponse other = (LockDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lockDocumentResult==null && other.getLockDocumentResult()==null) || 
             (this.lockDocumentResult!=null &&
              this.lockDocumentResult.equals(other.getLockDocumentResult())));
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
        if (getLockDocumentResult() != null) {
            _hashCode += getLockDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LockDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">LockDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LockDocumentResult"));
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
