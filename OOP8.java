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

    // Method to print the details of the sstudent
    public void printStudentDetails() {
        // Print the name of the student
        System.out.println("Name: " + name);
        // Print the grade of the student
        System.out.println("Grade: " + grade);
    }
}


/**
 * 
 * Explanation
 * 
 * The above "Student" class has three private attributes: 'name', 'grade', and 'courses'. 
 * The 'name' and 'grade' attributes are initialized in the constructor with the values 
 * passed as arguments. The 'courses' attribute is initialized as an empty array list.
 * There are getter methods for the 'name', 'grade', and 'courses' attributes. 
 * There are also methods to add and remove courses from the 'courses' attribute.
 * 
 */


// Main class
// OOP8.java
public class OOP8 {
    // Define the main method
    public static void main(String[] args) {

        // Create the new student object
        Student student1 = new Student("Sachintha", 5, "Science");

        // Create new object
        Student student2 = new Student("Chamod", 2, "Maths");

        // Create the new student object
        Student student3 = new Student("Piyathunga", 1, "English");

        // Print a header for student1
        student1.printStudentDetails();

        // Print a header for student2
        student2.printStudentDetails();

        // Print a header for student1
        student1.printStudentDetails();

        // Print the message
        System.out.println("Adding courses for " + student1.getName());

        // Add the courses
        student1.addCourses("Maths");

        // Add the courses
        student1.addCourses("Science");

        // Add the courses
        student1.addCourses("Maths");

        // Print the name and and there list of courses
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        // Print a message indicating courses are add to the student 2
        System.out.println("\nAdding courses for " + student2.getName());

        // Add the courses
        student2.addCourses("History");



    }
}
