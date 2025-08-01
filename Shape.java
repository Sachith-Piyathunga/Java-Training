/**
 * Write a Java program to create an interface Shape with the getArea() method. 
 * Create three classes Rectangle, Circle, and Triangle that implement the Shape 
 * interface. Implement the getArea() method for each of the three classes.
 */

  // Shape.java
// This is an interface named 'Shape' that defines a contract for classes to implement.
public interface Shape {
    // Abstract method signature for getting the area of a shape.
    double getArea();
}

// Rectangle.java
// This is the 'Rectangle' class that implements the 'Shape' interface.

public class Rectangle implements Shape {
    // Private instance variables to store the dimensions of the rectangle.
    private double length;
    private double width;

    // Constructor for creating a Rectangle object with given length and width.
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the 'getArea' method as required by the 'Shape' interface.
    @Override
    public double getArea() {
        // Calculate and return the area of the rectangle.
        return length * width;
    }
}

public class Circle implements Shape {
    private double redius;

    public Circle(double redius) {
        this.redius = redius;
    }
}

public class Shape {
    

}
