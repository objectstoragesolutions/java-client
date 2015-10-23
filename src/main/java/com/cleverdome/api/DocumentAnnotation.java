/**
 * DocumentAnnotation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class DocumentAnnotation  implements java.io.Serializable {
    private java.lang.Integer ARank;

    private java.lang.Object dataObject;

    private java.math.BigDecimal height;

    private java.lang.String ID;

    private java.lang.Boolean isOwn;

    private java.math.BigDecimal left;

    private java.lang.String text;

    private java.math.BigDecimal top;

    private java.lang.String type;

    private java.lang.Integer URank;

    private java.lang.Integer userID;

    private java.lang.String userName;

    private java.math.BigDecimal width;

    public DocumentAnnotation() {
    }

    public DocumentAnnotation(
           java.lang.Integer ARank,
           java.lang.Object dataObject,
           java.math.BigDecimal height,
           java.lang.String ID,
           java.lang.Boolean isOwn,
           java.math.BigDecimal left,
           java.lang.String text,
           java.math.BigDecimal top,
           java.lang.String type,
           java.lang.Integer URank,
           java.lang.Integer userID,
           java.lang.String userName,
           java.math.BigDecimal width) {
           this.ARank = ARank;
           this.dataObject = dataObject;
           this.height = height;
           this.ID = ID;
           this.isOwn = isOwn;
           this.left = left;
           this.text = text;
           this.top = top;
           this.type = type;
           this.URank = URank;
           this.userID = userID;
           this.userName = userName;
           this.width = width;
    }


    /**
     * Gets the ARank value for this DocumentAnnotation.
     * 
     * @return ARank
     */
    public java.lang.Integer getARank() {
        return ARank;
    }


    /**
     * Sets the ARank value for this DocumentAnnotation.
     * 
     * @param ARank
     */
    public void setARank(java.lang.Integer ARank) {
        this.ARank = ARank;
    }


    /**
     * Gets the dataObject value for this DocumentAnnotation.
     * 
     * @return dataObject
     */
    public java.lang.Object getDataObject() {
        return dataObject;
    }


    /**
     * Sets the dataObject value for this DocumentAnnotation.
     * 
     * @param dataObject
     */
    public void setDataObject(java.lang.Object dataObject) {
        this.dataObject = dataObject;
    }


    /**
     * Gets the height value for this DocumentAnnotation.
     * 
     * @return height
     */
    public java.math.BigDecimal getHeight() {
        return height;
    }


    /**
     * Sets the height value for this DocumentAnnotation.
     * 
     * @param height
     */
    public void setHeight(java.math.BigDecimal height) {
        this.height = height;
    }


    /**
     * Gets the ID value for this DocumentAnnotation.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DocumentAnnotation.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the isOwn value for this DocumentAnnotation.
     * 
     * @return isOwn
     */
    public java.lang.Boolean getIsOwn() {
        return isOwn;
    }


    /**
     * Sets the isOwn value for this DocumentAnnotation.
     * 
     * @param isOwn
     */
    public void setIsOwn(java.lang.Boolean isOwn) {
        this.isOwn = isOwn;
    }


    /**
     * Gets the left value for this DocumentAnnotation.
     * 
     * @return left
     */
    public java.math.BigDecimal getLeft() {
        return left;
    }


    /**
     * Sets the left value for this DocumentAnnotation.
     * 
     * @param left
     */
    public void setLeft(java.math.BigDecimal left) {
        this.left = left;
    }


    /**
     * Gets the text value for this DocumentAnnotation.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this DocumentAnnotation.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the top value for this DocumentAnnotation.
     * 
     * @return top
     */
    public java.math.BigDecimal getTop() {
        return top;
    }


    /**
     * Sets the top value for this DocumentAnnotation.
     * 
     * @param top
     */
    public void setTop(java.math.BigDecimal top) {
        this.top = top;
    }


    /**
     * Gets the type value for this DocumentAnnotation.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DocumentAnnotation.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the URank value for this DocumentAnnotation.
     * 
     * @return URank
     */
    public java.lang.Integer getURank() {
        return URank;
    }


    /**
     * Sets the URank value for this DocumentAnnotation.
     * 
     * @param URank
     */
    public void setURank(java.lang.Integer URank) {
        this.URank = URank;
    }


    /**
     * Gets the userID value for this DocumentAnnotation.
     * 
     * @return userID
     */
    public java.lang.Integer getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this DocumentAnnotation.
     * 
     * @param userID
     */
    public void setUserID(java.lang.Integer userID) {
        this.userID = userID;
    }


    /**
     * Gets the userName value for this DocumentAnnotation.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this DocumentAnnotation.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the width value for this DocumentAnnotation.
     * 
     * @return width
     */
    public java.math.BigDecimal getWidth() {
        return width;
    }


    /**
     * Sets the width value for this DocumentAnnotation.
     * 
     * @param width
     */
    public void setWidth(java.math.BigDecimal width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentAnnotation)) return false;
        DocumentAnnotation other = (DocumentAnnotation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ARank==null && other.getARank()==null) || 
             (this.ARank!=null &&
              this.ARank.equals(other.getARank()))) &&
            ((this.dataObject==null && other.getDataObject()==null) || 
             (this.dataObject!=null &&
              this.dataObject.equals(other.getDataObject()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.isOwn==null && other.getIsOwn()==null) || 
             (this.isOwn!=null &&
              this.isOwn.equals(other.getIsOwn()))) &&
            ((this.left==null && other.getLeft()==null) || 
             (this.left!=null &&
              this.left.equals(other.getLeft()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.top==null && other.getTop()==null) || 
             (this.top!=null &&
              this.top.equals(other.getTop()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.URank==null && other.getURank()==null) || 
             (this.URank!=null &&
              this.URank.equals(other.getURank()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getARank() != null) {
            _hashCode += getARank().hashCode();
        }
        if (getDataObject() != null) {
            _hashCode += getDataObject().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIsOwn() != null) {
            _hashCode += getIsOwn().hashCode();
        }
        if (getLeft() != null) {
            _hashCode += getLeft().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getTop() != null) {
            _hashCode += getTop().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getURank() != null) {
            _hashCode += getURank().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentAnnotation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DocumentAnnotation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ARank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "DataObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOwn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "IsOwn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("left");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "URank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
