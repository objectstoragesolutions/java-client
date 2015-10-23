/**
 * CreateUserTagAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class CreateUserTagAlert  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String userTagID;

    private java.lang.String name;

    private java.lang.Integer typeID;

    private java.lang.Integer scheduleTypeID;

    private java.lang.Boolean isClient;

    private java.lang.Integer vendorID;

    public CreateUserTagAlert() {
    }

    public CreateUserTagAlert(
           java.lang.String sessionID,
           java.lang.String userTagID,
           java.lang.String name,
           java.lang.Integer typeID,
           java.lang.Integer scheduleTypeID,
           java.lang.Boolean isClient,
           java.lang.Integer vendorID) {
           this.sessionID = sessionID;
           this.userTagID = userTagID;
           this.name = name;
           this.typeID = typeID;
           this.scheduleTypeID = scheduleTypeID;
           this.isClient = isClient;
           this.vendorID = vendorID;
    }


    /**
     * Gets the sessionID value for this CreateUserTagAlert.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this CreateUserTagAlert.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the userTagID value for this CreateUserTagAlert.
     * 
     * @return userTagID
     */
    public java.lang.String getUserTagID() {
        return userTagID;
    }


    /**
     * Sets the userTagID value for this CreateUserTagAlert.
     * 
     * @param userTagID
     */
    public void setUserTagID(java.lang.String userTagID) {
        this.userTagID = userTagID;
    }


    /**
     * Gets the name value for this CreateUserTagAlert.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreateUserTagAlert.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the typeID value for this CreateUserTagAlert.
     * 
     * @return typeID
     */
    public java.lang.Integer getTypeID() {
        return typeID;
    }


    /**
     * Sets the typeID value for this CreateUserTagAlert.
     * 
     * @param typeID
     */
    public void setTypeID(java.lang.Integer typeID) {
        this.typeID = typeID;
    }


    /**
     * Gets the scheduleTypeID value for this CreateUserTagAlert.
     * 
     * @return scheduleTypeID
     */
    public java.lang.Integer getScheduleTypeID() {
        return scheduleTypeID;
    }


    /**
     * Sets the scheduleTypeID value for this CreateUserTagAlert.
     * 
     * @param scheduleTypeID
     */
    public void setScheduleTypeID(java.lang.Integer scheduleTypeID) {
        this.scheduleTypeID = scheduleTypeID;
    }


    /**
     * Gets the isClient value for this CreateUserTagAlert.
     * 
     * @return isClient
     */
    public java.lang.Boolean getIsClient() {
        return isClient;
    }


    /**
     * Sets the isClient value for this CreateUserTagAlert.
     * 
     * @param isClient
     */
    public void setIsClient(java.lang.Boolean isClient) {
        this.isClient = isClient;
    }


    /**
     * Gets the vendorID value for this CreateUserTagAlert.
     * 
     * @return vendorID
     */
    public java.lang.Integer getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this CreateUserTagAlert.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.Integer vendorID) {
        this.vendorID = vendorID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateUserTagAlert)) return false;
        CreateUserTagAlert other = (CreateUserTagAlert) obj;
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
            ((this.userTagID==null && other.getUserTagID()==null) || 
             (this.userTagID!=null &&
              this.userTagID.equals(other.getUserTagID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.typeID==null && other.getTypeID()==null) || 
             (this.typeID!=null &&
              this.typeID.equals(other.getTypeID()))) &&
            ((this.scheduleTypeID==null && other.getScheduleTypeID()==null) || 
             (this.scheduleTypeID!=null &&
              this.scheduleTypeID.equals(other.getScheduleTypeID()))) &&
            ((this.isClient==null && other.getIsClient()==null) || 
             (this.isClient!=null &&
              this.isClient.equals(other.getIsClient()))) &&
            ((this.vendorID==null && other.getVendorID()==null) || 
             (this.vendorID!=null &&
              this.vendorID.equals(other.getVendorID())));
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
        if (getUserTagID() != null) {
            _hashCode += getUserTagID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTypeID() != null) {
            _hashCode += getTypeID().hashCode();
        }
        if (getScheduleTypeID() != null) {
            _hashCode += getScheduleTypeID().hashCode();
        }
        if (getIsClient() != null) {
            _hashCode += getIsClient().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateUserTagAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CreateUserTagAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTagID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "userTagID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "typeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "scheduleTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "isClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vendorID"));
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
