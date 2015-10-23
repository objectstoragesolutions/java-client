/**
 * GetDocumentsForEventsByMetaValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentsForEventsByMetaValue  implements java.io.Serializable {
    private java.lang.String sessionID;

    private int[] eventIDs;

    private java.lang.Integer applicationID;

    private java.lang.String dbValue;

    private java.lang.Integer metaID;

    public GetDocumentsForEventsByMetaValue() {
    }

    public GetDocumentsForEventsByMetaValue(
           java.lang.String sessionID,
           int[] eventIDs,
           java.lang.Integer applicationID,
           java.lang.String dbValue,
           java.lang.Integer metaID) {
           this.sessionID = sessionID;
           this.eventIDs = eventIDs;
           this.applicationID = applicationID;
           this.dbValue = dbValue;
           this.metaID = metaID;
    }


    /**
     * Gets the sessionID value for this GetDocumentsForEventsByMetaValue.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetDocumentsForEventsByMetaValue.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the eventIDs value for this GetDocumentsForEventsByMetaValue.
     * 
     * @return eventIDs
     */
    public int[] getEventIDs() {
        return eventIDs;
    }


    /**
     * Sets the eventIDs value for this GetDocumentsForEventsByMetaValue.
     * 
     * @param eventIDs
     */
    public void setEventIDs(int[] eventIDs) {
        this.eventIDs = eventIDs;
    }


    /**
     * Gets the applicationID value for this GetDocumentsForEventsByMetaValue.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this GetDocumentsForEventsByMetaValue.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the dbValue value for this GetDocumentsForEventsByMetaValue.
     * 
     * @return dbValue
     */
    public java.lang.String getDbValue() {
        return dbValue;
    }


    /**
     * Sets the dbValue value for this GetDocumentsForEventsByMetaValue.
     * 
     * @param dbValue
     */
    public void setDbValue(java.lang.String dbValue) {
        this.dbValue = dbValue;
    }


    /**
     * Gets the metaID value for this GetDocumentsForEventsByMetaValue.
     * 
     * @return metaID
     */
    public java.lang.Integer getMetaID() {
        return metaID;
    }


    /**
     * Sets the metaID value for this GetDocumentsForEventsByMetaValue.
     * 
     * @param metaID
     */
    public void setMetaID(java.lang.Integer metaID) {
        this.metaID = metaID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsForEventsByMetaValue)) return false;
        GetDocumentsForEventsByMetaValue other = (GetDocumentsForEventsByMetaValue) obj;
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
            ((this.eventIDs==null && other.getEventIDs()==null) || 
             (this.eventIDs!=null &&
              java.util.Arrays.equals(this.eventIDs, other.getEventIDs()))) &&
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.dbValue==null && other.getDbValue()==null) || 
             (this.dbValue!=null &&
              this.dbValue.equals(other.getDbValue()))) &&
            ((this.metaID==null && other.getMetaID()==null) || 
             (this.metaID!=null &&
              this.metaID.equals(other.getMetaID())));
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
        if (getEventIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getDbValue() != null) {
            _hashCode += getDbValue().hashCode();
        }
        if (getMetaID() != null) {
            _hashCode += getMetaID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentsForEventsByMetaValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsForEventsByMetaValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "eventIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "applicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dbValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "metaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
