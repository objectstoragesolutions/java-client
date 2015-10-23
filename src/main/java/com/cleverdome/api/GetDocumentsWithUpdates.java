/**
 * GetDocumentsWithUpdates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentsWithUpdates  implements java.io.Serializable {
    private java.lang.String sessionID;

    private com.cleverdome.api.ListPagerParams listPageInfo;

    private com.cleverdome.api.FilterOptions filterOptions;

    private java.lang.Integer sharedUserID;

    public GetDocumentsWithUpdates() {
    }

    public GetDocumentsWithUpdates(
           java.lang.String sessionID,
           com.cleverdome.api.ListPagerParams listPageInfo,
           com.cleverdome.api.FilterOptions filterOptions,
           java.lang.Integer sharedUserID) {
           this.sessionID = sessionID;
           this.listPageInfo = listPageInfo;
           this.filterOptions = filterOptions;
           this.sharedUserID = sharedUserID;
    }


    /**
     * Gets the sessionID value for this GetDocumentsWithUpdates.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetDocumentsWithUpdates.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the listPageInfo value for this GetDocumentsWithUpdates.
     * 
     * @return listPageInfo
     */
    public com.cleverdome.api.ListPagerParams getListPageInfo() {
        return listPageInfo;
    }


    /**
     * Sets the listPageInfo value for this GetDocumentsWithUpdates.
     * 
     * @param listPageInfo
     */
    public void setListPageInfo(com.cleverdome.api.ListPagerParams listPageInfo) {
        this.listPageInfo = listPageInfo;
    }


    /**
     * Gets the filterOptions value for this GetDocumentsWithUpdates.
     * 
     * @return filterOptions
     */
    public com.cleverdome.api.FilterOptions getFilterOptions() {
        return filterOptions;
    }


    /**
     * Sets the filterOptions value for this GetDocumentsWithUpdates.
     * 
     * @param filterOptions
     */
    public void setFilterOptions(com.cleverdome.api.FilterOptions filterOptions) {
        this.filterOptions = filterOptions;
    }


    /**
     * Gets the sharedUserID value for this GetDocumentsWithUpdates.
     * 
     * @return sharedUserID
     */
    public java.lang.Integer getSharedUserID() {
        return sharedUserID;
    }


    /**
     * Sets the sharedUserID value for this GetDocumentsWithUpdates.
     * 
     * @param sharedUserID
     */
    public void setSharedUserID(java.lang.Integer sharedUserID) {
        this.sharedUserID = sharedUserID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsWithUpdates)) return false;
        GetDocumentsWithUpdates other = (GetDocumentsWithUpdates) obj;
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
            ((this.listPageInfo==null && other.getListPageInfo()==null) || 
             (this.listPageInfo!=null &&
              this.listPageInfo.equals(other.getListPageInfo()))) &&
            ((this.filterOptions==null && other.getFilterOptions()==null) || 
             (this.filterOptions!=null &&
              this.filterOptions.equals(other.getFilterOptions()))) &&
            ((this.sharedUserID==null && other.getSharedUserID()==null) || 
             (this.sharedUserID!=null &&
              this.sharedUserID.equals(other.getSharedUserID())));
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
        if (getListPageInfo() != null) {
            _hashCode += getListPageInfo().hashCode();
        }
        if (getFilterOptions() != null) {
            _hashCode += getFilterOptions().hashCode();
        }
        if (getSharedUserID() != null) {
            _hashCode += getSharedUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentsWithUpdates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsWithUpdates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "listPageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Pager", "ListPagerParams"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "filterOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.Search", "FilterOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sharedUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
