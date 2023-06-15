/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.time.Duration;

/**
 *
 * @author catom
 */
public class Movie {
    
    private String title;
    private String director;
    private Duration duration;

    public Movie() {
    }

    public Movie(String title, String director, Duration duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + ", duration=" + duration + '}';
    }
    
    
    
    
}
