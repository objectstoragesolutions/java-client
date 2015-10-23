/**
 * DocumentMetadataValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentMetadataValue  extends com.cleverdome.api.DocumentMetadataValueBase  implements java.io.Serializable {
    private com.cleverdome.api.MetadataEditorInfo editorInfo;

    private com.cleverdome.api.RecordView fieldValueView;

    private java.lang.Boolean isRequired;

    public DocumentMetadataValue() {
    }

    public DocumentMetadataValue(
           java.lang.String fieldDataType,
           java.lang.Integer fieldID,
           java.lang.String fieldName,
           java.lang.String fieldValue,
           java.lang.Integer fieldValueID,
           com.cleverdome.api.MetadataEditorInfo editorInfo,
           com.cleverdome.api.RecordView fieldValueView,
           java.lang.Boolean isRequired) {
        super(
            fieldDataType,
            fieldID,
            fieldName,
            fieldValue,
            fieldValueID);
        this.editorInfo = editorInfo;
        this.fieldValueView = fieldValueView;
        this.isRequired = isRequired;
    }


    /**
     * Gets the editorInfo value for this DocumentMetadataValue.
     * 
     * @return editorInfo
     */
    public com.cleverdome.api.MetadataEditorInfo getEditorInfo() {
        return editorInfo;
    }


    /**
     * Sets the editorInfo value for this DocumentMetadataValue.
     * 
     * @param editorInfo
     */
    public void setEditorInfo(com.cleverdome.api.MetadataEditorInfo editorInfo) {
        this.editorInfo = editorInfo;
    }


    /**
     * Gets the fieldValueView value for this DocumentMetadataValue.
     * 
     * @return fieldValueView
     */
    public com.cleverdome.api.RecordView getFieldValueView() {
        return fieldValueView;
    }


    /**
     * Sets the fieldValueView value for this DocumentMetadataValue.
     * 
     * @param fieldValueView
     */
    public void setFieldValueView(com.cleverdome.api.RecordView fieldValueView) {
        this.fieldValueView = fieldValueView;
    }


    /**
     * Gets the isRequired value for this DocumentMetadataValue.
     * 
     * @return isRequired
     */
    public java.lang.Boolean getIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this DocumentMetadataValue.
     * 
     * @param isRequired
     */
    public void setIsRequired(java.lang.Boolean isRequired) {
        this.isRequired = isRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentMetadataValue)) return false;
        DocumentMetadataValue other = (DocumentMetadataValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.editorInfo==null && other.getEditorInfo()==null) || 
             (this.editorInfo!=null &&
              this.editorInfo.equals(other.getEditorInfo()))) &&
            ((this.fieldValueView==null && other.getFieldValueView()==null) || 
             (this.fieldValueView!=null &&
              this.fieldValueView.equals(other.getFieldValueView()))) &&
            ((this.isRequired==null && other.getIsRequired()==null) || 
             (this.isRequired!=null &&
              this.isRequired.equals(other.getIsRequired())));
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
        if (getEditorInfo() != null) {
            _hashCode += getEditorInfo().hashCode();
        }
        if (getFieldValueView() != null) {
            _hashCode += getFieldValueView().hashCode();
        }
        if (getIsRequired() != null) {
            _hashCode += getIsRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentMetadataValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "EditorInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "MetadataEditorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValueView");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FieldValueView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RecordView"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "IsRequired"));
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
