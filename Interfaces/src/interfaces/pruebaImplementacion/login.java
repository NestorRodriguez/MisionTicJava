/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.pruebaImplementacion;

/**
 *
 * @author aiya
 */
public class login implements InterfaceLogin, InterfaceProducto{
    
    @Override
    public void logear(String user, String password) {
        System.out.println("Método loguear");
    }

    @Override
    public void comprobar(String user) {
        System.out.println("Método comprobar");
    }

    @Override
    public void bloquear(String user) {
        System.out.println("Método bloquear");
    }
    
}
