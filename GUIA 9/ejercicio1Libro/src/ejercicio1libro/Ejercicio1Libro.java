/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1libro;

/**
 *
 * @author catom
 */
public class Ejercicio1Libro {

    public static void main(String[] args) {

        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();
        // this is a comment

        while (x > 12) {
            x--;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i is now " + i);

        }

        if (x == 10) {
            System.out.println("x must be 10");

        } else {
            System.out.println("X isn't 10");
            
        } 
        if ((x<3) && (name.equalsIgnoreCase("Dirk"))){
            System.out.println("Gently");
        }
        System.out.println("this line runs no matter what");
    }

}
