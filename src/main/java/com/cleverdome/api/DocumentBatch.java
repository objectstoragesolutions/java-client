/**
 * DocumentBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentBatch  implements java.io.Serializable {
    private com.cleverdome.api.DocumentBatchItem[] batchItems;

    private java.lang.Integer batchType;

    private java.lang.Integer ID;

    private java.lang.String name;

    private java.lang.Boolean requiredDocumentsOnFile;

    public DocumentBatch() {
    }

    public DocumentBatch(
           com.cleverdome.api.DocumentBatchItem[] batchItems,
           java.lang.Integer batchType,
           java.lang.Integer ID,
           java.lang.String name,
           java.lang.Boolean requiredDocumentsOnFile) {
           this.batchItems = batchItems;
           this.batchType = batchType;
           this.ID = ID;
           this.name = name;
           this.requiredDocumentsOnFile = requiredDocumentsOnFile;
    }


    /**
     * Gets the batchItems value for this DocumentBatch.
     * 
     * @return batchItems
     */
    public com.cleverdome.api.DocumentBatchItem[] getBatchItems() {
        return batchItems;
    }


    /**
     * Sets the batchItems value for this DocumentBatch.
     * 
     * @param batchItems
     */
    public void setBatchItems(com.cleverdome.api.DocumentBatchItem[] batchItems) {
        this.batchItems = batchItems;
    }


    /**
     * Gets the batchType value for this DocumentBatch.
     * 
     * @return batchType
     */
    public java.lang.Integer getBatchType() {
        return batchType;
    }


    /**
     * Sets the batchType value for this DocumentBatch.
     * 
     * @param batchType
     */
    public void setBatchType(java.lang.Integer batchType) {
        this.batchType = batchType;
    }


    /**
     * Gets the ID value for this DocumentBatch.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DocumentBatch.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the name value for this DocumentBatch.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentBatch.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the requiredDocumentsOnFile value for this DocumentBatch.
     * 
     * @return requiredDocumentsOnFile
     */
    public java.lang.Boolean getRequiredDocumentsOnFile() {
        return requiredDocumentsOnFile;
    }


    /**
     * Sets the requiredDocumentsOnFile value for this DocumentBatch.
     * 
     * @param requiredDocumentsOnFile
     */
    public void setRequiredDocumentsOnFile(java.lang.Boolean requiredDocumentsOnFile) {
        this.requiredDocumentsOnFile = requiredDocumentsOnFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentBatch)) return false;
        DocumentBatch other = (DocumentBatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchItems==null && other.getBatchItems()==null) || 
             (this.batchItems!=null &&
              java.util.Arrays.equals(this.batchItems, other.getBatchItems()))) &&
            ((this.batchType==null && other.getBatchType()==null) || 
             (this.batchType!=null &&
              this.batchType.equals(other.getBatchType()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.requiredDocumentsOnFile==null && other.getRequiredDocumentsOnFile()==null) || 
             (this.requiredDocumentsOnFile!=null &&
              this.requiredDocumentsOnFile.equals(other.getRequiredDocumentsOnFile())));
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
        if (getBatchItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatchItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBatchType() != null) {
            _hashCode += getBatchType().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRequiredDocumentsOnFile() != null) {
            _hashCode += getRequiredDocumentsOnFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "BatchItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentBatchItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentBatchItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "BatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("requiredDocumentsOnFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RequiredDocumentsOnFile"));
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
