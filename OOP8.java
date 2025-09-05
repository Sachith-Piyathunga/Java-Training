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

    // Getter method for the name
    public String getName() {
        // Return the name
        return name;
    }

    // Getter method for the grade
    public int getGrade() {
        // Return the grade
        return grade;
    }

    // Getter method for get the courses
    public ArrayList getCourses() {
        // Return the course
        return courses;
    }

    // Methods to add the courses to the list
    public void addCourses(String course) {
        // Add the given course to the list
        courses.add(course);
    }

    // Method to remove the courses from the list
    public void removeCourse(String course) {
        // Remove given course from the list
        courses.remove(course);
    }
}








public class OOP8 {
    
}
