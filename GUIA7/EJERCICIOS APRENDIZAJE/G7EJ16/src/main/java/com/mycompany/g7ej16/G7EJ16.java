/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ej16;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("De qué tamaño desea el vector?");
        int num = input.nextInt();

        int[] vector = new int[num];

        for (int i = 0; i < num; i++) {
            int random = (int) (Math.random() * 10);
            vector[i] = random;

        }
        System.out.println("Qué número quiere buscar?");
        int cual = input.nextInt();

        int contador = 0;
        String posiciones = "";

        for (int i = 0; i <num; i++) {

            if (vector[i] == cual) {
                contador++;
                posiciones = posiciones.concat("[" + i + "]");
               
            }
        }
        System.out.println("El número se repite " + contador + " veces en las posiciones" + posiciones);
    }
}
