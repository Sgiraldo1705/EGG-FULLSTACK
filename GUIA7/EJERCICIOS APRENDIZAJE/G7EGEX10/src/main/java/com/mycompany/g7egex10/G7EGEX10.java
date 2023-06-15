/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7egex10;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EGEX10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = multi();
        System.out.println(res);

        System.out.println("adivina el resultado de una multiplicación de dos números entre 1 y 10");
        int user = input.nextInt();
        while (user != res) {
            System.out.println("Incorrecto! intentalo nuevamente");
            user = input.nextInt();

          
        }
        System.out.println("Adivinaste");
    }

    public static int multi() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);

        int res = a * b;

        return res;

    }
}
