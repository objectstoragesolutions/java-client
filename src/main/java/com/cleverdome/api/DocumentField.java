/**
 * DocumentField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentField  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.Integer integration;

    private java.lang.String intergationName;

    private java.lang.Boolean isBaseSystemType;

    private java.lang.Boolean isMultiIndexAllowed;

    private java.lang.String keyProperty;

    private java.lang.String name;

    private java.lang.Integer parentFieldTypeID;

    private java.lang.String parentFieldTypeProperty;

    private java.lang.Boolean required;

    private java.lang.String valueType;

    public DocumentField() {
    }

    public DocumentField(
           java.lang.Integer ID,
           java.lang.Integer integration,
           java.lang.String intergationName,
           java.lang.Boolean isBaseSystemType,
           java.lang.Boolean isMultiIndexAllowed,
           java.lang.String keyProperty,
           java.lang.String name,
           java.lang.Integer parentFieldTypeID,
           java.lang.String parentFieldTypeProperty,
           java.lang.Boolean required,
           java.lang.String valueType) {
           this.ID = ID;
           this.integration = integration;
           this.intergationName = intergationName;
           this.isBaseSystemType = isBaseSystemType;
           this.isMultiIndexAllowed = isMultiIndexAllowed;
           this.keyProperty = keyProperty;
           this.name = name;
           this.parentFieldTypeID = parentFieldTypeID;
           this.parentFieldTypeProperty = parentFieldTypeProperty;
           this.required = required;
           this.valueType = valueType;
    }


    /**
     * Gets the ID value for this DocumentField.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DocumentField.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the integration value for this DocumentField.
     * 
     * @return integration
     */
    public java.lang.Integer getIntegration() {
        return integration;
    }


    /**
     * Sets the integration value for this DocumentField.
     * 
     * @param integration
     */
    public void setIntegration(java.lang.Integer integration) {
        this.integration = integration;
    }


    /**
     * Gets the intergationName value for this DocumentField.
     * 
     * @return intergationName
     */
    public java.lang.String getIntergationName() {
        return intergationName;
    }


    /**
     * Sets the intergationName value for this DocumentField.
     * 
     * @param intergationName
     */
    public void setIntergationName(java.lang.String intergationName) {
        this.intergationName = intergationName;
    }


    /**
     * Gets the isBaseSystemType value for this DocumentField.
     * 
     * @return isBaseSystemType
     */
    public java.lang.Boolean getIsBaseSystemType() {
        return isBaseSystemType;
    }


    /**
     * Sets the isBaseSystemType value for this DocumentField.
     * 
     * @param isBaseSystemType
     */
    public void setIsBaseSystemType(java.lang.Boolean isBaseSystemType) {
        this.isBaseSystemType = isBaseSystemType;
    }


    /**
     * Gets the isMultiIndexAllowed value for this DocumentField.
     * 
     * @return isMultiIndexAllowed
     */
    public java.lang.Boolean getIsMultiIndexAllowed() {
        return isMultiIndexAllowed;
    }


    /**
     * Sets the isMultiIndexAllowed value for this DocumentField.
     * 
     * @param isMultiIndexAllowed
     */
    public void setIsMultiIndexAllowed(java.lang.Boolean isMultiIndexAllowed) {
        this.isMultiIndexAllowed = isMultiIndexAllowed;
    }


    /**
     * Gets the keyProperty value for this DocumentField.
     * 
     * @return keyProperty
     */
    public java.lang.String getKeyProperty() {
        return keyProperty;
    }


    /**
     * Sets the keyProperty value for this DocumentField.
     * 
     * @param keyProperty
     */
    public void setKeyProperty(java.lang.String keyProperty) {
        this.keyProperty = keyProperty;
    }


    /**
     * Gets the name value for this DocumentField.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentField.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parentFieldTypeID value for this DocumentField.
     * 
     * @return parentFieldTypeID
     */
    public java.lang.Integer getParentFieldTypeID() {
        return parentFieldTypeID;
    }


    /**
     * Sets the parentFieldTypeID value for this DocumentField.
     * 
     * @param parentFieldTypeID
     */
    public void setParentFieldTypeID(java.lang.Integer parentFieldTypeID) {
        this.parentFieldTypeID = parentFieldTypeID;
    }


    /**
     * Gets the parentFieldTypeProperty value for this DocumentField.
     * 
     * @return parentFieldTypeProperty
     */
    public java.lang.String getParentFieldTypeProperty() {
        return parentFieldTypeProperty;
    }


    /**
     * Sets the parentFieldTypeProperty value for this DocumentField.
     * 
     * @param parentFieldTypeProperty
     */
    public void setParentFieldTypeProperty(java.lang.String parentFieldTypeProperty) {
        this.parentFieldTypeProperty = parentFieldTypeProperty;
    }


    /**
     * Gets the required value for this DocumentField.
     * 
     * @return required
     */
    public java.lang.Boolean getRequired() {
        return required;
    }


    /**
     * Sets the required value for this DocumentField.
     * 
     * @param required
     */
    public void setRequired(java.lang.Boolean required) {
        this.required = required;
    }


    /**
     * Gets the valueType value for this DocumentField.
     * 
     * @return valueType
     */
    public java.lang.String getValueType() {
        return valueType;
    }


    /**
     * Sets the valueType value for this DocumentField.
     * 
     * @param valueType
     */
    public void setValueType(java.lang.String valueType) {
        this.valueType = valueType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentField)) return false;
        DocumentField other = (DocumentField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.integration==null && other.getIntegration()==null) || 
             (this.integration!=null &&
              this.integration.equals(other.getIntegration()))) &&
            ((this.intergationName==null && other.getIntergationName()==null) || 
             (this.intergationName!=null &&
              this.intergationName.equals(other.getIntergationName()))) &&
            ((this.isBaseSystemType==null && other.getIsBaseSystemType()==null) || 
             (this.isBaseSystemType!=null &&
              this.isBaseSystemType.equals(other.getIsBaseSystemType()))) &&
            ((this.isMultiIndexAllowed==null && other.getIsMultiIndexAllowed()==null) || 
             (this.isMultiIndexAllowed!=null &&
              this.isMultiIndexAllowed.equals(other.getIsMultiIndexAllowed()))) &&
            ((this.keyProperty==null && other.getKeyProperty()==null) || 
             (this.keyProperty!=null &&
              this.keyProperty.equals(other.getKeyProperty()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parentFieldTypeID==null && other.getParentFieldTypeID()==null) || 
             (this.parentFieldTypeID!=null &&
              this.parentFieldTypeID.equals(other.getParentFieldTypeID()))) &&
            ((this.parentFieldTypeProperty==null && other.getParentFieldTypeProperty()==null) || 
             (this.parentFieldTypeProperty!=null &&
              this.parentFieldTypeProperty.equals(other.getParentFieldTypeProperty()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.valueType==null && other.getValueType()==null) || 
             (this.valueType!=null &&
              this.valueType.equals(other.getValueType())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIntegration() != null) {
            _hashCode += getIntegration().hashCode();
        }
        if (getIntergationName() != null) {
            _hashCode += getIntergationName().hashCode();
        }
        if (getIsBaseSystemType() != null) {
            _hashCode += getIsBaseSystemType().hashCode();
        }
        if (getIsMultiIndexAllowed() != null) {
            _hashCode += getIsMultiIndexAllowed().hashCode();
        }
        if (getKeyProperty() != null) {
            _hashCode += getKeyProperty().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParentFieldTypeID() != null) {
            _hashCode += getParentFieldTypeID().hashCode();
        }
        if (getParentFieldTypeProperty() != null) {
            _hashCode += getParentFieldTypeProperty().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getValueType() != null) {
            _hashCode += getValueType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Integration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intergationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "IntergationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBaseSystemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "IsBaseSystemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultiIndexAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "IsMultiIndexAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "KeyProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentFieldTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ParentFieldTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentFieldTypeProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ParentFieldTypeProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ValueType"));
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
