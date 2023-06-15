/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g7ejex7;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJEX7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("De cuántos números se va a sacar el promedio");
        int num = input.nextInt();
        int max = 0, prom = 0, cont = 0, min = 0;

        while (cont < num) {
            System.out.println("ingrese un número");
            int num2 = input.nextInt();
            if (cont == 0) {
                min = num2;
            }

            cont++;
            prom = prom + num2;
            if (num2 > max) {
                max = num2;
            }

            if (num2 < min) {
                min = num2;

            }

        }
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
        System.out.println("El promedio es: " + (prom / cont));

    }

}
