/**
 * Write a Java program to create a class Employee with a method called calculateSalary(). 
 * Create two subclasses Manager and Programmer. In each subclass, override the 
 * calculateSalary() method to calculate and return the salary based on their 
 * specific roles.
 */

// Employee.java
// Base class Employee
// Define the employee class
class Employee {

    // Declare the private instance variables
    private String name;
    private String role;

    // Constructor for the Employee class
    public Employee(String name, String role) {
        // Create the instaance variable
        this.name = name;
        // Create the instaance variable
        this.role = role;
    }

    // Getter method for get the name
    public String getName() {
        // Return the name
        return name;
    }

    // Getter method for get the role
    public String getRole() {
        // Return the role
        return role;
    }

    // Public method to calculate salary of the employee
    public double calculateSalary() {
        // Return default
        return 0.0;
    }
}


// Manager.java
// Subclass Manager
// Definethe Manager class
class Manager extends Employee {

    // Declare the private variables
    private double baseSalary;
    private double bonus;

    // Constructor for the Manager class
    public Manager(String name, double baseSalary, double bonus) {
        
    }
}










public class JavaPolymorphism4 {
    
}
