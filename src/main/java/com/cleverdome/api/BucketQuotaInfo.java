/**
 * BucketQuotaInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class BucketQuotaInfo  implements java.io.Serializable {
    private java.lang.Long allSize;

    private java.lang.String allSizeWithDimension;

    private java.lang.Long usedSize;

    private java.lang.String usedSizeWithDimension;

    public BucketQuotaInfo() {
    }

    public BucketQuotaInfo(
           java.lang.Long allSize,
           java.lang.String allSizeWithDimension,
           java.lang.Long usedSize,
           java.lang.String usedSizeWithDimension) {
           this.allSize = allSize;
           this.allSizeWithDimension = allSizeWithDimension;
           this.usedSize = usedSize;
           this.usedSizeWithDimension = usedSizeWithDimension;
    }


    /**
     * Gets the allSize value for this BucketQuotaInfo.
     * 
     * @return allSize
     */
    public java.lang.Long getAllSize() {
        return allSize;
    }


    /**
     * Sets the allSize value for this BucketQuotaInfo.
     * 
     * @param allSize
     */
    public void setAllSize(java.lang.Long allSize) {
        this.allSize = allSize;
    }


    /**
     * Gets the allSizeWithDimension value for this BucketQuotaInfo.
     * 
     * @return allSizeWithDimension
     */
    public java.lang.String getAllSizeWithDimension() {
        return allSizeWithDimension;
    }


    /**
     * Sets the allSizeWithDimension value for this BucketQuotaInfo.
     * 
     * @param allSizeWithDimension
     */
    public void setAllSizeWithDimension(java.lang.String allSizeWithDimension) {
        this.allSizeWithDimension = allSizeWithDimension;
    }


    /**
     * Gets the usedSize value for this BucketQuotaInfo.
     * 
     * @return usedSize
     */
    public java.lang.Long getUsedSize() {
        return usedSize;
    }


    /**
     * Sets the usedSize value for this BucketQuotaInfo.
     * 
     * @param usedSize
     */
    public void setUsedSize(java.lang.Long usedSize) {
        this.usedSize = usedSize;
    }


    /**
     * Gets the usedSizeWithDimension value for this BucketQuotaInfo.
     * 
     * @return usedSizeWithDimension
     */
    public java.lang.String getUsedSizeWithDimension() {
        return usedSizeWithDimension;
    }


    /**
     * Sets the usedSizeWithDimension value for this BucketQuotaInfo.
     * 
     * @param usedSizeWithDimension
     */
    public void setUsedSizeWithDimension(java.lang.String usedSizeWithDimension) {
        this.usedSizeWithDimension = usedSizeWithDimension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BucketQuotaInfo)) return false;
        BucketQuotaInfo other = (BucketQuotaInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allSize==null && other.getAllSize()==null) || 
             (this.allSize!=null &&
              this.allSize.equals(other.getAllSize()))) &&
            ((this.allSizeWithDimension==null && other.getAllSizeWithDimension()==null) || 
             (this.allSizeWithDimension!=null &&
              this.allSizeWithDimension.equals(other.getAllSizeWithDimension()))) &&
            ((this.usedSize==null && other.getUsedSize()==null) || 
             (this.usedSize!=null &&
              this.usedSize.equals(other.getUsedSize()))) &&
            ((this.usedSizeWithDimension==null && other.getUsedSizeWithDimension()==null) || 
             (this.usedSizeWithDimension!=null &&
              this.usedSizeWithDimension.equals(other.getUsedSizeWithDimension())));
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
        if (getAllSize() != null) {
            _hashCode += getAllSize().hashCode();
        }
        if (getAllSizeWithDimension() != null) {
            _hashCode += getAllSizeWithDimension().hashCode();
        }
        if (getUsedSize() != null) {
            _hashCode += getUsedSize().hashCode();
        }
        if (getUsedSizeWithDimension() != null) {
            _hashCode += getUsedSizeWithDimension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BucketQuotaInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "BucketQuotaInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "AllSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allSizeWithDimension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "AllSizeWithDimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "UsedSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedSizeWithDimension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "UsedSizeWithDimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
