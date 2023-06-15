/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class EJERCICIO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String[] egg = new String[5];
       
       
        System.out.println("Ingresa los nombres de tus compañeros uno a uno");
        
        for (int i = 0; i <5 ; i++) {
            
            egg[i]=leer.nextLine();
            
        }
        System.out.println("Mis compañeros son: ");
        for (int i = 0; i < 5; i++) {
            System.out.print( egg[i] + ", ");
        }
        
    }
    
}
