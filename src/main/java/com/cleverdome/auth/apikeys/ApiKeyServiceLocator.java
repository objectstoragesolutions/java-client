/**
 * ApiKeyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.auth.apikeys;

public class ApiKeyServiceLocator extends org.apache.axis.client.Service implements com.cleverdome.auth.apikeys.ApiKeyService {

    public ApiKeyServiceLocator() {
    }


    public ApiKeyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ApiKeyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IApiKeyService
    private java.lang.String BasicHttpBinding_IApiKeyService_address = "https://sandbox.cleverdome.com/JavaSSOService/ApiKeyService.svc";

    public java.lang.String getBasicHttpBinding_IApiKeyServiceAddress() {
        return BasicHttpBinding_IApiKeyService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IApiKeyServiceWSDDServiceName = "BasicHttpBinding_IApiKeyService";

    public java.lang.String getBasicHttpBinding_IApiKeyServiceWSDDServiceName() {
        return BasicHttpBinding_IApiKeyServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IApiKeyServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IApiKeyServiceWSDDServiceName = name;
    }

    public com.cleverdome.auth.apikeys.IApiKeyService getBasicHttpBinding_IApiKeyService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IApiKeyService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IApiKeyService(endpoint);
    }

    public com.cleverdome.auth.apikeys.IApiKeyService getBasicHttpBinding_IApiKeyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cleverdome.auth.apikeys.BasicHttpBinding_IApiKeyServiceStub _stub = new com.cleverdome.auth.apikeys.BasicHttpBinding_IApiKeyServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IApiKeyServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IApiKeyServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IApiKeyService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cleverdome.auth.apikeys.IApiKeyService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cleverdome.auth.apikeys.BasicHttpBinding_IApiKeyServiceStub _stub = new com.cleverdome.auth.apikeys.BasicHttpBinding_IApiKeyServiceStub(new java.net.URL(BasicHttpBinding_IApiKeyService_address), this);
                _stub.setPortName(getBasicHttpBinding_IApiKeyServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IApiKeyService".equals(inputPortName)) {
            return getBasicHttpBinding_IApiKeyService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "ApiKeyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cleverdome.com/apikeys", "BasicHttpBinding_IApiKeyService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IApiKeyService".equals(portName)) {
            setBasicHttpBinding_IApiKeyServiceEndpointAddress(address);
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
