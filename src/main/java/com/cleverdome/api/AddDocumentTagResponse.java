/**
 * AddDocumentTagResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddDocumentTagResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDocumentTagwJCT_PyJf addDocumentTagResult;

    public AddDocumentTagResponse() {
    }

    public AddDocumentTagResponse(
           com.cleverdome.api.OperationResultOfDocumentTagwJCT_PyJf addDocumentTagResult) {
           this.addDocumentTagResult = addDocumentTagResult;
    }


    /**
     * Gets the addDocumentTagResult value for this AddDocumentTagResponse.
     * 
     * @return addDocumentTagResult
     */
    public com.cleverdome.api.OperationResultOfDocumentTagwJCT_PyJf getAddDocumentTagResult() {
        return addDocumentTagResult;
    }


    /**
     * Sets the addDocumentTagResult value for this AddDocumentTagResponse.
     * 
     * @param addDocumentTagResult
     */
    public void setAddDocumentTagResult(com.cleverdome.api.OperationResultOfDocumentTagwJCT_PyJf addDocumentTagResult) {
        this.addDocumentTagResult = addDocumentTagResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddDocumentTagResponse)) return false;
        AddDocumentTagResponse other = (AddDocumentTagResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addDocumentTagResult==null && other.getAddDocumentTagResult()==null) || 
             (this.addDocumentTagResult!=null &&
              this.addDocumentTagResult.equals(other.getAddDocumentTagResult())));
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
        if (getAddDocumentTagResult() != null) {
            _hashCode += getAddDocumentTagResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddDocumentTagResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddDocumentTagResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addDocumentTagResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddDocumentTagResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDocumentTagwJCT_PyJf"));
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
