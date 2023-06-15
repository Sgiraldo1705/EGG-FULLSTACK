/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        int contador = 1;
        int suma = 0;
        
        do{
            
            System.out.println("Inresa un número");
            int num = leer.nextInt();
            
            if (num>0) {
            suma = suma + num;
                    
            } else if (num<0){
                continue;
            }else{
                System.out.println("SE CAPTURO EL NÚMERO 0");
                break;
            }
                 contador++;
        }
        while (contador<=20);
        System.out.println("El total de la suma de los números ingresados es: " + suma);
    }
    
}
