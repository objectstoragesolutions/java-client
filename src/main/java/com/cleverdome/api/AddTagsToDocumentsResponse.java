/**
 * AddTagsToDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddTagsToDocumentsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfboolean addTagsToDocumentsResult;

    public AddTagsToDocumentsResponse() {
    }

    public AddTagsToDocumentsResponse(
           com.cleverdome.api.OperationResultOfboolean addTagsToDocumentsResult) {
           this.addTagsToDocumentsResult = addTagsToDocumentsResult;
    }


    /**
     * Gets the addTagsToDocumentsResult value for this AddTagsToDocumentsResponse.
     * 
     * @return addTagsToDocumentsResult
     */
    public com.cleverdome.api.OperationResultOfboolean getAddTagsToDocumentsResult() {
        return addTagsToDocumentsResult;
    }


    /**
     * Sets the addTagsToDocumentsResult value for this AddTagsToDocumentsResponse.
     * 
     * @param addTagsToDocumentsResult
     */
    public void setAddTagsToDocumentsResult(com.cleverdome.api.OperationResultOfboolean addTagsToDocumentsResult) {
        this.addTagsToDocumentsResult = addTagsToDocumentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddTagsToDocumentsResponse)) return false;
        AddTagsToDocumentsResponse other = (AddTagsToDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addTagsToDocumentsResult==null && other.getAddTagsToDocumentsResult()==null) || 
             (this.addTagsToDocumentsResult!=null &&
              this.addTagsToDocumentsResult.equals(other.getAddTagsToDocumentsResult())));
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
        if (getAddTagsToDocumentsResult() != null) {
            _hashCode += getAddTagsToDocumentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddTagsToDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddTagsToDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTagsToDocumentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddTagsToDocumentsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfboolean"));
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
