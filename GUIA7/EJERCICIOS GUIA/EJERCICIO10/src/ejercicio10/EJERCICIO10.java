/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese un número");
       
    String a ="";
    String b ="";
    for (int i = 0; i<4; i++){
        int num = leer.nextInt();
        if (num>0 && num<=20){
                                
        for ( int j =1;j<=num; j++ ){
               a= a+"*";
               
              }        
                     
         System.out.println(num + a + b);
         a="";
        
          }else {
        System.out.println("Numero fuera de rango");
        }
        
    }
       
    }
    
    
}
