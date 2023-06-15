/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Movie;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author catom
 */
public class MovieService {

    Scanner read = new Scanner(System.in);
    private Movie entry = new Movie();

    private ArrayList<Movie> movies;

    public MovieService() {
        movies = new ArrayList<Movie>();

    }

    public void newMovie() {
        do {
            System.out.println("Ingrese el nombre de la película");
            String name = read.nextLine();

            System.out.println("Ingrese el nonbre del director");
            String director = read.nextLine();

            System.out.println("ingrese la duracion de la pelicula horas");
            Duration duration = Duration.ofHours((long) read.nextDouble());

            Movie movie = new Movie(name, director, duration);
            movies.add(movie);
            System.out.println("desea ingresar otra pelicula?");
        } while (read.next().equalsIgnoreCase("s"));
        System.out.println(" ");

    }
}