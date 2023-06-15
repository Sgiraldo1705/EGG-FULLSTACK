/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej5;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        double var = read.nextDouble();
        
        double sqr = Math.sqrt(var);
                    
        double doble = var*2;
        
        double triple = var*3;
        
        System.out.println("El doble es: "+ doble + "; El triple es: " + triple + "; La raíz cuadrada es: " + sqr);
    }
    
}
