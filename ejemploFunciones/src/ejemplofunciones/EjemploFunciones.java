/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofunciones;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class EjemploFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     int num1 = 5;
     int num2 = 7;
     int ret = sumar(num1, num2);
     
        System.out.println("La suma de ambos es: " + ret);
        
    }        
    public static int sumar (int num1, int num2){
        int suma;
        suma = num1+num2;
        return suma;
    }
    
        
    }
    

