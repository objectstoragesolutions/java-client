/**
 * BaseDocumentMetadataHierarchyElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class BaseDocumentMetadataHierarchyElement  implements java.io.Serializable {
    private com.cleverdome.api.Alert alert;

    private java.lang.Integer fieldTypeID;

    private java.lang.String nodeID;

    private java.lang.String parentNodeID;

    private java.lang.String text;

    public BaseDocumentMetadataHierarchyElement() {
    }

    public BaseDocumentMetadataHierarchyElement(
           com.cleverdome.api.Alert alert,
           java.lang.Integer fieldTypeID,
           java.lang.String nodeID,
           java.lang.String parentNodeID,
           java.lang.String text) {
           this.alert = alert;
           this.fieldTypeID = fieldTypeID;
           this.nodeID = nodeID;
           this.parentNodeID = parentNodeID;
           this.text = text;
    }


    /**
     * Gets the alert value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @return alert
     */
    public com.cleverdome.api.Alert getAlert() {
        return alert;
    }


    /**
     * Sets the alert value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @param alert
     */
    public void setAlert(com.cleverdome.api.Alert alert) {
        this.alert = alert;
    }


    /**
     * Gets the fieldTypeID value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @return fieldTypeID
     */
    public java.lang.Integer getFieldTypeID() {
        return fieldTypeID;
    }


    /**
     * Sets the fieldTypeID value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @param fieldTypeID
     */
    public void setFieldTypeID(java.lang.Integer fieldTypeID) {
        this.fieldTypeID = fieldTypeID;
    }


    /**
     * Gets the nodeID value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @return nodeID
     */
    public java.lang.String getNodeID() {
        return nodeID;
    }


    /**
     * Sets the nodeID value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @param nodeID
     */
    public void setNodeID(java.lang.String nodeID) {
        this.nodeID = nodeID;
    }


    /**
     * Gets the parentNodeID value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @return parentNodeID
     */
    public java.lang.String getParentNodeID() {
        return parentNodeID;
    }


    /**
     * Sets the parentNodeID value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @param parentNodeID
     */
    public void setParentNodeID(java.lang.String parentNodeID) {
        this.parentNodeID = parentNodeID;
    }


    /**
     * Gets the text value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this BaseDocumentMetadataHierarchyElement.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseDocumentMetadataHierarchyElement)) return false;
        BaseDocumentMetadataHierarchyElement other = (BaseDocumentMetadataHierarchyElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alert==null && other.getAlert()==null) || 
             (this.alert!=null &&
              this.alert.equals(other.getAlert()))) &&
            ((this.fieldTypeID==null && other.getFieldTypeID()==null) || 
             (this.fieldTypeID!=null &&
              this.fieldTypeID.equals(other.getFieldTypeID()))) &&
            ((this.nodeID==null && other.getNodeID()==null) || 
             (this.nodeID!=null &&
              this.nodeID.equals(other.getNodeID()))) &&
            ((this.parentNodeID==null && other.getParentNodeID()==null) || 
             (this.parentNodeID!=null &&
              this.parentNodeID.equals(other.getParentNodeID()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText())));
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
        if (getAlert() != null) {
            _hashCode += getAlert().hashCode();
        }
        if (getFieldTypeID() != null) {
            _hashCode += getFieldTypeID().hashCode();
        }
        if (getNodeID() != null) {
            _hashCode += getNodeID().hashCode();
        }
        if (getParentNodeID() != null) {
            _hashCode += getParentNodeID().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseDocumentMetadataHierarchyElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "BaseDocument.MetadataHierarchyElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "Alert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "Alert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "FieldTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "NodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "ParentNodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "Text"));
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
