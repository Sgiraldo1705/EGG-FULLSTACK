/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ejex16;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJEX16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cuántos lugares en la lista?");
        int N = input.nextInt();

        String[][] lista = new String[N][3];
        llenar(lista, N);
        print(lista, N);
    }

    public static void llenar(String lista[][], int N) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= N-1; i++) {
            for (int j = 0; j <1; j++) {
                System.out.println("Ingrese el nombre");
                lista[i][j] = input.next();

                System.out.println("Ingrese la edad");
                lista[i][(j + 1)] = input.next();

                int edad = Integer.parseInt(lista[i][(j + 1)]);

                if (edad >= 18) {
                    lista[i][(j + 2)] = "ES MAYOR";

                } else {
                    lista[i][(j + 2)] = "NO ES MAYOR";
                }

            }

        }

    }

    public static void print(String lista[][],int N) {

        System.out.println("*****************************************");
        System.out.println("*   -NOMBRE-    || -EDAD- || ¿ES MAYOR? *");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println("*" + lista[i][j] + "||" + lista[i][(j + 1)] + "||" + lista[i][(j + 2)] + "*");
            }
        }
    }
}
