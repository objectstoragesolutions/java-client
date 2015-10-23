/**
 * SearchDocumentMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SearchDocumentMetadata  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String searchTerm;

    private java.lang.Boolean searchTagsOnly;

    private com.cleverdome.api.DocumentMetadataValueBase[] requiredValues;

    private java.lang.Integer applicationID;

    private java.lang.Integer templateID;

    private java.lang.Integer typeID;

    private java.lang.String documentFilter;

    public SearchDocumentMetadata() {
    }

    public SearchDocumentMetadata(
           java.lang.String sessionID,
           java.lang.String searchTerm,
           java.lang.Boolean searchTagsOnly,
           com.cleverdome.api.DocumentMetadataValueBase[] requiredValues,
           java.lang.Integer applicationID,
           java.lang.Integer templateID,
           java.lang.Integer typeID,
           java.lang.String documentFilter) {
           this.sessionID = sessionID;
           this.searchTerm = searchTerm;
           this.searchTagsOnly = searchTagsOnly;
           this.requiredValues = requiredValues;
           this.applicationID = applicationID;
           this.templateID = templateID;
           this.typeID = typeID;
           this.documentFilter = documentFilter;
    }


    /**
     * Gets the sessionID value for this SearchDocumentMetadata.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this SearchDocumentMetadata.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the searchTerm value for this SearchDocumentMetadata.
     * 
     * @return searchTerm
     */
    public java.lang.String getSearchTerm() {
        return searchTerm;
    }


    /**
     * Sets the searchTerm value for this SearchDocumentMetadata.
     * 
     * @param searchTerm
     */
    public void setSearchTerm(java.lang.String searchTerm) {
        this.searchTerm = searchTerm;
    }


    /**
     * Gets the searchTagsOnly value for this SearchDocumentMetadata.
     * 
     * @return searchTagsOnly
     */
    public java.lang.Boolean getSearchTagsOnly() {
        return searchTagsOnly;
    }


    /**
     * Sets the searchTagsOnly value for this SearchDocumentMetadata.
     * 
     * @param searchTagsOnly
     */
    public void setSearchTagsOnly(java.lang.Boolean searchTagsOnly) {
        this.searchTagsOnly = searchTagsOnly;
    }


    /**
     * Gets the requiredValues value for this SearchDocumentMetadata.
     * 
     * @return requiredValues
     */
    public com.cleverdome.api.DocumentMetadataValueBase[] getRequiredValues() {
        return requiredValues;
    }


    /**
     * Sets the requiredValues value for this SearchDocumentMetadata.
     * 
     * @param requiredValues
     */
    public void setRequiredValues(com.cleverdome.api.DocumentMetadataValueBase[] requiredValues) {
        this.requiredValues = requiredValues;
    }


    /**
     * Gets the applicationID value for this SearchDocumentMetadata.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this SearchDocumentMetadata.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the templateID value for this SearchDocumentMetadata.
     * 
     * @return templateID
     */
    public java.lang.Integer getTemplateID() {
        return templateID;
    }


    /**
     * Sets the templateID value for this SearchDocumentMetadata.
     * 
     * @param templateID
     */
    public void setTemplateID(java.lang.Integer templateID) {
        this.templateID = templateID;
    }


    /**
     * Gets the typeID value for this SearchDocumentMetadata.
     * 
     * @return typeID
     */
    public java.lang.Integer getTypeID() {
        return typeID;
    }


    /**
     * Sets the typeID value for this SearchDocumentMetadata.
     * 
     * @param typeID
     */
    public void setTypeID(java.lang.Integer typeID) {
        this.typeID = typeID;
    }


    /**
     * Gets the documentFilter value for this SearchDocumentMetadata.
     * 
     * @return documentFilter
     */
    public java.lang.String getDocumentFilter() {
        return documentFilter;
    }


    /**
     * Sets the documentFilter value for this SearchDocumentMetadata.
     * 
     * @param documentFilter
     */
    public void setDocumentFilter(java.lang.String documentFilter) {
        this.documentFilter = documentFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchDocumentMetadata)) return false;
        SearchDocumentMetadata other = (SearchDocumentMetadata) obj;
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
            ((this.searchTerm==null && other.getSearchTerm()==null) || 
             (this.searchTerm!=null &&
              this.searchTerm.equals(other.getSearchTerm()))) &&
            ((this.searchTagsOnly==null && other.getSearchTagsOnly()==null) || 
             (this.searchTagsOnly!=null &&
              this.searchTagsOnly.equals(other.getSearchTagsOnly()))) &&
            ((this.requiredValues==null && other.getRequiredValues()==null) || 
             (this.requiredValues!=null &&
              java.util.Arrays.equals(this.requiredValues, other.getRequiredValues()))) &&
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.templateID==null && other.getTemplateID()==null) || 
             (this.templateID!=null &&
              this.templateID.equals(other.getTemplateID()))) &&
            ((this.typeID==null && other.getTypeID()==null) || 
             (this.typeID!=null &&
              this.typeID.equals(other.getTypeID()))) &&
            ((this.documentFilter==null && other.getDocumentFilter()==null) || 
             (this.documentFilter!=null &&
              this.documentFilter.equals(other.getDocumentFilter())));
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
        if (getSearchTerm() != null) {
            _hashCode += getSearchTerm().hashCode();
        }
        if (getSearchTagsOnly() != null) {
            _hashCode += getSearchTagsOnly().hashCode();
        }
        if (getRequiredValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequiredValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequiredValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getTemplateID() != null) {
            _hashCode += getTemplateID().hashCode();
        }
        if (getTypeID() != null) {
            _hashCode += getTypeID().hashCode();
        }
        if (getDocumentFilter() != null) {
            _hashCode += getDocumentFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchDocumentMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SearchDocumentMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "searchTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTagsOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "searchTagsOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "requiredValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "applicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "templateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "typeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentFilter"));
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
