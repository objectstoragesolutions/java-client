/**
 * GetDefaulTemplateAndDescriptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDefaulTemplateAndDescriptionResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDefaultTemplateTypewJCT_PyJf getDefaulTemplateAndDescriptionResult;

    public GetDefaulTemplateAndDescriptionResponse() {
    }

    public GetDefaulTemplateAndDescriptionResponse(
           com.cleverdome.api.OperationResultOfDefaultTemplateTypewJCT_PyJf getDefaulTemplateAndDescriptionResult) {
           this.getDefaulTemplateAndDescriptionResult = getDefaulTemplateAndDescriptionResult;
    }


    /**
     * Gets the getDefaulTemplateAndDescriptionResult value for this GetDefaulTemplateAndDescriptionResponse.
     * 
     * @return getDefaulTemplateAndDescriptionResult
     */
    public com.cleverdome.api.OperationResultOfDefaultTemplateTypewJCT_PyJf getGetDefaulTemplateAndDescriptionResult() {
        return getDefaulTemplateAndDescriptionResult;
    }


    /**
     * Sets the getDefaulTemplateAndDescriptionResult value for this GetDefaulTemplateAndDescriptionResponse.
     * 
     * @param getDefaulTemplateAndDescriptionResult
     */
    public void setGetDefaulTemplateAndDescriptionResult(com.cleverdome.api.OperationResultOfDefaultTemplateTypewJCT_PyJf getDefaulTemplateAndDescriptionResult) {
        this.getDefaulTemplateAndDescriptionResult = getDefaulTemplateAndDescriptionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDefaulTemplateAndDescriptionResponse)) return false;
        GetDefaulTemplateAndDescriptionResponse other = (GetDefaulTemplateAndDescriptionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDefaulTemplateAndDescriptionResult==null && other.getGetDefaulTemplateAndDescriptionResult()==null) || 
             (this.getDefaulTemplateAndDescriptionResult!=null &&
              this.getDefaulTemplateAndDescriptionResult.equals(other.getGetDefaulTemplateAndDescriptionResult())));
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
        if (getGetDefaulTemplateAndDescriptionResult() != null) {
            _hashCode += getGetDefaulTemplateAndDescriptionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDefaulTemplateAndDescriptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDefaulTemplateAndDescriptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDefaulTemplateAndDescriptionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDefaulTemplateAndDescriptionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDefaultTemplateTypewJCT_PyJf"));
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
