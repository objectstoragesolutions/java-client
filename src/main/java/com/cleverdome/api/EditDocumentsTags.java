/**
 * EditDocumentsTags.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class EditDocumentsTags  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String[] tagNamesDelete;

    private java.lang.String[] tagNamesInsert;

    private java.lang.String[] documentGuids;

    public EditDocumentsTags() {
    }

    public EditDocumentsTags(
           java.lang.String sessionID,
           java.lang.String[] tagNamesDelete,
           java.lang.String[] tagNamesInsert,
           java.lang.String[] documentGuids) {
           this.sessionID = sessionID;
           this.tagNamesDelete = tagNamesDelete;
           this.tagNamesInsert = tagNamesInsert;
           this.documentGuids = documentGuids;
    }


    /**
     * Gets the sessionID value for this EditDocumentsTags.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this EditDocumentsTags.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the tagNamesDelete value for this EditDocumentsTags.
     * 
     * @return tagNamesDelete
     */
    public java.lang.String[] getTagNamesDelete() {
        return tagNamesDelete;
    }


    /**
     * Sets the tagNamesDelete value for this EditDocumentsTags.
     * 
     * @param tagNamesDelete
     */
    public void setTagNamesDelete(java.lang.String[] tagNamesDelete) {
        this.tagNamesDelete = tagNamesDelete;
    }


    /**
     * Gets the tagNamesInsert value for this EditDocumentsTags.
     * 
     * @return tagNamesInsert
     */
    public java.lang.String[] getTagNamesInsert() {
        return tagNamesInsert;
    }


    /**
     * Sets the tagNamesInsert value for this EditDocumentsTags.
     * 
     * @param tagNamesInsert
     */
    public void setTagNamesInsert(java.lang.String[] tagNamesInsert) {
        this.tagNamesInsert = tagNamesInsert;
    }


    /**
     * Gets the documentGuids value for this EditDocumentsTags.
     * 
     * @return documentGuids
     */
    public java.lang.String[] getDocumentGuids() {
        return documentGuids;
    }


    /**
     * Sets the documentGuids value for this EditDocumentsTags.
     * 
     * @param documentGuids
     */
    public void setDocumentGuids(java.lang.String[] documentGuids) {
        this.documentGuids = documentGuids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditDocumentsTags)) return false;
        EditDocumentsTags other = (EditDocumentsTags) obj;
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
            ((this.documentGuids==null && other.getDocumentGuids()==null) || 
             (this.documentGuids!=null &&
              java.util.Arrays.equals(this.documentGuids, other.getDocumentGuids())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditDocumentsTags.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">EditDocumentsTags"));
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
        elemField.setFieldName("documentGuids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentGuids"));
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
