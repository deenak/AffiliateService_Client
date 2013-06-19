package com.affiliatewindow.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2013-06-18T17:32:55.021-07:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "ApiService", 
                  wsdlLocation = "file:/C:/501122045/workspace/eclipse/AffiliateService_Client/wsdl/AffiliateService_e.wsdl",
                  targetNamespace = "http://api.affiliatewindow.com/") 
public class ApiService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://api.affiliatewindow.com/", "ApiService");
    public final static QName ApiPort = new QName("http://api.affiliatewindow.com/", "ApiPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/501122045/workspace/eclipse/AffiliateService_Client/wsdl/AffiliateService_e.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ApiService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/501122045/workspace/eclipse/AffiliateService_Client/wsdl/AffiliateService_e.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ApiService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ApiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ApiService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ApiPortType
     */
    @WebEndpoint(name = "ApiPort")
    public ApiPortType getApiPort() {
        return super.getPort(ApiPort, ApiPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ApiPortType
     */
    @WebEndpoint(name = "ApiPort")
    public ApiPortType getApiPort(WebServiceFeature... features) {
        return super.getPort(ApiPort, ApiPortType.class, features);
    }

}
