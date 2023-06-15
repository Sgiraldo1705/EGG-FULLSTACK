/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ej13;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero mayor que 0");
        int num = input.nextInt();
        String[][] matriz = new String[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i > 0) && i < num - 1 && j > 0 && j < num - 1) {
                    matriz[i][j] = " ";

                } else {
                    matriz[i][j] = "*";
                }

            }

        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                System.out.print(matriz[i][j]);


            }
            System.out.println("");
        }
    }
}

