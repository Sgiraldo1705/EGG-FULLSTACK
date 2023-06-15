/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7egex15;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EGEX15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa dos números");
        System.out.print("var1:");
        int var1 = input.nextInt();
        System.out.print("var2:");
        int var2 = input.nextInt();

        int sel = menu();

        switch (sel) {

            case 1:
                sumar(var1, var2);
                menu();

            case 2:
                resta(var1, var2);
                menu();

            case 3:
                multi(var1, var2);
                menu();

            case 4:
                div(var1, var2);
                menu();

            case 5:
                System.out.println("BYE!");
                break;
                
            default:
                System.out.println("Opción invalida");
                menu();
        }
    }

    public static void sumar(int var1, int var2) {
        int res = var1 + var2;
        System.out.println(var1 + "+" + var2 + "=" + res);

    }

    public static void resta(int var1, int var2) {
        int res = var1 - var2;
        System.out.println(var1 + "-" + var2 + "=" + res);
        
    }

    public static void multi(int var1, int var2) {
        int res = var1 * var2;
        System.out.println(var1 + "X" + var2 + "=" + res);
    }

    public static void div(int var1, int var2) {
        int res = var1 / var2;
        System.out.println(var1 + "/" + var2 + "=" + res);
    }

    public static int menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("*     -MENU-     *");
        System.out.println("*  1)SUMAR       *");
        System.out.println("*  2)RESTAR      *");
        System.out.println("*  3)MULTIPLICAR *");
        System.out.println("*  4)DIVIDIR     *");
        System.out.println("*  5)SALIR       *");
        System.out.println("******************");
        int sel = input.nextInt();
        return sel;

    }
}
