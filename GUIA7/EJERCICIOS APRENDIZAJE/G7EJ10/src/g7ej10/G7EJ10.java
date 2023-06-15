/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej10;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);    
     int suma=0;
         System.out.println("ingresa un valor MÁXIMO");
         int max = read.nextInt(); 
         
         do{
             System.out.println("Ingresa un número para sumar");
             int num = read.nextInt();
             
             suma = suma+num;
         }while(suma<=max);
         System.out.println("Limite alcanzado");
         
    }
    
}
