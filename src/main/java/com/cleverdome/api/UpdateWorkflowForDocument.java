/**
 * UpdateWorkflowForDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UpdateWorkflowForDocument  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String documentGuid;

    private java.lang.Integer docEventID;

    private java.lang.String[] batchDocumentGuids;

    public UpdateWorkflowForDocument() {
    }

    public UpdateWorkflowForDocument(
           java.lang.String sessionID,
           java.lang.String documentGuid,
           java.lang.Integer docEventID,
           java.lang.String[] batchDocumentGuids) {
           this.sessionID = sessionID;
           this.documentGuid = documentGuid;
           this.docEventID = docEventID;
           this.batchDocumentGuids = batchDocumentGuids;
    }


    /**
     * Gets the sessionID value for this UpdateWorkflowForDocument.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this UpdateWorkflowForDocument.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the documentGuid value for this UpdateWorkflowForDocument.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this UpdateWorkflowForDocument.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the docEventID value for this UpdateWorkflowForDocument.
     * 
     * @return docEventID
     */
    public java.lang.Integer getDocEventID() {
        return docEventID;
    }


    /**
     * Sets the docEventID value for this UpdateWorkflowForDocument.
     * 
     * @param docEventID
     */
    public void setDocEventID(java.lang.Integer docEventID) {
        this.docEventID = docEventID;
    }


    /**
     * Gets the batchDocumentGuids value for this UpdateWorkflowForDocument.
     * 
     * @return batchDocumentGuids
     */
    public java.lang.String[] getBatchDocumentGuids() {
        return batchDocumentGuids;
    }


    /**
     * Sets the batchDocumentGuids value for this UpdateWorkflowForDocument.
     * 
     * @param batchDocumentGuids
     */
    public void setBatchDocumentGuids(java.lang.String[] batchDocumentGuids) {
        this.batchDocumentGuids = batchDocumentGuids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateWorkflowForDocument)) return false;
        UpdateWorkflowForDocument other = (UpdateWorkflowForDocument) obj;
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
            ((this.documentGuid==null && other.getDocumentGuid()==null) || 
             (this.documentGuid!=null &&
              this.documentGuid.equals(other.getDocumentGuid()))) &&
            ((this.docEventID==null && other.getDocEventID()==null) || 
             (this.docEventID!=null &&
              this.docEventID.equals(other.getDocEventID()))) &&
            ((this.batchDocumentGuids==null && other.getBatchDocumentGuids()==null) || 
             (this.batchDocumentGuids!=null &&
              java.util.Arrays.equals(this.batchDocumentGuids, other.getBatchDocumentGuids())));
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
        if (getDocumentGuid() != null) {
            _hashCode += getDocumentGuid().hashCode();
        }
        if (getDocEventID() != null) {
            _hashCode += getDocEventID().hashCode();
        }
        if (getBatchDocumentGuids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchDocumentGuids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatchDocumentGuids(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateWorkflowForDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateWorkflowForDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "docEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchDocumentGuids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "batchDocumentGuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "guid"));
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
