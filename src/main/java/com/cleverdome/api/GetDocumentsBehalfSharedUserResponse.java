/**
 * GetDocumentsBehalfSharedUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentsBehalfSharedUserResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getDocumentsBehalfSharedUserResult;

    public GetDocumentsBehalfSharedUserResponse() {
    }

    public GetDocumentsBehalfSharedUserResponse(
           com.cleverdome.api.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getDocumentsBehalfSharedUserResult) {
           this.getDocumentsBehalfSharedUserResult = getDocumentsBehalfSharedUserResult;
    }


    /**
     * Gets the getDocumentsBehalfSharedUserResult value for this GetDocumentsBehalfSharedUserResponse.
     * 
     * @return getDocumentsBehalfSharedUserResult
     */
    public com.cleverdome.api.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getGetDocumentsBehalfSharedUserResult() {
        return getDocumentsBehalfSharedUserResult;
    }


    /**
     * Sets the getDocumentsBehalfSharedUserResult value for this GetDocumentsBehalfSharedUserResponse.
     * 
     * @param getDocumentsBehalfSharedUserResult
     */
    public void setGetDocumentsBehalfSharedUserResult(com.cleverdome.api.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getDocumentsBehalfSharedUserResult) {
        this.getDocumentsBehalfSharedUserResult = getDocumentsBehalfSharedUserResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentsBehalfSharedUserResponse)) return false;
        GetDocumentsBehalfSharedUserResponse other = (GetDocumentsBehalfSharedUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentsBehalfSharedUserResult==null && other.getGetDocumentsBehalfSharedUserResult()==null) || 
             (this.getDocumentsBehalfSharedUserResult!=null &&
              this.getDocumentsBehalfSharedUserResult.equals(other.getGetDocumentsBehalfSharedUserResult())));
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
        if (getGetDocumentsBehalfSharedUserResult() != null) {
            _hashCode += getGetDocumentsBehalfSharedUserResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentsBehalfSharedUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentsBehalfSharedUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentsBehalfSharedUserResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentsBehalfSharedUserResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq"));
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
