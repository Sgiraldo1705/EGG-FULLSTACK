/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej8;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     
     
         System.out.println("ingresa una palabra o frase de 8 caracteres");
         String var = read.nextLine();
         
     while(var.length()==8){
         System.out.println("EXCELENTE!!! Continua...");
         var=read.nextLine();
         
     }
        System.out.println("HAS PERDIDO :(");
    
    
    
}
}