/**
 * VendorUserManagementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.vendormgmt;

public class VendorUserManagementLocator extends org.apache.axis.client.Service implements com.cleverdome.vendormgmt.VendorUserManagement {

    public VendorUserManagementLocator(VendorUserManagement_address address) {
        BasicHttpBinding_IVendorUserManagement_address = address.url();
    }

    public VendorUserManagementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VendorUserManagementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    public enum VendorUserManagement_address {
        Prod("https://www.objectstoragesolutions.io/soap-api/Services/VendorUserManagement.svc"),
        SandBox("https://sandbox.objectstoragesolutions.io/soap-api/Services/VendorUserManagement.svc");
        private String url;

        VendorUserManagement_address(String url) {
            this.url = url;
        }

        public String url() {
            return url;
        }
    }
    // Use to get a proxy class for BasicHttpBinding_IVendorUserManagement
    private java.lang.String BasicHttpBinding_IVendorUserManagement_address = "";

    public java.lang.String getBasicHttpBinding_IVendorUserManagementAddress() {
            return BasicHttpBinding_IVendorUserManagement_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IVendorUserManagementWSDDServiceName = "BasicHttpBinding_IVendorUserManagement";

    public java.lang.String getBasicHttpBinding_IVendorUserManagementWSDDServiceName() {
        return BasicHttpBinding_IVendorUserManagementWSDDServiceName;
    }

    public void setBasicHttpBinding_IVendorUserManagementWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IVendorUserManagementWSDDServiceName = name;
    }

    public com.cleverdome.vendormgmt.IVendorUserManagement getBasicHttpBinding_IVendorUserManagement() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IVendorUserManagement_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IVendorUserManagement(endpoint);
    }

    public com.cleverdome.vendormgmt.IVendorUserManagement getBasicHttpBinding_IVendorUserManagement(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cleverdome.vendormgmt.BasicHttpBinding_IVendorUserManagementStub _stub = new com.cleverdome.vendormgmt.BasicHttpBinding_IVendorUserManagementStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IVendorUserManagementWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IVendorUserManagementEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IVendorUserManagement_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cleverdome.vendormgmt.IVendorUserManagement.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cleverdome.vendormgmt.BasicHttpBinding_IVendorUserManagementStub _stub = new com.cleverdome.vendormgmt.BasicHttpBinding_IVendorUserManagementStub(new java.net.URL(BasicHttpBinding_IVendorUserManagement_address), this);
                _stub.setPortName(getBasicHttpBinding_IVendorUserManagementWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IVendorUserManagement".equals(inputPortName)) {
            return getBasicHttpBinding_IVendorUserManagement();
        }
        else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "VendorUserManagement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IVendorUserManagement"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IVendorUserManagement".equals(portName)) {
            setBasicHttpBinding_IVendorUserManagementEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
