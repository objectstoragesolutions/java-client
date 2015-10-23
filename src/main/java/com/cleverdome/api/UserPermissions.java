/**
 * UserPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UserPermissions  implements java.io.Serializable {
    private java.lang.Boolean canAddMetadata;

    private java.lang.Boolean canAddNewRevision;

    private java.lang.Boolean canEditDocTemplatesAndTypes;

    private java.lang.Boolean canEditDocument;

    private java.lang.Boolean canEditPermissions;

    private java.lang.Boolean canRemoveDocument;

    private java.lang.Boolean canViewDocument;

    private java.lang.Boolean canViewDocumentTemplatesAndTypes;

    private java.lang.Boolean canViewPermissions;

    private java.lang.Boolean canViewRelatedDocuments;

    private java.lang.Boolean hasAdminRights;

    public UserPermissions() {
    }

    public UserPermissions(
           java.lang.Boolean canAddMetadata,
           java.lang.Boolean canAddNewRevision,
           java.lang.Boolean canEditDocTemplatesAndTypes,
           java.lang.Boolean canEditDocument,
           java.lang.Boolean canEditPermissions,
           java.lang.Boolean canRemoveDocument,
           java.lang.Boolean canViewDocument,
           java.lang.Boolean canViewDocumentTemplatesAndTypes,
           java.lang.Boolean canViewPermissions,
           java.lang.Boolean canViewRelatedDocuments,
           java.lang.Boolean hasAdminRights) {
           this.canAddMetadata = canAddMetadata;
           this.canAddNewRevision = canAddNewRevision;
           this.canEditDocTemplatesAndTypes = canEditDocTemplatesAndTypes;
           this.canEditDocument = canEditDocument;
           this.canEditPermissions = canEditPermissions;
           this.canRemoveDocument = canRemoveDocument;
           this.canViewDocument = canViewDocument;
           this.canViewDocumentTemplatesAndTypes = canViewDocumentTemplatesAndTypes;
           this.canViewPermissions = canViewPermissions;
           this.canViewRelatedDocuments = canViewRelatedDocuments;
           this.hasAdminRights = hasAdminRights;
    }


    /**
     * Gets the canAddMetadata value for this UserPermissions.
     * 
     * @return canAddMetadata
     */
    public java.lang.Boolean getCanAddMetadata() {
        return canAddMetadata;
    }


    /**
     * Sets the canAddMetadata value for this UserPermissions.
     * 
     * @param canAddMetadata
     */
    public void setCanAddMetadata(java.lang.Boolean canAddMetadata) {
        this.canAddMetadata = canAddMetadata;
    }


    /**
     * Gets the canAddNewRevision value for this UserPermissions.
     * 
     * @return canAddNewRevision
     */
    public java.lang.Boolean getCanAddNewRevision() {
        return canAddNewRevision;
    }


    /**
     * Sets the canAddNewRevision value for this UserPermissions.
     * 
     * @param canAddNewRevision
     */
    public void setCanAddNewRevision(java.lang.Boolean canAddNewRevision) {
        this.canAddNewRevision = canAddNewRevision;
    }


    /**
     * Gets the canEditDocTemplatesAndTypes value for this UserPermissions.
     * 
     * @return canEditDocTemplatesAndTypes
     */
    public java.lang.Boolean getCanEditDocTemplatesAndTypes() {
        return canEditDocTemplatesAndTypes;
    }


    /**
     * Sets the canEditDocTemplatesAndTypes value for this UserPermissions.
     * 
     * @param canEditDocTemplatesAndTypes
     */
    public void setCanEditDocTemplatesAndTypes(java.lang.Boolean canEditDocTemplatesAndTypes) {
        this.canEditDocTemplatesAndTypes = canEditDocTemplatesAndTypes;
    }


    /**
     * Gets the canEditDocument value for this UserPermissions.
     * 
     * @return canEditDocument
     */
    public java.lang.Boolean getCanEditDocument() {
        return canEditDocument;
    }


    /**
     * Sets the canEditDocument value for this UserPermissions.
     * 
     * @param canEditDocument
     */
    public void setCanEditDocument(java.lang.Boolean canEditDocument) {
        this.canEditDocument = canEditDocument;
    }


    /**
     * Gets the canEditPermissions value for this UserPermissions.
     * 
     * @return canEditPermissions
     */
    public java.lang.Boolean getCanEditPermissions() {
        return canEditPermissions;
    }


    /**
     * Sets the canEditPermissions value for this UserPermissions.
     * 
     * @param canEditPermissions
     */
    public void setCanEditPermissions(java.lang.Boolean canEditPermissions) {
        this.canEditPermissions = canEditPermissions;
    }


    /**
     * Gets the canRemoveDocument value for this UserPermissions.
     * 
     * @return canRemoveDocument
     */
    public java.lang.Boolean getCanRemoveDocument() {
        return canRemoveDocument;
    }


    /**
     * Sets the canRemoveDocument value for this UserPermissions.
     * 
     * @param canRemoveDocument
     */
    public void setCanRemoveDocument(java.lang.Boolean canRemoveDocument) {
        this.canRemoveDocument = canRemoveDocument;
    }


    /**
     * Gets the canViewDocument value for this UserPermissions.
     * 
     * @return canViewDocument
     */
    public java.lang.Boolean getCanViewDocument() {
        return canViewDocument;
    }


    /**
     * Sets the canViewDocument value for this UserPermissions.
     * 
     * @param canViewDocument
     */
    public void setCanViewDocument(java.lang.Boolean canViewDocument) {
        this.canViewDocument = canViewDocument;
    }


    /**
     * Gets the canViewDocumentTemplatesAndTypes value for this UserPermissions.
     * 
     * @return canViewDocumentTemplatesAndTypes
     */
    public java.lang.Boolean getCanViewDocumentTemplatesAndTypes() {
        return canViewDocumentTemplatesAndTypes;
    }


    /**
     * Sets the canViewDocumentTemplatesAndTypes value for this UserPermissions.
     * 
     * @param canViewDocumentTemplatesAndTypes
     */
    public void setCanViewDocumentTemplatesAndTypes(java.lang.Boolean canViewDocumentTemplatesAndTypes) {
        this.canViewDocumentTemplatesAndTypes = canViewDocumentTemplatesAndTypes;
    }


    /**
     * Gets the canViewPermissions value for this UserPermissions.
     * 
     * @return canViewPermissions
     */
    public java.lang.Boolean getCanViewPermissions() {
        return canViewPermissions;
    }


    /**
     * Sets the canViewPermissions value for this UserPermissions.
     * 
     * @param canViewPermissions
     */
    public void setCanViewPermissions(java.lang.Boolean canViewPermissions) {
        this.canViewPermissions = canViewPermissions;
    }


    /**
     * Gets the canViewRelatedDocuments value for this UserPermissions.
     * 
     * @return canViewRelatedDocuments
     */
    public java.lang.Boolean getCanViewRelatedDocuments() {
        return canViewRelatedDocuments;
    }


    /**
     * Sets the canViewRelatedDocuments value for this UserPermissions.
     * 
     * @param canViewRelatedDocuments
     */
    public void setCanViewRelatedDocuments(java.lang.Boolean canViewRelatedDocuments) {
        this.canViewRelatedDocuments = canViewRelatedDocuments;
    }


    /**
     * Gets the hasAdminRights value for this UserPermissions.
     * 
     * @return hasAdminRights
     */
    public java.lang.Boolean getHasAdminRights() {
        return hasAdminRights;
    }


    /**
     * Sets the hasAdminRights value for this UserPermissions.
     * 
     * @param hasAdminRights
     */
    public void setHasAdminRights(java.lang.Boolean hasAdminRights) {
        this.hasAdminRights = hasAdminRights;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPermissions)) return false;
        UserPermissions other = (UserPermissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.canAddMetadata==null && other.getCanAddMetadata()==null) || 
             (this.canAddMetadata!=null &&
              this.canAddMetadata.equals(other.getCanAddMetadata()))) &&
            ((this.canAddNewRevision==null && other.getCanAddNewRevision()==null) || 
             (this.canAddNewRevision!=null &&
              this.canAddNewRevision.equals(other.getCanAddNewRevision()))) &&
            ((this.canEditDocTemplatesAndTypes==null && other.getCanEditDocTemplatesAndTypes()==null) || 
             (this.canEditDocTemplatesAndTypes!=null &&
              this.canEditDocTemplatesAndTypes.equals(other.getCanEditDocTemplatesAndTypes()))) &&
            ((this.canEditDocument==null && other.getCanEditDocument()==null) || 
             (this.canEditDocument!=null &&
              this.canEditDocument.equals(other.getCanEditDocument()))) &&
            ((this.canEditPermissions==null && other.getCanEditPermissions()==null) || 
             (this.canEditPermissions!=null &&
              this.canEditPermissions.equals(other.getCanEditPermissions()))) &&
            ((this.canRemoveDocument==null && other.getCanRemoveDocument()==null) || 
             (this.canRemoveDocument!=null &&
              this.canRemoveDocument.equals(other.getCanRemoveDocument()))) &&
            ((this.canViewDocument==null && other.getCanViewDocument()==null) || 
             (this.canViewDocument!=null &&
              this.canViewDocument.equals(other.getCanViewDocument()))) &&
            ((this.canViewDocumentTemplatesAndTypes==null && other.getCanViewDocumentTemplatesAndTypes()==null) || 
             (this.canViewDocumentTemplatesAndTypes!=null &&
              this.canViewDocumentTemplatesAndTypes.equals(other.getCanViewDocumentTemplatesAndTypes()))) &&
            ((this.canViewPermissions==null && other.getCanViewPermissions()==null) || 
             (this.canViewPermissions!=null &&
              this.canViewPermissions.equals(other.getCanViewPermissions()))) &&
            ((this.canViewRelatedDocuments==null && other.getCanViewRelatedDocuments()==null) || 
             (this.canViewRelatedDocuments!=null &&
              this.canViewRelatedDocuments.equals(other.getCanViewRelatedDocuments()))) &&
            ((this.hasAdminRights==null && other.getHasAdminRights()==null) || 
             (this.hasAdminRights!=null &&
              this.hasAdminRights.equals(other.getHasAdminRights())));
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
        if (getCanAddMetadata() != null) {
            _hashCode += getCanAddMetadata().hashCode();
        }
        if (getCanAddNewRevision() != null) {
            _hashCode += getCanAddNewRevision().hashCode();
        }
        if (getCanEditDocTemplatesAndTypes() != null) {
            _hashCode += getCanEditDocTemplatesAndTypes().hashCode();
        }
        if (getCanEditDocument() != null) {
            _hashCode += getCanEditDocument().hashCode();
        }
        if (getCanEditPermissions() != null) {
            _hashCode += getCanEditPermissions().hashCode();
        }
        if (getCanRemoveDocument() != null) {
            _hashCode += getCanRemoveDocument().hashCode();
        }
        if (getCanViewDocument() != null) {
            _hashCode += getCanViewDocument().hashCode();
        }
        if (getCanViewDocumentTemplatesAndTypes() != null) {
            _hashCode += getCanViewDocumentTemplatesAndTypes().hashCode();
        }
        if (getCanViewPermissions() != null) {
            _hashCode += getCanViewPermissions().hashCode();
        }
        if (getCanViewRelatedDocuments() != null) {
            _hashCode += getCanViewRelatedDocuments().hashCode();
        }
        if (getHasAdminRights() != null) {
            _hashCode += getHasAdminRights().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPermissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserPermissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canAddMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanAddMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canAddNewRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanAddNewRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canEditDocTemplatesAndTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanEditDocTemplatesAndTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canEditDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanEditDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canEditPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanEditPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canRemoveDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanRemoveDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canViewDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanViewDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canViewDocumentTemplatesAndTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanViewDocumentTemplatesAndTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canViewPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanViewPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canViewRelatedDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CanViewRelatedDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAdminRights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "HasAdminRights"));
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
