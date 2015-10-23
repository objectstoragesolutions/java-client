/**
 * RecordView.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class RecordView  implements java.io.Serializable {
    private java.lang.String footerText;

    private java.lang.String text;

    private java.lang.String urlAddress;

    private java.lang.Integer viewType;

    public RecordView() {
    }

    public RecordView(
           java.lang.String footerText,
           java.lang.String text,
           java.lang.String urlAddress,
           java.lang.Integer viewType) {
           this.footerText = footerText;
           this.text = text;
           this.urlAddress = urlAddress;
           this.viewType = viewType;
    }


    /**
     * Gets the footerText value for this RecordView.
     * 
     * @return footerText
     */
    public java.lang.String getFooterText() {
        return footerText;
    }


    /**
     * Sets the footerText value for this RecordView.
     * 
     * @param footerText
     */
    public void setFooterText(java.lang.String footerText) {
        this.footerText = footerText;
    }


    /**
     * Gets the text value for this RecordView.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this RecordView.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the urlAddress value for this RecordView.
     * 
     * @return urlAddress
     */
    public java.lang.String getUrlAddress() {
        return urlAddress;
    }


    /**
     * Sets the urlAddress value for this RecordView.
     * 
     * @param urlAddress
     */
    public void setUrlAddress(java.lang.String urlAddress) {
        this.urlAddress = urlAddress;
    }


    /**
     * Gets the viewType value for this RecordView.
     * 
     * @return viewType
     */
    public java.lang.Integer getViewType() {
        return viewType;
    }


    /**
     * Sets the viewType value for this RecordView.
     * 
     * @param viewType
     */
    public void setViewType(java.lang.Integer viewType) {
        this.viewType = viewType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordView)) return false;
        RecordView other = (RecordView) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.footerText==null && other.getFooterText()==null) || 
             (this.footerText!=null &&
              this.footerText.equals(other.getFooterText()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.urlAddress==null && other.getUrlAddress()==null) || 
             (this.urlAddress!=null &&
              this.urlAddress.equals(other.getUrlAddress()))) &&
            ((this.viewType==null && other.getViewType()==null) || 
             (this.viewType!=null &&
              this.viewType.equals(other.getViewType())));
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
        if (getFooterText() != null) {
            _hashCode += getFooterText().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getUrlAddress() != null) {
            _hashCode += getUrlAddress().hashCode();
        }
        if (getViewType() != null) {
            _hashCode += getViewType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordView.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RecordView"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footerText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "FooterText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UrlAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ViewType"));
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
