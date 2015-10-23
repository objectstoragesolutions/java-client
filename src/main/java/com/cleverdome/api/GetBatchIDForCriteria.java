/**
 * GetBatchIDForCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetBatchIDForCriteria  implements java.io.Serializable {
    private java.lang.String sessionID;

    private com.cleverdome.api.DocumentMetadataValueBase[] valsToSearch;

    private com.cleverdome.api.ImagingBatchBatchTypes batchType;

    public GetBatchIDForCriteria() {
    }

    public GetBatchIDForCriteria(
           java.lang.String sessionID,
           com.cleverdome.api.DocumentMetadataValueBase[] valsToSearch,
           com.cleverdome.api.ImagingBatchBatchTypes batchType) {
           this.sessionID = sessionID;
           this.valsToSearch = valsToSearch;
           this.batchType = batchType;
    }


    /**
     * Gets the sessionID value for this GetBatchIDForCriteria.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this GetBatchIDForCriteria.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the valsToSearch value for this GetBatchIDForCriteria.
     * 
     * @return valsToSearch
     */
    public com.cleverdome.api.DocumentMetadataValueBase[] getValsToSearch() {
        return valsToSearch;
    }


    /**
     * Sets the valsToSearch value for this GetBatchIDForCriteria.
     * 
     * @param valsToSearch
     */
    public void setValsToSearch(com.cleverdome.api.DocumentMetadataValueBase[] valsToSearch) {
        this.valsToSearch = valsToSearch;
    }


    /**
     * Gets the batchType value for this GetBatchIDForCriteria.
     * 
     * @return batchType
     */
    public com.cleverdome.api.ImagingBatchBatchTypes getBatchType() {
        return batchType;
    }


    /**
     * Sets the batchType value for this GetBatchIDForCriteria.
     * 
     * @param batchType
     */
    public void setBatchType(com.cleverdome.api.ImagingBatchBatchTypes batchType) {
        this.batchType = batchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBatchIDForCriteria)) return false;
        GetBatchIDForCriteria other = (GetBatchIDForCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.valsToSearch==null && other.getValsToSearch()==null) || 
             (this.valsToSearch!=null &&
              java.util.Arrays.equals(this.valsToSearch, other.getValsToSearch()))) &&
            ((this.batchType==null && other.getBatchType()==null) || 
             (this.batchType!=null &&
              this.batchType.equals(other.getBatchType())));
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
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getValsToSearch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValsToSearch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValsToSearch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBatchType() != null) {
            _hashCode += getBatchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBatchIDForCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBatchIDForCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valsToSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "valsToSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentMetadataValueBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "batchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "ImagingBatch.BatchTypes"));
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
