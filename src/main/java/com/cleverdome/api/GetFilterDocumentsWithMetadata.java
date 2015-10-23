/**
 * GetFilterDocumentsWithMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetFilterDocumentsWithMetadata  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.Integer templateID;

    private java.lang.Integer documentTypeID;

    private java.lang.Integer applicationID;

    private com.cleverdome.api.FieldValue[][] fieldValueGroups;

    public GetFilterDocumentsWithMetadata() {
    }

    public GetFilterDocumentsWithMetadata(
           java.lang.String sessionID,
           java.lang.Integer templateID,
           java.lang.Integer documentTypeID,
           java.lang.Integer applicationID,
           com.cleverdome.api.FieldValue[][] fieldValueGroups) {
           this.sessionID = sessionID;
           this.templateID = templateID;
           this.documentTypeID = documentTypeID;
           this.applicationID = applicationID;
           this.fieldValueGroups = fieldValueGroups;
    }


    /**
     * Gets the sessionID value for this GetFilterDocumentsWithMetadata.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetFilterDocumentsWithMetadata.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the templateID value for this GetFilterDocumentsWithMetadata.
     * 
     * @return templateID
     */
    public java.lang.Integer getTemplateID() {
        return templateID;
    }


    /**
     * Sets the templateID value for this GetFilterDocumentsWithMetadata.
     * 
     * @param templateID
     */
    public void setTemplateID(java.lang.Integer templateID) {
        this.templateID = templateID;
    }


    /**
     * Gets the documentTypeID value for this GetFilterDocumentsWithMetadata.
     * 
     * @return documentTypeID
     */
    public java.lang.Integer getDocumentTypeID() {
        return documentTypeID;
    }


    /**
     * Sets the documentTypeID value for this GetFilterDocumentsWithMetadata.
     * 
     * @param documentTypeID
     */
    public void setDocumentTypeID(java.lang.Integer documentTypeID) {
        this.documentTypeID = documentTypeID;
    }


    /**
     * Gets the applicationID value for this GetFilterDocumentsWithMetadata.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this GetFilterDocumentsWithMetadata.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the fieldValueGroups value for this GetFilterDocumentsWithMetadata.
     * 
     * @return fieldValueGroups
     */
    public com.cleverdome.api.FieldValue[][] getFieldValueGroups() {
        return fieldValueGroups;
    }


    /**
     * Sets the fieldValueGroups value for this GetFilterDocumentsWithMetadata.
     * 
     * @param fieldValueGroups
     */
    public void setFieldValueGroups(com.cleverdome.api.FieldValue[][] fieldValueGroups) {
        this.fieldValueGroups = fieldValueGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFilterDocumentsWithMetadata)) return false;
        GetFilterDocumentsWithMetadata other = (GetFilterDocumentsWithMetadata) obj;
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
            ((this.templateID==null && other.getTemplateID()==null) || 
             (this.templateID!=null &&
              this.templateID.equals(other.getTemplateID()))) &&
            ((this.documentTypeID==null && other.getDocumentTypeID()==null) || 
             (this.documentTypeID!=null &&
              this.documentTypeID.equals(other.getDocumentTypeID()))) &&
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.fieldValueGroups==null && other.getFieldValueGroups()==null) || 
             (this.fieldValueGroups!=null &&
              java.util.Arrays.equals(this.fieldValueGroups, other.getFieldValueGroups())));
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
        if (getTemplateID() != null) {
            _hashCode += getTemplateID().hashCode();
        }
        if (getDocumentTypeID() != null) {
            _hashCode += getDocumentTypeID().hashCode();
        }
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getFieldValueGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldValueGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldValueGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFilterDocumentsWithMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFilterDocumentsWithMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "templateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "applicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValueGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fieldValueGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ArrayOfFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ArrayOfFieldValue"));
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
