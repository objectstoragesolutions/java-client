/**
 * GetBatchIDForCriteriaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetBatchIDForCriteriaResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfNullableOfint5F2DSckg getBatchIDForCriteriaResult;

    public GetBatchIDForCriteriaResponse() {
    }

    public GetBatchIDForCriteriaResponse(
           com.cleverdome.api.OperationResultOfNullableOfint5F2DSckg getBatchIDForCriteriaResult) {
           this.getBatchIDForCriteriaResult = getBatchIDForCriteriaResult;
    }


    /**
     * Gets the getBatchIDForCriteriaResult value for this GetBatchIDForCriteriaResponse.
     * 
     * @return getBatchIDForCriteriaResult
     */
    public com.cleverdome.api.OperationResultOfNullableOfint5F2DSckg getGetBatchIDForCriteriaResult() {
        return getBatchIDForCriteriaResult;
    }


    /**
     * Sets the getBatchIDForCriteriaResult value for this GetBatchIDForCriteriaResponse.
     * 
     * @param getBatchIDForCriteriaResult
     */
    public void setGetBatchIDForCriteriaResult(com.cleverdome.api.OperationResultOfNullableOfint5F2DSckg getBatchIDForCriteriaResult) {
        this.getBatchIDForCriteriaResult = getBatchIDForCriteriaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBatchIDForCriteriaResponse)) return false;
        GetBatchIDForCriteriaResponse other = (GetBatchIDForCriteriaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBatchIDForCriteriaResult==null && other.getGetBatchIDForCriteriaResult()==null) || 
             (this.getBatchIDForCriteriaResult!=null &&
              this.getBatchIDForCriteriaResult.equals(other.getGetBatchIDForCriteriaResult())));
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
        if (getGetBatchIDForCriteriaResult() != null) {
            _hashCode += getGetBatchIDForCriteriaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBatchIDForCriteriaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBatchIDForCriteriaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBatchIDForCriteriaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBatchIDForCriteriaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfNullableOfint5F2dSckg"));
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
