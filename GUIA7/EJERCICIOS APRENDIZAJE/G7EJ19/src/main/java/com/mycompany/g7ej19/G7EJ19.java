             /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ej19;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ19 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];

        System.out.println("INGRESA LOS VALORES DE MATRIZ EN ORDEN");

        llenar(matriz);

        System.out.println("INGRESA LOS VALORES DE TRASNSPUESTA EN ORDEN");

        llenar(transpuesta);

        esTrans(matriz, transpuesta);

    }

    public static void llenar(int matriz[][]) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingtresa la pos " + i + ":" + j);
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void esTrans(int matriz[][], int trans[][]) {
        int[][] test = new int[3][3];
        boolean es;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                test[i][j] = trans[i][j] * -1;

            }

        }
        do {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (matriz[i][j] == test[i][j]) {
                        es = true;

                    } else {
                        es = false;

                    }
                   
                }
                 System.out.println("La matriz no es anti simétrica");

                    break;

            }
            System.out.println("la matriz es anti simetrica");
            break;
        } while (es == true);
    }
}
