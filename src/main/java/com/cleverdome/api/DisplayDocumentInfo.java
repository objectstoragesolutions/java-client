/**
 * DisplayDocumentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DisplayDocumentInfo  implements java.io.Serializable {
    private com.cleverdome.api.DocumentAnnotation[] annotations;

    private java.lang.Integer currentUserID;

    private java.lang.String currentUserName;

    private java.lang.Integer height;

    private com.cleverdome.api.DisplayDocumentPageInfo[] pagesDisplayInfoes;

    private java.lang.String renderSource;

    private java.lang.String revisionID;

    private java.lang.Integer width;

    private java.lang.Integer y;

    public DisplayDocumentInfo() {
    }

    public DisplayDocumentInfo(
           com.cleverdome.api.DocumentAnnotation[] annotations,
           java.lang.Integer currentUserID,
           java.lang.String currentUserName,
           java.lang.Integer height,
           com.cleverdome.api.DisplayDocumentPageInfo[] pagesDisplayInfoes,
           java.lang.String renderSource,
           java.lang.String revisionID,
           java.lang.Integer width,
           java.lang.Integer y) {
           this.annotations = annotations;
           this.currentUserID = currentUserID;
           this.currentUserName = currentUserName;
           this.height = height;
           this.pagesDisplayInfoes = pagesDisplayInfoes;
           this.renderSource = renderSource;
           this.revisionID = revisionID;
           this.width = width;
           this.y = y;
    }


    /**
     * Gets the annotations value for this DisplayDocumentInfo.
     * 
     * @return annotations
     */
    public com.cleverdome.api.DocumentAnnotation[] getAnnotations() {
        return annotations;
    }


    /**
     * Sets the annotations value for this DisplayDocumentInfo.
     * 
     * @param annotations
     */
    public void setAnnotations(com.cleverdome.api.DocumentAnnotation[] annotations) {
        this.annotations = annotations;
    }


    /**
     * Gets the currentUserID value for this DisplayDocumentInfo.
     * 
     * @return currentUserID
     */
    public java.lang.Integer getCurrentUserID() {
        return currentUserID;
    }


    /**
     * Sets the currentUserID value for this DisplayDocumentInfo.
     * 
     * @param currentUserID
     */
    public void setCurrentUserID(java.lang.Integer currentUserID) {
        this.currentUserID = currentUserID;
    }


    /**
     * Gets the currentUserName value for this DisplayDocumentInfo.
     * 
     * @return currentUserName
     */
    public java.lang.String getCurrentUserName() {
        return currentUserName;
    }


    /**
     * Sets the currentUserName value for this DisplayDocumentInfo.
     * 
     * @param currentUserName
     */
    public void setCurrentUserName(java.lang.String currentUserName) {
        this.currentUserName = currentUserName;
    }


    /**
     * Gets the height value for this DisplayDocumentInfo.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this DisplayDocumentInfo.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the pagesDisplayInfoes value for this DisplayDocumentInfo.
     * 
     * @return pagesDisplayInfoes
     */
    public com.cleverdome.api.DisplayDocumentPageInfo[] getPagesDisplayInfoes() {
        return pagesDisplayInfoes;
    }


    /**
     * Sets the pagesDisplayInfoes value for this DisplayDocumentInfo.
     * 
     * @param pagesDisplayInfoes
     */
    public void setPagesDisplayInfoes(com.cleverdome.api.DisplayDocumentPageInfo[] pagesDisplayInfoes) {
        this.pagesDisplayInfoes = pagesDisplayInfoes;
    }


    /**
     * Gets the renderSource value for this DisplayDocumentInfo.
     * 
     * @return renderSource
     */
    public java.lang.String getRenderSource() {
        return renderSource;
    }


    /**
     * Sets the renderSource value for this DisplayDocumentInfo.
     * 
     * @param renderSource
     */
    public void setRenderSource(java.lang.String renderSource) {
        this.renderSource = renderSource;
    }


    /**
     * Gets the revisionID value for this DisplayDocumentInfo.
     * 
     * @return revisionID
     */
    public java.lang.String getRevisionID() {
        return revisionID;
    }


    /**
     * Sets the revisionID value for this DisplayDocumentInfo.
     * 
     * @param revisionID
     */
    public void setRevisionID(java.lang.String revisionID) {
        this.revisionID = revisionID;
    }


    /**
     * Gets the width value for this DisplayDocumentInfo.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this DisplayDocumentInfo.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }


    /**
     * Gets the y value for this DisplayDocumentInfo.
     * 
     * @return y
     */
    public java.lang.Integer getY() {
        return y;
    }


    /**
     * Sets the y value for this DisplayDocumentInfo.
     * 
     * @param y
     */
    public void setY(java.lang.Integer y) {
        this.y = y;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayDocumentInfo)) return false;
        DisplayDocumentInfo other = (DisplayDocumentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.annotations==null && other.getAnnotations()==null) || 
             (this.annotations!=null &&
              java.util.Arrays.equals(this.annotations, other.getAnnotations()))) &&
            ((this.currentUserID==null && other.getCurrentUserID()==null) || 
             (this.currentUserID!=null &&
              this.currentUserID.equals(other.getCurrentUserID()))) &&
            ((this.currentUserName==null && other.getCurrentUserName()==null) || 
             (this.currentUserName!=null &&
              this.currentUserName.equals(other.getCurrentUserName()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.pagesDisplayInfoes==null && other.getPagesDisplayInfoes()==null) || 
             (this.pagesDisplayInfoes!=null &&
              java.util.Arrays.equals(this.pagesDisplayInfoes, other.getPagesDisplayInfoes()))) &&
            ((this.renderSource==null && other.getRenderSource()==null) || 
             (this.renderSource!=null &&
              this.renderSource.equals(other.getRenderSource()))) &&
            ((this.revisionID==null && other.getRevisionID()==null) || 
             (this.revisionID!=null &&
              this.revisionID.equals(other.getRevisionID()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.y==null && other.getY()==null) || 
             (this.y!=null &&
              this.y.equals(other.getY())));
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
        if (getAnnotations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnnotations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnnotations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrentUserID() != null) {
            _hashCode += getCurrentUserID().hashCode();
        }
        if (getCurrentUserName() != null) {
            _hashCode += getCurrentUserName().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getPagesDisplayInfoes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPagesDisplayInfoes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPagesDisplayInfoes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRenderSource() != null) {
            _hashCode += getRenderSource().hashCode();
        }
        if (getRevisionID() != null) {
            _hashCode += getRevisionID().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getY() != null) {
            _hashCode += getY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisplayDocumentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DisplayDocumentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Annotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentAnnotation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentAnnotation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CurrentUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "CurrentUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagesDisplayInfoes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "PagesDisplayInfoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DisplayDocumentPageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DisplayDocumentPageInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RenderSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "RevisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Y"));
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
