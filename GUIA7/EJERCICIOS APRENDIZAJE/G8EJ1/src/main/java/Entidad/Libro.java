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
public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.isbn = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
        this.isbn = 0;
        this.titulo = "";
        this.autor = "";
        this.paginas = 0;

    }

    public void crearLibro() {
  

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el código ISBN");
        this.isbn = read.nextInt();

        System.out.println("Ingrese el título");
        this.titulo = read.next();

        System.out.println("Ingrese el Autor");
        this.autor = read.next();

        System.out.println("Ingrese el número de páginas");
        this.paginas = read.nextInt();
    }
 
   public void informarLibro() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.paginas);
    }
}

