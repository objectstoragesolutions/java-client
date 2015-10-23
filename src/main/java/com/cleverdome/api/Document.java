/**
 * Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class Document  implements java.io.Serializable {
    private java.lang.Integer applicationID;

    private java.lang.String docGUID;

    private java.lang.String docStatus;

    private java.lang.String docTemplate;

    private java.lang.String docType;

    private java.lang.Integer documentTemplateID;

    private java.lang.Integer documentTypeID;

    private java.lang.String fileType;

    private java.lang.String lastRevisionID;

    private java.lang.String name;

    private java.util.Calendar scanDate;

    private java.lang.Integer systemID;

    private java.lang.Integer uploadedByID;

    public Document() {
    }

    public Document(
           java.lang.Integer applicationID,
           java.lang.String docGUID,
           java.lang.String docStatus,
           java.lang.String docTemplate,
           java.lang.String docType,
           java.lang.Integer documentTemplateID,
           java.lang.Integer documentTypeID,
           java.lang.String fileType,
           java.lang.String lastRevisionID,
           java.lang.String name,
           java.util.Calendar scanDate,
           java.lang.Integer systemID,
           java.lang.Integer uploadedByID) {
           this.applicationID = applicationID;
           this.docGUID = docGUID;
           this.docStatus = docStatus;
           this.docTemplate = docTemplate;
           this.docType = docType;
           this.documentTemplateID = documentTemplateID;
           this.documentTypeID = documentTypeID;
           this.fileType = fileType;
           this.lastRevisionID = lastRevisionID;
           this.name = name;
           this.scanDate = scanDate;
           this.systemID = systemID;
           this.uploadedByID = uploadedByID;
    }


    /**
     * Gets the applicationID value for this Document.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this Document.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the docGUID value for this Document.
     * 
     * @return docGUID
     */
    public java.lang.String getDocGUID() {
        return docGUID;
    }


    /**
     * Sets the docGUID value for this Document.
     * 
     * @param docGUID
     */
    public void setDocGUID(java.lang.String docGUID) {
        this.docGUID = docGUID;
    }


    /**
     * Gets the docStatus value for this Document.
     * 
     * @return docStatus
     */
    public java.lang.String getDocStatus() {
        return docStatus;
    }


    /**
     * Sets the docStatus value for this Document.
     * 
     * @param docStatus
     */
    public void setDocStatus(java.lang.String docStatus) {
        this.docStatus = docStatus;
    }


    /**
     * Gets the docTemplate value for this Document.
     * 
     * @return docTemplate
     */
    public java.lang.String getDocTemplate() {
        return docTemplate;
    }


    /**
     * Sets the docTemplate value for this Document.
     * 
     * @param docTemplate
     */
    public void setDocTemplate(java.lang.String docTemplate) {
        this.docTemplate = docTemplate;
    }


    /**
     * Gets the docType value for this Document.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this Document.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }


    /**
     * Gets the documentTemplateID value for this Document.
     * 
     * @return documentTemplateID
     */
    public java.lang.Integer getDocumentTemplateID() {
        return documentTemplateID;
    }


    /**
     * Sets the documentTemplateID value for this Document.
     * 
     * @param documentTemplateID
     */
    public void setDocumentTemplateID(java.lang.Integer documentTemplateID) {
        this.documentTemplateID = documentTemplateID;
    }


    /**
     * Gets the documentTypeID value for this Document.
     * 
     * @return documentTypeID
     */
    public java.lang.Integer getDocumentTypeID() {
        return documentTypeID;
    }


    /**
     * Sets the documentTypeID value for this Document.
     * 
     * @param documentTypeID
     */
    public void setDocumentTypeID(java.lang.Integer documentTypeID) {
        this.documentTypeID = documentTypeID;
    }


    /**
     * Gets the fileType value for this Document.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this Document.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the lastRevisionID value for this Document.
     * 
     * @return lastRevisionID
     */
    public java.lang.String getLastRevisionID() {
        return lastRevisionID;
    }


    /**
     * Sets the lastRevisionID value for this Document.
     * 
     * @param lastRevisionID
     */
    public void setLastRevisionID(java.lang.String lastRevisionID) {
        this.lastRevisionID = lastRevisionID;
    }


    /**
     * Gets the name value for this Document.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Document.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the scanDate value for this Document.
     * 
     * @return scanDate
     */
    public java.util.Calendar getScanDate() {
        return scanDate;
    }


    /**
     * Sets the scanDate value for this Document.
     * 
     * @param scanDate
     */
    public void setScanDate(java.util.Calendar scanDate) {
        this.scanDate = scanDate;
    }


    /**
     * Gets the systemID value for this Document.
     * 
     * @return systemID
     */
    public java.lang.Integer getSystemID() {
        return systemID;
    }


    /**
     * Sets the systemID value for this Document.
     * 
     * @param systemID
     */
    public void setSystemID(java.lang.Integer systemID) {
        this.systemID = systemID;
    }


    /**
     * Gets the uploadedByID value for this Document.
     * 
     * @return uploadedByID
     */
    public java.lang.Integer getUploadedByID() {
        return uploadedByID;
    }


    /**
     * Sets the uploadedByID value for this Document.
     * 
     * @param uploadedByID
     */
    public void setUploadedByID(java.lang.Integer uploadedByID) {
        this.uploadedByID = uploadedByID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Document)) return false;
        Document other = (Document) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.docGUID==null && other.getDocGUID()==null) || 
             (this.docGUID!=null &&
              this.docGUID.equals(other.getDocGUID()))) &&
            ((this.docStatus==null && other.getDocStatus()==null) || 
             (this.docStatus!=null &&
              this.docStatus.equals(other.getDocStatus()))) &&
            ((this.docTemplate==null && other.getDocTemplate()==null) || 
             (this.docTemplate!=null &&
              this.docTemplate.equals(other.getDocTemplate()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.documentTemplateID==null && other.getDocumentTemplateID()==null) || 
             (this.documentTemplateID!=null &&
              this.documentTemplateID.equals(other.getDocumentTemplateID()))) &&
            ((this.documentTypeID==null && other.getDocumentTypeID()==null) || 
             (this.documentTypeID!=null &&
              this.documentTypeID.equals(other.getDocumentTypeID()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.lastRevisionID==null && other.getLastRevisionID()==null) || 
             (this.lastRevisionID!=null &&
              this.lastRevisionID.equals(other.getLastRevisionID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.scanDate==null && other.getScanDate()==null) || 
             (this.scanDate!=null &&
              this.scanDate.equals(other.getScanDate()))) &&
            ((this.systemID==null && other.getSystemID()==null) || 
             (this.systemID!=null &&
              this.systemID.equals(other.getSystemID()))) &&
            ((this.uploadedByID==null && other.getUploadedByID()==null) || 
             (this.uploadedByID!=null &&
              this.uploadedByID.equals(other.getUploadedByID())));
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
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getDocGUID() != null) {
            _hashCode += getDocGUID().hashCode();
        }
        if (getDocStatus() != null) {
            _hashCode += getDocStatus().hashCode();
        }
        if (getDocTemplate() != null) {
            _hashCode += getDocTemplate().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getDocumentTemplateID() != null) {
            _hashCode += getDocumentTemplateID().hashCode();
        }
        if (getDocumentTypeID() != null) {
            _hashCode += getDocumentTypeID().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getLastRevisionID() != null) {
            _hashCode += getLastRevisionID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getScanDate() != null) {
            _hashCode += getScanDate().hashCode();
        }
        if (getSystemID() != null) {
            _hashCode += getSystemID().hashCode();
        }
        if (getUploadedByID() != null) {
            _hashCode += getUploadedByID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Document.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Document"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ApplicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTemplateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentTemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentTypeID"));
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
        elemField.setFieldName("lastRevisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastRevisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scanDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ScanDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SystemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadedByID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UploadedByID"));
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
