
package miservicioweb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MiServicioWeb", targetNamespace = "http://miservicioweb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MiServicioWeb {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCuentaSuma", targetNamespace = "http://miservicioweb/", className = "miservicioweb.GetCuentaSuma")
    @ResponseWrapper(localName = "getCuentaSumaResponse", targetNamespace = "http://miservicioweb/", className = "miservicioweb.GetCuentaSumaResponse")
    @Action(input = "http://miservicioweb/MiServicioWeb/getCuentaSumaRequest", output = "http://miservicioweb/MiServicioWeb/getCuentaSumaResponse")
    public int getCuentaSuma();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://miservicioweb/", className = "miservicioweb.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://miservicioweb/", className = "miservicioweb.HelloResponse")
    @Action(input = "http://miservicioweb/MiServicioWeb/helloRequest", output = "http://miservicioweb/MiServicioWeb/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://miservicioweb/", className = "miservicioweb.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://miservicioweb/", className = "miservicioweb.SumaResponse")
    @Action(input = "http://miservicioweb/MiServicioWeb/sumaRequest", output = "http://miservicioweb/MiServicioWeb/sumaResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://miservicioweb/MiServicioWeb/suma/Fault/Exception")
    })
    public int suma(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reseteaCuentaSuma", targetNamespace = "http://miservicioweb/", className = "miservicioweb.ReseteaCuentaSuma")
    @ResponseWrapper(localName = "reseteaCuentaSumaResponse", targetNamespace = "http://miservicioweb/", className = "miservicioweb.ReseteaCuentaSumaResponse")
    @Action(input = "http://miservicioweb/MiServicioWeb/reseteaCuentaSumaRequest", output = "http://miservicioweb/MiServicioWeb/reseteaCuentaSumaResponse")
    public String reseteaCuentaSuma();

}
