/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movietest;

class Movie{
    String title;
    String genre;
    int rating;
    
    void playIt(){
        System.out.println("Playing the movie");
        
    }
            
}

public class MovieTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movie one = new Movie();
        one.title = "Matrix";
        one.genre = "SciFi";
        one.rating = -2;//
        
        Movie two = new Movie();
        two.title = "Lost in space";
        two.genre = "SciFi";
        two.rating = 3;
        two.playIt();
                
        Movie three= new Movie();
        two.title = "the rock";
        two.genre = "acction";
        two.rating = 120;
    }
    
}
