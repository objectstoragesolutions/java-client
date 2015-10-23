/**
 * DocumentFieldDetailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentFieldDetailed  extends com.cleverdome.api.DocumentField  implements java.io.Serializable {
    private java.lang.String baseAssemblyName;

    private java.lang.Integer baseFieldDataTypeID;

    private java.lang.Boolean constructorRequiresUser;

    private java.lang.Boolean customConstructor;

    private java.lang.Boolean customConverter;

    private java.lang.Integer dataTypeID;

    private java.lang.Integer documentUIControlID;

    private java.lang.String extendedAssemblyName;

    public DocumentFieldDetailed() {
    }

    public DocumentFieldDetailed(
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
           java.lang.String valueType,
           java.lang.String baseAssemblyName,
           java.lang.Integer baseFieldDataTypeID,
           java.lang.Boolean constructorRequiresUser,
           java.lang.Boolean customConstructor,
           java.lang.Boolean customConverter,
           java.lang.Integer dataTypeID,
           java.lang.Integer documentUIControlID,
           java.lang.String extendedAssemblyName) {
        super(
            ID,
            integration,
            intergationName,
            isBaseSystemType,
            isMultiIndexAllowed,
            keyProperty,
            name,
            parentFieldTypeID,
            parentFieldTypeProperty,
            required,
            valueType);
        this.baseAssemblyName = baseAssemblyName;
        this.baseFieldDataTypeID = baseFieldDataTypeID;
        this.constructorRequiresUser = constructorRequiresUser;
        this.customConstructor = customConstructor;
        this.customConverter = customConverter;
        this.dataTypeID = dataTypeID;
        this.documentUIControlID = documentUIControlID;
        this.extendedAssemblyName = extendedAssemblyName;
    }


    /**
     * Gets the baseAssemblyName value for this DocumentFieldDetailed.
     * 
     * @return baseAssemblyName
     */
    public java.lang.String getBaseAssemblyName() {
        return baseAssemblyName;
    }


    /**
     * Sets the baseAssemblyName value for this DocumentFieldDetailed.
     * 
     * @param baseAssemblyName
     */
    public void setBaseAssemblyName(java.lang.String baseAssemblyName) {
        this.baseAssemblyName = baseAssemblyName;
    }


    /**
     * Gets the baseFieldDataTypeID value for this DocumentFieldDetailed.
     * 
     * @return baseFieldDataTypeID
     */
    public java.lang.Integer getBaseFieldDataTypeID() {
        return baseFieldDataTypeID;
    }


    /**
     * Sets the baseFieldDataTypeID value for this DocumentFieldDetailed.
     * 
     * @param baseFieldDataTypeID
     */
    public void setBaseFieldDataTypeID(java.lang.Integer baseFieldDataTypeID) {
        this.baseFieldDataTypeID = baseFieldDataTypeID;
    }


    /**
     * Gets the constructorRequiresUser value for this DocumentFieldDetailed.
     * 
     * @return constructorRequiresUser
     */
    public java.lang.Boolean getConstructorRequiresUser() {
        return constructorRequiresUser;
    }


    /**
     * Sets the constructorRequiresUser value for this DocumentFieldDetailed.
     * 
     * @param constructorRequiresUser
     */
    public void setConstructorRequiresUser(java.lang.Boolean constructorRequiresUser) {
        this.constructorRequiresUser = constructorRequiresUser;
    }


    /**
     * Gets the customConstructor value for this DocumentFieldDetailed.
     * 
     * @return customConstructor
     */
    public java.lang.Boolean getCustomConstructor() {
        return customConstructor;
    }


    /**
     * Sets the customConstructor value for this DocumentFieldDetailed.
     * 
     * @param customConstructor
     */
    public void setCustomConstructor(java.lang.Boolean customConstructor) {
        this.customConstructor = customConstructor;
    }


    /**
     * Gets the customConverter value for this DocumentFieldDetailed.
     * 
     * @return customConverter
     */
    public java.lang.Boolean getCustomConverter() {
        return customConverter;
    }


    /**
     * Sets the customConverter value for this DocumentFieldDetailed.
     * 
     * @param customConverter
     */
    public void setCustomConverter(java.lang.Boolean customConverter) {
        this.customConverter = customConverter;
    }


    /**
     * Gets the dataTypeID value for this DocumentFieldDetailed.
     * 
     * @return dataTypeID
     */
    public java.lang.Integer getDataTypeID() {
        return dataTypeID;
    }


    /**
     * Sets the dataTypeID value for this DocumentFieldDetailed.
     * 
     * @param dataTypeID
     */
    public void setDataTypeID(java.lang.Integer dataTypeID) {
        this.dataTypeID = dataTypeID;
    }


    /**
     * Gets the documentUIControlID value for this DocumentFieldDetailed.
     * 
     * @return documentUIControlID
     */
    public java.lang.Integer getDocumentUIControlID() {
        return documentUIControlID;
    }


    /**
     * Sets the documentUIControlID value for this DocumentFieldDetailed.
     * 
     * @param documentUIControlID
     */
    public void setDocumentUIControlID(java.lang.Integer documentUIControlID) {
        this.documentUIControlID = documentUIControlID;
    }


    /**
     * Gets the extendedAssemblyName value for this DocumentFieldDetailed.
     * 
     * @return extendedAssemblyName
     */
    public java.lang.String getExtendedAssemblyName() {
        return extendedAssemblyName;
    }


    /**
     * Sets the extendedAssemblyName value for this DocumentFieldDetailed.
     * 
     * @param extendedAssemblyName
     */
    public void setExtendedAssemblyName(java.lang.String extendedAssemblyName) {
        this.extendedAssemblyName = extendedAssemblyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentFieldDetailed)) return false;
        DocumentFieldDetailed other = (DocumentFieldDetailed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.baseAssemblyName==null && other.getBaseAssemblyName()==null) || 
             (this.baseAssemblyName!=null &&
              this.baseAssemblyName.equals(other.getBaseAssemblyName()))) &&
            ((this.baseFieldDataTypeID==null && other.getBaseFieldDataTypeID()==null) || 
             (this.baseFieldDataTypeID!=null &&
              this.baseFieldDataTypeID.equals(other.getBaseFieldDataTypeID()))) &&
            ((this.constructorRequiresUser==null && other.getConstructorRequiresUser()==null) || 
             (this.constructorRequiresUser!=null &&
              this.constructorRequiresUser.equals(other.getConstructorRequiresUser()))) &&
            ((this.customConstructor==null && other.getCustomConstructor()==null) || 
             (this.customConstructor!=null &&
              this.customConstructor.equals(other.getCustomConstructor()))) &&
            ((this.customConverter==null && other.getCustomConverter()==null) || 
             (this.customConverter!=null &&
              this.customConverter.equals(other.getCustomConverter()))) &&
            ((this.dataTypeID==null && other.getDataTypeID()==null) || 
             (this.dataTypeID!=null &&
              this.dataTypeID.equals(other.getDataTypeID()))) &&
            ((this.documentUIControlID==null && other.getDocumentUIControlID()==null) || 
             (this.documentUIControlID!=null &&
              this.documentUIControlID.equals(other.getDocumentUIControlID()))) &&
            ((this.extendedAssemblyName==null && other.getExtendedAssemblyName()==null) || 
             (this.extendedAssemblyName!=null &&
              this.extendedAssemblyName.equals(other.getExtendedAssemblyName())));
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
        if (getBaseAssemblyName() != null) {
            _hashCode += getBaseAssemblyName().hashCode();
        }
        if (getBaseFieldDataTypeID() != null) {
            _hashCode += getBaseFieldDataTypeID().hashCode();
        }
        if (getConstructorRequiresUser() != null) {
            _hashCode += getConstructorRequiresUser().hashCode();
        }
        if (getCustomConstructor() != null) {
            _hashCode += getCustomConstructor().hashCode();
        }
        if (getCustomConverter() != null) {
            _hashCode += getCustomConverter().hashCode();
        }
        if (getDataTypeID() != null) {
            _hashCode += getDataTypeID().hashCode();
        }
        if (getDocumentUIControlID() != null) {
            _hashCode += getDocumentUIControlID().hashCode();
        }
        if (getExtendedAssemblyName() != null) {
            _hashCode += getExtendedAssemblyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentFieldDetailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentFieldDetailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAssemblyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "BaseAssemblyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFieldDataTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "BaseFieldDataTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constructorRequiresUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ConstructorRequiresUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customConstructor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CustomConstructor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customConverter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CustomConverter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DataTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentUIControlID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentUIControlID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedAssemblyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ExtendedAssemblyName"));
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
