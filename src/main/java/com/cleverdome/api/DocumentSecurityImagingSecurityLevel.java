/**
 * DocumentSecurityImagingSecurityLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentSecurityImagingSecurityLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentSecurityImagingSecurityLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _View = "View";
    public static final java.lang.String _Modify = "Modify";
    public static final java.lang.String _AddRevision = "AddRevision";
    public static final java.lang.String _Delete = "Delete";
    public static final java.lang.String _Owner = "Owner";
    public static final java.lang.String _OSJReview = "OSJReview";
    public static final java.lang.String _QualityReview = "QualityReview";
    public static final java.lang.String _BOProcessing = "BOProcessing";
    public static final java.lang.String _Compliance = "Compliance";
    public static final java.lang.String _Admin = "Admin";
    public static final DocumentSecurityImagingSecurityLevel None = new DocumentSecurityImagingSecurityLevel(_None);
    public static final DocumentSecurityImagingSecurityLevel View = new DocumentSecurityImagingSecurityLevel(_View);
    public static final DocumentSecurityImagingSecurityLevel Modify = new DocumentSecurityImagingSecurityLevel(_Modify);
    public static final DocumentSecurityImagingSecurityLevel AddRevision = new DocumentSecurityImagingSecurityLevel(_AddRevision);
    public static final DocumentSecurityImagingSecurityLevel Delete = new DocumentSecurityImagingSecurityLevel(_Delete);
    public static final DocumentSecurityImagingSecurityLevel Owner = new DocumentSecurityImagingSecurityLevel(_Owner);
    public static final DocumentSecurityImagingSecurityLevel OSJReview = new DocumentSecurityImagingSecurityLevel(_OSJReview);
    public static final DocumentSecurityImagingSecurityLevel QualityReview = new DocumentSecurityImagingSecurityLevel(_QualityReview);
    public static final DocumentSecurityImagingSecurityLevel BOProcessing = new DocumentSecurityImagingSecurityLevel(_BOProcessing);
    public static final DocumentSecurityImagingSecurityLevel Compliance = new DocumentSecurityImagingSecurityLevel(_Compliance);
    public static final DocumentSecurityImagingSecurityLevel Admin = new DocumentSecurityImagingSecurityLevel(_Admin);
    public java.lang.String getValue() { return _value_;}
    public static DocumentSecurityImagingSecurityLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentSecurityImagingSecurityLevel enumeration = (DocumentSecurityImagingSecurityLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DocumentSecurityImagingSecurityLevel fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentSecurityImagingSecurityLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging", "DocumentSecurity.ImagingSecurityLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
