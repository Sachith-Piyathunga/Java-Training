/**
 * Write a Java program to create a class called "Book" with attributes for title, 
 * author, and ISBN, and methods to add and remove books from a collection.
 */


// Book.java
// Import the array list class from the jav.util package
import java.util.ArrayList;

// Define the Book class
/* public */ class Book {
    // Declare the private variable
    private String title;
    // Declare the private variable
    private String author;
    // Declare the private variable
    private String ISBN;
    // Declare the array list
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    // Constructor for the Book class
    public Book(String title, String author, String ISBM) {
        // Set the variables
        this.title = title;
        this.author = author;
        this.ISBN = ISBM;
    }

    // Getter method for the title
    public String getTitle() {
        // Return the title
        return title;
    }

    // Setter method for the title
    public void setTitle(String title) {
        // Set the variable
        this.title = title;
    }

    // Getter method for the author
    public String getAuthor() {
        // Return the author
        return author;
    }

    // Setter method for the author
    public void setAuthor(String author) {
        // Set the variable
        this.author = author;
    }

    // Getter method for the ISBN number
    public String getISBN() {
        // Return the ISBN
        return ISBN;
    }

    // Setter method for the ISBN
    public void setISBN(String ISBN) {
        // 
    }
}






public class OOP4 {
    
}
