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

    // Getter method for the list of the all reviews
    public ArrayList<Review> getReviews() {
        // Return the list of reviews
        return this.reviews;
    }

    // Getter method for get the title
    public String getTitle() {
        // Return the title
        return this.title;
    }

    // Getter method for get the direcctor
    public String getDirector() {
        // Return the director field
        return this.director;
    }

    // Method to get the list of actors
    public ArrayList<String> getActors() {
        // Return the list of actors
        return this.actors;
    }
}


/**
 * Explanation
 * 
 * The above Java class has instance variables for the movie's title, director, 
 * actors, and reviews. The class constructor takes in the movie's title, director, 
 * and actors as parameters, and initializes the instance variables. The class also 
 * has methods to add a review to the movie's reviews list.
 */




























public class OOP14 {
    
}
