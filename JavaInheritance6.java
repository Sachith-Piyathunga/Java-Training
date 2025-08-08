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
    
}

public class JavaInheritance6 {
    
}
