/**
 * GetDocumentBarcodesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentBarcodesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfListPageDataOfBarcodeData4T4GnWAZYbvldztq getDocumentBarcodesResult;

    public GetDocumentBarcodesResponse() {
    }

    public GetDocumentBarcodesResponse(
           com.cleverdome.api.OperationResultOfListPageDataOfBarcodeData4T4GnWAZYbvldztq getDocumentBarcodesResult) {
           this.getDocumentBarcodesResult = getDocumentBarcodesResult;
    }


    /**
     * Gets the getDocumentBarcodesResult value for this GetDocumentBarcodesResponse.
     * 
     * @return getDocumentBarcodesResult
     */
    public com.cleverdome.api.OperationResultOfListPageDataOfBarcodeData4T4GnWAZYbvldztq getGetDocumentBarcodesResult() {
        return getDocumentBarcodesResult;
    }


    /**
     * Sets the getDocumentBarcodesResult value for this GetDocumentBarcodesResponse.
     * 
     * @param getDocumentBarcodesResult
     */
    public void setGetDocumentBarcodesResult(com.cleverdome.api.OperationResultOfListPageDataOfBarcodeData4T4GnWAZYbvldztq getDocumentBarcodesResult) {
        this.getDocumentBarcodesResult = getDocumentBarcodesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentBarcodesResponse)) return false;
        GetDocumentBarcodesResponse other = (GetDocumentBarcodesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentBarcodesResult==null && other.getGetDocumentBarcodesResult()==null) || 
             (this.getDocumentBarcodesResult!=null &&
              this.getDocumentBarcodesResult.equals(other.getGetDocumentBarcodesResult())));
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
        if (getGetDocumentBarcodesResult() != null) {
            _hashCode += getGetDocumentBarcodesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentBarcodesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentBarcodesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentBarcodesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentBarcodesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfListPageDataOfBarcodeData4T4gnWAZYbvldztq"));
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
