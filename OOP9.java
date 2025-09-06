import java.util.ArrayList;

/**
 * Write a Java program to create a class called "Library" with a collection of 
 * books and methods to add and remove books.
 */


// Book.java
// Define the book class
/* public */ class Book {

    // Create the private field
    private String title;
    // Create the private field
    private String author;

    // Construcor for the book class
    public Book(String title, String author) {
        // Assign the parameter
        this.title = title;
        // Assign the parameter
        this.author = author;
    }

    // Getter method for the title
    public String getTitle() {
        // Return the title
        return title;
    }

    // Setter method for the title
    public void setTitle(String title) {
        // Assign the title variable
        this.title = title;
    }

    // Getter method for the author
    public String getAuthor() {
        // Return the author
        return author;
    }

    // Setter method for the author
    public void setAuthor(String author) {
        // Assign the author variable
        this.author = author;
    }
}


/**
 * Explanation
 * 
 * The above class has two private attributes, "title" and "author". It has a constructor 
 * that takes two arguments, the title and author of the book, and initializes the 
 * corresponding attributes. It also has getter and setter methods to access and 
 * modify the title and author attributes.
 * 
 */


// Library.java
// Import the java ArrayList class
Import java.util.ArrayList;

// Define the Library class
/* public */ class Library {

    // Create the private field
    private ArrayList<Book> books;

    // Construcor for the book field
    public Library() {
        // Creaate a new ArrayList
        books = new ArrayList<Book>();
    }

    // Method to add the book
    public void addBook(Book book) {
        // Add the book to the book list
        books.add(book);
    }

    // Method to remove the book
    public void removeBook(Book book) {
        // Remove the book from book list
        books.remove(book);
    }

    // Method to get the list of books
    public ArrayList<Book> getBooks() {
        // Return the books
        return books;
    }
}


/**
 * Explanation
 * 
 * The above "Library" class has a private books attribute, which is an ArrayList of 
 * Book objects. The Library constructor initializes this attribute as an empty list.
 * The "addBook()" method adds a Book object to the books list, while the “removeBook()” 
 * method removes a Book object from the list. The “getBooks()” method returns 
 * the books list.
 * 
 */


// OOP9.java
// Main class
public class OOP9 {
    // Define the main method
    public static void main(String[] args) {
        
    }
}
