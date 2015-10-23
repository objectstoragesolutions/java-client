/**
 * GetDocumentRevisionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentRevisionsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionwJCT_PyJf getDocumentRevisionsResult;

    public GetDocumentRevisionsResponse() {
    }

    public GetDocumentRevisionsResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionwJCT_PyJf getDocumentRevisionsResult) {
           this.getDocumentRevisionsResult = getDocumentRevisionsResult;
    }


    /**
     * Gets the getDocumentRevisionsResult value for this GetDocumentRevisionsResponse.
     * 
     * @return getDocumentRevisionsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionwJCT_PyJf getGetDocumentRevisionsResult() {
        return getDocumentRevisionsResult;
    }


    /**
     * Sets the getDocumentRevisionsResult value for this GetDocumentRevisionsResponse.
     * 
     * @param getDocumentRevisionsResult
     */
    public void setGetDocumentRevisionsResult(com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionwJCT_PyJf getDocumentRevisionsResult) {
        this.getDocumentRevisionsResult = getDocumentRevisionsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentRevisionsResponse)) return false;
        GetDocumentRevisionsResponse other = (GetDocumentRevisionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentRevisionsResult==null && other.getGetDocumentRevisionsResult()==null) || 
             (this.getDocumentRevisionsResult!=null &&
              this.getDocumentRevisionsResult.equals(other.getGetDocumentRevisionsResult())));
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
        if (getGetDocumentRevisionsResult() != null) {
            _hashCode += getGetDocumentRevisionsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentRevisionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentRevisionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentRevisionsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentRevisionsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentRevisionwJCT_PyJf"));
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
