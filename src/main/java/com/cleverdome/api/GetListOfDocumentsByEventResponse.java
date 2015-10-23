/**
 * GetListOfDocumentsByEventResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetListOfDocumentsByEventResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getListOfDocumentsByEventResult;

    public GetListOfDocumentsByEventResponse() {
    }

    public GetListOfDocumentsByEventResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getListOfDocumentsByEventResult) {
           this.getListOfDocumentsByEventResult = getListOfDocumentsByEventResult;
    }


    /**
     * Gets the getListOfDocumentsByEventResult value for this GetListOfDocumentsByEventResponse.
     * 
     * @return getListOfDocumentsByEventResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getGetListOfDocumentsByEventResult() {
        return getListOfDocumentsByEventResult;
    }


    /**
     * Sets the getListOfDocumentsByEventResult value for this GetListOfDocumentsByEventResponse.
     * 
     * @param getListOfDocumentsByEventResult
     */
    public void setGetListOfDocumentsByEventResult(com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getListOfDocumentsByEventResult) {
        this.getListOfDocumentsByEventResult = getListOfDocumentsByEventResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListOfDocumentsByEventResponse)) return false;
        GetListOfDocumentsByEventResponse other = (GetListOfDocumentsByEventResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getListOfDocumentsByEventResult==null && other.getGetListOfDocumentsByEventResult()==null) || 
             (this.getListOfDocumentsByEventResult!=null &&
              this.getListOfDocumentsByEventResult.equals(other.getGetListOfDocumentsByEventResult())));
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
        if (getGetListOfDocumentsByEventResult() != null) {
            _hashCode += getGetListOfDocumentsByEventResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetListOfDocumentsByEventResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetListOfDocumentsByEventResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getListOfDocumentsByEventResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetListOfDocumentsByEventResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentwJCT_PyJf"));
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
