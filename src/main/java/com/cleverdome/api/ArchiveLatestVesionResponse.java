/**
 * ArchiveLatestVesionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class ArchiveLatestVesionResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfboolean archiveLatestVesionResult;

    public ArchiveLatestVesionResponse() {
    }

    public ArchiveLatestVesionResponse(
           com.cleverdome.api.OperationResultOfboolean archiveLatestVesionResult) {
           this.archiveLatestVesionResult = archiveLatestVesionResult;
    }


    /**
     * Gets the archiveLatestVesionResult value for this ArchiveLatestVesionResponse.
     * 
     * @return archiveLatestVesionResult
     */
    public com.cleverdome.api.OperationResultOfboolean getArchiveLatestVesionResult() {
        return archiveLatestVesionResult;
    }


    /**
     * Sets the archiveLatestVesionResult value for this ArchiveLatestVesionResponse.
     * 
     * @param archiveLatestVesionResult
     */
    public void setArchiveLatestVesionResult(com.cleverdome.api.OperationResultOfboolean archiveLatestVesionResult) {
        this.archiveLatestVesionResult = archiveLatestVesionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiveLatestVesionResponse)) return false;
        ArchiveLatestVesionResponse other = (ArchiveLatestVesionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.archiveLatestVesionResult==null && other.getArchiveLatestVesionResult()==null) || 
             (this.archiveLatestVesionResult!=null &&
              this.archiveLatestVesionResult.equals(other.getArchiveLatestVesionResult())));
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
        if (getArchiveLatestVesionResult() != null) {
            _hashCode += getArchiveLatestVesionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiveLatestVesionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ArchiveLatestVesionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveLatestVesionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ArchiveLatestVesionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfboolean"));
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
