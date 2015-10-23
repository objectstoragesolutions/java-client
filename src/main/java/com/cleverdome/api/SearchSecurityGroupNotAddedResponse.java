/**
 * SearchSecurityGroupNotAddedResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SearchSecurityGroupNotAddedResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf searchSecurityGroupNotAddedResult;

    public SearchSecurityGroupNotAddedResponse() {
    }

    public SearchSecurityGroupNotAddedResponse(
           com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf searchSecurityGroupNotAddedResult) {
           this.searchSecurityGroupNotAddedResult = searchSecurityGroupNotAddedResult;
    }


    /**
     * Gets the searchSecurityGroupNotAddedResult value for this SearchSecurityGroupNotAddedResponse.
     * 
     * @return searchSecurityGroupNotAddedResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getSearchSecurityGroupNotAddedResult() {
        return searchSecurityGroupNotAddedResult;
    }


    /**
     * Sets the searchSecurityGroupNotAddedResult value for this SearchSecurityGroupNotAddedResponse.
     * 
     * @param searchSecurityGroupNotAddedResult
     */
    public void setSearchSecurityGroupNotAddedResult(com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf searchSecurityGroupNotAddedResult) {
        this.searchSecurityGroupNotAddedResult = searchSecurityGroupNotAddedResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchSecurityGroupNotAddedResponse)) return false;
        SearchSecurityGroupNotAddedResponse other = (SearchSecurityGroupNotAddedResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchSecurityGroupNotAddedResult==null && other.getSearchSecurityGroupNotAddedResult()==null) || 
             (this.searchSecurityGroupNotAddedResult!=null &&
              this.searchSecurityGroupNotAddedResult.equals(other.getSearchSecurityGroupNotAddedResult())));
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
        if (getSearchSecurityGroupNotAddedResult() != null) {
            _hashCode += getSearchSecurityGroupNotAddedResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchSecurityGroupNotAddedResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SearchSecurityGroupNotAddedResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchSecurityGroupNotAddedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SearchSecurityGroupNotAddedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfSecurityGroupwJCT_PyJf"));
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
