package com.bibliotheques.appliweb.consumer.generated.utilisateurservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-05T14:30:09.436+02:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "UtilisateurService",
                  wsdlLocation = "file:/D:/Parcours_Developpeur_Application_Java/Projet_7_Systeme_information_bibliotheque/bibliotheques-annecy/bibliotheques-annecy-consumer/src/main/resources/wsdl/UtilisateurService.wsdl",
                  targetNamespace = "http://www.example.org/UtilisateurService/")
public class UtilisateurService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/UtilisateurService/", "UtilisateurService");
    public final static QName UtilisateurServiceSOAP = new QName("http://www.example.org/UtilisateurService/", "UtilisateurServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/Parcours_Developpeur_Application_Java/Projet_7_Systeme_information_bibliotheque/bibliotheques-annecy/bibliotheques-annecy-consumer/src/main/resources/wsdl/UtilisateurService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UtilisateurService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/Parcours_Developpeur_Application_Java/Projet_7_Systeme_information_bibliotheque/bibliotheques-annecy/bibliotheques-annecy-consumer/src/main/resources/wsdl/UtilisateurService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UtilisateurService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UtilisateurService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtilisateurService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public UtilisateurService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UtilisateurService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UtilisateurService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UtilisateurService
     */
    @WebEndpoint(name = "UtilisateurServiceSOAP")
    public UtilisateurService getUtilisateurServiceSOAP() {
        return super.getPort(UtilisateurServiceSOAP, UtilisateurService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtilisateurService
     */
    @WebEndpoint(name = "UtilisateurServiceSOAP")
    public UtilisateurService getUtilisateurServiceSOAP(WebServiceFeature... features) {
        return super.getPort(UtilisateurServiceSOAP, UtilisateurService.class, features);
    }

}
