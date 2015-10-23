/**
 * GetDocumentBatchItemsForApprovalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDocumentBatchItemsForApprovalResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentBatchItemForApproval52SKXdDF getDocumentBatchItemsForApprovalResult;

    public GetDocumentBatchItemsForApprovalResponse() {
    }

    public GetDocumentBatchItemsForApprovalResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentBatchItemForApproval52SKXdDF getDocumentBatchItemsForApprovalResult) {
           this.getDocumentBatchItemsForApprovalResult = getDocumentBatchItemsForApprovalResult;
    }


    /**
     * Gets the getDocumentBatchItemsForApprovalResult value for this GetDocumentBatchItemsForApprovalResponse.
     * 
     * @return getDocumentBatchItemsForApprovalResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentBatchItemForApproval52SKXdDF getGetDocumentBatchItemsForApprovalResult() {
        return getDocumentBatchItemsForApprovalResult;
    }


    /**
     * Sets the getDocumentBatchItemsForApprovalResult value for this GetDocumentBatchItemsForApprovalResponse.
     * 
     * @param getDocumentBatchItemsForApprovalResult
     */
    public void setGetDocumentBatchItemsForApprovalResult(com.cleverdome.api.OperationResultOfArrayOfDocumentBatchItemForApproval52SKXdDF getDocumentBatchItemsForApprovalResult) {
        this.getDocumentBatchItemsForApprovalResult = getDocumentBatchItemsForApprovalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentBatchItemsForApprovalResponse)) return false;
        GetDocumentBatchItemsForApprovalResponse other = (GetDocumentBatchItemsForApprovalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDocumentBatchItemsForApprovalResult==null && other.getGetDocumentBatchItemsForApprovalResult()==null) || 
             (this.getDocumentBatchItemsForApprovalResult!=null &&
              this.getDocumentBatchItemsForApprovalResult.equals(other.getGetDocumentBatchItemsForApprovalResult())));
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
        if (getGetDocumentBatchItemsForApprovalResult() != null) {
            _hashCode += getGetDocumentBatchItemsForApprovalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentBatchItemsForApprovalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDocumentBatchItemsForApprovalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDocumentBatchItemsForApprovalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDocumentBatchItemsForApprovalResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentBatchItemForApproval52SKXdDF"));
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
