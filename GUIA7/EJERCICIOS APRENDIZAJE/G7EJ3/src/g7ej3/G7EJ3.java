/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej3;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Escribe una Frase");
        String frase = read.nextLine();
        
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
        
        System.out.println("Tu frase en mayusculas:");
        System.out.println(mayus);
        System.out.println("");
        
        System.out.println("Tu frase en minusculas:");
        System.out.println(minus);
  
    }
    
    
}
