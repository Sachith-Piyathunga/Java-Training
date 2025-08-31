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


// OOP2.java
// Main class
// Define the main clss
public class OOP2 {
    // Define the main method
    public static void main(String[] args) {
        // Create the dog object
        Dog dog1 = new Dog("Balla", "Danneee");
        // Create the dog object
        Dog dog2 = new Dog("Balu Balla", "Wal Special");

        // Print the message for dog 1
        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        // Print the message for dog 2
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

        // Print the message
        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
        // Change the breed of the dog 1
        dog1.setBreeed("Extra special wal Dogiyaa. Hodama badu.");
    }
}
