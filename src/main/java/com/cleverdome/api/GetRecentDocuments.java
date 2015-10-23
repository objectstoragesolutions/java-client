/**
 * GetRecentDocuments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetRecentDocuments  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String[] documentGuids;

    private java.lang.Integer sharedUserId;

    private java.lang.String documentFilter;

    private com.cleverdome.api.DocumentMetadataValueBase[] metadataValues;

    public GetRecentDocuments() {
    }

    public GetRecentDocuments(
           java.lang.String sessionID,
           java.lang.String[] documentGuids,
           java.lang.Integer sharedUserId,
           java.lang.String documentFilter,
           com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) {
           this.sessionID = sessionID;
           this.documentGuids = documentGuids;
           this.sharedUserId = sharedUserId;
           this.documentFilter = documentFilter;
           this.metadataValues = metadataValues;
    }


    /**
     * Gets the sessionID value for this GetRecentDocuments.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetRecentDocuments.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the documentGuids value for this GetRecentDocuments.
     * 
     * @return documentGuids
     */
    public java.lang.String[] getDocumentGuids() {
        return documentGuids;
    }


    /**
     * Sets the documentGuids value for this GetRecentDocuments.
     * 
     * @param documentGuids
     */
    public void setDocumentGuids(java.lang.String[] documentGuids) {
        this.documentGuids = documentGuids;
    }


    /**
     * Gets the sharedUserId value for this GetRecentDocuments.
     * 
     * @return sharedUserId
     */
    public java.lang.Integer getSharedUserId() {
        return sharedUserId;
    }


    /**
     * Sets the sharedUserId value for this GetRecentDocuments.
     * 
     * @param sharedUserId
     */
    public void setSharedUserId(java.lang.Integer sharedUserId) {
        this.sharedUserId = sharedUserId;
    }


    /**
     * Gets the documentFilter value for this GetRecentDocuments.
     * 
     * @return documentFilter
     */
    public java.lang.String getDocumentFilter() {
        return documentFilter;
    }


    /**
     * Sets the documentFilter value for this GetRecentDocuments.
     * 
     * @param documentFilter
     */
    public void setDocumentFilter(java.lang.String documentFilter) {
        this.documentFilter = documentFilter;
    }


    /**
     * Gets the metadataValues value for this GetRecentDocuments.
     * 
     * @return metadataValues
     */
    public com.cleverdome.api.DocumentMetadataValueBase[] getMetadataValues() {
        return metadataValues;
    }


    /**
     * Sets the metadataValues value for this GetRecentDocuments.
     * 
     * @param metadataValues
     */
    public void setMetadataValues(com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) {
        this.metadataValues = metadataValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRecentDocuments)) return false;
        GetRecentDocuments other = (GetRecentDocuments) obj;
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
            ((this.documentGuids==null && other.getDocumentGuids()==null) || 
             (this.documentGuids!=null &&
              java.util.Arrays.equals(this.documentGuids, other.getDocumentGuids()))) &&
            ((this.sharedUserId==null && other.getSharedUserId()==null) || 
             (this.sharedUserId!=null &&
              this.sharedUserId.equals(other.getSharedUserId()))) &&
            ((this.documentFilter==null && other.getDocumentFilter()==null) || 
             (this.documentFilter!=null &&
              this.documentFilter.equals(other.getDocumentFilter()))) &&
            ((this.metadataValues==null && other.getMetadataValues()==null) || 
             (this.metadataValues!=null &&
              java.util.Arrays.equals(this.metadataValues, other.getMetadataValues())));
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
        if (getDocumentGuids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentGuids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentGuids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharedUserId() != null) {
            _hashCode += getSharedUserId().hashCode();
        }
        if (getDocumentFilter() != null) {
            _hashCode += getDocumentFilter().hashCode();
        }
        if (getMetadataValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetadataValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetadataValues(), i);
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
        new org.apache.axis.description.TypeDesc(GetRecentDocuments.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRecentDocuments"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentGuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "guid"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sharedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "metadataValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
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
