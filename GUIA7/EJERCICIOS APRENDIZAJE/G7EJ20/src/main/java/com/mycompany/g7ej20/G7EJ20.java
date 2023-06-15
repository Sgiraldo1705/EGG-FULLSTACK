/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ej20;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ20 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        System.out.println("Llena la matriz en orden para crear un cuadrado mágico");

        llenar(matriz);
        validar(matriz);
    }

    public static void llenar(int matriz[][]) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("ingresa la pos " + i + ":" + j);
                matriz[i][j] = input.nextInt();

                if (matriz[i][j] < 1 || matriz[i][j] >= 10) {

                    System.out.println("EL NÚMERO DEBE ESTAR ENTRE 1 Y 9");
                    matriz[i][j] = input.nextInt();
                }
            }
        }
    }

    public static void validar(int matriz[][]) {
        int[] var1 = new int[8];
        int suma = 0;
        int v = 0;
        
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                suma = suma + matriz[j][k];
            }
            var1[v] = suma;
            v++;
            suma = 0;
        }
        
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                suma = suma + matriz[k][j];
            }
            var1[v] = suma;
            v++;
            suma = 0; 
        }
        for (int i = 0; i < 3; i++) {
            suma=suma+matriz[i][i];
            
        }
        var1[6]=suma;
        suma=0;
        int j=2;
        
        for (int i = 0; i < 3; i++) {
            suma=suma+matriz[i][j];
           j--;
        }
var1[7]=suma;
        for (int i = 0; i < 8; i++) {
            if (var1[i]==var1[0])
                magica++ 
        }
    }
}
