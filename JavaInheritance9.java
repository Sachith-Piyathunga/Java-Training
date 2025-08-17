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

    // Getter method for the salary field
    public double getSalary() {
        return salary;
    }

    // Getter method for the jobTitle field
    public String getJobTitle() {
        return jobTitle;
    }

    // Method to calculate the bonus for the employee
    public double calculateBonus() {
        // Default implemetation for bonus calculation
        return 0.0;
    }

    // Method to generate the preformance report for the employee
    public String generatePerformanceReport() {
        // Defult implementation for performance report
        return "No performance report available.";
    }
}

/**
 * Explanation
 * 
 * Employee class: This class represents a generic employee with private instance 
 * variables 'name', 'address', 'salary', and 'jobTitle'. 
 * It also provides getter methods to access these private variables.
 *      getName(): Returns the employee's name.
 *      getAddress(): Returns the employee's address.
 *      getSalary(): Returns the employee's salary.
 *      getJobTitle(): Returns the employee's job title.
 * 
 * calculateBonus(): This method is used to calculate the bonus for an employee. 
 * In the base class, it provides a default implementation that returns 0.0. 
 * Subclasses can override this method to provide custom bonus calculation logic.
 * 
 * generatePerformanceReport(): This method generates a performance report for an 
 * employee. Similar to the bonus calculation, it provides a default implementation 
 * that returns "No performance report available." Subclasses can override this 
 * method to provide custom performance report generation logic.
 * 
 */

// Class declaretion for manager witch extends Employee
class Manager extends Employee {
    // private field for the number of subordinates
    private int numberOfSubordinates;

    // Constructor for manager class
    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        // Calling the constructor of the superclass Employee
        super(name, address, salary, jobTitle);
        // Initialize the numberOfSubordinates field
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // Getter method for the numberOfSubordinates field
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    // Override method to calcula the bonus for the manager
    @Override
    public double calculateBonus() {
        // Custom inplimantation for the bonus calculation 
        return getSalary() * 0.15;
    }

    // Override method to genarate the performance report for the manager
    @Override
    public String generatePerformanceReport() {
        // Custom implimantation for performance report for manager
        return "Performance report for Manager " + getName() + ": Excellent";
    }

    // Custom method for managing project
    public void mangeProject() {
        
    }
}















public class JavaInheritance9 {
    
}
