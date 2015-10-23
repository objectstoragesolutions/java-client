/**
 * Alert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class Alert  implements java.io.Serializable {
    private java.lang.Boolean isClient;

    private java.lang.String name;

    private java.lang.Integer ownerID;

    private com.cleverdome.api.AlertScheduleType scheduleType;

    private java.lang.String[] type;

    private java.lang.String userTagID;

    private java.lang.Integer vendorID;

    public Alert() {
    }

    public Alert(
           java.lang.Boolean isClient,
           java.lang.String name,
           java.lang.Integer ownerID,
           com.cleverdome.api.AlertScheduleType scheduleType,
           java.lang.String[] type,
           java.lang.String userTagID,
           java.lang.Integer vendorID) {
           this.isClient = isClient;
           this.name = name;
           this.ownerID = ownerID;
           this.scheduleType = scheduleType;
           this.type = type;
           this.userTagID = userTagID;
           this.vendorID = vendorID;
    }


    /**
     * Gets the isClient value for this Alert.
     * 
     * @return isClient
     */
    public java.lang.Boolean getIsClient() {
        return isClient;
    }


    /**
     * Sets the isClient value for this Alert.
     * 
     * @param isClient
     */
    public void setIsClient(java.lang.Boolean isClient) {
        this.isClient = isClient;
    }


    /**
     * Gets the name value for this Alert.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Alert.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ownerID value for this Alert.
     * 
     * @return ownerID
     */
    public java.lang.Integer getOwnerID() {
        return ownerID;
    }


    /**
     * Sets the ownerID value for this Alert.
     * 
     * @param ownerID
     */
    public void setOwnerID(java.lang.Integer ownerID) {
        this.ownerID = ownerID;
    }


    /**
     * Gets the scheduleType value for this Alert.
     * 
     * @return scheduleType
     */
    public com.cleverdome.api.AlertScheduleType getScheduleType() {
        return scheduleType;
    }


    /**
     * Sets the scheduleType value for this Alert.
     * 
     * @param scheduleType
     */
    public void setScheduleType(com.cleverdome.api.AlertScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }


    /**
     * Gets the type value for this Alert.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this Alert.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }


    /**
     * Gets the userTagID value for this Alert.
     * 
     * @return userTagID
     */
    public java.lang.String getUserTagID() {
        return userTagID;
    }


    /**
     * Sets the userTagID value for this Alert.
     * 
     * @param userTagID
     */
    public void setUserTagID(java.lang.String userTagID) {
        this.userTagID = userTagID;
    }


    /**
     * Gets the vendorID value for this Alert.
     * 
     * @return vendorID
     */
    public java.lang.Integer getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this Alert.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.Integer vendorID) {
        this.vendorID = vendorID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Alert)) return false;
        Alert other = (Alert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isClient==null && other.getIsClient()==null) || 
             (this.isClient!=null &&
              this.isClient.equals(other.getIsClient()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ownerID==null && other.getOwnerID()==null) || 
             (this.ownerID!=null &&
              this.ownerID.equals(other.getOwnerID()))) &&
            ((this.scheduleType==null && other.getScheduleType()==null) || 
             (this.scheduleType!=null &&
              this.scheduleType.equals(other.getScheduleType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.userTagID==null && other.getUserTagID()==null) || 
             (this.userTagID!=null &&
              this.userTagID.equals(other.getUserTagID()))) &&
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
        if (getIsClient() != null) {
            _hashCode += getIsClient().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwnerID() != null) {
            _hashCode += getOwnerID().hashCode();
        }
        if (getScheduleType() != null) {
            _hashCode += getScheduleType().hashCode();
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserTagID() != null) {
            _hashCode += getUserTagID().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Alert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "Alert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "IsClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "OwnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "ScheduleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "AlertScheduleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "AlertTypeFlags"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTagID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "UserTagID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.UserTags", "VendorID"));
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
