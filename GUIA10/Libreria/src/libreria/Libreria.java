/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.util.Scanner;
import libreria.servicios.AutorServicio;

/**
 *
 * @author catom
 */
public class Libreria {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        AutorServicio serv = new AutorServicio();
        
        System.out.println("ingrese un nombre");
        String nombre = read.nextLine();
        serv.crearAutor(nombre);
       

    }

}
