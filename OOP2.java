/**
 * Write a Java program to create a class called "Dog" with a name and breed attribute. 
 * Create two instances of the "Dog" class, set their attributes using the constructor 
 * and modify the attributes using the setter methods and print the updated values.
 */


// Dog.java
// Define the Dog class
/* public */ class Dog {
    // Declare the private variable
    private String name;
    // Declare the private variable
    private String breed;

    // Create the constructor for the dog class
    public Dog(String name, String breed) {
        // Set the instance variables
        this.name = name;
        // Set the instance variables
        this.breed = breed;
    }

    // Getter method for the name
    public String getName() {
        // return the name
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        // Set the name variable
        this.name = name;
    }

    // Getter method for the breed
    public String getBreed() {
        // Return the breed
        return breed;
    }

    // Setter method for the breed
    public void setBreeed(String breed) {
        // Set the breed variable
        this.breed = breed;
    }
    
} 

/**
 * Explain
 * 
 * The above class has two private attributes: ‘name’ and ‘breed’, and a constructor 
 * that initializes these attributes with the values passed as arguments. It also has 
 * getter and setter methods to access and modify these attributes.
 */






public class OOP2 {
    
}
