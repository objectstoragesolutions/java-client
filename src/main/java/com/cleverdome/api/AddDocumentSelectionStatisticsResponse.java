/**
 * AddDocumentSelectionStatisticsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class AddDocumentSelectionStatisticsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfanyType addDocumentSelectionStatisticsResult;

    public AddDocumentSelectionStatisticsResponse() {
    }

    public AddDocumentSelectionStatisticsResponse(
           com.cleverdome.api.OperationResultOfanyType addDocumentSelectionStatisticsResult) {
           this.addDocumentSelectionStatisticsResult = addDocumentSelectionStatisticsResult;
    }


    /**
     * Gets the addDocumentSelectionStatisticsResult value for this AddDocumentSelectionStatisticsResponse.
     * 
     * @return addDocumentSelectionStatisticsResult
     */
    public com.cleverdome.api.OperationResultOfanyType getAddDocumentSelectionStatisticsResult() {
        return addDocumentSelectionStatisticsResult;
    }


    /**
     * Sets the addDocumentSelectionStatisticsResult value for this AddDocumentSelectionStatisticsResponse.
     * 
     * @param addDocumentSelectionStatisticsResult
     */
    public void setAddDocumentSelectionStatisticsResult(com.cleverdome.api.OperationResultOfanyType addDocumentSelectionStatisticsResult) {
        this.addDocumentSelectionStatisticsResult = addDocumentSelectionStatisticsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddDocumentSelectionStatisticsResponse)) return false;
        AddDocumentSelectionStatisticsResponse other = (AddDocumentSelectionStatisticsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addDocumentSelectionStatisticsResult==null && other.getAddDocumentSelectionStatisticsResult()==null) || 
             (this.addDocumentSelectionStatisticsResult!=null &&
              this.addDocumentSelectionStatisticsResult.equals(other.getAddDocumentSelectionStatisticsResult())));
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
        if (getAddDocumentSelectionStatisticsResult() != null) {
            _hashCode += getAddDocumentSelectionStatisticsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddDocumentSelectionStatisticsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddDocumentSelectionStatisticsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addDocumentSelectionStatisticsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddDocumentSelectionStatisticsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfanyType"));
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
