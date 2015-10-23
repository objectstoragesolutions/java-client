/**
 * ESignDocumentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class ESignDocumentData  implements java.io.Serializable {
    private java.lang.String docuSignID;

    private java.lang.String documentGuid;

    private java.lang.Integer documentOrder;

    private java.lang.Integer ESignID;

    public ESignDocumentData() {
    }

    public ESignDocumentData(
           java.lang.String docuSignID,
           java.lang.String documentGuid,
           java.lang.Integer documentOrder,
           java.lang.Integer ESignID) {
           this.docuSignID = docuSignID;
           this.documentGuid = documentGuid;
           this.documentOrder = documentOrder;
           this.ESignID = ESignID;
    }


    /**
     * Gets the docuSignID value for this ESignDocumentData.
     * 
     * @return docuSignID
     */
    public java.lang.String getDocuSignID() {
        return docuSignID;
    }


    /**
     * Sets the docuSignID value for this ESignDocumentData.
     * 
     * @param docuSignID
     */
    public void setDocuSignID(java.lang.String docuSignID) {
        this.docuSignID = docuSignID;
    }


    /**
     * Gets the documentGuid value for this ESignDocumentData.
     * 
     * @return documentGuid
     */
    public java.lang.String getDocumentGuid() {
        return documentGuid;
    }


    /**
     * Sets the documentGuid value for this ESignDocumentData.
     * 
     * @param documentGuid
     */
    public void setDocumentGuid(java.lang.String documentGuid) {
        this.documentGuid = documentGuid;
    }


    /**
     * Gets the documentOrder value for this ESignDocumentData.
     * 
     * @return documentOrder
     */
    public java.lang.Integer getDocumentOrder() {
        return documentOrder;
    }


    /**
     * Sets the documentOrder value for this ESignDocumentData.
     * 
     * @param documentOrder
     */
    public void setDocumentOrder(java.lang.Integer documentOrder) {
        this.documentOrder = documentOrder;
    }


    /**
     * Gets the ESignID value for this ESignDocumentData.
     * 
     * @return ESignID
     */
    public java.lang.Integer getESignID() {
        return ESignID;
    }


    /**
     * Sets the ESignID value for this ESignDocumentData.
     * 
     * @param ESignID
     */
    public void setESignID(java.lang.Integer ESignID) {
        this.ESignID = ESignID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ESignDocumentData)) return false;
        ESignDocumentData other = (ESignDocumentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docuSignID==null && other.getDocuSignID()==null) || 
             (this.docuSignID!=null &&
              this.docuSignID.equals(other.getDocuSignID()))) &&
            ((this.documentGuid==null && other.getDocumentGuid()==null) || 
             (this.documentGuid!=null &&
              this.documentGuid.equals(other.getDocumentGuid()))) &&
            ((this.documentOrder==null && other.getDocumentOrder()==null) || 
             (this.documentOrder!=null &&
              this.documentOrder.equals(other.getDocumentOrder()))) &&
            ((this.ESignID==null && other.getESignID()==null) || 
             (this.ESignID!=null &&
              this.ESignID.equals(other.getESignID())));
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
        if (getDocuSignID() != null) {
            _hashCode += getDocuSignID().hashCode();
        }
        if (getDocumentGuid() != null) {
            _hashCode += getDocumentGuid().hashCode();
        }
        if (getDocumentOrder() != null) {
            _hashCode += getDocumentOrder().hashCode();
        }
        if (getESignID() != null) {
            _hashCode += getESignID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ESignDocumentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.DocuSign", "ESignDocumentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docuSignID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.DocuSign", "DocuSignID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.DocuSign", "DocumentGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.DocuSign", "DocumentOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESignID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data.DocuSign", "ESignID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
