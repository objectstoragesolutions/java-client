/**
 * UpdatedDocumentsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UpdatedDocumentsInfo  implements java.io.Serializable {
    private com.cleverdome.api.ListPageDataOfDocumentSearchResultwJCT_PyJf primaryDocuments;

    private com.cleverdome.api.RecentDocumentsInfo recentDocumentsInfo;

    public UpdatedDocumentsInfo() {
    }

    public UpdatedDocumentsInfo(
           com.cleverdome.api.ListPageDataOfDocumentSearchResultwJCT_PyJf primaryDocuments,
           com.cleverdome.api.RecentDocumentsInfo recentDocumentsInfo) {
           this.primaryDocuments = primaryDocuments;
           this.recentDocumentsInfo = recentDocumentsInfo;
    }


    /**
     * Gets the primaryDocuments value for this UpdatedDocumentsInfo.
     * 
     * @return primaryDocuments
     */
    public com.cleverdome.api.ListPageDataOfDocumentSearchResultwJCT_PyJf getPrimaryDocuments() {
        return primaryDocuments;
    }


    /**
     * Sets the primaryDocuments value for this UpdatedDocumentsInfo.
     * 
     * @param primaryDocuments
     */
    public void setPrimaryDocuments(com.cleverdome.api.ListPageDataOfDocumentSearchResultwJCT_PyJf primaryDocuments) {
        this.primaryDocuments = primaryDocuments;
    }


    /**
     * Gets the recentDocumentsInfo value for this UpdatedDocumentsInfo.
     * 
     * @return recentDocumentsInfo
     */
    public com.cleverdome.api.RecentDocumentsInfo getRecentDocumentsInfo() {
        return recentDocumentsInfo;
    }


    /**
     * Sets the recentDocumentsInfo value for this UpdatedDocumentsInfo.
     * 
     * @param recentDocumentsInfo
     */
    public void setRecentDocumentsInfo(com.cleverdome.api.RecentDocumentsInfo recentDocumentsInfo) {
        this.recentDocumentsInfo = recentDocumentsInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatedDocumentsInfo)) return false;
        UpdatedDocumentsInfo other = (UpdatedDocumentsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryDocuments==null && other.getPrimaryDocuments()==null) || 
             (this.primaryDocuments!=null &&
              this.primaryDocuments.equals(other.getPrimaryDocuments()))) &&
            ((this.recentDocumentsInfo==null && other.getRecentDocumentsInfo()==null) || 
             (this.recentDocumentsInfo!=null &&
              this.recentDocumentsInfo.equals(other.getRecentDocumentsInfo())));
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
        if (getPrimaryDocuments() != null) {
            _hashCode += getPrimaryDocuments().hashCode();
        }
        if (getRecentDocumentsInfo() != null) {
            _hashCode += getRecentDocumentsInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatedDocumentsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UpdatedDocumentsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PrimaryDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Pager", "ListPageDataOfDocumentSearchResultwJCT_PyJf"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recentDocumentsInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RecentDocumentsInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RecentDocumentsInfo"));
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
