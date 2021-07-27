/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author aiya
 */
public class Figura {
    //Atributos
    private String nombre;
    private String Color;

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", Color=" + Color + '}';
    }
    
    public String estadoFigura(){
        return "Hola desde Figura";
    }
}
