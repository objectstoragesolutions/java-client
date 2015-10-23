/**
 * DocumentRevisionHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentRevisionHistory  implements java.io.Serializable {
    private com.cleverdome.api.DocumentFileEvent[] events;

    private java.lang.String revisionGuid;

    private java.lang.Integer revisionNumber;

    public DocumentRevisionHistory() {
    }

    public DocumentRevisionHistory(
           com.cleverdome.api.DocumentFileEvent[] events,
           java.lang.String revisionGuid,
           java.lang.Integer revisionNumber) {
           this.events = events;
           this.revisionGuid = revisionGuid;
           this.revisionNumber = revisionNumber;
    }


    /**
     * Gets the events value for this DocumentRevisionHistory.
     * 
     * @return events
     */
    public com.cleverdome.api.DocumentFileEvent[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this DocumentRevisionHistory.
     * 
     * @param events
     */
    public void setEvents(com.cleverdome.api.DocumentFileEvent[] events) {
        this.events = events;
    }


    /**
     * Gets the revisionGuid value for this DocumentRevisionHistory.
     * 
     * @return revisionGuid
     */
    public java.lang.String getRevisionGuid() {
        return revisionGuid;
    }


    /**
     * Sets the revisionGuid value for this DocumentRevisionHistory.
     * 
     * @param revisionGuid
     */
    public void setRevisionGuid(java.lang.String revisionGuid) {
        this.revisionGuid = revisionGuid;
    }


    /**
     * Gets the revisionNumber value for this DocumentRevisionHistory.
     * 
     * @return revisionNumber
     */
    public java.lang.Integer getRevisionNumber() {
        return revisionNumber;
    }


    /**
     * Sets the revisionNumber value for this DocumentRevisionHistory.
     * 
     * @param revisionNumber
     */
    public void setRevisionNumber(java.lang.Integer revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentRevisionHistory)) return false;
        DocumentRevisionHistory other = (DocumentRevisionHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.revisionGuid==null && other.getRevisionGuid()==null) || 
             (this.revisionGuid!=null &&
              this.revisionGuid.equals(other.getRevisionGuid()))) &&
            ((this.revisionNumber==null && other.getRevisionNumber()==null) || 
             (this.revisionNumber!=null &&
              this.revisionNumber.equals(other.getRevisionNumber())));
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
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevisionGuid() != null) {
            _hashCode += getRevisionGuid().hashCode();
        }
        if (getRevisionNumber() != null) {
            _hashCode += getRevisionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentRevisionHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentRevisionHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentFileEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentFileEvent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RevisionGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RevisionNumber"));
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
