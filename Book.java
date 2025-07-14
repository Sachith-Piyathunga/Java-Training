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

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println("Book title: " + book1.title);
        System.out.println("Book author: " + book1.author);
        System.out.println("Book price: " + book1.price);

        Book book2 = new Book("Danne", "Denagaththa");
        System.out.println("Book title: " + book2.title);
        System.out.println("Book author: " + book2.author);
        System.out.println("Book price: " + book2.price);

    }

 }