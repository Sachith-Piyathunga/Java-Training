/**
 * Problem
 * 
 * Write a Java program that creates a class hierarchy for employees of a company. 
 * The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
 * Each subclass should have properties such as name, address, salary, and job title. 
 * Implement methods for calculating bonuses, generating performance reports, and managing projects.
 * 
 */

// Class declaretion for Employee
class Employee {
    // Private fields for the Employee class
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    // Constructor for the employee class
    private Employee(String name, String address, double salary, String jobTitle) {
        // Initialize the name field
        this.name = name;
        // Initalize the address feild
        this.address = address;
        // Initialize the salary field
        this.salary = salary;
        // Initialize the jobTitle field
        this.jobTitle = jobTitle;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Getter method for the address field
    public String getAddress() {
        return address;
    }

    // Getter method for the address field
    public double getSalary() {
        return salary;
    }

}



public class JavaInheritance9 {
    
}
