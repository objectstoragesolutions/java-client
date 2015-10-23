/**
 * ShareDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class ShareDocument  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.Integer securityLevel;

    private java.lang.Boolean sendEmail;

    private java.util.Calendar expirationDate;

    private int[] userIDs;

    private java.lang.String[] documentGuids;

    private java.lang.String message;

    private java.lang.Integer vendorID;

    public ShareDocument() {
    }

    public ShareDocument(
           java.lang.String sessionID,
           java.lang.Integer securityLevel,
           java.lang.Boolean sendEmail,
           java.util.Calendar expirationDate,
           int[] userIDs,
           java.lang.String[] documentGuids,
           java.lang.String message,
           java.lang.Integer vendorID) {
           this.sessionID = sessionID;
           this.securityLevel = securityLevel;
           this.sendEmail = sendEmail;
           this.expirationDate = expirationDate;
           this.userIDs = userIDs;
           this.documentGuids = documentGuids;
           this.message = message;
           this.vendorID = vendorID;
    }


    /**
     * Gets the sessionID value for this ShareDocument.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this ShareDocument.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the securityLevel value for this ShareDocument.
     * 
     * @return securityLevel
     */
    public java.lang.Integer getSecurityLevel() {
        return securityLevel;
    }


    /**
     * Sets the securityLevel value for this ShareDocument.
     * 
     * @param securityLevel
     */
    public void setSecurityLevel(java.lang.Integer securityLevel) {
        this.securityLevel = securityLevel;
    }


    /**
     * Gets the sendEmail value for this ShareDocument.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this ShareDocument.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the expirationDate value for this ShareDocument.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this ShareDocument.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the userIDs value for this ShareDocument.
     * 
     * @return userIDs
     */
    public int[] getUserIDs() {
        return userIDs;
    }


    /**
     * Sets the userIDs value for this ShareDocument.
     * 
     * @param userIDs
     */
    public void setUserIDs(int[] userIDs) {
        this.userIDs = userIDs;
    }


    /**
     * Gets the documentGuids value for this ShareDocument.
     * 
     * @return documentGuids
     */
    public java.lang.String[] getDocumentGuids() {
        return documentGuids;
    }


    /**
     * Sets the documentGuids value for this ShareDocument.
     * 
     * @param documentGuids
     */
    public void setDocumentGuids(java.lang.String[] documentGuids) {
        this.documentGuids = documentGuids;
    }


    /**
     * Gets the message value for this ShareDocument.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ShareDocument.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the vendorID value for this ShareDocument.
     * 
     * @return vendorID
     */
    public java.lang.Integer getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this ShareDocument.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.Integer vendorID) {
        this.vendorID = vendorID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShareDocument)) return false;
        ShareDocument other = (ShareDocument) obj;
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
            ((this.securityLevel==null && other.getSecurityLevel()==null) || 
             (this.securityLevel!=null &&
              this.securityLevel.equals(other.getSecurityLevel()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.userIDs==null && other.getUserIDs()==null) || 
             (this.userIDs!=null &&
              java.util.Arrays.equals(this.userIDs, other.getUserIDs()))) &&
            ((this.documentGuids==null && other.getDocumentGuids()==null) || 
             (this.documentGuids!=null &&
              java.util.Arrays.equals(this.documentGuids, other.getDocumentGuids()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
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
        if (getSecurityLevel() != null) {
            _hashCode += getSecurityLevel().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getUserIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserIDs(), i);
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShareDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ShareDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "securityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "userIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "documentGuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "guid"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
