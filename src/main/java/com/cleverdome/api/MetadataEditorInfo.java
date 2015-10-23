/**
 * MetadataEditorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class MetadataEditorInfo  implements java.io.Serializable {
    private java.lang.Integer valueEditorType;

    private com.cleverdome.api.MetadataEditorInfoValueOption[] valueOptions;

    public MetadataEditorInfo() {
    }

    public MetadataEditorInfo(
           java.lang.Integer valueEditorType,
           com.cleverdome.api.MetadataEditorInfoValueOption[] valueOptions) {
           this.valueEditorType = valueEditorType;
           this.valueOptions = valueOptions;
    }


    /**
     * Gets the valueEditorType value for this MetadataEditorInfo.
     * 
     * @return valueEditorType
     */
    public java.lang.Integer getValueEditorType() {
        return valueEditorType;
    }


    /**
     * Sets the valueEditorType value for this MetadataEditorInfo.
     * 
     * @param valueEditorType
     */
    public void setValueEditorType(java.lang.Integer valueEditorType) {
        this.valueEditorType = valueEditorType;
    }


    /**
     * Gets the valueOptions value for this MetadataEditorInfo.
     * 
     * @return valueOptions
     */
    public com.cleverdome.api.MetadataEditorInfoValueOption[] getValueOptions() {
        return valueOptions;
    }


    /**
     * Sets the valueOptions value for this MetadataEditorInfo.
     * 
     * @param valueOptions
     */
    public void setValueOptions(com.cleverdome.api.MetadataEditorInfoValueOption[] valueOptions) {
        this.valueOptions = valueOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetadataEditorInfo)) return false;
        MetadataEditorInfo other = (MetadataEditorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valueEditorType==null && other.getValueEditorType()==null) || 
             (this.valueEditorType!=null &&
              this.valueEditorType.equals(other.getValueEditorType()))) &&
            ((this.valueOptions==null && other.getValueOptions()==null) || 
             (this.valueOptions!=null &&
              java.util.Arrays.equals(this.valueOptions, other.getValueOptions())));
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
        if (getValueEditorType() != null) {
            _hashCode += getValueEditorType().hashCode();
        }
        if (getValueOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueOptions(), i);
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
        new org.apache.axis.description.TypeDesc(MetadataEditorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "MetadataEditorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueEditorType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ValueEditorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ValueOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "MetadataEditorInfo.ValueOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "MetadataEditorInfo.ValueOption"));
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
