/**
 * PermittedTagTreesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class PermittedTagTreesInfo  implements java.io.Serializable {
    private com.cleverdome.api.UserData currentUser;

    private com.cleverdome.api.UserData[] permittedTreesOwners;

    public PermittedTagTreesInfo() {
    }

    public PermittedTagTreesInfo(
           com.cleverdome.api.UserData currentUser,
           com.cleverdome.api.UserData[] permittedTreesOwners) {
           this.currentUser = currentUser;
           this.permittedTreesOwners = permittedTreesOwners;
    }


    /**
     * Gets the currentUser value for this PermittedTagTreesInfo.
     * 
     * @return currentUser
     */
    public com.cleverdome.api.UserData getCurrentUser() {
        return currentUser;
    }


    /**
     * Sets the currentUser value for this PermittedTagTreesInfo.
     * 
     * @param currentUser
     */
    public void setCurrentUser(com.cleverdome.api.UserData currentUser) {
        this.currentUser = currentUser;
    }


    /**
     * Gets the permittedTreesOwners value for this PermittedTagTreesInfo.
     * 
     * @return permittedTreesOwners
     */
    public com.cleverdome.api.UserData[] getPermittedTreesOwners() {
        return permittedTreesOwners;
    }


    /**
     * Sets the permittedTreesOwners value for this PermittedTagTreesInfo.
     * 
     * @param permittedTreesOwners
     */
    public void setPermittedTreesOwners(com.cleverdome.api.UserData[] permittedTreesOwners) {
        this.permittedTreesOwners = permittedTreesOwners;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermittedTagTreesInfo)) return false;
        PermittedTagTreesInfo other = (PermittedTagTreesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentUser==null && other.getCurrentUser()==null) || 
             (this.currentUser!=null &&
              this.currentUser.equals(other.getCurrentUser()))) &&
            ((this.permittedTreesOwners==null && other.getPermittedTreesOwners()==null) || 
             (this.permittedTreesOwners!=null &&
              java.util.Arrays.equals(this.permittedTreesOwners, other.getPermittedTreesOwners())));
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
        if (getCurrentUser() != null) {
            _hashCode += getCurrentUser().hashCode();
        }
        if (getPermittedTreesOwners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermittedTreesOwners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermittedTreesOwners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermittedTagTreesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "PermittedTagTreesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "CurrentUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permittedTreesOwners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Data", "PermittedTreesOwners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "UserData"));
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
