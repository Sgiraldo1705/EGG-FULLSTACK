/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operacion;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Operacion {

    private int n1;
    private int n2;

    public Operacion() {
    }

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void crearOperacion() {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor de 'a'");
        n1 = read.nextInt();

        System.out.println("Ingrese el valor de 'b'");
        n2 = read.nextInt();

    }

    public int sumar() {
        int total = n1 + n2;
        System.out.println("la suma de 'a+b' es igual a:" + total);
        return total;

    }

    public int restar() {
        int total = n1 - n2;
        System.out.println("la resta de 'a-b' es igual a:" + total);
        return total;

    }

    public void dividir() {
        if (n1 == 0 || n2 == 0) {
            System.out.println("Una de las variables es 0 lo cual da 0");

        } else {
            int total = n1 / n2;
            System.out.println("la division de 'a/b' es igual a:" + total);
        }

    }
}
