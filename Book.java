/**
 * Constructor Overloading
 * Write a Java program to create a class called "Book" with instance variables 
 * title, author, and price. Implement a default constructor and two parameterized 
 * constructors:
 * 
 * One constructor takes title and author as parameters.
 * The other constructor takes title, author, and price as parameters.
 * Print the values of the variables for each constructor.
 */

 public class Book {
    
    private String title;
    private String author;
    private double price;

    public Book () {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
 }