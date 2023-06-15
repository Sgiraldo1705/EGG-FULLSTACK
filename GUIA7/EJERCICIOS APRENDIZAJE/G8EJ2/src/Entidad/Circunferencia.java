/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Circunferencia {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public Circunferencia() {
    }

    

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void crearCircu(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia a crear");
        radio=read.nextDouble();
     
    }
    
    public double  area(){
        double ar= ((Math.pow(radio, 2))*(Math.PI));
        System.out.println("esta es el area: "+ ar + "cm2");
        return ar;
    }
    
    public double perimetro(){
        double per = ((2*(Math.PI))*this.getRadio());
        System.out.println("este es el perimetro: "+per);
        return per;
    }
    
    
}
