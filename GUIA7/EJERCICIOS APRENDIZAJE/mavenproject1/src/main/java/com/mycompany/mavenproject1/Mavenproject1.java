/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author catom
 */
public class Mavenproject1 {

    public static void main(String[] args) {
      
        int[] matriz = new int[100];

        for (int i = 1; i < matriz.length; i++) {
            matriz[i]=i;
            
        }
        for (int i = 100; i < matriz.length; i--) {
            System.out.println("["+ matriz[i]+"]");
            
        }
    }
}
