/**
 * IVendorUserManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.vendormgmt;

public interface IVendorUserManagement extends java.rmi.Remote {
    public java.lang.Integer createUser(java.lang.String apiKey, java.lang.String externalUserID, java.lang.String firstName, java.lang.String lastName, java.lang.String email, java.lang.String phone) throws java.rmi.RemoteException;
    public java.lang.Integer getCleverDomeUserID(java.lang.String apiKey, java.lang.String externalUserID) throws java.rmi.RemoteException;
    public void allowAccessToUserTagsHierarchy(java.lang.String apiKey, java.lang.Integer accessorID, java.lang.Integer sharedUserID) throws java.rmi.RemoteException;
    public void denyAccessToUserTagsHierarchy(java.lang.String apiKey, java.lang.Integer accessorID, java.lang.Integer sharedUserID) throws java.rmi.RemoteException;
    public void deleteUser(java.lang.String apiKey, java.lang.String externalUserID) throws java.rmi.RemoteException;
    public com.cleverdome.vendormgmt.PortalUserUserEmail[] getUserEmails(java.lang.String apiKey, java.lang.String externalUserID) throws java.rmi.RemoteException;
    public java.lang.Integer addUserEmail(java.lang.String apiKey, java.lang.String externalUserID, java.lang.String email, java.lang.Boolean isPrimary) throws java.rmi.RemoteException;
    public void setUserPrimaryEmail(java.lang.String apiKey, java.lang.String externalUserID, java.lang.Integer emailID) throws java.rmi.RemoteException;
    public void removeUserEmail(java.lang.String apiKey, java.lang.String externalUserID, java.lang.Integer emailID) throws java.rmi.RemoteException;
}
