/**
 * Write a Java program to create a class called Employee(JavaInheritance3) with methods called work() 
 * and getSalary(). Create a subclass called HRManager that overrides the work() 
 * method and adds a new method called addEmployee().
 * 
 */

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Working as an Employee!");
    }

    public double getSalary() {
        return salary;
    }
}

public class JavaInheritance3 {
    
}
