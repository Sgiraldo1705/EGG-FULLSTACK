/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ej17;



/**
 *
 * @author catom
 */
public class G7EJ17 {

    public static void main(String[] args) {
        int[] vector = new int[500];
        int de1 = 0, de2 = 0, de3 = 0, de4 = 0, de5 = 0;
        for (int i = 0; i <= 500 - 1; i++) {
            int random = (int) (Math.random() * 100000);
            vector[i] = random;

        }

        for (int j = 0; j < 500; j++) {

            if (vector[j] < 10) {
                de1++;
            } else if (vector[j] > 9 && vector[j] < 100) {
                de2++;
            } else if (vector[j] > 99 && vector[j] < 1000) {
                de3++;
            } else if (vector[j] > 999 && vector[j] < 10000) {
                de4++;
            } else if (vector[j] > 9999 && vector[j] < 100000) {
                de5++;
            }
        }
        System.out.println("de 1 hay : " + de1 + "de 2 hay : " + de2 + " de 3 hay : " + de3 + " de 4 hay : " + de4 + " de 5 hay : " + de5);
    }
}
