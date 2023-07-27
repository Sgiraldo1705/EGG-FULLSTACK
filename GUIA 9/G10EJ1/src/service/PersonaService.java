/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Persona;
import java.rmi.server.ObjID;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author catom
 */
public class PersonaService {
Scanner read = new Scanner(System.in);
    private ArrayList<Persona> adoptantes = new ArrayList<Persona>();

    public void adoptante() {
        Persona p1 = new Persona();
        
        System.out.println("Biendvenido al sistema de adopción de mascotas");
        
        System.out.println("Ingrese su número de identificación");
        p1.setCedula(read.nextInt());
        
        System.out.println("ingrese su nombre");
        p1.setNombre(read.nextLine());
        
        System.out.println("ingrese su apellido");
        p1.setApellido(read.nextLine());
        
        System.out.println("ingrese su edad");
        p1.setEdad(read.nextInt());
        
        adoptantes.add(p1);
    }
public void adoptar(){
    System.out.println("ingrese su cedula");
   Persona adop1= adoptantes.
}
}
