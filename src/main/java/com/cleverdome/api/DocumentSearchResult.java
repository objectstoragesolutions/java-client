/**
 * DocumentSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentSearchResult  implements java.io.Serializable {
    private java.util.Calendar archivedTill;

    private java.lang.String documentGuid;

    private java.lang.Boolean evernoteNoteDeleted;

    private java.lang.String fileName;

    private java.lang.Integer fileSize;

    private java.lang.String fileType;

    private java.util.Calendar lastViewedTime;

    private java.lang.String lastViewer;

    private java.lang.Integer lastWorkflowEventID;

    private java.lang.String lastWorkflowEventName;

    private java.lang.Boolean lockDelete;

    private com.cleverdome.api.DocumentMetadataValueBase[] metadataValues;

    private java.lang.Integer securityLevel;

    public DocumentSearchResult() {
    }

    public DocumentSearchResult(
           java.util.Calendar archivedTill,
           java.lang.String documentGuid,
           java.lang.Boolean evernoteNoteDeleted,
           java.lang.String fileName,
           java.lang.Integer fileSize,
           java.lang.String fileType,
           java.util.Calendar lastViewedTime,
           java.lang.String lastViewer,
           java.lang.Integer lastWorkflowEventID,
           java.lang.String lastWorkflowEventName,
           java.lang.Boolean lockDelete,
           com.cleverdome.api.DocumentMetadataValueBase[] metadataValues,
           java.lang.Integer securityLevel) {
           this.archivedTill = archivedTill;
           this.documentGuid = documentGuid;
           this.evernoteNoteDeleted = evernoteNoteDeleted;
           this.fileName = fileName;
           this.fileSize = fileSize;
           this.fileType = fileType;
           this.lastViewedTime = lastViewedTime;
           this.lastViewer = lastViewer;
           this.lastWorkflowEventID = lastWorkflowEventID;
           this.lastWorkflowEventName = lastWorkflowEventName;
           this.lockDelete = lockDelete;
           this.metadataValues = metadataValues;
           this.securityLevel = securityLevel;
    }


    /**
     * Gets the archivedTill value for this DocumentSearchResult.
     * 
     * @return archivedTill
     */
    public java.util.Calendar getArchivedTill() {
        return archivedTill;
    }


    /**
     * Sets the archivedTill value for this DocumentSearchResult.
     * 
     * @param archivedTill
     */
    public void setArchivedTill(java.util.Calendar archivedTill) {
        this.archivedTill = archivedTill;
    }


    /**
     * Gets the documentGuid value for this DocumentSearchResult.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this DocumentSearchResult.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the evernoteNoteDeleted value for this DocumentSearchResult.
     * 
     * @return evernoteNoteDeleted
     */
    public java.lang.Boolean getEvernoteNoteDeleted() {
        return evernoteNoteDeleted;
    }


    /**
     * Sets the evernoteNoteDeleted value for this DocumentSearchResult.
     * 
     * @param evernoteNoteDeleted
     */
    public void setEvernoteNoteDeleted(java.lang.Boolean evernoteNoteDeleted) {
        this.evernoteNoteDeleted = evernoteNoteDeleted;
    }


    /**
     * Gets the fileName value for this DocumentSearchResult.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this DocumentSearchResult.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileSize value for this DocumentSearchResult.
     * 
     * @return fileSize
     */
    public java.lang.Integer getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this DocumentSearchResult.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Integer fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the fileType value for this DocumentSearchResult.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this DocumentSearchResult.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the lastViewedTime value for this DocumentSearchResult.
     * 
     * @return lastViewedTime
     */
    public java.util.Calendar getLastViewedTime() {
        return lastViewedTime;
    }


    /**
     * Sets the lastViewedTime value for this DocumentSearchResult.
     * 
     * @param lastViewedTime
     */
    public void setLastViewedTime(java.util.Calendar lastViewedTime) {
        this.lastViewedTime = lastViewedTime;
    }


    /**
     * Gets the lastViewer value for this DocumentSearchResult.
     * 
     * @return lastViewer
     */
    public java.lang.String getLastViewer() {
        return lastViewer;
    }


    /**
     * Sets the lastViewer value for this DocumentSearchResult.
     * 
     * @param lastViewer
     */
    public void setLastViewer(java.lang.String lastViewer) {
        this.lastViewer = lastViewer;
    }


    /**
     * Gets the lastWorkflowEventID value for this DocumentSearchResult.
     * 
     * @return lastWorkflowEventID
     */
    public java.lang.Integer getLastWorkflowEventID() {
        return lastWorkflowEventID;
    }


    /**
     * Sets the lastWorkflowEventID value for this DocumentSearchResult.
     * 
     * @param lastWorkflowEventID
     */
    public void setLastWorkflowEventID(java.lang.Integer lastWorkflowEventID) {
        this.lastWorkflowEventID = lastWorkflowEventID;
    }


    /**
     * Gets the lastWorkflowEventName value for this DocumentSearchResult.
     * 
     * @return lastWorkflowEventName
     */
    public java.lang.String getLastWorkflowEventName() {
        return lastWorkflowEventName;
    }


    /**
     * Sets the lastWorkflowEventName value for this DocumentSearchResult.
     * 
     * @param lastWorkflowEventName
     */
    public void setLastWorkflowEventName(java.lang.String lastWorkflowEventName) {
        this.lastWorkflowEventName = lastWorkflowEventName;
    }


    /**
     * Gets the lockDelete value for this DocumentSearchResult.
     * 
     * @return lockDelete
     */
    public java.lang.Boolean getLockDelete() {
        return lockDelete;
    }


    /**
     * Sets the lockDelete value for this DocumentSearchResult.
     * 
     * @param lockDelete
     */
    public void setLockDelete(java.lang.Boolean lockDelete) {
        this.lockDelete = lockDelete;
    }


    /**
     * Gets the metadataValues value for this DocumentSearchResult.
     * 
     * @return metadataValues
     */
    public com.cleverdome.api.DocumentMetadataValueBase[] getMetadataValues() {
        return metadataValues;
    }


    /**
     * Sets the metadataValues value for this DocumentSearchResult.
     * 
     * @param metadataValues
     */
    public void setMetadataValues(com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) {
        this.metadataValues = metadataValues;
    }


    /**
     * Gets the securityLevel value for this DocumentSearchResult.
     * 
     * @return securityLevel
     */
    public java.lang.Integer getSecurityLevel() {
        return securityLevel;
    }


    /**
     * Sets the securityLevel value for this DocumentSearchResult.
     * 
     * @param securityLevel
     */
    public void setSecurityLevel(java.lang.Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentSearchResult)) return false;
        DocumentSearchResult other = (DocumentSearchResult) obj;
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
            ((this.documentGuid==null && other.getDocumentGuid()==null) || 
             (this.documentGuid!=null &&
              this.documentGuid.equals(other.getDocumentGuid()))) &&
            ((this.evernoteNoteDeleted==null && other.getEvernoteNoteDeleted()==null) || 
             (this.evernoteNoteDeleted!=null &&
              this.evernoteNoteDeleted.equals(other.getEvernoteNoteDeleted()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.lastViewedTime==null && other.getLastViewedTime()==null) || 
             (this.lastViewedTime!=null &&
              this.lastViewedTime.equals(other.getLastViewedTime()))) &&
            ((this.lastViewer==null && other.getLastViewer()==null) || 
             (this.lastViewer!=null &&
              this.lastViewer.equals(other.getLastViewer()))) &&
            ((this.lastWorkflowEventID==null && other.getLastWorkflowEventID()==null) || 
             (this.lastWorkflowEventID!=null &&
              this.lastWorkflowEventID.equals(other.getLastWorkflowEventID()))) &&
            ((this.lastWorkflowEventName==null && other.getLastWorkflowEventName()==null) || 
             (this.lastWorkflowEventName!=null &&
              this.lastWorkflowEventName.equals(other.getLastWorkflowEventName()))) &&
            ((this.lockDelete==null && other.getLockDelete()==null) || 
             (this.lockDelete!=null &&
              this.lockDelete.equals(other.getLockDelete()))) &&
            ((this.metadataValues==null && other.getMetadataValues()==null) || 
             (this.metadataValues!=null &&
              java.util.Arrays.equals(this.metadataValues, other.getMetadataValues()))) &&
            ((this.securityLevel==null && other.getSecurityLevel()==null) || 
             (this.securityLevel!=null &&
              this.securityLevel.equals(other.getSecurityLevel())));
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
        if (getDocumentGuid() != null) {
            _hashCode += getDocumentGuid().hashCode();
        }
        if (getEvernoteNoteDeleted() != null) {
            _hashCode += getEvernoteNoteDeleted().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getLastViewedTime() != null) {
            _hashCode += getLastViewedTime().hashCode();
        }
        if (getLastViewer() != null) {
            _hashCode += getLastViewer().hashCode();
        }
        if (getLastWorkflowEventID() != null) {
            _hashCode += getLastWorkflowEventID().hashCode();
        }
        if (getLastWorkflowEventName() != null) {
            _hashCode += getLastWorkflowEventName().hashCode();
        }
        if (getLockDelete() != null) {
            _hashCode += getLockDelete().hashCode();
        }
        if (getMetadataValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetadataValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetadataValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecurityLevel() != null) {
            _hashCode += getSecurityLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivedTill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ArchivedTill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evernoteNoteDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "EvernoteNoteDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastViewedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastViewedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastViewer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastViewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWorkflowEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastWorkflowEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWorkflowEventName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastWorkflowEventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LockDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "MetadataValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SecurityLevel"));
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
