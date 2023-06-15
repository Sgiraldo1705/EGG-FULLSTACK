/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        for (int i=0; i==4; i++){
            System.out.println("Ingresa un número");
            int a = leer.nextInt();
            String n= "*";
            
            for (int j=0; j<a ;j++){
               n = n.concat("*");
            }
             System.out.println(n);
        }
       
    
}
}