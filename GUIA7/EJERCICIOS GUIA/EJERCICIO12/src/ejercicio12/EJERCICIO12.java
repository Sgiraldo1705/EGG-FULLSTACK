/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class EJERCICIO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese dos números para saber si el primero es multiplo del segundo");
        
        System.out.println("Ingrese el primer número");
        int a = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");
        int b = leer.nextInt();
        
        esMultiplo(a, b);
      
    }
    
    public static void esMultiplo(int a, int b){
        int c =a%b;
        
        if(c==0){     
            System.out.println(a + " Si es multiplo de " + b);
    }else{
            System.out.println(a + " No es multiplo de " + b);
    
}
    }     
}