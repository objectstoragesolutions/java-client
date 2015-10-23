/**
 * GetQualityReviewReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetQualityReviewReport  implements java.io.Serializable {
    private java.lang.String begindDate;

    private java.lang.String endDate;

    private java.lang.Integer timePeriod;

    public GetQualityReviewReport() {
    }

    public GetQualityReviewReport(
           java.lang.String begindDate,
           java.lang.String endDate,
           java.lang.Integer timePeriod) {
           this.begindDate = begindDate;
           this.endDate = endDate;
           this.timePeriod = timePeriod;
    }


    /**
     * Gets the begindDate value for this GetQualityReviewReport.
     * 
     * @return begindDate
     */
    public java.lang.String getBegindDate() {
        return begindDate;
    }


    /**
     * Sets the begindDate value for this GetQualityReviewReport.
     * 
     * @param begindDate
     */
    public void setBegindDate(java.lang.String begindDate) {
        this.begindDate = begindDate;
    }


    /**
     * Gets the endDate value for this GetQualityReviewReport.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GetQualityReviewReport.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the timePeriod value for this GetQualityReviewReport.
     * 
     * @return timePeriod
     */
    public java.lang.Integer getTimePeriod() {
        return timePeriod;
    }


    /**
     * Sets the timePeriod value for this GetQualityReviewReport.
     * 
     * @param timePeriod
     */
    public void setTimePeriod(java.lang.Integer timePeriod) {
        this.timePeriod = timePeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQualityReviewReport)) return false;
        GetQualityReviewReport other = (GetQualityReviewReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.begindDate==null && other.getBegindDate()==null) || 
             (this.begindDate!=null &&
              this.begindDate.equals(other.getBegindDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.timePeriod==null && other.getTimePeriod()==null) || 
             (this.timePeriod!=null &&
              this.timePeriod.equals(other.getTimePeriod())));
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
        if (getBegindDate() != null) {
            _hashCode += getBegindDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getTimePeriod() != null) {
            _hashCode += getTimePeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetQualityReviewReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetQualityReviewReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("begindDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "begindDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "timePeriod"));
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
