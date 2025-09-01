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
        // Set the variable
        this.ISBN = ISBN;
    }

    // Static method to add a book to the book collection
    public static void removeBook(Book book) {
        // Add the provided book object
        bookCollection.add(book);
    }

    // Static method to retrieve the entire book collection
    public static ArrayList<Book> getBookCollection() {
        // Return the book collectio array list
        return bookCollection;
    }
}


/**
 * Explanation
 * 
 * The above class has three private attributes: title, author and ISBN. It has a 
 * constructor that initializes these attributes with the values passed as arguments, 
 * and getter and setter methods to access and modify these attributes. It also has 
 * static methods to add and remove books from a collection, and a static 
 * method to get the book collection.
 */


// OOP4.java
// Import the ArrayList class
// import java.util.ArrayList;

// Define the main class
public class OOP4 {
    // Define the main class
    public static void main(String[] args) {
        // Create the book object
        Book book1 = new Book("The Rich", "Sachintha", "asd-123");
        // Create the book object
        Book book2 = new Book("The Car", "Chamod", "ZXC-345");

        // Add the book1 to the book collection
        Book.addBook(book1);
        // Add the book2 to the book collection
        Book.addBook(book2);

        // Retrieve the book collection
        ArrayList<Book> bookCollection = Book.getBookCollection();

        // Print the hedding for the book collection
        System.out.println("List of Books:");
    }
}
