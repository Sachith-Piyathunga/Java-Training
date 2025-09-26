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
}

































public class OOP24 {
    
}
