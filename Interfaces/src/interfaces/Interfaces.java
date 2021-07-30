/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.pruebaImplementacion.login;
import interfaces.pruebaImplementacion.registro;

/**
 *
 * @author aiya
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login login = new login();
        login.logear("Pepe", "1234");
        
        registro register = new registro();
        register.logear("Camilo", "234");
        
    }
    
}
