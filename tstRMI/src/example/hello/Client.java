/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//================================================================
// Código del Cliente:
//================================================================
package example.hello;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import miservicioweb.Exception_Exception;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Client 
{
    //private Client() {}
    public static void main(String[] args) 
    {
       long lngQuienSoy;
       long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
       long lngCuantosMilisFaltan;
       miservicioweb.MiServicioWeb_Service service = new miservicioweb.MiServicioWeb_Service();
       miservicioweb.MiServicioWeb port = service.getMiServicioWebPort();
       String host = (args.length < 1) ? null : args[0];
       long i,n,t0,t1,dt;
       String response;
       int suma;
       int a = 2147483647;
       int b = 0;
       int min = -46339;
       int max = 46339;
       
       n = (args.length < 2) ? 20 : Long.parseLong(args[1]);
       
       try 
        {
             Registry registry = LocateRegistry.getRegistry(host);
             IServDisparo servDisparo = (IServDisparo) registry.lookup("ServidorDeDisparo");
             lngQuienSoy = servDisparo.quienSoy();
             lngCuantosMilisFaltan = servDisparo.deltaTEnMilis();
             System.out.println("Cliente " + lngQuienSoy + " faltan " + lngCuantosMilisFaltan  + " milisegundos");
             sumDeltaT  = 0;
             sumDeltaT2 = 0;
//             Hello stub = (Hello) registry.lookup("Hello");
             Thread.currentThread().sleep(lngCuantosMilisFaltan);
             
             for(i= 0; i < n; i++ )
             {
               t0 = System.currentTimeMillis();  
//               response = stub.sayHello();
            
            //EJERCICIO 1 SUMA 
               //suma = port.suma(1,2);
               
            //Ejercicio 3 Multiplicacion con overflow
            try{
                if(Math.random() < 0.1)
                    a = 2147483647;
                else{
                a = ThreadLocalRandom.current().nextInt(min, max + 1);
                b = ThreadLocalRandom.current().nextInt(min, max + 1);
                }
                    
            suma = port.multiplica(a,b);
            }
            catch(Exception e){
                System.out.println(e);
                suma = -1;
            }
            
               t1 = System.currentTimeMillis();
               dt = t1 - t0;
               sumDeltaT  += dt;
               sumDeltaT2 += dt * dt;
               if( i == 0 )
               {
                   dtMin = dt;
                   dtMax = dt;
               }
               else
               {
                   if( dt < dtMin ) dtMin = dt;
                   if( dt > dtMax ) dtMax = dt;
               }
               System.out.println("Clte " + lngQuienSoy + ": suma:" + suma);
             }
             servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
          } 
          catch (Exception e)
          {
              System.err.println("Client exception: " + e.toString());
               e.printStackTrace();
           }
    }

    private static int suma(int a, int b) throws Exception_Exception {
        miservicioweb.MiServicioWeb_Service service = new miservicioweb.MiServicioWeb_Service();
        miservicioweb.MiServicioWeb port = service.getMiServicioWebPort();
        return port.suma(a, b);
    }

    private static int multiplica(int a, int b) throws Exception_Exception {
        miservicioweb.MiServicioWeb_Service service = new miservicioweb.MiServicioWeb_Service();
        miservicioweb.MiServicioWeb port = service.getMiServicioWebPort();
        return port.multiplica(a, b);
    }
}
//================================================================

