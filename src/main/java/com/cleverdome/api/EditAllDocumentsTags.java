/**
 * EditAllDocumentsTags.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class EditAllDocumentsTags  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String[] tagNamesDelete;

    private java.lang.String[] tagNamesInsert;

    private java.lang.Integer sharedUserId;

    private com.cleverdome.api.FilterOptions filterOptions;

    private java.lang.String[] additionalDocGuids;

    public EditAllDocumentsTags() {
    }

    public EditAllDocumentsTags(
           java.lang.String sessionID,
           java.lang.String[] tagNamesDelete,
           java.lang.String[] tagNamesInsert,
           java.lang.Integer sharedUserId,
           com.cleverdome.api.FilterOptions filterOptions,
           java.lang.String[] additionalDocGuids) {
           this.sessionID = sessionID;
           this.tagNamesDelete = tagNamesDelete;
           this.tagNamesInsert = tagNamesInsert;
           this.sharedUserId = sharedUserId;
           this.filterOptions = filterOptions;
           this.additionalDocGuids = additionalDocGuids;
    }


    /**
     * Gets the sessionID value for this EditAllDocumentsTags.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this EditAllDocumentsTags.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the tagNamesDelete value for this EditAllDocumentsTags.
     * 
     * @return tagNamesDelete
     */
    public java.lang.String[] getTagNamesDelete() {
        return tagNamesDelete;
    }


    /**
     * Sets the tagNamesDelete value for this EditAllDocumentsTags.
     * 
     * @param tagNamesDelete
     */
    public void setTagNamesDelete(java.lang.String[] tagNamesDelete) {
        this.tagNamesDelete = tagNamesDelete;
    }


    /**
     * Gets the tagNamesInsert value for this EditAllDocumentsTags.
     * 
     * @return tagNamesInsert
     */
    public java.lang.String[] getTagNamesInsert() {
        return tagNamesInsert;
    }


    /**
     * Sets the tagNamesInsert value for this EditAllDocumentsTags.
     * 
     * @param tagNamesInsert
     */
    public void setTagNamesInsert(java.lang.String[] tagNamesInsert) {
        this.tagNamesInsert = tagNamesInsert;
    }


    /**
     * Gets the sharedUserId value for this EditAllDocumentsTags.
     * 
     * @return sharedUserId
     */
    public java.lang.Integer getSharedUserId() {
        return sharedUserId;
    }


    /**
     * Sets the sharedUserId value for this EditAllDocumentsTags.
     * 
     * @param sharedUserId
     */
    public void setSharedUserId(java.lang.Integer sharedUserId) {
        this.sharedUserId = sharedUserId;
    }


    /**
     * Gets the filterOptions value for this EditAllDocumentsTags.
     * 
     * @return filterOptions
     */
    public com.cleverdome.api.FilterOptions getFilterOptions() {
        return filterOptions;
    }


    /**
     * Sets the filterOptions value for this EditAllDocumentsTags.
     * 
     * @param filterOptions
     */
    public void setFilterOptions(com.cleverdome.api.FilterOptions filterOptions) {
        this.filterOptions = filterOptions;
    }


    /**
     * Gets the additionalDocGuids value for this EditAllDocumentsTags.
     * 
     * @return additionalDocGuids
     */
    public java.lang.String[] getAdditionalDocGuids() {
        return additionalDocGuids;
    }


    /**
     * Sets the additionalDocGuids value for this EditAllDocumentsTags.
     * 
     * @param additionalDocGuids
     */
    public void setAdditionalDocGuids(java.lang.String[] additionalDocGuids) {
        this.additionalDocGuids = additionalDocGuids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditAllDocumentsTags)) return false;
        EditAllDocumentsTags other = (EditAllDocumentsTags) obj;
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
            ((this.tagNamesDelete==null && other.getTagNamesDelete()==null) || 
             (this.tagNamesDelete!=null &&
              java.util.Arrays.equals(this.tagNamesDelete, other.getTagNamesDelete()))) &&
            ((this.tagNamesInsert==null && other.getTagNamesInsert()==null) || 
             (this.tagNamesInsert!=null &&
              java.util.Arrays.equals(this.tagNamesInsert, other.getTagNamesInsert()))) &&
            ((this.sharedUserId==null && other.getSharedUserId()==null) || 
             (this.sharedUserId!=null &&
              this.sharedUserId.equals(other.getSharedUserId()))) &&
            ((this.filterOptions==null && other.getFilterOptions()==null) || 
             (this.filterOptions!=null &&
              this.filterOptions.equals(other.getFilterOptions()))) &&
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
        if (getTagNamesDelete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTagNamesDelete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTagNamesDelete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTagNamesInsert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTagNamesInsert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTagNamesInsert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharedUserId() != null) {
            _hashCode += getSharedUserId().hashCode();
        }
        if (getFilterOptions() != null) {
            _hashCode += getFilterOptions().hashCode();
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
        new org.apache.axis.description.TypeDesc(EditAllDocumentsTags.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">EditAllDocumentsTags"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagNamesDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tagNamesDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagNamesInsert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tagNamesInsert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sharedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
