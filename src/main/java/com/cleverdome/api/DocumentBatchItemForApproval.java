/**
 * DocumentBatchItemForApproval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentBatchItemForApproval  implements java.io.Serializable {
    private java.lang.String documentGuid;

    private java.lang.String documentTypeDescription;

    private java.lang.Boolean hasCurrentRevisionBeenViewed;

    private java.lang.Integer lastWorkflowEventID;

    public DocumentBatchItemForApproval() {
    }

    public DocumentBatchItemForApproval(
           java.lang.String documentGuid,
           java.lang.String documentTypeDescription,
           java.lang.Boolean hasCurrentRevisionBeenViewed,
           java.lang.Integer lastWorkflowEventID) {
           this.documentGuid = documentGuid;
           this.documentTypeDescription = documentTypeDescription;
           this.hasCurrentRevisionBeenViewed = hasCurrentRevisionBeenViewed;
           this.lastWorkflowEventID = lastWorkflowEventID;
    }


    /**
     * Gets the documentGuid value for this DocumentBatchItemForApproval.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this DocumentBatchItemForApproval.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the documentTypeDescription value for this DocumentBatchItemForApproval.
     * 
     * @return documentTypeDescription
     */
    public java.lang.String getDocumentTypeDescription() {
        return documentTypeDescription;
    }


    /**
     * Sets the documentTypeDescription value for this DocumentBatchItemForApproval.
     * 
     * @param documentTypeDescription
     */
    public void setDocumentTypeDescription(java.lang.String documentTypeDescription) {
        this.documentTypeDescription = documentTypeDescription;
    }


    /**
     * Gets the hasCurrentRevisionBeenViewed value for this DocumentBatchItemForApproval.
     * 
     * @return hasCurrentRevisionBeenViewed
     */
    public java.lang.Boolean getHasCurrentRevisionBeenViewed() {
        return hasCurrentRevisionBeenViewed;
    }


    /**
     * Sets the hasCurrentRevisionBeenViewed value for this DocumentBatchItemForApproval.
     * 
     * @param hasCurrentRevisionBeenViewed
     */
    public void setHasCurrentRevisionBeenViewed(java.lang.Boolean hasCurrentRevisionBeenViewed) {
        this.hasCurrentRevisionBeenViewed = hasCurrentRevisionBeenViewed;
    }


    /**
     * Gets the lastWorkflowEventID value for this DocumentBatchItemForApproval.
     * 
     * @return lastWorkflowEventID
     */
    public java.lang.Integer getLastWorkflowEventID() {
        return lastWorkflowEventID;
    }


    /**
     * Sets the lastWorkflowEventID value for this DocumentBatchItemForApproval.
     * 
     * @param lastWorkflowEventID
     */
    public void setLastWorkflowEventID(java.lang.Integer lastWorkflowEventID) {
        this.lastWorkflowEventID = lastWorkflowEventID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentBatchItemForApproval)) return false;
        DocumentBatchItemForApproval other = (DocumentBatchItemForApproval) obj;
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
            ((this.documentTypeDescription==null && other.getDocumentTypeDescription()==null) || 
             (this.documentTypeDescription!=null &&
              this.documentTypeDescription.equals(other.getDocumentTypeDescription()))) &&
            ((this.hasCurrentRevisionBeenViewed==null && other.getHasCurrentRevisionBeenViewed()==null) || 
             (this.hasCurrentRevisionBeenViewed!=null &&
              this.hasCurrentRevisionBeenViewed.equals(other.getHasCurrentRevisionBeenViewed()))) &&
            ((this.lastWorkflowEventID==null && other.getLastWorkflowEventID()==null) || 
             (this.lastWorkflowEventID!=null &&
              this.lastWorkflowEventID.equals(other.getLastWorkflowEventID())));
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
        if (getDocumentTypeDescription() != null) {
            _hashCode += getDocumentTypeDescription().hashCode();
        }
        if (getHasCurrentRevisionBeenViewed() != null) {
            _hashCode += getHasCurrentRevisionBeenViewed().hashCode();
        }
        if (getLastWorkflowEventID() != null) {
            _hashCode += getLastWorkflowEventID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentBatchItemForApproval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "DocumentBatchItemForApproval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "DocumentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "DocumentTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasCurrentRevisionBeenViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "HasCurrentRevisionBeenViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWorkflowEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "LastWorkflowEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
