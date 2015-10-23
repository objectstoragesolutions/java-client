/**
 * AddDocumentSelectionStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddDocumentSelectionStatistics  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.Integer applicationID;

    private java.lang.String documentGuid;

    private com.cleverdome.api.DocumentMetadataValueBase[] metadataValues;

    private java.lang.Boolean previewedOnly;

    public AddDocumentSelectionStatistics() {
    }

    public AddDocumentSelectionStatistics(
           java.lang.String sessionID,
           java.lang.Integer applicationID,
           java.lang.String documentGuid,
           com.cleverdome.api.DocumentMetadataValueBase[] metadataValues,
           java.lang.Boolean previewedOnly) {
           this.sessionID = sessionID;
           this.applicationID = applicationID;
           this.documentGuid = documentGuid;
           this.metadataValues = metadataValues;
           this.previewedOnly = previewedOnly;
    }


    /**
     * Gets the sessionID value for this AddDocumentSelectionStatistics.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this AddDocumentSelectionStatistics.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the applicationID value for this AddDocumentSelectionStatistics.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this AddDocumentSelectionStatistics.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the documentGuid value for this AddDocumentSelectionStatistics.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this AddDocumentSelectionStatistics.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the metadataValues value for this AddDocumentSelectionStatistics.
     * 
     * @return metadataValues
     */
    public com.cleverdome.api.DocumentMetadataValueBase[] getMetadataValues() {
        return metadataValues;
    }


    /**
     * Sets the metadataValues value for this AddDocumentSelectionStatistics.
     * 
     * @param metadataValues
     */
    public void setMetadataValues(com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) {
        this.metadataValues = metadataValues;
    }


    /**
     * Gets the previewedOnly value for this AddDocumentSelectionStatistics.
     * 
     * @return previewedOnly
     */
    public java.lang.Boolean getPreviewedOnly() {
        return previewedOnly;
    }


    /**
     * Sets the previewedOnly value for this AddDocumentSelectionStatistics.
     * 
     * @param previewedOnly
     */
    public void setPreviewedOnly(java.lang.Boolean previewedOnly) {
        this.previewedOnly = previewedOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddDocumentSelectionStatistics)) return false;
        AddDocumentSelectionStatistics other = (AddDocumentSelectionStatistics) obj;
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
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.documentGuid==null && other.getDocumentGuid()==null) || 
             (this.documentGuid!=null &&
              this.documentGuid.equals(other.getDocumentGuid()))) &&
            ((this.metadataValues==null && other.getMetadataValues()==null) || 
             (this.metadataValues!=null &&
              java.util.Arrays.equals(this.metadataValues, other.getMetadataValues()))) &&
            ((this.previewedOnly==null && other.getPreviewedOnly()==null) || 
             (this.previewedOnly!=null &&
              this.previewedOnly.equals(other.getPreviewedOnly())));
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
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getDocumentGuid() != null) {
            _hashCode += getDocumentGuid().hashCode();
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
        if (getPreviewedOnly() != null) {
            _hashCode += getPreviewedOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddDocumentSelectionStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddDocumentSelectionStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "applicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "metadataValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previewedOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "previewedOnly"));
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
