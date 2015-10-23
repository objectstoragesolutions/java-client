/**
 * RecentDocumentsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RecentDocumentsInfo  implements java.io.Serializable {
    private com.cleverdome.api.PendingDocument[] pendingDocuments;

    private com.cleverdome.api.ModifiedDocument[] primaryDocumentsUpdates;

    public RecentDocumentsInfo() {
    }

    public RecentDocumentsInfo(
           com.cleverdome.api.PendingDocument[] pendingDocuments,
           com.cleverdome.api.ModifiedDocument[] primaryDocumentsUpdates) {
           this.pendingDocuments = pendingDocuments;
           this.primaryDocumentsUpdates = primaryDocumentsUpdates;
    }


    /**
     * Gets the pendingDocuments value for this RecentDocumentsInfo.
     * 
     * @return pendingDocuments
     */
    public com.cleverdome.api.PendingDocument[] getPendingDocuments() {
        return pendingDocuments;
    }


    /**
     * Sets the pendingDocuments value for this RecentDocumentsInfo.
     * 
     * @param pendingDocuments
     */
    public void setPendingDocuments(com.cleverdome.api.PendingDocument[] pendingDocuments) {
        this.pendingDocuments = pendingDocuments;
    }


    /**
     * Gets the primaryDocumentsUpdates value for this RecentDocumentsInfo.
     * 
     * @return primaryDocumentsUpdates
     */
    public com.cleverdome.api.ModifiedDocument[] getPrimaryDocumentsUpdates() {
        return primaryDocumentsUpdates;
    }


    /**
     * Sets the primaryDocumentsUpdates value for this RecentDocumentsInfo.
     * 
     * @param primaryDocumentsUpdates
     */
    public void setPrimaryDocumentsUpdates(com.cleverdome.api.ModifiedDocument[] primaryDocumentsUpdates) {
        this.primaryDocumentsUpdates = primaryDocumentsUpdates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecentDocumentsInfo)) return false;
        RecentDocumentsInfo other = (RecentDocumentsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pendingDocuments==null && other.getPendingDocuments()==null) || 
             (this.pendingDocuments!=null &&
              java.util.Arrays.equals(this.pendingDocuments, other.getPendingDocuments()))) &&
            ((this.primaryDocumentsUpdates==null && other.getPrimaryDocumentsUpdates()==null) || 
             (this.primaryDocumentsUpdates!=null &&
              java.util.Arrays.equals(this.primaryDocumentsUpdates, other.getPrimaryDocumentsUpdates())));
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
        if (getPendingDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPendingDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPendingDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryDocumentsUpdates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryDocumentsUpdates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryDocumentsUpdates(), i);
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
        new org.apache.axis.description.TypeDesc(RecentDocumentsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RecentDocumentsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PendingDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PendingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PendingDocument"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryDocumentsUpdates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PrimaryDocumentsUpdates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ModifiedDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ModifiedDocument"));
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
