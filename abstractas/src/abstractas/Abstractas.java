/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas;

/**
 *
 * @author aiya
 */
public class Abstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //No se puede generar una instancia de una clase abstracta
        //Producto producto = new Producto();
        //ProductoCongelado pc = new ProductoCongelado();
        ProductoFresco pf = new ProductoFresco();
        pf.PreparacionAmbiente();
        
        ProductoCongeladoAire productoCongeladoAire = new ProductoCongeladoAire();
        productoCongeladoAire.PreparacionAmbiente();
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
