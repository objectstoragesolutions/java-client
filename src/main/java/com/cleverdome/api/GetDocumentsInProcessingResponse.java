/**
 * GetDocumentsInProcessingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentsInProcessingResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfChangedDocumentwJCT_PyJf getDocumentsInProcessingResult;

    public GetDocumentsInProcessingResponse() {
    }

    public GetDocumentsInProcessingResponse(
           com.cleverdome.api.OperationResultOfArrayOfChangedDocumentwJCT_PyJf getDocumentsInProcessingResult) {
           this.getDocumentsInProcessingResult = getDocumentsInProcessingResult;
    }


    /**
     * Gets the getDocumentsInProcessingResult value for this GetDocumentsInProcessingResponse.
     * 
     * @return getDocumentsInProcessingResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfChangedDocumentwJCT_PyJf getGetDocumentsInProcessingResult() {
        return getDocumentsInProcessingResult;
    }


    /**
     * Sets the getDocumentsInProcessingResult value for this GetDocumentsInProcessingResponse.
     * 
     * @param getDocumentsInProcessingResult
     */
    public void setGetDocumentsInProcessingResult(com.cleverdome.api.OperationResultOfArrayOfChangedDocumentwJCT_PyJf getDocumentsInProcessingResult) {
        this.getDocumentsInProcessingResult = getDocumentsInProcessingResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsInProcessingResponse)) return false;
        GetDocumentsInProcessingResponse other = (GetDocumentsInProcessingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentsInProcessingResult==null && other.getGetDocumentsInProcessingResult()==null) || 
             (this.getDocumentsInProcessingResult!=null &&
              this.getDocumentsInProcessingResult.equals(other.getGetDocumentsInProcessingResult())));
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
        if (getGetDocumentsInProcessingResult() != null) {
            _hashCode += getGetDocumentsInProcessingResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentsInProcessingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsInProcessingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentsInProcessingResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentsInProcessingResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfChangedDocumentwJCT_PyJf"));
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
