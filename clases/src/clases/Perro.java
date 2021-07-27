/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aiya
 */
public class Perro extends Animal {
    //Atributo
    private String tipoPelaje;

    //Constructor
    public Perro() {
        super(1, "Barbas", 4);
    }
    
    public Perro(String pelaje){
        this.tipoPelaje = pelaje;
        
    }
    
    //Métodos
    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }
 
    public String toStringPerro() {
        return "Perro{" + "tipoPelaje=" + tipoPelaje + '}';
    }
    
    
    
}
