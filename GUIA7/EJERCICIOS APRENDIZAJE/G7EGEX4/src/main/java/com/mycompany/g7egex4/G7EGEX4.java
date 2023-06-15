/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g7egex4;
import  java.util.Scanner;
/**
 *
 * @author catom
 */
public class G7EGEX4 {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
        System.out.println("Ingrese un número del 1 al 10 para transformarlo a romano");
        int num = input.nextInt();
        String rom;
        
        if (num==5){
            rom="V";
        }
        if (num==10) {
            rom="X";            
        }
        
    }
}
