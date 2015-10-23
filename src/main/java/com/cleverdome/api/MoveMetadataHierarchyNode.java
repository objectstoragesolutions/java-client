/**
 * MoveMetadataHierarchyNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class MoveMetadataHierarchyNode  implements java.io.Serializable {
    private java.lang.String sessionID;

    private java.lang.String nodeID;

    private java.lang.String parentNodeID;

    private java.lang.Integer sharedUserId;

    public MoveMetadataHierarchyNode() {
    }

    public MoveMetadataHierarchyNode(
           java.lang.String sessionID,
           java.lang.String nodeID,
           java.lang.String parentNodeID,
           java.lang.Integer sharedUserId) {
           this.sessionID = sessionID;
           this.nodeID = nodeID;
           this.parentNodeID = parentNodeID;
           this.sharedUserId = sharedUserId;
    }


    /**
     * Gets the sessionID value for this MoveMetadataHierarchyNode.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this MoveMetadataHierarchyNode.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the nodeID value for this MoveMetadataHierarchyNode.
     * 
     * @return nodeID
     */
    public java.lang.String getNodeID() {
        return nodeID;
    }


    /**
     * Sets the nodeID value for this MoveMetadataHierarchyNode.
     * 
     * @param nodeID
     */
    public void setNodeID(java.lang.String nodeID) {
        this.nodeID = nodeID;
    }


    /**
     * Gets the parentNodeID value for this MoveMetadataHierarchyNode.
     * 
     * @return parentNodeID
     */
    public java.lang.String getParentNodeID() {
        return parentNodeID;
    }


    /**
     * Sets the parentNodeID value for this MoveMetadataHierarchyNode.
     * 
     * @param parentNodeID
     */
    public void setParentNodeID(java.lang.String parentNodeID) {
        this.parentNodeID = parentNodeID;
    }


    /**
     * Gets the sharedUserId value for this MoveMetadataHierarchyNode.
     * 
     * @return sharedUserId
     */
    public java.lang.Integer getSharedUserId() {
        return sharedUserId;
    }


    /**
     * Sets the sharedUserId value for this MoveMetadataHierarchyNode.
     * 
     * @param sharedUserId
     */
    public void setSharedUserId(java.lang.Integer sharedUserId) {
        this.sharedUserId = sharedUserId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveMetadataHierarchyNode)) return false;
        MoveMetadataHierarchyNode other = (MoveMetadataHierarchyNode) obj;
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
            ((this.nodeID==null && other.getNodeID()==null) || 
             (this.nodeID!=null &&
              this.nodeID.equals(other.getNodeID()))) &&
            ((this.parentNodeID==null && other.getParentNodeID()==null) || 
             (this.parentNodeID!=null &&
              this.parentNodeID.equals(other.getParentNodeID()))) &&
            ((this.sharedUserId==null && other.getSharedUserId()==null) || 
             (this.sharedUserId!=null &&
              this.sharedUserId.equals(other.getSharedUserId())));
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
        if (getNodeID() != null) {
            _hashCode += getNodeID().hashCode();
        }
        if (getParentNodeID() != null) {
            _hashCode += getParentNodeID().hashCode();
        }
        if (getSharedUserId() != null) {
            _hashCode += getSharedUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveMetadataHierarchyNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">MoveMetadataHierarchyNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "nodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "parentNodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sharedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
