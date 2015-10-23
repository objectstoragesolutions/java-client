/**
 * DocumentMetadataValueBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentMetadataValueBase  implements java.io.Serializable {
    private java.lang.String fieldDataType;

    private java.lang.Integer fieldID;

    private java.lang.String fieldName;

    private java.lang.String fieldValue;

    private java.lang.Integer fieldValueID;

    public DocumentMetadataValueBase() {
    }

    public DocumentMetadataValueBase(
           java.lang.String fieldDataType,
           java.lang.Integer fieldID,
           java.lang.String fieldName,
           java.lang.String fieldValue,
           java.lang.Integer fieldValueID) {
           this.fieldDataType = fieldDataType;
           this.fieldID = fieldID;
           this.fieldName = fieldName;
           this.fieldValue = fieldValue;
           this.fieldValueID = fieldValueID;
    }


    /**
     * Gets the fieldDataType value for this DocumentMetadataValueBase.
     * 
     * @return fieldDataType
     */
    public java.lang.String getFieldDataType() {
        return fieldDataType;
    }


    /**
     * Sets the fieldDataType value for this DocumentMetadataValueBase.
     * 
     * @param fieldDataType
     */
    public void setFieldDataType(java.lang.String fieldDataType) {
        this.fieldDataType = fieldDataType;
    }


    /**
     * Gets the fieldID value for this DocumentMetadataValueBase.
     * 
     * @return fieldID
     */
    public java.lang.Integer getFieldID() {
        return fieldID;
    }


    /**
     * Sets the fieldID value for this DocumentMetadataValueBase.
     * 
     * @param fieldID
     */
    public void setFieldID(java.lang.Integer fieldID) {
        this.fieldID = fieldID;
    }


    /**
     * Gets the fieldName value for this DocumentMetadataValueBase.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this DocumentMetadataValueBase.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the fieldValue value for this DocumentMetadataValueBase.
     * 
     * @return fieldValue
     */
    public java.lang.String getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this DocumentMetadataValueBase.
     * 
     * @param fieldValue
     */
    public void setFieldValue(java.lang.String fieldValue) {
        this.fieldValue = fieldValue;
    }


    /**
     * Gets the fieldValueID value for this DocumentMetadataValueBase.
     * 
     * @return fieldValueID
     */
    public java.lang.Integer getFieldValueID() {
        return fieldValueID;
    }


    /**
     * Sets the fieldValueID value for this DocumentMetadataValueBase.
     * 
     * @param fieldValueID
     */
    public void setFieldValueID(java.lang.Integer fieldValueID) {
        this.fieldValueID = fieldValueID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentMetadataValueBase)) return false;
        DocumentMetadataValueBase other = (DocumentMetadataValueBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldDataType==null && other.getFieldDataType()==null) || 
             (this.fieldDataType!=null &&
              this.fieldDataType.equals(other.getFieldDataType()))) &&
            ((this.fieldID==null && other.getFieldID()==null) || 
             (this.fieldID!=null &&
              this.fieldID.equals(other.getFieldID()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              this.fieldValue.equals(other.getFieldValue()))) &&
            ((this.fieldValueID==null && other.getFieldValueID()==null) || 
             (this.fieldValueID!=null &&
              this.fieldValueID.equals(other.getFieldValueID())));
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
        if (getFieldDataType() != null) {
            _hashCode += getFieldDataType().hashCode();
        }
        if (getFieldID() != null) {
            _hashCode += getFieldID().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getFieldValue() != null) {
            _hashCode += getFieldValue().hashCode();
        }
        if (getFieldValueID() != null) {
            _hashCode += getFieldValueID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentMetadataValueBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FieldDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FieldID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValueID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FieldValueID"));
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
