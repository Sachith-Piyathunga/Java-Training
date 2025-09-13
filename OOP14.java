/**
 * Write a Java program to create a class called "Movie" with attributes for title, 
 * director, actors, and reviews, and methods for adding and retrieving reviews.
 */


// Import the java arraylist clas
import java.util.ArrayList;
import java.util.Arrays;


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
 * has methods to add a review to the movie's reviews list. It can retrieve the 
 * reviews list, and the movie's title, director, and actors. The reviews list is 
 * an ArrayList of Review objects, created outside of this class. These objects 
 * are added to the reviews list using the addReview() method.
 * 
 */


// Review.java
// Define the Review class
class Review {

    // Create the private fields
    private String reviewText;
    private String reviewerName;
    private double rating;

    // Constructor for the review class
    public Review(String reviewText, String reviewerName, double rating) {
        // Assign the pararmeter
        this.reviewText = reviewText;
        this.reviewerName = reviewerName;
        this.rating = rating;
    }

    // Getter method for the review test
    public String getReviewText() {
        // Return the review text
        return reviewText;
    }

    // Getter method for the reviewer name
    public String getReviewerName() {
        // Return the reviewer name
        return reviewerName;
    }

    // Getter method for the rating
    public double getRating() {
        // Return the rating
        return rating;
    }
}


/**
 * Explanation
 * 
 * The Review class represents a movie review, with attributes such as the review 
 * text, the reviewer's name, and the rating given to the movie. It has a constructor 
 * that takes these attributes as parameters and sets them as instance variables. 
 * The class also has three getter methods to retrieve review text, reviewer name, 
 * and rating.
 * 
 */


// OOP14.java
// Main class
public class OOP14 {
    // Define the main method
    public static void main(String[] args) {
        
    }
}
