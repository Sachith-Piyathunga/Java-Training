/**
 * Write a Java program to create a class called Employee(JavaInheritance3) with methods called work() 
 * and getSalary(). Create a subclass called HRManager that overrides the work() 
 * method and adds a new method called addEmployee().
 * 
 */

// Employee.java
// Parent class Employee
class Employee {

    // Private field to store the salary of the employee
    private int salary;

    // Constructor to initialize the salary of the employee
    public Employee(int salary) {
        this.salary = salary;
    }

    // Method to simulate the employee working
    public void work() {
        // Print a message indicating the employee is working
        System.out.println("working as an employee!");
    }

    // Getter method to retrieve the salary of the employee
    public int getSalary() {
        return salary;
    }
} 

// HRManager.java class

public class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }
    public void work() {
        System.out.println("\nManaging Employee");
    }

    public void addEmployee() {
        System.out.println("\nAdding new Employee");
    }
}

public class JavaInheritance3 {
    
}
