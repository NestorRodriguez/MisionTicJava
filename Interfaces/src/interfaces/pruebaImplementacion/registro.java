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
public class registro implements registroInterface{

    @Override
    public void logear(String user, String password) {
        System.out.println("legear desde registro");
    }

    @Override
    public void comprobar(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquear(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
