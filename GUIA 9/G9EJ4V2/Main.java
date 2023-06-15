/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colle_exercise_04;

import entity.Movie;
import service.MovieService;

/**
 *
 * @author Sheepard
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovieService ms = new MovieService();
        
        ms.CreateMovie();
        ms.Menu();
        
    }
    
}
