/**
 * CreateNewVendorResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class CreateNewVendorResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfboolean createNewVendorResult;

    public CreateNewVendorResponse() {
    }

    public CreateNewVendorResponse(
           com.cleverdome.api.OperationResultOfboolean createNewVendorResult) {
           this.createNewVendorResult = createNewVendorResult;
    }


    /**
     * Gets the createNewVendorResult value for this CreateNewVendorResponse.
     * 
     * @return createNewVendorResult
     */
    public com.cleverdome.api.OperationResultOfboolean getCreateNewVendorResult() {
        return createNewVendorResult;
    }


    /**
     * Sets the createNewVendorResult value for this CreateNewVendorResponse.
     * 
     * @param createNewVendorResult
     */
    public void setCreateNewVendorResult(com.cleverdome.api.OperationResultOfboolean createNewVendorResult) {
        this.createNewVendorResult = createNewVendorResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateNewVendorResponse)) return false;
        CreateNewVendorResponse other = (CreateNewVendorResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createNewVendorResult==null && other.getCreateNewVendorResult()==null) || 
             (this.createNewVendorResult!=null &&
              this.createNewVendorResult.equals(other.getCreateNewVendorResult())));
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
        if (getCreateNewVendorResult() != null) {
            _hashCode += getCreateNewVendorResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateNewVendorResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CreateNewVendorResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createNewVendorResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CreateNewVendorResult"));
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
