/**
 * Write a Java program to create a class called Rectangle with private instance 
 * variables length and width. Provide public getter and setter methods to access 
 * and modify these variables.
 */

// Rectangle.java
// Rectangle class
class Rectangle {
    // Declare a private double variable for length
    private double length;
    // Declare a provate double variable for width
    private double width;

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }
}

// JavaEncapsulation2.java
// Main class
public class JavaEncapsulation2 {
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle();

        // Set values using setter method
        rectangle.setLength(56.2);
        rectangle.setWidth(20.63);

        // Get values using getter methids
        double length = rectangle.getLength();
        double width = rectangle.getWidth();

        // Print the values
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}


/**
 * Explanation
 * 
 * the Rectangle class encapsulates the private instance variables length and width. 
 * The getLength() and getWidth() methods are public getter methods that allow other 
 * classes to access length and width values. 
 * The setLength() and setWidth() methods are public setter methods that allow 
 * other classes to modify length and width values.
 * 
 * In the Main class, an object rectangle of the Rectangle class is created. 
 * The setter methods (setLength() and setWidth()) are used to set length and width values. 
 * The getter methods (getLength() and getWidth()) are used to retrieve length and width values.
 * We then use System.out.println() statements to print the length and width values.
 * 
 */