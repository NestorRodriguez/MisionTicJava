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
interface registroInterface {
    
    public void logear(String user, String password );
    
    public void comprobar(String user);
    
    public void bloquear(String user);
}
