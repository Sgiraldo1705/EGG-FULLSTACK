/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g8ej7;

import Persona.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author catom
 */
public class G8EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioPersona sp = new ServicioPersona();

        Persona p1 = sp.newPersona();
        Persona p2 = sp.newPersona();
        Persona p3 = sp.newPersona();
        Persona p4 = sp.newPersona();

        Persona[] personas = {p1, p2, p3, p4};

        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Sexo: " + persona.getSexo());
            System.out.println("Peso: " + persona.getPeso());
            System.out.println("Altura: " + persona.getAltura());
            
            sp.calcularIMC(persona);

            
        }
    }

}
