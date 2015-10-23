/**
 * FilterOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class FilterOptions  implements java.io.Serializable {
    private java.lang.Integer applicationID;

    private java.lang.String documentFilter;

    private com.cleverdome.api.DocumentFilter documentVaultType;

    private java.util.Calendar fromTime;

    private com.cleverdome.api.DocumentMetadataValueBase[] metadataValues;

    private java.lang.String searchTerm;

    private int[] searchedFieldTypeIDs;

    private java.lang.Integer templateID;

    private java.lang.Integer typeID;

    public FilterOptions() {
    }

    public FilterOptions(
           java.lang.Integer applicationID,
           java.lang.String documentFilter,
           com.cleverdome.api.DocumentFilter documentVaultType,
           java.util.Calendar fromTime,
           com.cleverdome.api.DocumentMetadataValueBase[] metadataValues,
           java.lang.String searchTerm,
           int[] searchedFieldTypeIDs,
           java.lang.Integer templateID,
           java.lang.Integer typeID) {
           this.applicationID = applicationID;
           this.documentFilter = documentFilter;
           this.documentVaultType = documentVaultType;
           this.fromTime = fromTime;
           this.metadataValues = metadataValues;
           this.searchTerm = searchTerm;
           this.searchedFieldTypeIDs = searchedFieldTypeIDs;
           this.templateID = templateID;
           this.typeID = typeID;
    }


    /**
     * Gets the applicationID value for this FilterOptions.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this FilterOptions.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the documentFilter value for this FilterOptions.
     * 
     * @return documentFilter
     */
    public java.lang.String getDocumentFilter() {
        return documentFilter;
    }


    /**
     * Sets the documentFilter value for this FilterOptions.
     * 
     * @param documentFilter
     */
    public void setDocumentFilter(java.lang.String documentFilter) {
        this.documentFilter = documentFilter;
    }


    /**
     * Gets the documentVaultType value for this FilterOptions.
     * 
     * @return documentVaultType
     */
    public com.cleverdome.api.DocumentFilter getDocumentVaultType() {
        return documentVaultType;
    }


    /**
     * Sets the documentVaultType value for this FilterOptions.
     * 
     * @param documentVaultType
     */
    public void setDocumentVaultType(com.cleverdome.api.DocumentFilter documentVaultType) {
        this.documentVaultType = documentVaultType;
    }


    /**
     * Gets the fromTime value for this FilterOptions.
     * 
     * @return fromTime
     */
    public java.util.Calendar getFromTime() {
        return fromTime;
    }


    /**
     * Sets the fromTime value for this FilterOptions.
     * 
     * @param fromTime
     */
    public void setFromTime(java.util.Calendar fromTime) {
        this.fromTime = fromTime;
    }


    /**
     * Gets the metadataValues value for this FilterOptions.
     * 
     * @return metadataValues
     */
    public com.cleverdome.api.DocumentMetadataValueBase[] getMetadataValues() {
        return metadataValues;
    }


    /**
     * Sets the metadataValues value for this FilterOptions.
     * 
     * @param metadataValues
     */
    public void setMetadataValues(com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) {
        this.metadataValues = metadataValues;
    }


    /**
     * Gets the searchTerm value for this FilterOptions.
     * 
     * @return searchTerm
     */
    public java.lang.String getSearchTerm() {
        return searchTerm;
    }


    /**
     * Sets the searchTerm value for this FilterOptions.
     * 
     * @param searchTerm
     */
    public void setSearchTerm(java.lang.String searchTerm) {
        this.searchTerm = searchTerm;
    }


    /**
     * Gets the searchedFieldTypeIDs value for this FilterOptions.
     * 
     * @return searchedFieldTypeIDs
     */
    public int[] getSearchedFieldTypeIDs() {
        return searchedFieldTypeIDs;
    }


    /**
     * Sets the searchedFieldTypeIDs value for this FilterOptions.
     * 
     * @param searchedFieldTypeIDs
     */
    public void setSearchedFieldTypeIDs(int[] searchedFieldTypeIDs) {
        this.searchedFieldTypeIDs = searchedFieldTypeIDs;
    }


    /**
     * Gets the templateID value for this FilterOptions.
     * 
     * @return templateID
     */
    public java.lang.Integer getTemplateID() {
        return templateID;
    }


    /**
     * Sets the templateID value for this FilterOptions.
     * 
     * @param templateID
     */
    public void setTemplateID(java.lang.Integer templateID) {
        this.templateID = templateID;
    }


    /**
     * Gets the typeID value for this FilterOptions.
     * 
     * @return typeID
     */
    public java.lang.Integer getTypeID() {
        return typeID;
    }


    /**
     * Sets the typeID value for this FilterOptions.
     * 
     * @param typeID
     */
    public void setTypeID(java.lang.Integer typeID) {
        this.typeID = typeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterOptions)) return false;
        FilterOptions other = (FilterOptions) obj;
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
            ((this.documentFilter==null && other.getDocumentFilter()==null) || 
             (this.documentFilter!=null &&
              this.documentFilter.equals(other.getDocumentFilter()))) &&
            ((this.documentVaultType==null && other.getDocumentVaultType()==null) || 
             (this.documentVaultType!=null &&
              this.documentVaultType.equals(other.getDocumentVaultType()))) &&
            ((this.fromTime==null && other.getFromTime()==null) || 
             (this.fromTime!=null &&
              this.fromTime.equals(other.getFromTime()))) &&
            ((this.metadataValues==null && other.getMetadataValues()==null) || 
             (this.metadataValues!=null &&
              java.util.Arrays.equals(this.metadataValues, other.getMetadataValues()))) &&
            ((this.searchTerm==null && other.getSearchTerm()==null) || 
             (this.searchTerm!=null &&
              this.searchTerm.equals(other.getSearchTerm()))) &&
            ((this.searchedFieldTypeIDs==null && other.getSearchedFieldTypeIDs()==null) || 
             (this.searchedFieldTypeIDs!=null &&
              java.util.Arrays.equals(this.searchedFieldTypeIDs, other.getSearchedFieldTypeIDs()))) &&
            ((this.templateID==null && other.getTemplateID()==null) || 
             (this.templateID!=null &&
              this.templateID.equals(other.getTemplateID()))) &&
            ((this.typeID==null && other.getTypeID()==null) || 
             (this.typeID!=null &&
              this.typeID.equals(other.getTypeID())));
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
        if (getDocumentFilter() != null) {
            _hashCode += getDocumentFilter().hashCode();
        }
        if (getDocumentVaultType() != null) {
            _hashCode += getDocumentVaultType().hashCode();
        }
        if (getFromTime() != null) {
            _hashCode += getFromTime().hashCode();
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
        if (getSearchTerm() != null) {
            _hashCode += getSearchTerm().hashCode();
        }
        if (getSearchedFieldTypeIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchedFieldTypeIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchedFieldTypeIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemplateID() != null) {
            _hashCode += getTemplateID().hashCode();
        }
        if (getTypeID() != null) {
            _hashCode += getTypeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "FilterOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "ApplicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "DocumentFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentVaultType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "DocumentVaultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.Enums", "DocumentFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "FromTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "MetadataValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "SearchTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchedFieldTypeIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "SearchedFieldTypeIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "TemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "TypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
