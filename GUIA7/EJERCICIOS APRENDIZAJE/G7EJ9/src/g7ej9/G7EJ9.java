/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej9;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    
        Scanner read = new Scanner(System.in);    
     
         System.out.println("ingresa una palabra o frase que inicie con 'A'");
         String var = read.nextLine();
         
         String primera = var.substring(0, 1);
         
         if (primera.equalsIgnoreCase("a")){
             System.out.println("CORRECTO!");
         }else{
             System.out.println("INCORRECTO");
         }
         
         
                 
}
}