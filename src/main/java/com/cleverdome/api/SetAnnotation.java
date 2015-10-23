/**
 * SetAnnotation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SetAnnotation  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String revisionGuid;

    private java.lang.String annID;

    private java.lang.String data;

    public SetAnnotation() {
    }

    public SetAnnotation(
           java.lang.String sessionID,
           java.lang.String revisionGuid,
           java.lang.String annID,
           java.lang.String data) {
           this.sessionID = sessionID;
           this.revisionGuid = revisionGuid;
           this.annID = annID;
           this.data = data;
    }


    /**
     * Gets the sessionID value for this SetAnnotation.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this SetAnnotation.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the revisionGuid value for this SetAnnotation.
     * 
     * @return revisionGuid
     */
    public java.lang.String getRevisionGuid() {
        return revisionGuid;
    }


    /**
     * Sets the revisionGuid value for this SetAnnotation.
     * 
     * @param revisionGuid
     */
    public void setRevisionGuid(java.lang.String revisionGuid) {
        this.revisionGuid = revisionGuid;
    }


    /**
     * Gets the annID value for this SetAnnotation.
     * 
     * @return annID
     */
    public java.lang.String getAnnID() {
        return annID;
    }


    /**
     * Sets the annID value for this SetAnnotation.
     * 
     * @param annID
     */
    public void setAnnID(java.lang.String annID) {
        this.annID = annID;
    }


    /**
     * Gets the data value for this SetAnnotation.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this SetAnnotation.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetAnnotation)) return false;
        SetAnnotation other = (SetAnnotation) obj;
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
            ((this.revisionGuid==null && other.getRevisionGuid()==null) || 
             (this.revisionGuid!=null &&
              this.revisionGuid.equals(other.getRevisionGuid()))) &&
            ((this.annID==null && other.getAnnID()==null) || 
             (this.annID!=null &&
              this.annID.equals(other.getAnnID()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getRevisionGuid() != null) {
            _hashCode += getRevisionGuid().hashCode();
        }
        if (getAnnID() != null) {
            _hashCode += getAnnID().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetAnnotation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetAnnotation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "revisionGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "annID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
