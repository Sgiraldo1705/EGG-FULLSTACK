/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Cuenta {
 Scanner read =new Scanner(System.in);  
    private int numerocuenta;
    private int dni;
    private double saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numerocuenta, int dni, double saldo, double interes) {
        this.numerocuenta = 0;
        this.dni = 0;
        this.saldo = 0;
        this.interes = 0;
    }

  

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public  Cuenta crearCuenta(){
     
    
       Cuenta cta1 = new Cuenta();
       
        System.out.println("Ingrese el DNI del Cliente");
        cta1.setDni(read.nextInt());
        System.out.println("Ingrese el número de cuenta asignado");
        cta1.setNumerocuenta(read.nextInt());
        
        System.out.println("Ingrese el saldo inicial de la cuenta");
        cta1.setSaldo(read.nextDouble());
          return cta1;      
}
    public void ingresar(int deposito){
        System.out.println("Ingrese el valor a depositar");
        deposito= read.nextInt();
        
        saldo+= deposito;
     
    }
    
}