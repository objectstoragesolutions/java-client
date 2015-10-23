/**
 * DocumentBatchItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentBatchItem  implements java.io.Serializable {
    private java.lang.String documentGuid;

    private java.lang.String lastWorkflowEvent;

    private java.lang.String name;

    private java.lang.String viewUrl;

    public DocumentBatchItem() {
    }

    public DocumentBatchItem(
           java.lang.String documentGuid,
           java.lang.String lastWorkflowEvent,
           java.lang.String name,
           java.lang.String viewUrl) {
           this.documentGuid = documentGuid;
           this.lastWorkflowEvent = lastWorkflowEvent;
           this.name = name;
           this.viewUrl = viewUrl;
    }


    /**
     * Gets the documentGuid value for this DocumentBatchItem.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this DocumentBatchItem.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the lastWorkflowEvent value for this DocumentBatchItem.
     * 
     * @return lastWorkflowEvent
     */
    public java.lang.String getLastWorkflowEvent() {
        return lastWorkflowEvent;
    }


    /**
     * Sets the lastWorkflowEvent value for this DocumentBatchItem.
     * 
     * @param lastWorkflowEvent
     */
    public void setLastWorkflowEvent(java.lang.String lastWorkflowEvent) {
        this.lastWorkflowEvent = lastWorkflowEvent;
    }


    /**
     * Gets the name value for this DocumentBatchItem.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentBatchItem.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the viewUrl value for this DocumentBatchItem.
     * 
     * @return viewUrl
     */
    public java.lang.String getViewUrl() {
        return viewUrl;
    }


    /**
     * Sets the viewUrl value for this DocumentBatchItem.
     * 
     * @param viewUrl
     */
    public void setViewUrl(java.lang.String viewUrl) {
        this.viewUrl = viewUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentBatchItem)) return false;
        DocumentBatchItem other = (DocumentBatchItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentGuid==null && other.getDocumentGuid()==null) || 
             (this.documentGuid!=null &&
              this.documentGuid.equals(other.getDocumentGuid()))) &&
            ((this.lastWorkflowEvent==null && other.getLastWorkflowEvent()==null) || 
             (this.lastWorkflowEvent!=null &&
              this.lastWorkflowEvent.equals(other.getLastWorkflowEvent()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.viewUrl==null && other.getViewUrl()==null) || 
             (this.viewUrl!=null &&
              this.viewUrl.equals(other.getViewUrl())));
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
        if (getDocumentGuid() != null) {
            _hashCode += getDocumentGuid().hashCode();
        }
        if (getLastWorkflowEvent() != null) {
            _hashCode += getLastWorkflowEvent().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getViewUrl() != null) {
            _hashCode += getViewUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentBatchItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentBatchItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWorkflowEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastWorkflowEvent"));
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
        elemField.setFieldName("viewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ViewUrl"));
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
