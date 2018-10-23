/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author sdist
 */
public class ReseteaCont {
    
    
    public static void main(String[] args) {
        reseteaCuentaSuma();
        System.out.println("Suma reseteada");
    }

    private static String reseteaCuentaSuma() {
        miservicioweb.MiServicioWeb_Service service = new miservicioweb.MiServicioWeb_Service();
        miservicioweb.MiServicioWeb port = service.getMiServicioWebPort();
        return port.reseteaCuentaSuma();
    }
}
