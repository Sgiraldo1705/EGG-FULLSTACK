/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g7ej12;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String code;
        int correctos=0, incorrectos=0;
        
        do{
        System.out.println("Ingrese un codigo");
        code= input.nextLine();
        
        if ((code.startsWith("X"))&&(code.endsWith("o"))){
            correctos++;
        }else{
            incorrectos++;
        }
        }while(!code.equals("&&&&&"));
        System.out.println("Cantidad correctas " + correctos);
        System.out.println("Cantidad incorrectas " + incorrectos);
    }                        
}
