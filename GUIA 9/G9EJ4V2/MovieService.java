/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Movie;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class MovieService {
    
    Scanner read = new Scanner(System.in);
    ArrayList<Movie> movieList = new ArrayList<>();
    
    public MovieService() {
    }
    
    public void CreateMovie(){
        
        do {            
            System.out.println("Ingrese el titulo de la pelicula: ");
        String title = read.nextLine();
        System.out.println("Ingrese el nombre del Director: ");
        String director = read.nextLine();
        System.out.println("Ingrese la duracion en horas: ");
        double lenght = read.nextDouble();
        read.nextLine();
        Movie newMovie = new Movie(title, director, lenght);
        movieList.add(newMovie);
        
        System.out.println("Desea agregar otra pelicula? \nS/N");
        } while (read.nextLine().equalsIgnoreCase("s"));
    }
    
    public void PrintMovieList(ArrayList ml){
        System.out.println(movieList.toString());
        System.out.println("");
    }
    
    public void PrintByDuration(){
        
        for (Movie aux : movieList) {
            if (aux.getDuration()>1) {
                System.out.println(aux.toString());
            }
        }
    }
    
    public void SortDesc() {
        movieList.sort(Movie.Descending);
        PrintMovieList(movieList);
    }
    
     public void SortAsc() {
        movieList.sort(Movie.Ascending);
        PrintMovieList(movieList);
    }
     
    public void SortAlphabetically(ArrayList ml){
        
    }
    
    public void Menu(){
//        do {            
//            
//        } while (true);
        System.out.println("=====================================================================================================================");
        System.out.println("Bienvenido al menu, digite su opcion: ");
        System.out.println("| 1- Mostrar todas las peliculas | 2- Mostrar peliculas de duracion mayor a 1Hr | 3- Ordenar por duracion ascendente |\n| 4- Ordenar por duracion descendente | 5- Ordenar alfabeticamente por titulo | 6- Ordenar alfabeticamente por director | 7- Salir |");    
        int option = read.nextInt();
        
        switch (option) {
            case 1:
                PrintMovieList(movieList);
                break;
            case 2:
                PrintByDuration();
                break;
            case 3:
                SortAsc();
                break;
            case 4:
                SortDesc();
                break;
            case 5:
                
            case 6:
                
            case 7:
                
            default:
                System.out.println("Opcion no disponible.");
        }
    }
    
    
}
