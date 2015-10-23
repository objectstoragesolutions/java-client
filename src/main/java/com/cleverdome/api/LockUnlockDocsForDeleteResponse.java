/**
 * LockUnlockDocsForDeleteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class LockUnlockDocsForDeleteResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType lockUnlockDocsForDeleteResult;

    public LockUnlockDocsForDeleteResponse() {
    }

    public LockUnlockDocsForDeleteResponse(
           com.cleverdome.api.OperationResultOfanyType lockUnlockDocsForDeleteResult) {
           this.lockUnlockDocsForDeleteResult = lockUnlockDocsForDeleteResult;
    }


    /**
     * Gets the lockUnlockDocsForDeleteResult value for this LockUnlockDocsForDeleteResponse.
     * 
     * @return lockUnlockDocsForDeleteResult
     */
    public com.cleverdome.api.OperationResultOfanyType getLockUnlockDocsForDeleteResult() {
        return lockUnlockDocsForDeleteResult;
    }


    /**
     * Sets the lockUnlockDocsForDeleteResult value for this LockUnlockDocsForDeleteResponse.
     * 
     * @param lockUnlockDocsForDeleteResult
     */
    public void setLockUnlockDocsForDeleteResult(com.cleverdome.api.OperationResultOfanyType lockUnlockDocsForDeleteResult) {
        this.lockUnlockDocsForDeleteResult = lockUnlockDocsForDeleteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LockUnlockDocsForDeleteResponse)) return false;
        LockUnlockDocsForDeleteResponse other = (LockUnlockDocsForDeleteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lockUnlockDocsForDeleteResult==null && other.getLockUnlockDocsForDeleteResult()==null) || 
             (this.lockUnlockDocsForDeleteResult!=null &&
              this.lockUnlockDocsForDeleteResult.equals(other.getLockUnlockDocsForDeleteResult())));
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
        if (getLockUnlockDocsForDeleteResult() != null) {
            _hashCode += getLockUnlockDocsForDeleteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LockUnlockDocsForDeleteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">LockUnlockDocsForDeleteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockUnlockDocsForDeleteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LockUnlockDocsForDeleteResult"));
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
