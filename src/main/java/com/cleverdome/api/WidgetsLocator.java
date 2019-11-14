/**
 * WidgetsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class WidgetsLocator extends org.apache.axis.client.Service implements com.cleverdome.api.Widgets {

    public WidgetsLocator(WidgetsLocator_address address) {
        BasicHttpBinding_IWidgets_address = address.url();
    }
    public WidgetsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WidgetsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    public enum WidgetsLocator_address {
        Prod("https://www.objectstoragesolutions.io/soap-api/Services/Widgets.svc/basic"),
        SandBox("https://sandbox.objectstoragesolutions.io/soap-api/Services/Widgets.svc/basic"),
        Test("https://test.objectstoragesolutions.io/soap-api/Services/Widgets.svc/basic");
        private String url;

        WidgetsLocator_address(String url) {
            this.url = url;
        }

        public String url() {
            return url;
        }
    }

    // Use to get a proxy class for BasicHttpBinding_IWidgets
    private java.lang.String BasicHttpBinding_IWidgets_address = "";

    public java.lang.String getBasicHttpBinding_IWidgetsAddress(WidgetsLocator_address address) {
        return address.url();
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IWidgetsWSDDServiceName = "BasicHttpBinding_IWidgets";

    public java.lang.String getBasicHttpBinding_IWidgetsWSDDServiceName() {
        return BasicHttpBinding_IWidgetsWSDDServiceName;
    }

    public void setBasicHttpBinding_IWidgetsWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IWidgetsWSDDServiceName = name;
    }

    public com.cleverdome.api.IWidgets getBasicHttpBinding_IWidgets() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IWidgets_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IWidgets(endpoint);
    }

    public com.cleverdome.api.IWidgets getBasicHttpBinding_IWidgets(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cleverdome.api.BasicHttpBinding_IWidgetsStub _stub = new com.cleverdome.api.BasicHttpBinding_IWidgetsStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IWidgetsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IWidgetsEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IWidgets_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cleverdome.api.IWidgets.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cleverdome.api.BasicHttpBinding_IWidgetsStub _stub = new com.cleverdome.api.BasicHttpBinding_IWidgetsStub(new java.net.URL(BasicHttpBinding_IWidgets_address), this);
                _stub.setPortName(getBasicHttpBinding_IWidgetsWSDDServiceName());
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
        if ("BasicHttpBinding_IWidgets".equals(inputPortName)) {
            return getBasicHttpBinding_IWidgets();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "Widgets");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IWidgets"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IWidgets".equals(portName)) {
            setBasicHttpBinding_IWidgetsEndpointAddress(address);
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
