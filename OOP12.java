/**
 * Write a Java program to create a class called "School" with attributes for 
 * students, teachers, and classes, and methods to add and remove students and 
 * teachers, and to create classes.
 */


// Import the java ArrayList class
import java.util.ArrayList;

// School.java
// Define the school class
/* public */ class School {

    // Create the private field
    private ArrayList<Student> students;
    // Create the private field
    private ArrayList<Teacher> teachers;
    // Create the private field
    private ArrayList<SchoolClass> classes;

    // Constructor for the school class
    public School() {
        // Create new array list
        this.students = new ArrayList<Student>();
        // Create new array list
        this.teachers = new ArrayList<Teacher>();
        // Create new array list
        this.classes = new ArrayList<SchoolClass>();
    }

    // Method to add a student into students list
    public void adStudent(Student student) {
        // Add the student to the students list
        students.add(student);
    }

    // Method to remove student from the student list
    public void removeStudent(Student student) {
        
    }
}




















public class OOP12 {
    
}
