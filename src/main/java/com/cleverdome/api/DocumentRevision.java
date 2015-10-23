/**
 * DocumentRevision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentRevision  implements java.io.Serializable {
    private java.util.Calendar beginDate;

    private java.util.Calendar endDate;

    private java.lang.Long fileSize;

    private java.lang.String fileType;

    private java.lang.Boolean isActive;

    private java.lang.Boolean isFillable;

    private java.util.Calendar lastApproved;

    private java.lang.Integer reviewedByID;

    private java.lang.String reviewedByName;

    private java.util.Calendar revisionDate;

    private java.lang.String revisionGUID;

    private java.util.Calendar uploadDate;

    private java.lang.Integer uploadedByID;

    private java.lang.String uploadedByName;

    public DocumentRevision() {
    }

    public DocumentRevision(
           java.util.Calendar beginDate,
           java.util.Calendar endDate,
           java.lang.Long fileSize,
           java.lang.String fileType,
           java.lang.Boolean isActive,
           java.lang.Boolean isFillable,
           java.util.Calendar lastApproved,
           java.lang.Integer reviewedByID,
           java.lang.String reviewedByName,
           java.util.Calendar revisionDate,
           java.lang.String revisionGUID,
           java.util.Calendar uploadDate,
           java.lang.Integer uploadedByID,
           java.lang.String uploadedByName) {
           this.beginDate = beginDate;
           this.endDate = endDate;
           this.fileSize = fileSize;
           this.fileType = fileType;
           this.isActive = isActive;
           this.isFillable = isFillable;
           this.lastApproved = lastApproved;
           this.reviewedByID = reviewedByID;
           this.reviewedByName = reviewedByName;
           this.revisionDate = revisionDate;
           this.revisionGUID = revisionGUID;
           this.uploadDate = uploadDate;
           this.uploadedByID = uploadedByID;
           this.uploadedByName = uploadedByName;
    }


    /**
     * Gets the beginDate value for this DocumentRevision.
     * 
     * @return beginDate
     */
    public java.util.Calendar getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this DocumentRevision.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.util.Calendar beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the endDate value for this DocumentRevision.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DocumentRevision.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the fileSize value for this DocumentRevision.
     * 
     * @return fileSize
     */
    public java.lang.Long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this DocumentRevision.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the fileType value for this DocumentRevision.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this DocumentRevision.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the isActive value for this DocumentRevision.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this DocumentRevision.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isFillable value for this DocumentRevision.
     * 
     * @return isFillable
     */
    public java.lang.Boolean getIsFillable() {
        return isFillable;
    }


    /**
     * Sets the isFillable value for this DocumentRevision.
     * 
     * @param isFillable
     */
    public void setIsFillable(java.lang.Boolean isFillable) {
        this.isFillable = isFillable;
    }


    /**
     * Gets the lastApproved value for this DocumentRevision.
     * 
     * @return lastApproved
     */
    public java.util.Calendar getLastApproved() {
        return lastApproved;
    }


    /**
     * Sets the lastApproved value for this DocumentRevision.
     * 
     * @param lastApproved
     */
    public void setLastApproved(java.util.Calendar lastApproved) {
        this.lastApproved = lastApproved;
    }


    /**
     * Gets the reviewedByID value for this DocumentRevision.
     * 
     * @return reviewedByID
     */
    public java.lang.Integer getReviewedByID() {
        return reviewedByID;
    }


    /**
     * Sets the reviewedByID value for this DocumentRevision.
     * 
     * @param reviewedByID
     */
    public void setReviewedByID(java.lang.Integer reviewedByID) {
        this.reviewedByID = reviewedByID;
    }


    /**
     * Gets the reviewedByName value for this DocumentRevision.
     * 
     * @return reviewedByName
     */
    public java.lang.String getReviewedByName() {
        return reviewedByName;
    }


    /**
     * Sets the reviewedByName value for this DocumentRevision.
     * 
     * @param reviewedByName
     */
    public void setReviewedByName(java.lang.String reviewedByName) {
        this.reviewedByName = reviewedByName;
    }


    /**
     * Gets the revisionDate value for this DocumentRevision.
     * 
     * @return revisionDate
     */
    public java.util.Calendar getRevisionDate() {
        return revisionDate;
    }


    /**
     * Sets the revisionDate value for this DocumentRevision.
     * 
     * @param revisionDate
     */
    public void setRevisionDate(java.util.Calendar revisionDate) {
        this.revisionDate = revisionDate;
    }


    /**
     * Gets the revisionGUID value for this DocumentRevision.
     * 
     * @return revisionGUID
     */
    public java.lang.String getRevisionGUID() {
        return revisionGUID;
    }


    /**
     * Sets the revisionGUID value for this DocumentRevision.
     * 
     * @param revisionGUID
     */
    public void setRevisionGUID(java.lang.String revisionGUID) {
        this.revisionGUID = revisionGUID;
    }


    /**
     * Gets the uploadDate value for this DocumentRevision.
     * 
     * @return uploadDate
     */
    public java.util.Calendar getUploadDate() {
        return uploadDate;
    }


    /**
     * Sets the uploadDate value for this DocumentRevision.
     * 
     * @param uploadDate
     */
    public void setUploadDate(java.util.Calendar uploadDate) {
        this.uploadDate = uploadDate;
    }


    /**
     * Gets the uploadedByID value for this DocumentRevision.
     * 
     * @return uploadedByID
     */
    public java.lang.Integer getUploadedByID() {
        return uploadedByID;
    }


    /**
     * Sets the uploadedByID value for this DocumentRevision.
     * 
     * @param uploadedByID
     */
    public void setUploadedByID(java.lang.Integer uploadedByID) {
        this.uploadedByID = uploadedByID;
    }


    /**
     * Gets the uploadedByName value for this DocumentRevision.
     * 
     * @return uploadedByName
     */
    public java.lang.String getUploadedByName() {
        return uploadedByName;
    }


    /**
     * Sets the uploadedByName value for this DocumentRevision.
     * 
     * @param uploadedByName
     */
    public void setUploadedByName(java.lang.String uploadedByName) {
        this.uploadedByName = uploadedByName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentRevision)) return false;
        DocumentRevision other = (DocumentRevision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isFillable==null && other.getIsFillable()==null) || 
             (this.isFillable!=null &&
              this.isFillable.equals(other.getIsFillable()))) &&
            ((this.lastApproved==null && other.getLastApproved()==null) || 
             (this.lastApproved!=null &&
              this.lastApproved.equals(other.getLastApproved()))) &&
            ((this.reviewedByID==null && other.getReviewedByID()==null) || 
             (this.reviewedByID!=null &&
              this.reviewedByID.equals(other.getReviewedByID()))) &&
            ((this.reviewedByName==null && other.getReviewedByName()==null) || 
             (this.reviewedByName!=null &&
              this.reviewedByName.equals(other.getReviewedByName()))) &&
            ((this.revisionDate==null && other.getRevisionDate()==null) || 
             (this.revisionDate!=null &&
              this.revisionDate.equals(other.getRevisionDate()))) &&
            ((this.revisionGUID==null && other.getRevisionGUID()==null) || 
             (this.revisionGUID!=null &&
              this.revisionGUID.equals(other.getRevisionGUID()))) &&
            ((this.uploadDate==null && other.getUploadDate()==null) || 
             (this.uploadDate!=null &&
              this.uploadDate.equals(other.getUploadDate()))) &&
            ((this.uploadedByID==null && other.getUploadedByID()==null) || 
             (this.uploadedByID!=null &&
              this.uploadedByID.equals(other.getUploadedByID()))) &&
            ((this.uploadedByName==null && other.getUploadedByName()==null) || 
             (this.uploadedByName!=null &&
              this.uploadedByName.equals(other.getUploadedByName())));
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
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsFillable() != null) {
            _hashCode += getIsFillable().hashCode();
        }
        if (getLastApproved() != null) {
            _hashCode += getLastApproved().hashCode();
        }
        if (getReviewedByID() != null) {
            _hashCode += getReviewedByID().hashCode();
        }
        if (getReviewedByName() != null) {
            _hashCode += getReviewedByName().hashCode();
        }
        if (getRevisionDate() != null) {
            _hashCode += getRevisionDate().hashCode();
        }
        if (getRevisionGUID() != null) {
            _hashCode += getRevisionGUID().hashCode();
        }
        if (getUploadDate() != null) {
            _hashCode += getUploadDate().hashCode();
        }
        if (getUploadedByID() != null) {
            _hashCode += getUploadedByID().hashCode();
        }
        if (getUploadedByName() != null) {
            _hashCode += getUploadedByName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentRevision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentRevision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "BeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFillable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "IsFillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewedByID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ReviewedByID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewedByName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ReviewedByName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RevisionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RevisionGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UploadDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadedByID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UploadedByID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadedByName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UploadedByName"));
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
