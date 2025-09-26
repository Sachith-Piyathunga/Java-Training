/**
 * Write a Java program to create a class called "Pet" with attributes for name, species, 
 * and age. Create subclasses "Dog" and "Bird" that add specific attributes like favorite 
 * toy for dogs and wing span for birds. Implement methods to display pet details and 
 * calculate the pet's age in human years
 * 
 */


// Pet.java
// Define the Pet class
class Pet {

    // Create an attributes
    String name;
    String species;
    int age;

    // Constructor for the pet class
    public Pet(String name, String species, int age) {
        // Assign the parameters
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Method to display pet details
    public void displayDetails() {
        // Print pet details
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    // Method to calcualate the pet age
    public int calculateHumanAge() {
        // Add the condition
        if (species.equals("Dog")) {
            return age * 7;
        } else {
            // Assuming bird's age in human years is the same as actual age
            return age;
        }
    }
}


/**
 * Explanation
 * 
 *      - Class definition: Defines the Pet class.
 *      - Attributes: Declares three attributes: name (String), species (String), 
 *        and age (int).
 *      - Constructor: Initializes the name, species, and age attributes with 
 *        provided values.
 *      - displayDetails() method: Prints the pet's name, species, and age to the 
 *        console.
 *  - calculateHumanAge() method:
 *      - Check if the species is "Dog".
 *      - If true, returns the pet's age multiplied by 7 (dog's age in human years).
 *      - Otherwise, returns the actual age (assuming birds' age in human years 
 *        is the same as their actual age).
 * 
 */


// Dog.java
// Define the Dog subclass
class Dog extends Pet {

    // Create the attribute
    String favoriteToy;

    // Constructor for the Dog subclass
    public Dog(String name, int age, String favoriteToy) {
        
    }
}



























public class OOP24 {
    
}
