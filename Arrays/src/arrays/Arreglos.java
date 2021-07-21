/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aiya
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Arrays
        int[] array = new int[3];
        int[] array1 = new int[3];
        array[1]= 5;
        array[0]= 3;
        array[2]= 8;
        
        for(int i=0; i < array.length; i++){
            System.out.println("Digite la posición "+(i+1));
            array[i]=in.nextInt();
        }
        
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);    
        }
        
        int suma = array[0] + array[1];
        System.out.println(suma);
        
        long multi = array[0] * array[1];
        System.out.println(multi);
        
        //Método para ordenar
        System.out.println("Ordenamiento con método");
        Integer[] numeros = {7, 4, 5, 8, 2};
        
        Arrays.sort(numeros, 0, 2, Collections.reverseOrder());
        
        for(int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);    
        }
        
        
        //Matrices
        String nombre[][] = new String[2][5];
        
        nombre[0][0] = "Carlos";
        nombre[0][1] = "Carolina";
        nombre[0][2] = "Juan";
        nombre[0][3] = "Jose";
        nombre[0][4] = "Pedro";
        nombre[1][0] = "Nairo";
        nombre[1][1] = "Ana Sofia";
        nombre[1][2] = "Angelica";
        nombre[1][3] = "Margarita";
        nombre[1][4] = "Camila";
        
        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < nombre[i].length; j++) {
                System.out.print(nombre[i][j] + " ");
            }
            System.out.println();
        }
        //Iteración del for
        // El primer for recorre las filas
        //El segundo for recorre las columnas
        //Primera iteración
        //i=0; j=0;
        //Segunda iteración
        //i=0; j=1;
        //Tercera iteración
        //i=1; j=0;
        //Cuarta iteración
        //i=1; j=1;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
