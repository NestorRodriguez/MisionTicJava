/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author aiya
 */
public class Ciclos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ciclos - bucles
        //while
        System.out.println("ciclor while");
        int numero = 0;
        while(numero <= 10){
            System.out.println(numero);
            //instrucciones
            numero++; // numero = numero + 1;
        }
        System.out.println("El valor final es: "+numero);
        //El while se utiliza en revisión de booleanos y ciclos
        //for
        System.out.println("ciclo for");
        //int num;
        for(int num = 0; num <= 10; num++){
            System.out.println(num);
        }
        //System.out.println("El valor final es: "+num);
        //El for se utiliza más para recorridos o ciclos
        //do-while
        System.out.println("Ciclo do-while");
        numero=15;
        do{
            System.out.println(numero);
            numero++;
        }while(numero <= 10);
        System.out.println("El valor final es: "+numero);
        //El do-while funciona para estados y ciclos y ejecuta las 
        //instrucciones una vez, como mínimo
       
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
