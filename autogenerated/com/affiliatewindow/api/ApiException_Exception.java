
package com.affiliatewindow.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.2
 * 2013-06-18T17:32:55.008-07:00
 * Generated source version: 2.4.2
 */

@WebFault(name = "ApiException", targetNamespace = "http://api.affiliatewindow.com/")
public class ApiException_Exception extends Exception {
    
    private com.affiliatewindow.api.ApiException apiException;

    public ApiException_Exception() {
        super();
    }
    
    public ApiException_Exception(String message) {
        super(message);
    }
    
    public ApiException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException_Exception(String message, com.affiliatewindow.api.ApiException apiException) {
        super(message);
        this.apiException = apiException;
    }

    public ApiException_Exception(String message, com.affiliatewindow.api.ApiException apiException, Throwable cause) {
        super(message, cause);
        this.apiException = apiException;
    }

    public com.affiliatewindow.api.ApiException getFaultInfo() {
        return this.apiException;
    }
}