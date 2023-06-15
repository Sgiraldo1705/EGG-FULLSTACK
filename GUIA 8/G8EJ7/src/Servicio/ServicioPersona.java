/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Scanner;
import Persona.Persona;

/**
 *
 * @author catom
 */
public class ServicioPersona {

    Scanner read2 = new Scanner(System.in);

    public Persona newPersona() {
        Persona p1 = new Persona();

        System.out.println("Ingrese el nombre");
        p1.setNombre(read2.next());

        System.out.println("Ingrese la edad");
        p1.setEdad(read2.nextInt());

        System.out.println("Indique su sexo");
        p1.setSexo(read2.next());
        if (!p1.getSexo().equalsIgnoreCase("H") && !p1.getSexo().equalsIgnoreCase("M") && !p1.getSexo().equalsIgnoreCase("O")) {
            System.out.println("Ha ingresado una opcion incorrecta, intentelo nuevamente");
            p1.setSexo(read2.next());
        }
        System.out.println("Ingrese su peso en Kg");
        p1.setPeso(read2.nextInt());

        System.out.println("Ingrese su altura en centimetros");
        p1.setAltura(read2.nextInt());
        

        return p1;


    }

    public double calcularIMC(Persona p1) {
        int IMC;

        double alturaM = p1.getAltura() / 100;
        IMC = (int) (p1.getPeso() / Math.pow(alturaM, 2));

        if (IMC < 20) {
            System.out.println("Se encuentra por debajo de su peso ideal");
            return -1;

        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("Se encuentra en su peso ideal");
            return 0;
        } else {
            System.out.println("Se encuentra con sobrepeso");
            return 1;
        }

    }

    public boolean esMayorEdad(Persona p1) {
        boolean esMayor = false;

        if (p1.getEdad() > 18) {
            esMayor = true;
        }
        return esMayor;
    }
}
