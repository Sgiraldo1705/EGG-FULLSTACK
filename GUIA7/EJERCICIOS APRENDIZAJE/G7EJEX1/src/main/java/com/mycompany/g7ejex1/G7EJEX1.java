/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g7ejex1;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJEX1 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de minutos para convertir");
        int min= input.nextInt();
        
        int horas, dias;
        
        dias = min/1440;
              
        
        horas = min/60 - (dias*24) ; 
        
                
        System.out.println("dias: " + dias + ", horas: " + horas);
        
        
    }
}
