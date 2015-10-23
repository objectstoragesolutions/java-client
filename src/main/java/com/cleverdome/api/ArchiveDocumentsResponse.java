/**
 * ArchiveDocumentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class ArchiveDocumentsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfdateTime archiveDocumentsResult;

    public ArchiveDocumentsResponse() {
    }

    public ArchiveDocumentsResponse(
           com.cleverdome.api.OperationResultOfdateTime archiveDocumentsResult) {
           this.archiveDocumentsResult = archiveDocumentsResult;
    }


    /**
     * Gets the archiveDocumentsResult value for this ArchiveDocumentsResponse.
     * 
     * @return archiveDocumentsResult
     */
    public com.cleverdome.api.OperationResultOfdateTime getArchiveDocumentsResult() {
        return archiveDocumentsResult;
    }


    /**
     * Sets the archiveDocumentsResult value for this ArchiveDocumentsResponse.
     * 
     * @param archiveDocumentsResult
     */
    public void setArchiveDocumentsResult(com.cleverdome.api.OperationResultOfdateTime archiveDocumentsResult) {
        this.archiveDocumentsResult = archiveDocumentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiveDocumentsResponse)) return false;
        ArchiveDocumentsResponse other = (ArchiveDocumentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.archiveDocumentsResult==null && other.getArchiveDocumentsResult()==null) || 
             (this.archiveDocumentsResult!=null &&
              this.archiveDocumentsResult.equals(other.getArchiveDocumentsResult())));
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
        if (getArchiveDocumentsResult() != null) {
            _hashCode += getArchiveDocumentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiveDocumentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ArchiveDocumentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDocumentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ArchiveDocumentsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfdateTime"));
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
