
package com.finmex.omnisuite.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * Demo Banca Electrónica.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CreditoMovimientos", targetNamespace = "http://Mascore/Movimientos", wsdlLocation = "http://192.168.80.102:8181/cxf/CreditoMovimientos?wsdl")
public class CreditoMovimientos
    extends Service
{

    private final static URL CREDITOMOVIMIENTOS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.finmex.omnisuite.client.CreditoMovimientos.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.finmex.omnisuite.client.CreditoMovimientos.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.80.102:8181/cxf/CreditoMovimientos?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.80.102:8181/cxf/CreditoMovimientos?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CREDITOMOVIMIENTOS_WSDL_LOCATION = url;
    }

    public CreditoMovimientos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreditoMovimientos() {
        super(CREDITOMOVIMIENTOS_WSDL_LOCATION, new QName("http://Mascore/Movimientos", "CreditoMovimientos"));
    }

    /**
     * 
     * @return
     *     returns CreditoMovimientosSoap
     */
    @WebEndpoint(name = "CreditoMovimientosSoap")
    public CreditoMovimientosSoap getCreditoMovimientosSoap() {
        return super.getPort(new QName("http://Mascore/Movimientos", "CreditoMovimientosSoap"), CreditoMovimientosSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreditoMovimientosSoap
     */
    @WebEndpoint(name = "CreditoMovimientosSoap")
    public CreditoMovimientosSoap getCreditoMovimientosSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://Mascore/Movimientos", "CreditoMovimientosSoap"), CreditoMovimientosSoap.class, features);
    }

}
