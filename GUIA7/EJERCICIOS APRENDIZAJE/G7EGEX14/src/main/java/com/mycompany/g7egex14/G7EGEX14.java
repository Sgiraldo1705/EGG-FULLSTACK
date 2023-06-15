/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g7egex14;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EGEX14 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int nFam=0, nHijos=0, edadMedia=0;
     
        System.out.println("Cuántas familias son?");
        nFam=input.nextInt();
        
        for (int i = 1; i <= nFam; i++) {
            System.out.println("Cuántos hijos tiene la familia"+i);
            int hijos= input.nextInt();
            
            nHijos = nHijos + hijos;
            for (int j = 1; j <= hijos; j++) {
                System.out.println("ingresa la edad del hijo "+j);
            int edad=input.nextInt();
            edadMedia=edadMedia+edad;
            
            }
            
        }
        int promedio= edadMedia/nFam;
        System.out.println("en total hay " + nHijos+ " hijos en el grupo con una edad promedio de "+ promedio + " años");
     
    }
}
