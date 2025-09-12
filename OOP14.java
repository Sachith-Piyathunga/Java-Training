/**
 * Write a Java program to create a class called "Movie" with attributes for title, 
 * director, actors, and reviews, and methods for adding and retrieving reviews.
 */


// Import the java arraylist clas
import java.util.ArrayList;

// Movie.java
// Define the Movie class
/* public */ class Movie {

    // Create the private fields
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;

    // Constructor for the movie class
    public Movie(String title, String director, ArrayList<String> actors) {

        // Assign the parameters
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = reviews; 
    }

    // Method to add a review to the movie
    public void addReview(Review review) {
        // Add the provided review to the review list
        this.reviews.add(review);
    }
}





























public class OOP14 {
    
}
