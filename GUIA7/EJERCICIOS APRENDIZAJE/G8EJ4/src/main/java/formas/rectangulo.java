/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class rectangulo {

    private int base;
    private int altura;

    public rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el valor para la altura del rectángulo");
        setAltura(read.nextInt());

        System.out.println("Ingrese el valor para la base del rectángulo");
        setBase(read.nextInt());

    }
    public int area(){
        int area = getAltura()*getBase();
        System.out.println("El area del rectángulo es: " + area);
        return area;
    }
    public int peri(){
        int peri = (getAltura()*getBase())*2;
        System.out.println("El perimetro del rectángulo es: " + peri);
        return peri;
    }    
    
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
}
