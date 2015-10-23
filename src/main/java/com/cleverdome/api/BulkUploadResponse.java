/**
 * BulkUploadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class BulkUploadResponse  implements java.io.Serializable {
    private java.lang.String documentGuid;

    private java.lang.String errorMessage;

    private java.lang.Boolean isUploadedSuccessfully;

    private java.lang.String uploadGuid;

    public BulkUploadResponse() {
    }

    public BulkUploadResponse(
           java.lang.String documentGuid,
           java.lang.String errorMessage,
           java.lang.Boolean isUploadedSuccessfully,
           java.lang.String uploadGuid) {
           this.documentGuid = documentGuid;
           this.errorMessage = errorMessage;
           this.isUploadedSuccessfully = isUploadedSuccessfully;
           this.uploadGuid = uploadGuid;
    }


    /**
     * Gets the documentGuid value for this BulkUploadResponse.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this BulkUploadResponse.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the errorMessage value for this BulkUploadResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this BulkUploadResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the isUploadedSuccessfully value for this BulkUploadResponse.
     * 
     * @return isUploadedSuccessfully
     */
    public java.lang.Boolean getIsUploadedSuccessfully() {
        return isUploadedSuccessfully;
    }


    /**
     * Sets the isUploadedSuccessfully value for this BulkUploadResponse.
     * 
     * @param isUploadedSuccessfully
     */
    public void setIsUploadedSuccessfully(java.lang.Boolean isUploadedSuccessfully) {
        this.isUploadedSuccessfully = isUploadedSuccessfully;
    }


    /**
     * Gets the uploadGuid value for this BulkUploadResponse.
     * 
     * @return uploadGuid
     */
    public java.lang.String getUploadGuid() {
        return uploadGuid;
    }


    /**
     * Sets the uploadGuid value for this BulkUploadResponse.
     * 
     * @param uploadGuid
     */
    public void setUploadGuid(java.lang.String uploadGuid) {
        this.uploadGuid = uploadGuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkUploadResponse)) return false;
        BulkUploadResponse other = (BulkUploadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentGuid==null && other.getDocumentGuid()==null) || 
             (this.documentGuid!=null &&
              this.documentGuid.equals(other.getDocumentGuid()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.isUploadedSuccessfully==null && other.getIsUploadedSuccessfully()==null) || 
             (this.isUploadedSuccessfully!=null &&
              this.isUploadedSuccessfully.equals(other.getIsUploadedSuccessfully()))) &&
            ((this.uploadGuid==null && other.getUploadGuid()==null) || 
             (this.uploadGuid!=null &&
              this.uploadGuid.equals(other.getUploadGuid())));
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
        if (getDocumentGuid() != null) {
            _hashCode += getDocumentGuid().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getIsUploadedSuccessfully() != null) {
            _hashCode += getIsUploadedSuccessfully().hashCode();
        }
        if (getUploadGuid() != null) {
            _hashCode += getUploadGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkUploadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.BulkActions", "BulkUploadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.BulkActions", "DocumentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.BulkActions", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUploadedSuccessfully");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.BulkActions", "IsUploadedSuccessfully"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.BulkActions", "UploadGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
