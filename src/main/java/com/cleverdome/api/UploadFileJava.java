/**
 * UploadFileJava.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UploadFileJava  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.Integer applicationID;

    private java.lang.Integer templateID;

    private java.lang.Integer descriptionID;

    private com.cleverdome.api.DocumentMetadataValueBase[] metadataValues;

    private java.lang.String filename;

    private java.lang.String successStatus1;

    private byte[] inputStream;

    public UploadFileJava() {
    }

    public UploadFileJava(
           java.lang.String sessionID,
           java.lang.Integer applicationID,
           java.lang.Integer templateID,
           java.lang.Integer descriptionID,
           com.cleverdome.api.DocumentMetadataValueBase[] metadataValues,
           java.lang.String filename,
           java.lang.String successStatus1,
           byte[] inputStream) {
           this.sessionID = sessionID;
           this.applicationID = applicationID;
           this.templateID = templateID;
           this.descriptionID = descriptionID;
           this.metadataValues = metadataValues;
           this.filename = filename;
           this.successStatus1 = successStatus1;
           this.inputStream = inputStream;
    }


    /**
     * Gets the sessionID value for this UploadFileJava.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this UploadFileJava.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the applicationID value for this UploadFileJava.
     * 
     * @return applicationID
     */
    public java.lang.Integer getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this UploadFileJava.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.Integer applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the templateID value for this UploadFileJava.
     * 
     * @return templateID
     */
    public java.lang.Integer getTemplateID() {
        return templateID;
    }


    /**
     * Sets the templateID value for this UploadFileJava.
     * 
     * @param templateID
     */
    public void setTemplateID(java.lang.Integer templateID) {
        this.templateID = templateID;
    }


    /**
     * Gets the descriptionID value for this UploadFileJava.
     * 
     * @return descriptionID
     */
    public java.lang.Integer getDescriptionID() {
        return descriptionID;
    }


    /**
     * Sets the descriptionID value for this UploadFileJava.
     * 
     * @param descriptionID
     */
    public void setDescriptionID(java.lang.Integer descriptionID) {
        this.descriptionID = descriptionID;
    }


    /**
     * Gets the metadataValues value for this UploadFileJava.
     * 
     * @return metadataValues
     */
    public com.cleverdome.api.DocumentMetadataValueBase[] getMetadataValues() {
        return metadataValues;
    }


    /**
     * Sets the metadataValues value for this UploadFileJava.
     * 
     * @param metadataValues
     */
    public void setMetadataValues(com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) {
        this.metadataValues = metadataValues;
    }


    /**
     * Gets the filename value for this UploadFileJava.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this UploadFileJava.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the successStatus1 value for this UploadFileJava.
     * 
     * @return successStatus1
     */
    public java.lang.String getSuccessStatus1() {
        return successStatus1;
    }


    /**
     * Sets the successStatus1 value for this UploadFileJava.
     * 
     * @param successStatus1
     */
    public void setSuccessStatus1(java.lang.String successStatus1) {
        this.successStatus1 = successStatus1;
    }


    /**
     * Gets the inputStream value for this UploadFileJava.
     * 
     * @return inputStream
     */
    public byte[] getInputStream() {
        return inputStream;
    }


    /**
     * Sets the inputStream value for this UploadFileJava.
     * 
     * @param inputStream
     */
    public void setInputStream(byte[] inputStream) {
        this.inputStream = inputStream;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadFileJava)) return false;
        UploadFileJava other = (UploadFileJava) obj;
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
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.templateID==null && other.getTemplateID()==null) || 
             (this.templateID!=null &&
              this.templateID.equals(other.getTemplateID()))) &&
            ((this.descriptionID==null && other.getDescriptionID()==null) || 
             (this.descriptionID!=null &&
              this.descriptionID.equals(other.getDescriptionID()))) &&
            ((this.metadataValues==null && other.getMetadataValues()==null) || 
             (this.metadataValues!=null &&
              java.util.Arrays.equals(this.metadataValues, other.getMetadataValues()))) &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            ((this.successStatus1==null && other.getSuccessStatus1()==null) || 
             (this.successStatus1!=null &&
              this.successStatus1.equals(other.getSuccessStatus1()))) &&
            ((this.inputStream==null && other.getInputStream()==null) || 
             (this.inputStream!=null &&
              java.util.Arrays.equals(this.inputStream, other.getInputStream())));
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
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getTemplateID() != null) {
            _hashCode += getTemplateID().hashCode();
        }
        if (getDescriptionID() != null) {
            _hashCode += getDescriptionID().hashCode();
        }
        if (getMetadataValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetadataValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetadataValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        if (getSuccessStatus1() != null) {
            _hashCode += getSuccessStatus1().hashCode();
        }
        if (getInputStream() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputStream());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputStream(), i);
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
        new org.apache.axis.description.TypeDesc(UploadFileJava.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UploadFileJava"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "applicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "templateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "descriptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "metadataValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successStatus1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "successStatus1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputStream");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "inputStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
