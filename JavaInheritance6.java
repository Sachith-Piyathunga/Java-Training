/**
 * Write a Java program to create a class known as Person with methods called 
 * getFirstName() and getLastName(). Create a subclass called Employee that adds 
 * a new method named getEmployeeId() and overrides the getLastName() method to 
 * include the employee's job title.
 */

// Person.java
// Parent class Person
// Define the Person class
/* public */ class Person {
    // Add private fields for first name and last name
    private String firstName;
    private String lastName;

    // Constructor to initialize first name and the last name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Method to get the first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get the last name
    public String getLastName() {
        return lastName;
    }
}

// Employee.java
// Child class Employee
// Declare the Employee class which extends the Person class
/* public */ class Employee extends Person {

    // Private instance veriable for emplooyee ID
    private int employeeID;
    // Private instance veriable for the job title
    private String jobTitle;

    // Constructor for Employee class, taking firs name, last name, employee Id, job title
    public Employee(String firstName, String lastName, int employeeID, String jobTitle) {
        // Call the constructor of the superclass (Person) with first name and the last name
        super (firstName, lastName);
        // Initialize the employeeID instance veriable
        this.employeeID = employeeID;
        // Initialize the jobTitle instance veriable
        this.jobTitle = jobTitle;
    }

    // Public method to get the employee id
    public int getEmployeeID() {
        return employeeID;
    }

    // Override the getLastName method from the supperclass (Person)
    @Override
    public String getLastName() {
        // Return the last name from the super class combine with the job title
        return super.getLastName() + ", " + jobTitle;
    }
}

// JavaInheritance6.java
// Main class
// Declare the JavaInheritance6 class
public class JavaInheritance6 {
    // Main method to execute the program
    public static void main(String[] args) {

        // Create the Employee object employee1 with first name , last name, id, and the job title
        Employee employee1 = new Employee("Scahintha", "Piyathunga", 2200313, "Developer");
        // Print the employee1 details
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeID() + ")");

        // Create the Employee object employee2 with first name , last name, id, and the job title
        Employee employee2 = new Employee("Sachi", "Piya", 565689, "Menager"):
        // Print the details
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeID() + ")");

    }
}

/**
 * Explanation
 * The Person class has two private instance variables, firstName and lastName, 
 * and two public methods, getFirstName() and getLastName(), that return the values 
 * of these variables.
 * 
 * The Employee class is a subclass of Person, and adds two private instance 
 * variables, employeeId and jobTitle, as well as a public method called getEmployeeId
 * (). It also overrides the getLastName() method from the Person class to include the
 *  employee's jobTitle. 
 * 
 * In the above Main class, we create two instances of the Employee class, namely 
 * "employee1" and "employee2".
 * 
 * "employee1" is initialized with the values "Kortney" for the first name, "Rosalee" 
 * for the last name, 4451 for the employee ID, and "HR Manager" for the job title. 
 * Employee1's getFirstName(), getLastName(), and getEmployeeId() methods of 
 * "employee1" are called. Their return values are concatenated into a string, 
 * which is printed to the console.
 * 
 * Similarly, Employee2's getFirstName(), getLastName(), and getEmployeeId() methods 
 * of employee2 are called. Their return values are concatenated into a string, 
 * which is printed to the console.
 */
