/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.guia1;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Ejercicio7Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
           int tipoMotor;
                
        System.out.println("Ingrese el número del tipo de motor");
        tipoMotor = leer.nextInt();
        
        
        switch (tipoMotor){
        
        case 1:
        System.out.println("La bomba es una bomba de agua");
        break;
        
        case 2:
        System.out.println("La bomba es una bomba de gasolina");
        break;
        
        case 3:
        System.out.println("La bomba es una bomba de hormigón");
        break;
        
        case 4:
        System.out.println("La bomba es una bomba de pasta alimenticia");
        break;
        
        default:
        System.out.println("No existe un valor válido para la tipo de bomba");
    }
    }
    
}


