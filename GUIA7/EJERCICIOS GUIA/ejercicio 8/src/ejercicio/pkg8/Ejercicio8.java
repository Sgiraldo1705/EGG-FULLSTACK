/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese una nota pra verificar que sea correcta");
        float nota = leer.nextFloat();
        while(nota>=10 && nota<=0){
            System.out.println("NOTA INVALIDA! inténtelo nuevamente");
            nota = leer.nextFloat();
        }
        
        System.out.println("La nota es válida.");
    }
    
}
