/**
 * Write a Java program to create a class called "Employee" with a name, salary, and 
 * hire date attributes, and a method to calculate years of service.
 */


// Employee.java
// Import the local date class from the java.time package
import java.time.LocalDate;

// Import the period class from the java.time package
import java.time.Period;


// Define the employee class
/* public */ class Employee {
    // Declare private variabale
    private String name;
    // Declare private variabale
    private double salary;
    // Declare private variabale
    private LocalDate hireDate;

    // Constructor for the employee class
    public Employee(String name, double salary, LocalDate hireDate) {
        // Initialize the name
        this.name = name;
        // Initialize the salary
        this.salary = salary;
        // Initialize the hire date
        this.hireDate = hireDate;
    }

    // Getter method for the name
    public String getName() {
        // Return name
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        // Update the variable
        this.name = name;
    }

    // Getter method for the salary
    public double getSalary() {
        // Return salary
        return salary;
    }

    // Setter method for the salary
    public void setSalary(double salary) {
        // Update the variable
        this.salary = salary;
    }
}













public class OOP7 {
    
}
