/**
 * GetDocumentsSharingInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentsSharingInfoResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfDocumentsSharingInfo50La3KLP getDocumentsSharingInfoResult;

    public GetDocumentsSharingInfoResponse() {
    }

    public GetDocumentsSharingInfoResponse(
           com.cleverdome.api.OperationResultOfDocumentsSharingInfo50La3KLP getDocumentsSharingInfoResult) {
           this.getDocumentsSharingInfoResult = getDocumentsSharingInfoResult;
    }


    /**
     * Gets the getDocumentsSharingInfoResult value for this GetDocumentsSharingInfoResponse.
     * 
     * @return getDocumentsSharingInfoResult
     */
    public com.cleverdome.api.OperationResultOfDocumentsSharingInfo50La3KLP getGetDocumentsSharingInfoResult() {
        return getDocumentsSharingInfoResult;
    }


    /**
     * Sets the getDocumentsSharingInfoResult value for this GetDocumentsSharingInfoResponse.
     * 
     * @param getDocumentsSharingInfoResult
     */
    public void setGetDocumentsSharingInfoResult(com.cleverdome.api.OperationResultOfDocumentsSharingInfo50La3KLP getDocumentsSharingInfoResult) {
        this.getDocumentsSharingInfoResult = getDocumentsSharingInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsSharingInfoResponse)) return false;
        GetDocumentsSharingInfoResponse other = (GetDocumentsSharingInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentsSharingInfoResult==null && other.getGetDocumentsSharingInfoResult()==null) || 
             (this.getDocumentsSharingInfoResult!=null &&
              this.getDocumentsSharingInfoResult.equals(other.getGetDocumentsSharingInfoResult())));
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
        if (getGetDocumentsSharingInfoResult() != null) {
            _hashCode += getGetDocumentsSharingInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentsSharingInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsSharingInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentsSharingInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentsSharingInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfDocumentsSharingInfo50La3KLP"));
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
