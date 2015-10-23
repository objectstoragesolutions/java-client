/**
 * GetArchiveInfoForDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetArchiveInfoForDocumentResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionArchiveInfowJCT_PyJf getArchiveInfoForDocumentResult;

    public GetArchiveInfoForDocumentResponse() {
    }

    public GetArchiveInfoForDocumentResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionArchiveInfowJCT_PyJf getArchiveInfoForDocumentResult) {
           this.getArchiveInfoForDocumentResult = getArchiveInfoForDocumentResult;
    }


    /**
     * Gets the getArchiveInfoForDocumentResult value for this GetArchiveInfoForDocumentResponse.
     * 
     * @return getArchiveInfoForDocumentResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionArchiveInfowJCT_PyJf getGetArchiveInfoForDocumentResult() {
        return getArchiveInfoForDocumentResult;
    }


    /**
     * Sets the getArchiveInfoForDocumentResult value for this GetArchiveInfoForDocumentResponse.
     * 
     * @param getArchiveInfoForDocumentResult
     */
    public void setGetArchiveInfoForDocumentResult(com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionArchiveInfowJCT_PyJf getArchiveInfoForDocumentResult) {
        this.getArchiveInfoForDocumentResult = getArchiveInfoForDocumentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetArchiveInfoForDocumentResponse)) return false;
        GetArchiveInfoForDocumentResponse other = (GetArchiveInfoForDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getArchiveInfoForDocumentResult==null && other.getGetArchiveInfoForDocumentResult()==null) || 
             (this.getArchiveInfoForDocumentResult!=null &&
              this.getArchiveInfoForDocumentResult.equals(other.getGetArchiveInfoForDocumentResult())));
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
        if (getGetArchiveInfoForDocumentResult() != null) {
            _hashCode += getGetArchiveInfoForDocumentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetArchiveInfoForDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetArchiveInfoForDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getArchiveInfoForDocumentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetArchiveInfoForDocumentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentRevisionArchiveInfowJCT_PyJf"));
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
