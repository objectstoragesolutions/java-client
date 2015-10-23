/**
 * GetPermittedTagTreesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetPermittedTagTreesResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfPermittedTagTreesInfo52SKXdDF getPermittedTagTreesResult;

    public GetPermittedTagTreesResponse() {
    }

    public GetPermittedTagTreesResponse(
           com.cleverdome.api.OperationResultOfPermittedTagTreesInfo52SKXdDF getPermittedTagTreesResult) {
           this.getPermittedTagTreesResult = getPermittedTagTreesResult;
    }


    /**
     * Gets the getPermittedTagTreesResult value for this GetPermittedTagTreesResponse.
     * 
     * @return getPermittedTagTreesResult
     */
    public com.cleverdome.api.OperationResultOfPermittedTagTreesInfo52SKXdDF getGetPermittedTagTreesResult() {
        return getPermittedTagTreesResult;
    }


    /**
     * Sets the getPermittedTagTreesResult value for this GetPermittedTagTreesResponse.
     * 
     * @param getPermittedTagTreesResult
     */
    public void setGetPermittedTagTreesResult(com.cleverdome.api.OperationResultOfPermittedTagTreesInfo52SKXdDF getPermittedTagTreesResult) {
        this.getPermittedTagTreesResult = getPermittedTagTreesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPermittedTagTreesResponse)) return false;
        GetPermittedTagTreesResponse other = (GetPermittedTagTreesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPermittedTagTreesResult==null && other.getGetPermittedTagTreesResult()==null) || 
             (this.getPermittedTagTreesResult!=null &&
              this.getPermittedTagTreesResult.equals(other.getGetPermittedTagTreesResult())));
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
        if (getGetPermittedTagTreesResult() != null) {
            _hashCode += getGetPermittedTagTreesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPermittedTagTreesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPermittedTagTreesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPermittedTagTreesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPermittedTagTreesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfPermittedTagTreesInfo52SKXdDF"));
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
