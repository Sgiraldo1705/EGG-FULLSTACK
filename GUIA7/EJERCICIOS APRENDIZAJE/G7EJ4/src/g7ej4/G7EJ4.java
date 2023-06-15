/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej4;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         
         System.out.println("Ingresa la temperatura en grados centígrados");
         int c = read.nextInt();
         
         float f = 32 +(9*c/5);
         
         System.out.println("La temperatura en grados Fahrenheit es: " + f +"°f");
         
    }
    
}
