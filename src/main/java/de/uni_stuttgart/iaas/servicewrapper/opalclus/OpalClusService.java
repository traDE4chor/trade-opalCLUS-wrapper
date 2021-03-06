package de.uni_stuttgart.iaas.servicewrapper.opalclus;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2019-03-27T13:47:29.540+01:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "OpalClusService", 
                  wsdlLocation = "file:/D:/TraDE/GitHub/trade-opalCLUS-wrapper/src/main/resources/opalCLUS.wsdl",
                  targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/") 
public class OpalClusService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/", "OpalClusService");
    public final static QName OpalClusServicePort = new QName("http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/", "OpalClusServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/TraDE/GitHub/trade-opalCLUS-wrapper/src/main/resources/opalCLUS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OpalClusService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/TraDE/GitHub/trade-opalCLUS-wrapper/src/main/resources/opalCLUS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OpalClusService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OpalClusService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OpalClusService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public OpalClusService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OpalClusService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OpalClusService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns OpalCLUS
     */
    @WebEndpoint(name = "OpalClusServicePort")
    public OpalCLUS getOpalClusServicePort() {
        return super.getPort(OpalClusServicePort, OpalCLUS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OpalCLUS
     */
    @WebEndpoint(name = "OpalClusServicePort")
    public OpalCLUS getOpalClusServicePort(WebServiceFeature... features) {
        return super.getPort(OpalClusServicePort, OpalCLUS.class, features);
    }

}
