/**
 * SearchUsersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class SearchUsersResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfUserDatawJCT_PyJf searchUsersResult;

    public SearchUsersResponse() {
    }

    public SearchUsersResponse(
           com.cleverdome.api.OperationResultOfArrayOfUserDatawJCT_PyJf searchUsersResult) {
           this.searchUsersResult = searchUsersResult;
    }


    /**
     * Gets the searchUsersResult value for this SearchUsersResponse.
     * 
     * @return searchUsersResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfUserDatawJCT_PyJf getSearchUsersResult() {
        return searchUsersResult;
    }


    /**
     * Sets the searchUsersResult value for this SearchUsersResponse.
     * 
     * @param searchUsersResult
     */
    public void setSearchUsersResult(com.cleverdome.api.OperationResultOfArrayOfUserDatawJCT_PyJf searchUsersResult) {
        this.searchUsersResult = searchUsersResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchUsersResponse)) return false;
        SearchUsersResponse other = (SearchUsersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchUsersResult==null && other.getSearchUsersResult()==null) || 
             (this.searchUsersResult!=null &&
              this.searchUsersResult.equals(other.getSearchUsersResult())));
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
        if (getSearchUsersResult() != null) {
            _hashCode += getSearchUsersResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchUsersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SearchUsersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchUsersResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SearchUsersResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfUserDatawJCT_PyJf"));
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
