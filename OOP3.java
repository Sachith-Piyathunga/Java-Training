/**
 * Write a Java program to create a class called "Rectangle" with width and height 
 * attributes. Calculate the area and perimeter of the rectangle.
 */


// Rectangle.java
// Define the rectangle class
/* public */ class Rectangle {
    // Declare the private variables
    private double width;
    private double height;

    // Create the constructor for the rectangle class
    public Rectangle(double width, double height) {
        // Set the width variable
        this.width = width;
        // Set the height variable
        this.height = height;
    }

    // Getter method for the width
    public double getWidth() {
        // Return width
        return width;
    }

    // Setter method for the width
    public void setWidth(double width) {
        // Set the variable
        this.width = width;
    }

    // Getter method for tyhe height
    public double getHeigth() {
        // Return the height
        return height;
    }

    // Setter method for the height
    public void setHeight(double height) {
        // Set the variable
        this.height = height;
    }

    // Method to calculate the area
    public double getArea() {
        // Calculate the area
        return width * height;  
    }
}













public class OOP3 {
    
}
