/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author aiya
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);        
        //Condicionales
        //1. Variable
        //2. Operador lógico >, <, >=, <=, ==, !=, 
        //3. Valor a comparar
        int a = 0;
        boolean estado = true;
        if(a >= 2){
            // instrucciones si cumple la condición    
        }
        else if(a < 3){
            // Instrucciones si no cumple y cuumple la nueva la condición
        }
        String valor = (estado) ? "Positivo" : "negativo";
        
        //AND lógico ó Y 
        //valor 1 = Arroz
        //Valor 2  = Pollo
        //valor1 && valor2
        System.out.println("Digite el valor");
        a = in.nextInt();
        if(a>0 && a <3){
           System.out.println("Número valido");
        }
        else if(a>=5 && a <=8){
           System.out.println("Número valido 2");
        }
        else if(a == 10){
           System.out.println("Número no valido");
        }
        
            
        //switch
        switch(a)
        {
            case 0: System.out.println("a es 0");                   
                    break;
            case 1: System.out.println("a es 1");                   
                    break;
            case 2: System.out.println("a es 2");                   
                    break;
            case 3: System.out.println("a es 3");                   
                    break;        
            default: System.out.println("No es ni 1 ni 2");
                    break;
        }
        
        String nombre = "Mama";
        //nombre.equals("mama");
        if(nombre.equals("Mama"))
            System.out.println("Si es Mama");
        else
            System.out.println("No es Mama");
        
        
        
        
        
        
        
        
        
        
        
        
                  
              
        
        
        
        
        
        
        
    }
    
}
