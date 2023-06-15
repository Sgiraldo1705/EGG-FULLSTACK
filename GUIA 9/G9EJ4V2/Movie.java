/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Comparator;

/**
 *
 * @author Sheepard
 */
public class Movie {
    
    private String Title;
    private String Director;
    private double Duration;

    public Movie() {
    }

    public Movie(String Title, String Director, double Duration) {
        this.Title = Title;
        this.Director = Director;
        this.Duration = Duration;
    }

  public static Comparator<Movie> Descending = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return Double.compare(t1.getDuration(), t.getDuration());
        }
    };
  
  public static Comparator<Movie> Ascending = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return Double.compare(t.getDuration(), t1.getDuration());
        }
    };
    
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public double getDuration() {
        return Duration;
    }

    public void setDuration(double Duration) {
        this.Duration = Duration;
    }

    @Override
    public String toString() {
        return "Titulo: " + Title + ", Director: " + Director + ", Duracion: " + Duration + " Hrs.\n";
    }
    
    
}
