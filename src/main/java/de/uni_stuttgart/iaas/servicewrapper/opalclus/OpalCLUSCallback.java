package de.uni_stuttgart.iaas.servicewrapper.opalclus;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2019-03-27T13:47:29.510+01:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/", name = "opalCLUSCallback")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OpalCLUSCallback {

    @WebMethod(action = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/callbackCLUS")
    @Oneway
    public void callbackCLUS(
        @WebParam(partName = "parameters", name = "callback", targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalCLUS/")
        Callback parameters
    );
}
