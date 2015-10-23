/**
 * IsEnoughSpaceToUploadFileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class IsEnoughSpaceToUploadFileResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfstring isEnoughSpaceToUploadFileResult;

    public IsEnoughSpaceToUploadFileResponse() {
    }

    public IsEnoughSpaceToUploadFileResponse(
           com.cleverdome.api.OperationResultOfstring isEnoughSpaceToUploadFileResult) {
           this.isEnoughSpaceToUploadFileResult = isEnoughSpaceToUploadFileResult;
    }


    /**
     * Gets the isEnoughSpaceToUploadFileResult value for this IsEnoughSpaceToUploadFileResponse.
     * 
     * @return isEnoughSpaceToUploadFileResult
     */
    public com.cleverdome.api.OperationResultOfstring getIsEnoughSpaceToUploadFileResult() {
        return isEnoughSpaceToUploadFileResult;
    }


    /**
     * Sets the isEnoughSpaceToUploadFileResult value for this IsEnoughSpaceToUploadFileResponse.
     * 
     * @param isEnoughSpaceToUploadFileResult
     */
    public void setIsEnoughSpaceToUploadFileResult(com.cleverdome.api.OperationResultOfstring isEnoughSpaceToUploadFileResult) {
        this.isEnoughSpaceToUploadFileResult = isEnoughSpaceToUploadFileResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsEnoughSpaceToUploadFileResponse)) return false;
        IsEnoughSpaceToUploadFileResponse other = (IsEnoughSpaceToUploadFileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isEnoughSpaceToUploadFileResult==null && other.getIsEnoughSpaceToUploadFileResult()==null) || 
             (this.isEnoughSpaceToUploadFileResult!=null &&
              this.isEnoughSpaceToUploadFileResult.equals(other.getIsEnoughSpaceToUploadFileResult())));
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
        if (getIsEnoughSpaceToUploadFileResult() != null) {
            _hashCode += getIsEnoughSpaceToUploadFileResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsEnoughSpaceToUploadFileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">IsEnoughSpaceToUploadFileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnoughSpaceToUploadFileResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsEnoughSpaceToUploadFileResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfstring"));
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
