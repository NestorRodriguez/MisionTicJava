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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        cuadrado.setColor("Verde");
        cuadrado.setNombre("Cuadrado perfecto");
        System.out.println(cuadrado.area(cuadrado.getLado(), cuadrado.getLado()));
        System.out.println(cuadrado.estadoFigura2D());
        System.out.println(cuadrado.estadoFigura());
    }
    
}
