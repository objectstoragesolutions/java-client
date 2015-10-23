/**
 * GetRelatedDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetRelatedDocumentsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfListPageDataOfDocumentwJCT_PyJfYbvldztq getRelatedDocumentsResult;

    public GetRelatedDocumentsResponse() {
    }

    public GetRelatedDocumentsResponse(
           com.cleverdome.api.OperationResultOfListPageDataOfDocumentwJCT_PyJfYbvldztq getRelatedDocumentsResult) {
           this.getRelatedDocumentsResult = getRelatedDocumentsResult;
    }


    /**
     * Gets the getRelatedDocumentsResult value for this GetRelatedDocumentsResponse.
     * 
     * @return getRelatedDocumentsResult
     */
    public com.cleverdome.api.OperationResultOfListPageDataOfDocumentwJCT_PyJfYbvldztq getGetRelatedDocumentsResult() {
        return getRelatedDocumentsResult;
    }


    /**
     * Sets the getRelatedDocumentsResult value for this GetRelatedDocumentsResponse.
     * 
     * @param getRelatedDocumentsResult
     */
    public void setGetRelatedDocumentsResult(com.cleverdome.api.OperationResultOfListPageDataOfDocumentwJCT_PyJfYbvldztq getRelatedDocumentsResult) {
        this.getRelatedDocumentsResult = getRelatedDocumentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRelatedDocumentsResponse)) return false;
        GetRelatedDocumentsResponse other = (GetRelatedDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRelatedDocumentsResult==null && other.getGetRelatedDocumentsResult()==null) || 
             (this.getRelatedDocumentsResult!=null &&
              this.getRelatedDocumentsResult.equals(other.getGetRelatedDocumentsResult())));
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
        if (getGetRelatedDocumentsResult() != null) {
            _hashCode += getGetRelatedDocumentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRelatedDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRelatedDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRelatedDocumentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetRelatedDocumentsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfListPageDataOfDocumentwJCT_PyJfYbvldztq"));
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
