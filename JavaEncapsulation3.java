/**
 * Write a Java program to create a class called Student with private instance variables 
 * student_id, student_name, and grades. Provide public getter and setter methods to 
 * access and modify the student_id and student_name variables. However, provide a 
 * method called addGrade() that allows adding a grade to the grades variable while 
 * performing additional validation.
 */

// IMpoert the ArrayList and List classes fromthe java.util package
import java.util.ArrayList;
import java.util.List;

// Student class
class Student {
    // Declare a private int variable for the student ID
    private int student_ID;
    
    // Declare a private String variable for the student name
    private String student_Name;

    // Declare a private List of Double for the grades
    private List grades;

    // Getter method for student ID
    public int getStudent_ID() {
        return student_ID;
    }

    // Setter method for student ID
    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    // Getter method for student name
    public String getStudent_Name() {
        return student_Name;
    }

    // Setter method for student name
    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    // Getter method for grades
    public List getGrades() {
        return grades;
    }

    // Method to add a grade to the grades list
    public void addGrade(double grade) {
        // Initialize the grades list if it is null
        if (grades == null) {
            
        }
    }
}




public class JavaEncapsulation3 {
    
}
