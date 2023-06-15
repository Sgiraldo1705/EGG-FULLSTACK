/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ej18;

/**
 *
 * @author catom
 */
public class G7EJ18 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int num = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                
                num++;
                matriz[i][j] = num;
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }
        

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                matriz2[i][j] = matriz[j][i];
                System.out.print("[" + matriz2[i][j] + "]");

            }
            System.out.println("");
        }
    }
}
