/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.prueba.Casa;
import java.util.Scanner;

/**
 *
 * @author aiya
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //Instnaciar la clase Animal con el constructor vacio
        System.out.println("Objeto 1");
        Animal animal1 = new Animal();
        System.out.println(animal1.toString());
        animal1.setId(10);
        animal1.setName("Toby");
        animal1.setYear(2);
        System.out.println(animal1.toString());
        animal1.setYear(10);
        System.out.println(animal1.setOperacion());
        
        //Instanciar la clase Animal con el constructor por parametros
        System.out.println("Objeto 2");
        Animal animal2 = new Animal(1, "Lucas", 9);
        System.out.println(animal2.toString());
        animal2.setId(20);
        if(animal2.getId()==10)
            System.out.println("Hola");
        System.out.println(animal2.toString());
        System.out.println(animal2.setOperacion());
        
        Casa casa = new Casa();
        System.out.println(casa.toString());
       
        
        //clase llamada Persona que siga las siguientes condiciones:
        //Sus atributos son: nombre, edad, documento, sexo (H hombre, M mujer),
        //peso y altura. No queremos que se accedan directamente a ellos. 
        //Piensa que modificador de acceso es el más adecuado,también su tipo. 
        //Se implantaran varios constructores:
        //Un constructor por defecto.
        //Un constructor con el nombre, edad y sexo, el resto por defecto.
        //Un constructor con todos los atributos como parámetro.

        llamar();
        int b = llamar(2);
        System.out.println("El valor de b es "+b);
        System.out.println(llamar("Pedro"));
        Animal anPrueba = llamar(2, "Pupy", 4);
        System.out.println(anPrueba.toString());
        Animal aniPrueba = llamar("Tobby", 2, 4); 
        System.out.println(aniPrueba.toString());
        
        
        //Herencia
        System.out.println("Herencia");
        Perro perro = new Perro();
        perro.setTipoPelaje("Suave");
        perro.setOperacion();
        System.out.println(perro.toString());
    }
    
    //Sobrecarga de métodos
    private static void llamar(){
        System.out.println("Hola desde llamar");
    }
    
    private static int llamar(int a){
        return a*5;
    }
    
    private static String llamar(String b){
        return "Hola "+b;
    }
    
    private static Animal llamar(long id, String name, int year){
        return new Animal(id, name, year);
    }
    
    private static Animal llamar(String name, long id, int year){
        return new Animal(id, name, year);
    }
    
}

