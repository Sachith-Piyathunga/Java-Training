import org.w3c.dom.css.Rect;

/**
 * Write a Java program to create a base class Shape with a method called calculateArea(). 
 * Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() 
 * method in each subclass to calculate and return the shape's area.
 */


// Shape.java
// Base class Shape
// Declare the Shape class
/* public */ class Shape {
    // Method to calculate the area of the shape
    // Default implimantaion returns 0
    public double calculateArea() {
        return 0;
    }
}

// Circle.java
// Subclass Circle
// Define the Circle class as a subclass of shape
/* public */ class Circle extends Shape {
    
    // Declare a private double variable radius
    private double radius;

    // Constructor for the radius class
    public Circle(double radius) {
        // Assign the parameter radius to the instance variable
        this.radius = radius;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area
        return Math.PI * radius * radius;
    }
}

// Rectangle.java
// Subclass Rectangle
// Define the Rectangle class as a subclass of Shape
/* public */ class Rectangle extends Shape {

    // Declare private double variables width and hight
    private double width;
    private double height;

    // Constructor for the Rectangle class
    public Rectangle(Double width, double height) {
        // Assign the instance variable
        this.width = width;
        // Assign the instance variable
        this.height = height;
    }

    // Override the calculate area method
    @Override
    public double calculateArea() {
        // Calculate and  return the area
        return width * height;
    }
}

// Triagle.java
// Subclass triangle
// Define the triangle class
/* public */ class Triangle extends Shape {

    // Declare private double variable
    private double base;
    private double height;

    // Constructor for Triangle class
    public Triangle(double base, double height) {
        // Assign the instance variable
        this.base = base;
        // Assign the instance variable
        this.height = height;
    }

    // Override the calculate area method
    @Override
    public double calculateArea() {
        // Calculate and return the area
        return 0.5 * base * height;
    }
}


// JavaPolymorphism3.java
// Main class
// Define the main class
public class JavaPolymorphism3 {
    
    // Main method 
    public static void main(String[] args) {

        // Create the Circle object
        Circle circle = new Circle(5);
        // Print the area of circle object
        System.out.println("Area of Cricle: " + circle.calculateArea());

        // Create the Rectangle object
        Rectangle rectangle = new Rectangle(23, 30);
    }
}
