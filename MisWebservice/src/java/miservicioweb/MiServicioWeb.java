/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miservicioweb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "MiServicioWeb")
public class MiServicioWeb {
    int numServiciosSuma = 0;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public int suma (@WebParam(name = "a") int a, @WebParam(name = "b") int b) throws Exception{
        System.out.println("Llamada con: "+a+"  "+ b);
        numServiciosSuma++;
//        if(true)
//        throw new Exception("Excepcion de la suma en el servidor");
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCuentaSuma")
    public int getCuentaSuma() {
        //TODO write your implementation code here:
        return numServiciosSuma;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "reseteaCuentaSuma")
    public String reseteaCuentaSuma() {
        //TODO write your implementation code here:
        numServiciosSuma = 0;
        return "Reseteado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplica")
    public int multiplica(@WebParam(name = "a") int a, @WebParam(name = "b") int b) throws Exception{
        //TODO write your implementation code here:
        int res;
        try{
        res = Math.multiplyExact(a,b);
        }
        catch(Exception e){
        throw new Exception("Excepcion de la multiplicacion: OVERFLOW");
        }
        
        return res;
    }
    
}
