/**
 * DocumentDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentDetails  extends com.cleverdome.api.Document  implements java.io.Serializable {
    private java.lang.Integer lastWorkflowEventID;

    private java.lang.String lastWorkflowEventName;

    private java.lang.String mergerURL;

    private java.lang.Integer pageCount;

    private java.lang.String printURL;

    private java.lang.String viewURL;

    public DocumentDetails() {
    }

    public DocumentDetails(
           java.lang.Integer applicationID,
           java.lang.String docGUID,
           java.lang.String docStatus,
           java.lang.String docTemplate,
           java.lang.String docType,
           java.lang.Integer documentTemplateID,
           java.lang.Integer documentTypeID,
           java.lang.String fileType,
           java.lang.String lastRevisionID,
           java.lang.String name,
           java.util.Calendar scanDate,
           java.lang.Integer systemID,
           java.lang.Integer uploadedByID,
           java.lang.Integer lastWorkflowEventID,
           java.lang.String lastWorkflowEventName,
           java.lang.String mergerURL,
           java.lang.Integer pageCount,
           java.lang.String printURL,
           java.lang.String viewURL) {
        super(
            applicationID,
            docGUID,
            docStatus,
            docTemplate,
            docType,
            documentTemplateID,
            documentTypeID,
            fileType,
            lastRevisionID,
            name,
            scanDate,
            systemID,
            uploadedByID);
        this.lastWorkflowEventID = lastWorkflowEventID;
        this.lastWorkflowEventName = lastWorkflowEventName;
        this.mergerURL = mergerURL;
        this.pageCount = pageCount;
        this.printURL = printURL;
        this.viewURL = viewURL;
    }


    /**
     * Gets the lastWorkflowEventID value for this DocumentDetails.
     * 
     * @return lastWorkflowEventID
     */
    public java.lang.Integer getLastWorkflowEventID() {
        return lastWorkflowEventID;
    }


    /**
     * Sets the lastWorkflowEventID value for this DocumentDetails.
     * 
     * @param lastWorkflowEventID
     */
    public void setLastWorkflowEventID(java.lang.Integer lastWorkflowEventID) {
        this.lastWorkflowEventID = lastWorkflowEventID;
    }


    /**
     * Gets the lastWorkflowEventName value for this DocumentDetails.
     * 
     * @return lastWorkflowEventName
     */
    public java.lang.String getLastWorkflowEventName() {
        return lastWorkflowEventName;
    }


    /**
     * Sets the lastWorkflowEventName value for this DocumentDetails.
     * 
     * @param lastWorkflowEventName
     */
    public void setLastWorkflowEventName(java.lang.String lastWorkflowEventName) {
        this.lastWorkflowEventName = lastWorkflowEventName;
    }


    /**
     * Gets the mergerURL value for this DocumentDetails.
     * 
     * @return mergerURL
     */
    public java.lang.String getMergerURL() {
        return mergerURL;
    }


    /**
     * Sets the mergerURL value for this DocumentDetails.
     * 
     * @param mergerURL
     */
    public void setMergerURL(java.lang.String mergerURL) {
        this.mergerURL = mergerURL;
    }


    /**
     * Gets the pageCount value for this DocumentDetails.
     * 
     * @return pageCount
     */
    public java.lang.Integer getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this DocumentDetails.
     * 
     * @param pageCount
     */
    public void setPageCount(java.lang.Integer pageCount) {
        this.pageCount = pageCount;
    }


    /**
     * Gets the printURL value for this DocumentDetails.
     * 
     * @return printURL
     */
    public java.lang.String getPrintURL() {
        return printURL;
    }


    /**
     * Sets the printURL value for this DocumentDetails.
     * 
     * @param printURL
     */
    public void setPrintURL(java.lang.String printURL) {
        this.printURL = printURL;
    }


    /**
     * Gets the viewURL value for this DocumentDetails.
     * 
     * @return viewURL
     */
    public java.lang.String getViewURL() {
        return viewURL;
    }


    /**
     * Sets the viewURL value for this DocumentDetails.
     * 
     * @param viewURL
     */
    public void setViewURL(java.lang.String viewURL) {
        this.viewURL = viewURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentDetails)) return false;
        DocumentDetails other = (DocumentDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lastWorkflowEventID==null && other.getLastWorkflowEventID()==null) || 
             (this.lastWorkflowEventID!=null &&
              this.lastWorkflowEventID.equals(other.getLastWorkflowEventID()))) &&
            ((this.lastWorkflowEventName==null && other.getLastWorkflowEventName()==null) || 
             (this.lastWorkflowEventName!=null &&
              this.lastWorkflowEventName.equals(other.getLastWorkflowEventName()))) &&
            ((this.mergerURL==null && other.getMergerURL()==null) || 
             (this.mergerURL!=null &&
              this.mergerURL.equals(other.getMergerURL()))) &&
            ((this.pageCount==null && other.getPageCount()==null) || 
             (this.pageCount!=null &&
              this.pageCount.equals(other.getPageCount()))) &&
            ((this.printURL==null && other.getPrintURL()==null) || 
             (this.printURL!=null &&
              this.printURL.equals(other.getPrintURL()))) &&
            ((this.viewURL==null && other.getViewURL()==null) || 
             (this.viewURL!=null &&
              this.viewURL.equals(other.getViewURL())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLastWorkflowEventID() != null) {
            _hashCode += getLastWorkflowEventID().hashCode();
        }
        if (getLastWorkflowEventName() != null) {
            _hashCode += getLastWorkflowEventName().hashCode();
        }
        if (getMergerURL() != null) {
            _hashCode += getMergerURL().hashCode();
        }
        if (getPageCount() != null) {
            _hashCode += getPageCount().hashCode();
        }
        if (getPrintURL() != null) {
            _hashCode += getPrintURL().hashCode();
        }
        if (getViewURL() != null) {
            _hashCode += getViewURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWorkflowEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastWorkflowEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastWorkflowEventName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "LastWorkflowEventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergerURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "MergerURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PrintURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ViewURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
