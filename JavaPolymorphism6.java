/**
 * Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
 * Create three subclasses: Circle, Square, and Triangle. Override the draw() method 
 * in each subclass to draw the respective shape, and override the calculateArea() 
 * method to calculate and return the area of each shape.
 */


// Shape.java
// Define the abstract class name Shape
abstract class Shape {

    // Declare an abstract method
    public abstract void draw():

    // Declare an abstract method calculateArea
    public abstract double calculateArea();
}


// Circle.java
// Define the Circle class
class Circle extends Shape {

    // Declare the private variable
    private double radius;

    // Define the costructor
    public Circle(double radius) {
        // Assign the instance variable
        this.radius = radius;
    }

    // Override the draw method
    @Override
    public void draw() {
        // Print the message
        System.out.println("Drawing a cricle");
    }

    // Override the calculate area method
    @Override
    public double calculateArea() {
        // Return the area of circle
        return Math.PI * radius * radius;
    }
}


// Square.java
// Define the Square class
class Square extends Shape {

    // Declare the private variable
    private double side;

    // Define a constructor
    public Square(double side) {
        // Assign the instance variable
        this.side = side;
    }

    // Override the draw method
    @Override
    public void draw() {
        // Print the message
        System.out.println("Drawing the square");
    }

}


// Triangle.java
// Define the Triangle class
class Triangle extends Shape {

    // Declare the private variables
    private double base;
    private double hight;

    // Define a constructor
    public Triangle(double base, double hight) {
        // Assign the instance variable
        this.base = base;
        // Assign the instance variable
        this.hight = hight;
    }

    // Override the draw method
    @Override
    public void draw() {
        // Print the message
        System.out.println("Drawing the triangle");
    }

    // Override the calculate area method
    @Override
    public double calculateArea() {
        
    }
}




public class JavaPolymorphism6 {
    
}
