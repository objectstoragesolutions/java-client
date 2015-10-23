/**
 * AddExternalDocumentRevision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddExternalDocumentRevision  implements java.io.Serializable {
    private java.lang.String parentDocGuid;

    private java.lang.Long fileSize;

    private java.util.Calendar revisionDate;

    private java.lang.Integer uploadedBy;

    private java.lang.String fileType;

    private java.lang.String sha1Hash;

    private java.lang.String versionID;

    private java.lang.Integer appID;

    public AddExternalDocumentRevision() {
    }

    public AddExternalDocumentRevision(
           java.lang.String parentDocGuid,
           java.lang.Long fileSize,
           java.util.Calendar revisionDate,
           java.lang.Integer uploadedBy,
           java.lang.String fileType,
           java.lang.String sha1Hash,
           java.lang.String versionID,
           java.lang.Integer appID) {
           this.parentDocGuid = parentDocGuid;
           this.fileSize = fileSize;
           this.revisionDate = revisionDate;
           this.uploadedBy = uploadedBy;
           this.fileType = fileType;
           this.sha1Hash = sha1Hash;
           this.versionID = versionID;
           this.appID = appID;
    }


    /**
     * Gets the parentDocGuid value for this AddExternalDocumentRevision.
     * 
     * @return parentDocGuid
     */
    public java.lang.String getParentDocGuid() {
        return parentDocGuid;
    }


    /**
     * Sets the parentDocGuid value for this AddExternalDocumentRevision.
     * 
     * @param parentDocGuid
     */
    public void setParentDocGuid(java.lang.String parentDocGuid) {
        this.parentDocGuid = parentDocGuid;
    }


    /**
     * Gets the fileSize value for this AddExternalDocumentRevision.
     * 
     * @return fileSize
     */
    public java.lang.Long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this AddExternalDocumentRevision.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the revisionDate value for this AddExternalDocumentRevision.
     * 
     * @return revisionDate
     */
    public java.util.Calendar getRevisionDate() {
        return revisionDate;
    }


    /**
     * Sets the revisionDate value for this AddExternalDocumentRevision.
     * 
     * @param revisionDate
     */
    public void setRevisionDate(java.util.Calendar revisionDate) {
        this.revisionDate = revisionDate;
    }


    /**
     * Gets the uploadedBy value for this AddExternalDocumentRevision.
     * 
     * @return uploadedBy
     */
    public java.lang.Integer getUploadedBy() {
        return uploadedBy;
    }


    /**
     * Sets the uploadedBy value for this AddExternalDocumentRevision.
     * 
     * @param uploadedBy
     */
    public void setUploadedBy(java.lang.Integer uploadedBy) {
        this.uploadedBy = uploadedBy;
    }


    /**
     * Gets the fileType value for this AddExternalDocumentRevision.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this AddExternalDocumentRevision.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the sha1Hash value for this AddExternalDocumentRevision.
     * 
     * @return sha1Hash
     */
    public java.lang.String getSha1Hash() {
        return sha1Hash;
    }


    /**
     * Sets the sha1Hash value for this AddExternalDocumentRevision.
     * 
     * @param sha1Hash
     */
    public void setSha1Hash(java.lang.String sha1Hash) {
        this.sha1Hash = sha1Hash;
    }


    /**
     * Gets the versionID value for this AddExternalDocumentRevision.
     * 
     * @return versionID
     */
    public java.lang.String getVersionID() {
        return versionID;
    }


    /**
     * Sets the versionID value for this AddExternalDocumentRevision.
     * 
     * @param versionID
     */
    public void setVersionID(java.lang.String versionID) {
        this.versionID = versionID;
    }


    /**
     * Gets the appID value for this AddExternalDocumentRevision.
     * 
     * @return appID
     */
    public java.lang.Integer getAppID() {
        return appID;
    }


    /**
     * Sets the appID value for this AddExternalDocumentRevision.
     * 
     * @param appID
     */
    public void setAppID(java.lang.Integer appID) {
        this.appID = appID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddExternalDocumentRevision)) return false;
        AddExternalDocumentRevision other = (AddExternalDocumentRevision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parentDocGuid==null && other.getParentDocGuid()==null) || 
             (this.parentDocGuid!=null &&
              this.parentDocGuid.equals(other.getParentDocGuid()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.revisionDate==null && other.getRevisionDate()==null) || 
             (this.revisionDate!=null &&
              this.revisionDate.equals(other.getRevisionDate()))) &&
            ((this.uploadedBy==null && other.getUploadedBy()==null) || 
             (this.uploadedBy!=null &&
              this.uploadedBy.equals(other.getUploadedBy()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.sha1Hash==null && other.getSha1Hash()==null) || 
             (this.sha1Hash!=null &&
              this.sha1Hash.equals(other.getSha1Hash()))) &&
            ((this.versionID==null && other.getVersionID()==null) || 
             (this.versionID!=null &&
              this.versionID.equals(other.getVersionID()))) &&
            ((this.appID==null && other.getAppID()==null) || 
             (this.appID!=null &&
              this.appID.equals(other.getAppID())));
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
        if (getParentDocGuid() != null) {
            _hashCode += getParentDocGuid().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getRevisionDate() != null) {
            _hashCode += getRevisionDate().hashCode();
        }
        if (getUploadedBy() != null) {
            _hashCode += getUploadedBy().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getSha1Hash() != null) {
            _hashCode += getSha1Hash().hashCode();
        }
        if (getVersionID() != null) {
            _hashCode += getVersionID().hashCode();
        }
        if (getAppID() != null) {
            _hashCode += getAppID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddExternalDocumentRevision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddExternalDocumentRevision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDocGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "parentDocGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "revisionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "uploadedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sha1Hash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sha1hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "versionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "appID"));
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
