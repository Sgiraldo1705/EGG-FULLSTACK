/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ejex11;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJEX11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero de cuántos dígitos quiera.");
        int num = input.nextInt();

        int cont = 1;

        if (num > 9) {
            num = num / 10;
            do {

                num = num / 10;
                cont++;

            } while (num % 10 > 0);
            System.out.println("El número tiene " + cont + " digitos");
        } else {
            System.out.println("tiene un solo digito");
        }
    }
}
