/**
 * ArchiveDocumentRevisions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class ArchiveDocumentRevisions  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String[] revisionGuids;

    private java.lang.Integer retentionPeriod;

    private java.lang.Integer retentionUnit;

    public ArchiveDocumentRevisions() {
    }

    public ArchiveDocumentRevisions(
           java.lang.String sessionID,
           java.lang.String[] revisionGuids,
           java.lang.Integer retentionPeriod,
           java.lang.Integer retentionUnit) {
           this.sessionID = sessionID;
           this.revisionGuids = revisionGuids;
           this.retentionPeriod = retentionPeriod;
           this.retentionUnit = retentionUnit;
    }


    /**
     * Gets the sessionID value for this ArchiveDocumentRevisions.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this ArchiveDocumentRevisions.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the revisionGuids value for this ArchiveDocumentRevisions.
     * 
     * @return revisionGuids
     */
    public java.lang.String[] getRevisionGuids() {
        return revisionGuids;
    }


    /**
     * Sets the revisionGuids value for this ArchiveDocumentRevisions.
     * 
     * @param revisionGuids
     */
    public void setRevisionGuids(java.lang.String[] revisionGuids) {
        this.revisionGuids = revisionGuids;
    }


    /**
     * Gets the retentionPeriod value for this ArchiveDocumentRevisions.
     * 
     * @return retentionPeriod
     */
    public java.lang.Integer getRetentionPeriod() {
        return retentionPeriod;
    }


    /**
     * Sets the retentionPeriod value for this ArchiveDocumentRevisions.
     * 
     * @param retentionPeriod
     */
    public void setRetentionPeriod(java.lang.Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }


    /**
     * Gets the retentionUnit value for this ArchiveDocumentRevisions.
     * 
     * @return retentionUnit
     */
    public java.lang.Integer getRetentionUnit() {
        return retentionUnit;
    }


    /**
     * Sets the retentionUnit value for this ArchiveDocumentRevisions.
     * 
     * @param retentionUnit
     */
    public void setRetentionUnit(java.lang.Integer retentionUnit) {
        this.retentionUnit = retentionUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiveDocumentRevisions)) return false;
        ArchiveDocumentRevisions other = (ArchiveDocumentRevisions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.revisionGuids==null && other.getRevisionGuids()==null) || 
             (this.revisionGuids!=null &&
              java.util.Arrays.equals(this.revisionGuids, other.getRevisionGuids()))) &&
            ((this.retentionPeriod==null && other.getRetentionPeriod()==null) || 
             (this.retentionPeriod!=null &&
              this.retentionPeriod.equals(other.getRetentionPeriod()))) &&
            ((this.retentionUnit==null && other.getRetentionUnit()==null) || 
             (this.retentionUnit!=null &&
              this.retentionUnit.equals(other.getRetentionUnit())));
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
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getRevisionGuids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevisionGuids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevisionGuids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetentionPeriod() != null) {
            _hashCode += getRetentionPeriod().hashCode();
        }
        if (getRetentionUnit() != null) {
            _hashCode += getRetentionUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiveDocumentRevisions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ArchiveDocumentRevisions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionGuids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "revisionGuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "guid"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retentionPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "retentionPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retentionUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "retentionUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
