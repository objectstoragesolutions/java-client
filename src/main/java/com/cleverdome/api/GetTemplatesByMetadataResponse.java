/**
 * GetTemplatesByMetadataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetTemplatesByMetadataResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getTemplatesByMetadataResult;

    public GetTemplatesByMetadataResponse() {
    }

    public GetTemplatesByMetadataResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getTemplatesByMetadataResult) {
           this.getTemplatesByMetadataResult = getTemplatesByMetadataResult;
    }


    /**
     * Gets the getTemplatesByMetadataResult value for this GetTemplatesByMetadataResponse.
     * 
     * @return getTemplatesByMetadataResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getGetTemplatesByMetadataResult() {
        return getTemplatesByMetadataResult;
    }


    /**
     * Sets the getTemplatesByMetadataResult value for this GetTemplatesByMetadataResponse.
     * 
     * @param getTemplatesByMetadataResult
     */
    public void setGetTemplatesByMetadataResult(com.cleverdome.api.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getTemplatesByMetadataResult) {
        this.getTemplatesByMetadataResult = getTemplatesByMetadataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTemplatesByMetadataResponse)) return false;
        GetTemplatesByMetadataResponse other = (GetTemplatesByMetadataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTemplatesByMetadataResult==null && other.getGetTemplatesByMetadataResult()==null) || 
             (this.getTemplatesByMetadataResult!=null &&
              this.getTemplatesByMetadataResult.equals(other.getGetTemplatesByMetadataResult())));
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
        if (getGetTemplatesByMetadataResult() != null) {
            _hashCode += getGetTemplatesByMetadataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTemplatesByMetadataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTemplatesByMetadataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTemplatesByMetadataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTemplatesByMetadataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentTemplatewJCT_PyJf"));
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
