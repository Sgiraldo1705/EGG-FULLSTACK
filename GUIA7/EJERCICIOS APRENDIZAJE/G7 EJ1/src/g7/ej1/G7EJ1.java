/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7.ej1;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        System.out.println("ingresa dos números para sumarlos");
        int a = read.nextInt();
        int b = read.nextInt();
        
        int c =a+b;
        
        System.out.println("El total de la suma es: " + c);

    }
    
}
