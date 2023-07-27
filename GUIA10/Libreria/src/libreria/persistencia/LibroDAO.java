/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Libro;

public final class LibroDAO extends DAO<Libro> {

    @Override
    public void crear(Libro libro) {
        super.crear(libro);
    }

    public Libro buscarLibro(int ISBN) {
        conectar();
        Libro libro = em.find(Libro.class, ISBN);
        desconectar();
        return libro;

    }

    public Libro buscarLibroTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("Select l from Libro l WHERE l.titulo LIKE :titulo")
                .setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }

    public void editarLibro(Integer ISBN) {
        Scanner read = new Scanner(System.in);
        Libro libro = buscarLibro(ISBN);
        System.out.println("Qué desea modificar del libro:?");
        System.out.println("1) Editar el código ISBN");
        System.out.println("2) Editar el año de publicación");
        System.out.println("3) Editar el numero de ejemplares");
        System.out.println("4) Editar el titulo del libro");
        System.out.println("5) Editar el autor");
        System.out.println("6) Editar el editorial");
        int respuesta = read.nextInt();
        AutorDAO autd = new AutorDAO();
        switch (respuesta) {
            case 1:
                System.out.println("Ingrese el nuevo código ISBN");
                libro.setIsbn(read.nextLong());

                break;

            case 2:
                System.out.println("Ingrese el nuevo año de publicación");
                libro.setAnio(read.nextInt());

                break;

            case 3:
                System.out.println("Ingrese el nuevo número de ejemplares");
                libro.setEjemplares(read.nextInt());
                break;

            case 4:
                System.out.println("Ingrese el nuevo título para el libro");
                libro.setTitulo(read.nextLine());
                break;

            case 5:

                System.out.println("Ingrese el nuevo autor");
                String nombre = read.nextLine();
                Long id = autd.buscarAutorNombre(nombre).getId();
                autd.editarAutor(id, nombre);
                break;
            case 6:
                System.out.println("");

          
        }
        conectar();
        super.editar(libro);
        desconectar();
        
        
           
    }

}
