/**
 * DocumentLockInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentLockInformation  implements java.io.Serializable {
    private java.lang.Boolean isLocked;

    private java.lang.Integer lockByUserID;

    private java.util.Calendar lockTime;

    public DocumentLockInformation() {
    }

    public DocumentLockInformation(
           java.lang.Boolean isLocked,
           java.lang.Integer lockByUserID,
           java.util.Calendar lockTime) {
           this.isLocked = isLocked;
           this.lockByUserID = lockByUserID;
           this.lockTime = lockTime;
    }


    /**
     * Gets the isLocked value for this DocumentLockInformation.
     * 
     * @return isLocked
     */
    public java.lang.Boolean getIsLocked() {
        return isLocked;
    }


    /**
     * Sets the isLocked value for this DocumentLockInformation.
     * 
     * @param isLocked
     */
    public void setIsLocked(java.lang.Boolean isLocked) {
        this.isLocked = isLocked;
    }


    /**
     * Gets the lockByUserID value for this DocumentLockInformation.
     * 
     * @return lockByUserID
     */
    public java.lang.Integer getLockByUserID() {
        return lockByUserID;
    }


    /**
     * Sets the lockByUserID value for this DocumentLockInformation.
     * 
     * @param lockByUserID
     */
    public void setLockByUserID(java.lang.Integer lockByUserID) {
        this.lockByUserID = lockByUserID;
    }


    /**
     * Gets the lockTime value for this DocumentLockInformation.
     * 
     * @return lockTime
     */
    public java.util.Calendar getLockTime() {
        return lockTime;
    }


    /**
     * Sets the lockTime value for this DocumentLockInformation.
     * 
     * @param lockTime
     */
    public void setLockTime(java.util.Calendar lockTime) {
        this.lockTime = lockTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentLockInformation)) return false;
        DocumentLockInformation other = (DocumentLockInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isLocked==null && other.getIsLocked()==null) || 
             (this.isLocked!=null &&
              this.isLocked.equals(other.getIsLocked()))) &&
            ((this.lockByUserID==null && other.getLockByUserID()==null) || 
             (this.lockByUserID!=null &&
              this.lockByUserID.equals(other.getLockByUserID()))) &&
            ((this.lockTime==null && other.getLockTime()==null) || 
             (this.lockTime!=null &&
              this.lockTime.equals(other.getLockTime())));
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
        if (getIsLocked() != null) {
            _hashCode += getIsLocked().hashCode();
        }
        if (getLockByUserID() != null) {
            _hashCode += getLockByUserID().hashCode();
        }
        if (getLockTime() != null) {
            _hashCode += getLockTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentLockInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentLockInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "IsLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockByUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LockByUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LockTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
