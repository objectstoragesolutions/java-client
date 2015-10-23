/**
 * GetAllFilteredDocsDownloadID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetAllFilteredDocsDownloadID  implements java.io.Serializable {
    private java.lang.String sessionID;

    private com.cleverdome.api.FilterOptions filterOptions;

    private java.lang.Integer sharedUserId;

    private java.lang.String[] additionalDocGuids;

    public GetAllFilteredDocsDownloadID() {
    }

    public GetAllFilteredDocsDownloadID(
           java.lang.String sessionID,
           com.cleverdome.api.FilterOptions filterOptions,
           java.lang.Integer sharedUserId,
           java.lang.String[] additionalDocGuids) {
           this.sessionID = sessionID;
           this.filterOptions = filterOptions;
           this.sharedUserId = sharedUserId;
           this.additionalDocGuids = additionalDocGuids;
    }


    /**
     * Gets the sessionID value for this GetAllFilteredDocsDownloadID.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetAllFilteredDocsDownloadID.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the filterOptions value for this GetAllFilteredDocsDownloadID.
     * 
     * @return filterOptions
     */
    public com.cleverdome.api.FilterOptions getFilterOptions() {
        return filterOptions;
    }


    /**
     * Sets the filterOptions value for this GetAllFilteredDocsDownloadID.
     * 
     * @param filterOptions
     */
    public void setFilterOptions(com.cleverdome.api.FilterOptions filterOptions) {
        this.filterOptions = filterOptions;
    }


    /**
     * Gets the sharedUserId value for this GetAllFilteredDocsDownloadID.
     * 
     * @return sharedUserId
     */
    public java.lang.Integer getSharedUserId() {
        return sharedUserId;
    }


    /**
     * Sets the sharedUserId value for this GetAllFilteredDocsDownloadID.
     * 
     * @param sharedUserId
     */
    public void setSharedUserId(java.lang.Integer sharedUserId) {
        this.sharedUserId = sharedUserId;
    }


    /**
     * Gets the additionalDocGuids value for this GetAllFilteredDocsDownloadID.
     * 
     * @return additionalDocGuids
     */
    public java.lang.String[] getAdditionalDocGuids() {
        return additionalDocGuids;
    }


    /**
     * Sets the additionalDocGuids value for this GetAllFilteredDocsDownloadID.
     * 
     * @param additionalDocGuids
     */
    public void setAdditionalDocGuids(java.lang.String[] additionalDocGuids) {
        this.additionalDocGuids = additionalDocGuids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllFilteredDocsDownloadID)) return false;
        GetAllFilteredDocsDownloadID other = (GetAllFilteredDocsDownloadID) obj;
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
            ((this.filterOptions==null && other.getFilterOptions()==null) || 
             (this.filterOptions!=null &&
              this.filterOptions.equals(other.getFilterOptions()))) &&
            ((this.sharedUserId==null && other.getSharedUserId()==null) || 
             (this.sharedUserId!=null &&
              this.sharedUserId.equals(other.getSharedUserId()))) &&
            ((this.additionalDocGuids==null && other.getAdditionalDocGuids()==null) || 
             (this.additionalDocGuids!=null &&
              java.util.Arrays.equals(this.additionalDocGuids, other.getAdditionalDocGuids())));
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
        if (getFilterOptions() != null) {
            _hashCode += getFilterOptions().hashCode();
        }
        if (getSharedUserId() != null) {
            _hashCode += getSharedUserId().hashCode();
        }
        if (getAdditionalDocGuids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalDocGuids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalDocGuids(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllFilteredDocsDownloadID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllFilteredDocsDownloadID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "filterOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "FilterOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sharedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDocGuids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "additionalDocGuids"));
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
