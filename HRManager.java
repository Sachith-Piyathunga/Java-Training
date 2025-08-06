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
// HRManager.java
// Child class HRManager
public class HRManager extends Employee {

    // Constructor to initialize the salary of the HRManager
    public HRManager(int salary) {
        // Call the parent class constructor with the salary
        super(salary);
    }

    // Overridden method to simulate the HRManager working
    public void work() {
        // Print a message indicating the HRManager is managing employees
        System.out.println("\nManaging employees");
    }

    // Method to simulate adding a new employee
    public void addEmployee() {
        // Print a message indicating a new employee is being added
        System.out.println("\nAdding new employee!");
    }
}


public class JavaInheritance3 {

    public static void main(String[] args) {
        Employee employee = new Employee(40000);

        HRManager manager = new HRManager(70000);

        employee.work();
    }
    
}
