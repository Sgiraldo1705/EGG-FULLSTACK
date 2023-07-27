
package service;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author catom
 */
public class PerroService {

    Scanner read = new Scanner(System.in);
    private ArrayList<Perro> adoptables = new ArrayList<Perro>();

    public void ingresarPerro() {
        Perro dog = new Perro();
        System.out.println("Cuál es el nombre del perro?");
        dog.setNombre(read.nextLine());

        System.out.println("Es el perro menor a un año? S/N");
        String cachorro = read.nextLine();

        if (cachorro.equalsIgnoreCase("s")) {

            System.out.println("ingrese la edad del perro en meses");
            int edadMeses = read.nextInt();

            dog.setEdad(edadMeses / 12);

        } else {
            System.out.println("ingrese la edad del perro");
            dog.setEdad(read.nextInt());
        }

        System.out.println("Ingrese la razar del perro");
        dog.setRaza(read.nextLine());
        
        System.out.println("De qué tamaño es el perro?");
        dog.setTamaño(read.nextLine());
        
        adoptables.add(dog);
    }

}
