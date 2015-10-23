/**
 * GetAllAvailableDocumentFieldTypesDetailedResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetAllAvailableDocumentFieldTypesDetailedResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentFieldDetailedwJCT_PyJf getAllAvailableDocumentFieldTypesDetailedResult;

    public GetAllAvailableDocumentFieldTypesDetailedResponse() {
    }

    public GetAllAvailableDocumentFieldTypesDetailedResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentFieldDetailedwJCT_PyJf getAllAvailableDocumentFieldTypesDetailedResult) {
           this.getAllAvailableDocumentFieldTypesDetailedResult = getAllAvailableDocumentFieldTypesDetailedResult;
    }


    /**
     * Gets the getAllAvailableDocumentFieldTypesDetailedResult value for this GetAllAvailableDocumentFieldTypesDetailedResponse.
     * 
     * @return getAllAvailableDocumentFieldTypesDetailedResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldDetailedwJCT_PyJf getGetAllAvailableDocumentFieldTypesDetailedResult() {
        return getAllAvailableDocumentFieldTypesDetailedResult;
    }


    /**
     * Sets the getAllAvailableDocumentFieldTypesDetailedResult value for this GetAllAvailableDocumentFieldTypesDetailedResponse.
     * 
     * @param getAllAvailableDocumentFieldTypesDetailedResult
     */
    public void setGetAllAvailableDocumentFieldTypesDetailedResult(com.cleverdome.api.OperationResultOfArrayOfDocumentFieldDetailedwJCT_PyJf getAllAvailableDocumentFieldTypesDetailedResult) {
        this.getAllAvailableDocumentFieldTypesDetailedResult = getAllAvailableDocumentFieldTypesDetailedResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllAvailableDocumentFieldTypesDetailedResponse)) return false;
        GetAllAvailableDocumentFieldTypesDetailedResponse other = (GetAllAvailableDocumentFieldTypesDetailedResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllAvailableDocumentFieldTypesDetailedResult==null && other.getGetAllAvailableDocumentFieldTypesDetailedResult()==null) || 
             (this.getAllAvailableDocumentFieldTypesDetailedResult!=null &&
              this.getAllAvailableDocumentFieldTypesDetailedResult.equals(other.getGetAllAvailableDocumentFieldTypesDetailedResult())));
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
        if (getGetAllAvailableDocumentFieldTypesDetailedResult() != null) {
            _hashCode += getGetAllAvailableDocumentFieldTypesDetailedResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllAvailableDocumentFieldTypesDetailedResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllAvailableDocumentFieldTypesDetailedResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllAvailableDocumentFieldTypesDetailedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllAvailableDocumentFieldTypesDetailedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentFieldDetailedwJCT_PyJf"));
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
