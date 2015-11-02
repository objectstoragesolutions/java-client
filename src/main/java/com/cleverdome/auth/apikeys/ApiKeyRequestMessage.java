/**
 * ApiKeyRequestMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.auth.apikeys;

public class ApiKeyRequestMessage  implements java.io.Serializable {
    private java.lang.String apiKey;

    private java.lang.String[] ipAddresses;

    private java.lang.String userID;

    public ApiKeyRequestMessage() {
    }

    public ApiKeyRequestMessage(
           java.lang.String apiKey,
           java.lang.String[] ipAddresses,
           java.lang.String userID) {
           this.apiKey = apiKey;
           this.ipAddresses = ipAddresses;
           this.userID = userID;
    }


    /**
     * Gets the apiKey value for this ApiKeyRequestMessage.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this ApiKeyRequestMessage.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the ipAddresses value for this ApiKeyRequestMessage.
     * 
     * @return ipAddresses
     */
    public java.lang.String[] getIpAddresses() {
        return ipAddresses;
    }


    /**
     * Sets the ipAddresses value for this ApiKeyRequestMessage.
     * 
     * @param ipAddresses
     */
    public void setIpAddresses(java.lang.String[] ipAddresses) {
        this.ipAddresses = ipAddresses;
    }


    /**
     * Gets the userID value for this ApiKeyRequestMessage.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this ApiKeyRequestMessage.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiKeyRequestMessage)) return false;
        ApiKeyRequestMessage other = (ApiKeyRequestMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apiKey==null && other.getApiKey()==null) || 
             (this.apiKey!=null &&
              this.apiKey.equals(other.getApiKey()))) &&
            ((this.ipAddresses==null && other.getIpAddresses()==null) || 
             (this.ipAddresses!=null &&
              java.util.Arrays.equals(this.ipAddresses, other.getIpAddresses()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
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
        if (getApiKey() != null) {
            _hashCode += getApiKey().hashCode();
        }
        if (getIpAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiKeyRequestMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", ">ApiKeyRequestMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "ApiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "IpAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "UserID"));
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
