/**
 * UploadCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UploadCheckResult  implements java.io.Serializable {
    private java.lang.Boolean hasEnoughSpaceInBucket;

    private java.lang.Boolean isFileTypeAllowed;

    public UploadCheckResult() {
    }

    public UploadCheckResult(
           java.lang.Boolean hasEnoughSpaceInBucket,
           java.lang.Boolean isFileTypeAllowed) {
           this.hasEnoughSpaceInBucket = hasEnoughSpaceInBucket;
           this.isFileTypeAllowed = isFileTypeAllowed;
    }


    /**
     * Gets the hasEnoughSpaceInBucket value for this UploadCheckResult.
     * 
     * @return hasEnoughSpaceInBucket
     */
    public java.lang.Boolean getHasEnoughSpaceInBucket() {
        return hasEnoughSpaceInBucket;
    }


    /**
     * Sets the hasEnoughSpaceInBucket value for this UploadCheckResult.
     * 
     * @param hasEnoughSpaceInBucket
     */
    public void setHasEnoughSpaceInBucket(java.lang.Boolean hasEnoughSpaceInBucket) {
        this.hasEnoughSpaceInBucket = hasEnoughSpaceInBucket;
    }


    /**
     * Gets the isFileTypeAllowed value for this UploadCheckResult.
     * 
     * @return isFileTypeAllowed
     */
    public java.lang.Boolean getIsFileTypeAllowed() {
        return isFileTypeAllowed;
    }


    /**
     * Sets the isFileTypeAllowed value for this UploadCheckResult.
     * 
     * @param isFileTypeAllowed
     */
    public void setIsFileTypeAllowed(java.lang.Boolean isFileTypeAllowed) {
        this.isFileTypeAllowed = isFileTypeAllowed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadCheckResult)) return false;
        UploadCheckResult other = (UploadCheckResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hasEnoughSpaceInBucket==null && other.getHasEnoughSpaceInBucket()==null) || 
             (this.hasEnoughSpaceInBucket!=null &&
              this.hasEnoughSpaceInBucket.equals(other.getHasEnoughSpaceInBucket()))) &&
            ((this.isFileTypeAllowed==null && other.getIsFileTypeAllowed()==null) || 
             (this.isFileTypeAllowed!=null &&
              this.isFileTypeAllowed.equals(other.getIsFileTypeAllowed())));
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
        if (getHasEnoughSpaceInBucket() != null) {
            _hashCode += getHasEnoughSpaceInBucket().hashCode();
        }
        if (getIsFileTypeAllowed() != null) {
            _hashCode += getIsFileTypeAllowed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadCheckResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "UploadCheckResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasEnoughSpaceInBucket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "HasEnoughSpaceInBucket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFileTypeAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "IsFileTypeAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
