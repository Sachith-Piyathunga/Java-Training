/**
 * Constructor with Array Initialization
 * 
 * Write a Java program to create a class called Classroom with instance 
 * variables className and students (an array of strings). Implement a 
 * parameterized constructor that initializes these variables. Print the 
 * values of the variables.
 */

 public class Classroom {
    
    private String className;
    private String[] students; // Create an array

    public Classroom(String className, String[] students) {

        this.className = className;
        this.students = students;
    }

    public void printClassroom() {

        System.out.println("Class Name: " + className);
        System.out.println("Students: ");
        for(String student : students) {
            System.out.println(student + " ");
        }
        System.out.println();
    }
 }