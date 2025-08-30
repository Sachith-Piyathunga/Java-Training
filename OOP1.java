/**
 * Write a Java program to create a class called "Person" with a name and age 
 * attribute. Create two instances of the "Person" class, set their attributes 
 * using the constructor, and print their name and age.
 */


 // Person.java
// Define the Person class
/* public */ class Person {
    // Declare the private variables
    private String name;
    private int age;

    // Constructor for the person class
    public Person(String name, int age) {
        // Set the variables
        this.name = name;
        this.age = age;
    }

    // Getter method for the name
    public String getName() {
        // Return the name
        return name;
    }

    // Setter mthod for the name
    public void setName(String name) {
        // Set the name variable
        this.name =  name;
    }

    // Getter method for thee age
    public int getAge() {
        // Return the age
        return age;
    }

    // Setter method for the age
    public void setAge(int age) {
        // Set the age variable
        this.age = age;
    }
}

/** Explanation
 * 
 * The above class has two private attributes: name and age, and a constructor that 
 * initializes these attributes with the values passed as arguments. It also has a 
 * getter method to access the attributes.
 */

// OOP1.java
// Main class
public class OOP1 {
    // Define the main method
    public static void main(String[] args) {
        // Create the instance of the person class
        Person person1 = new Person("Sachintha", 75);
    }
}
