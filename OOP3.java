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

    // Method to calculate the Perimeter
    public double getPerimeter() {
        // Calculate the perimeter
        return 2 * (width + height);
    }
}


/**
 * Explanation
 * 
 * The above class has two private attributes: 'width' and 'height', a constructor that 
 * initializes these attributes with the values passed as arguments, and getter and 
 * setter methods to access and modify these attributes. It also has two methods 
 * 'getArea()' and 'getPerimeter() ' to calculate the area and perimeter of the 
 * rectangle.
 */

 
// OOP3.java
// Define the main class
public class OOP3 {
    // Define the main method
    public static void main(String[] args) {
        // Create an instance of the rectangle class
        Rectangle rectangle = new Rectangle(12.56, 15.62);

        // Print the area fo the rectangle
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        // Print the perimeter of the rectangle
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

        // Set a new width for the rectangle
        rectangle.setWidth(10.53);
        // Set a new height for the rectangle
        rectangle.setHeight(12.53);
    }
}
