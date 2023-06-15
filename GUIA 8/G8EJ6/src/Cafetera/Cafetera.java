/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafetera;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Cafetera {

    private int maxCapacity;
    private int currentQuantity;

    public Cafetera() {
        this.currentQuantity = 65;
        this.maxCapacity = 100;
    }

    public Cafetera(int maxCapacity, int currentQuantity) {
        this.maxCapacity = maxCapacity;
        this.currentQuantity = currentQuantity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public void fillCoffee() {
        this.setCurrentQuantity(currentQuantity = 100);
    }

    public void pourCoffee() {
        Scanner read = new Scanner(System.in);
        String size;
        int porcion;
        System.out.println("De qué tamaño desea el café?");
        System.out.println("    P. Pequeño");
        System.out.println("    M. Mediano");
        System.out.println("    G. Grande");
        size = read.nextLine();

        if (size.equalsIgnoreCase("p")) {
            porcion = 7;

            if (currentQuantity < porcion) {
                System.out.println("No hay suficiente café, iniciará el proceso de recarga");

                fillCoffee();

            } else {
                System.out.println("Su café será preparado enseguida");
            }
        }
            if (size.equalsIgnoreCase("m")) {
                porcion = 10;
                if (currentQuantity < porcion) {
                    System.out.println("No hay suficiente café, iniciará el proceso de recarga");

                    fillCoffee();

                } else {
                    System.out.println("Su café será preparado enseguida");

                }
                

            }
            if (size.equalsIgnoreCase("g")) {
                porcion = 15;
                if (currentQuantity < porcion) {
                    System.out.println("No hay suficiente café, iniciará el proceso de recarga");
                    System.out.println("cantidad de cafe actual" + currentQuantity);

                    fillCoffee();

                } else {
                    System.out.println("Su café será preparado enseguida");
                    }
        }
    }
}
