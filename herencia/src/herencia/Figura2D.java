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
public class Figura2D extends Figura{
    
    //Método
    public float area (float base, float altura){
        return base * altura;
    }
    
    public float perimetro(float base, float altura){
        return 2 * base + 2 * altura;
    }
    
    public String estadoFigura2D(){
        return "Hola desde figuras 2D";
    }
}
