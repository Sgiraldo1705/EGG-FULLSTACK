/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej11;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ11 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("ingresa dos números");

        int var1 = read.nextInt();
        int var2 = read.nextInt();
        int resultado;
        int eleccion = 0;
        String exit = "n";

        do {
            menu();

            eleccion = read.nextInt();

            switch (eleccion) {
                case 1:
                    resultado = var1 + var2;

                    System.out.println("Total de la suma: " + resultado);

                    break;
                case 2:
                    resultado = var1 - var2;
                    System.out.println("Total de la resta: " + resultado);

                    break;
                case 3:
                    resultado = var1 * var2;
                    System.out.println("Total de la multiplicación: " + resultado);
                    break;
                case 4:
                    resultado = var1 / var2;
                    System.out.println("Total de la división: " + resultado);
                    break;

                case 5:
                    System.out.println("Desea salir? S/N");
                    exit = read.next();

            }

        } while (exit.equalsIgnoreCase("n"));
    }

    public static void menu() {
        System.out.println("ESCOJE UNA OPCIÓN DEL MENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

    }

    }

