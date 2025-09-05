/**
 * Write a Java program to create a class called "Student" with a name, grade, and 
 * courses attributes, and methods to add and remove courses.
 */


// Student.java
// Import the java array list class
import java.util.ArrayList;

// Define the student class
/* public */ class Student {
    
    // Declare the private variable
    private String name;
    // Declare the private variable
    private int grade;
    // Declare the private variable
    private ArrayList courses;

    // Costructor for the student class
    public Student(String name, int grade, ArrayList courses) {
        // Initialize the variaables
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList();
    }
}








public class OOP8 {
    
}
