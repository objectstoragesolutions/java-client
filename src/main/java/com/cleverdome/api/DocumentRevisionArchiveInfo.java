/**
 * DocumentRevisionArchiveInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentRevisionArchiveInfo  implements java.io.Serializable {
    private java.util.Calendar archivedTill;

    private java.lang.String revisionGuid;

    private java.lang.Integer revisionNumber;

    public DocumentRevisionArchiveInfo() {
    }

    public DocumentRevisionArchiveInfo(
           java.util.Calendar archivedTill,
           java.lang.String revisionGuid,
           java.lang.Integer revisionNumber) {
           this.archivedTill = archivedTill;
           this.revisionGuid = revisionGuid;
           this.revisionNumber = revisionNumber;
    }


    /**
     * Gets the archivedTill value for this DocumentRevisionArchiveInfo.
     * 
     * @return archivedTill
     */
    public java.util.Calendar getArchivedTill() {
        return archivedTill;
    }


    /**
     * Sets the archivedTill value for this DocumentRevisionArchiveInfo.
     * 
     * @param archivedTill
     */
    public void setArchivedTill(java.util.Calendar archivedTill) {
        this.archivedTill = archivedTill;
    }


    /**
     * Gets the revisionGuid value for this DocumentRevisionArchiveInfo.
     * 
     * @return revisionGuid
     */
    public java.lang.String getRevisionGuid() {
        return revisionGuid;
    }


    /**
     * Sets the revisionGuid value for this DocumentRevisionArchiveInfo.
     * 
     * @param revisionGuid
     */
    public void setRevisionGuid(java.lang.String revisionGuid) {
        this.revisionGuid = revisionGuid;
    }


    /**
     * Gets the revisionNumber value for this DocumentRevisionArchiveInfo.
     * 
     * @return revisionNumber
     */
    public java.lang.Integer getRevisionNumber() {
        return revisionNumber;
    }


    /**
     * Sets the revisionNumber value for this DocumentRevisionArchiveInfo.
     * 
     * @param revisionNumber
     */
    public void setRevisionNumber(java.lang.Integer revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentRevisionArchiveInfo)) return false;
        DocumentRevisionArchiveInfo other = (DocumentRevisionArchiveInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.archivedTill==null && other.getArchivedTill()==null) || 
             (this.archivedTill!=null &&
              this.archivedTill.equals(other.getArchivedTill()))) &&
            ((this.revisionGuid==null && other.getRevisionGuid()==null) || 
             (this.revisionGuid!=null &&
              this.revisionGuid.equals(other.getRevisionGuid()))) &&
            ((this.revisionNumber==null && other.getRevisionNumber()==null) || 
             (this.revisionNumber!=null &&
              this.revisionNumber.equals(other.getRevisionNumber())));
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
        if (getArchivedTill() != null) {
            _hashCode += getArchivedTill().hashCode();
        }
        if (getRevisionGuid() != null) {
            _hashCode += getRevisionGuid().hashCode();
        }
        if (getRevisionNumber() != null) {
            _hashCode += getRevisionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentRevisionArchiveInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentRevisionArchiveInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivedTill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ArchivedTill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RevisionGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RevisionNumber"));
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
