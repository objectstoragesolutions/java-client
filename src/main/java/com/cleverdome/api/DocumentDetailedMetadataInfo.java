/**
 * DocumentDetailedMetadataInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentDetailedMetadataInfo  extends com.cleverdome.api.Document  implements java.io.Serializable {
    private com.cleverdome.api.DocumentField[] allowedFieldTypes;

    private com.cleverdome.api.DocumentBatch[] batches;

    private com.cleverdome.api.DocumentMetadataValueBase[] metadata;

    private com.cleverdome.api.DocumentSecurityImagingSecurityLevel securityLevel;

    public DocumentDetailedMetadataInfo() {
    }

    public DocumentDetailedMetadataInfo(
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
           java.lang.Integer uploadedByID,
           com.cleverdome.api.DocumentField[] allowedFieldTypes,
           com.cleverdome.api.DocumentBatch[] batches,
           com.cleverdome.api.DocumentMetadataValueBase[] metadata,
           com.cleverdome.api.DocumentSecurityImagingSecurityLevel securityLevel) {
        super(
            applicationID,
            docGUID,
            docStatus,
            docTemplate,
            docType,
            documentTemplateID,
            documentTypeID,
            fileType,
            lastRevisionID,
            name,
            scanDate,
            systemID,
            uploadedByID);
        this.allowedFieldTypes = allowedFieldTypes;
        this.batches = batches;
        this.metadata = metadata;
        this.securityLevel = securityLevel;
    }


    /**
     * Gets the allowedFieldTypes value for this DocumentDetailedMetadataInfo.
     * 
     * @return allowedFieldTypes
     */
    public com.cleverdome.api.DocumentField[] getAllowedFieldTypes() {
        return allowedFieldTypes;
    }


    /**
     * Sets the allowedFieldTypes value for this DocumentDetailedMetadataInfo.
     * 
     * @param allowedFieldTypes
     */
    public void setAllowedFieldTypes(com.cleverdome.api.DocumentField[] allowedFieldTypes) {
        this.allowedFieldTypes = allowedFieldTypes;
    }


    /**
     * Gets the batches value for this DocumentDetailedMetadataInfo.
     * 
     * @return batches
     */
    public com.cleverdome.api.DocumentBatch[] getBatches() {
        return batches;
    }


    /**
     * Sets the batches value for this DocumentDetailedMetadataInfo.
     * 
     * @param batches
     */
    public void setBatches(com.cleverdome.api.DocumentBatch[] batches) {
        this.batches = batches;
    }


    /**
     * Gets the metadata value for this DocumentDetailedMetadataInfo.
     * 
     * @return metadata
     */
    public com.cleverdome.api.DocumentMetadataValueBase[] getMetadata() {
        return metadata;
    }


    /**
     * Sets the metadata value for this DocumentDetailedMetadataInfo.
     * 
     * @param metadata
     */
    public void setMetadata(com.cleverdome.api.DocumentMetadataValueBase[] metadata) {
        this.metadata = metadata;
    }


    /**
     * Gets the securityLevel value for this DocumentDetailedMetadataInfo.
     * 
     * @return securityLevel
     */
    public com.cleverdome.api.DocumentSecurityImagingSecurityLevel getSecurityLevel() {
        return securityLevel;
    }


    /**
     * Sets the securityLevel value for this DocumentDetailedMetadataInfo.
     * 
     * @param securityLevel
     */
    public void setSecurityLevel(com.cleverdome.api.DocumentSecurityImagingSecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentDetailedMetadataInfo)) return false;
        DocumentDetailedMetadataInfo other = (DocumentDetailedMetadataInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowedFieldTypes==null && other.getAllowedFieldTypes()==null) || 
             (this.allowedFieldTypes!=null &&
              java.util.Arrays.equals(this.allowedFieldTypes, other.getAllowedFieldTypes()))) &&
            ((this.batches==null && other.getBatches()==null) || 
             (this.batches!=null &&
              java.util.Arrays.equals(this.batches, other.getBatches()))) &&
            ((this.metadata==null && other.getMetadata()==null) || 
             (this.metadata!=null &&
              java.util.Arrays.equals(this.metadata, other.getMetadata()))) &&
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
        int _hashCode = super.hashCode();
        if (getAllowedFieldTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedFieldTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedFieldTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBatches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatches(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetadata(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentDetailedMetadataInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentDetailedMetadataInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedFieldTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "AllowedFieldTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batches");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Batches"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentBatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentBatch"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Metadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "SecurityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "DocumentSecurity.ImagingSecurityLevel"));
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
