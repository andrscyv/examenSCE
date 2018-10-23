/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstws;

import javax.xml.ws.WebServiceException;

/**
 *
 * @author sdist
 */
public class Tstws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        miservicioweb.MiServicioWeb_Service service = new miservicioweb.MiServicioWeb_Service();
        miservicioweb.MiServicioWeb port = service.getMiServicioWebPort();
        int a,b,c;
        long t0, t1, deltaT, sumaDeltaT = 0, sumaDeltaT2 = 0;
        double promDeltaT, desvStdDeltaT;
        int N  = 20;
        
        for (int i = 0; i <= N; i++) {
           a = (int) (1000.0 * (-1.0+2.0*Math.random()));
           b =(int) (1000.0 * (-1.0+2.0*Math.random()));;
           t0 = System.nanoTime();
           try{
           c = port.suma(a,b); 
           }
           catch(Exception e){
               System.out.println("Excepcion cashada: "+e);
           }
           t1 = System.nanoTime();
           deltaT = t1-t0;
           sumaDeltaT +=deltaT;
           sumaDeltaT2 += deltaT ^2;
           
           if(i%100==0)
                System.out.println("Llamada: "+i);
        }
        promDeltaT = sumaDeltaT / (N *1.0E9);
        desvStdDeltaT = Math.sqrt((1.0/(N-1))*(sumaDeltaT2 - N*promDeltaT*promDeltaT))*1.0E-9;
        System.out.println("Para "+N+" iteraciones: ");
        System.out.println("Promedio en seg: "+promDeltaT);
        System.out.println("DesvStdDeltaT seg: "+desvStdDeltaT);
            
            
        
        
    }

    private static int suma(int a, int b) {
        miservicioweb.MiServicioWeb_Service service = new miservicioweb.MiServicioWeb_Service();
        miservicioweb.MiServicioWeb port = service.getMiServicioWebPort();
        return port.suma(a, b);
    }
    
}
