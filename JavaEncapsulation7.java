/**
 * Write a Java program to create a class called Movie with private instance variables 
 * title, director, and duration. Provide public getter and setter methods to access 
 * and modify these variables. Add a method called getMovieDetails() that returns a 
 * formatted string containing the movie details.
 */

// Define the Movive class
/* public */ class Movie {
    // Private instance variables
    private String title;
    private String director;
    private int duration;

    // Getter method for the title 
    public String getTitle() {
        return title;
    }

    // Setter method for the title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for the director
    public String getDirector() {
        return director;
    }

    // Setter method for the director
    public void setDirector(String director) {
        this.director = director;
    }

    // Getter method for the duration
    public int getDuration() {
        return duration;
    }

    // Setter method for the duration
    public void setDuration(int duration) {
        this.duration = duration;
    }
}


public class JavaEncapsulation7 {
    
}
