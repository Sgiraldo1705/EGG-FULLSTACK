/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej6;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número para saber si es par");
        int var = read.nextInt();
        if (var%2==0) {
            
            System.out.println(var + " Es un número par.");
            
        }else{
         System.out.println(var + " No es un número par.");
           }
           }



}