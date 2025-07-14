/**
 * Copy Constructor
 * Write a Java program to create a class called Rectangle with instance variables 
 * length and width. Implement a parameterized constructor and a copy constructor 
 * that initializes a new object using the values of an existing object. Print the 
 * values of the variables.
 */

public class Rectangle {
   
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Copy of the constructor
    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length; // Initialize the rectangle object length
        this.width = rectangle.width;
    }
}