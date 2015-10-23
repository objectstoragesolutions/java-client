/**
 * GetDocumentsByMetadataValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentsByMetadataValue  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.Integer applicationID;

    private java.lang.Integer documentTypeID;

    private java.lang.Integer fieldType;

    private java.lang.String fieldValue;

    private java.lang.Integer limit;

    private int[] requiredEvents;

    public GetDocumentsByMetadataValue() {
    }

    public GetDocumentsByMetadataValue(
           java.lang.String sessionID,
           java.lang.Integer applicationID,
           java.lang.Integer documentTypeID,
           java.lang.Integer fieldType,
           java.lang.String fieldValue,
           java.lang.Integer limit,
           int[] requiredEvents) {
           this.sessionID = sessionID;
           this.applicationID = applicationID;
           this.documentTypeID = documentTypeID;
           this.fieldType = fieldType;
           this.fieldValue = fieldValue;
           this.limit = limit;
           this.requiredEvents = requiredEvents;
    }


    /**
     * Gets the sessionID value for this GetDocumentsByMetadataValue.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetDocumentsByMetadataValue.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the applicationID value for this GetDocumentsByMetadataValue.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this GetDocumentsByMetadataValue.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the documentTypeID value for this GetDocumentsByMetadataValue.
     * 
     * @return documentTypeID
     */
    public java.lang.Integer getDocumentTypeID() {
        return documentTypeID;
    }


    /**
     * Sets the documentTypeID value for this GetDocumentsByMetadataValue.
     * 
     * @param documentTypeID
     */
    public void setDocumentTypeID(java.lang.Integer documentTypeID) {
        this.documentTypeID = documentTypeID;
    }


    /**
     * Gets the fieldType value for this GetDocumentsByMetadataValue.
     * 
     * @return fieldType
     */
    public java.lang.Integer getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this GetDocumentsByMetadataValue.
     * 
     * @param fieldType
     */
    public void setFieldType(java.lang.Integer fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the fieldValue value for this GetDocumentsByMetadataValue.
     * 
     * @return fieldValue
     */
    public java.lang.String getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this GetDocumentsByMetadataValue.
     * 
     * @param fieldValue
     */
    public void setFieldValue(java.lang.String fieldValue) {
        this.fieldValue = fieldValue;
    }


    /**
     * Gets the limit value for this GetDocumentsByMetadataValue.
     * 
     * @return limit
     */
    public java.lang.Integer getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this GetDocumentsByMetadataValue.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Integer limit) {
        this.limit = limit;
    }


    /**
     * Gets the requiredEvents value for this GetDocumentsByMetadataValue.
     * 
     * @return requiredEvents
     */
    public int[] getRequiredEvents() {
        return requiredEvents;
    }


    /**
     * Sets the requiredEvents value for this GetDocumentsByMetadataValue.
     * 
     * @param requiredEvents
     */
    public void setRequiredEvents(int[] requiredEvents) {
        this.requiredEvents = requiredEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsByMetadataValue)) return false;
        GetDocumentsByMetadataValue other = (GetDocumentsByMetadataValue) obj;
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
            ((this.documentTypeID==null && other.getDocumentTypeID()==null) || 
             (this.documentTypeID!=null &&
              this.documentTypeID.equals(other.getDocumentTypeID()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              this.fieldValue.equals(other.getFieldValue()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.requiredEvents==null && other.getRequiredEvents()==null) || 
             (this.requiredEvents!=null &&
              java.util.Arrays.equals(this.requiredEvents, other.getRequiredEvents())));
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
        if (getDocumentTypeID() != null) {
            _hashCode += getDocumentTypeID().hashCode();
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getFieldValue() != null) {
            _hashCode += getFieldValue().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getRequiredEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequiredEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequiredEvents(), i);
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
        new org.apache.axis.description.TypeDesc(GetDocumentsByMetadataValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsByMetadataValue"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "requiredEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
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
