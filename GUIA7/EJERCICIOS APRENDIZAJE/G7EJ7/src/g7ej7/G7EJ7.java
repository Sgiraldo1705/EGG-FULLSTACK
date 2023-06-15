/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej7;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner read = new Scanner(System.in);  
    String clave= "eureka";
    
        System.out.println("Ingrese la palabra secreta");
        String ingreso = read.nextLine();
        
        if (ingreso.equalsIgnoreCase(clave)){
            
            System.out.println("PALABRA CORRECTA");
            
        }else{System.out.println("INCORRECTO");}
         
}       
}
