/**
 * Write a Java program to create a base class Animal with methods eat() and sound(). 
 * Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in 
 * each subclass to describe what each animal eats. In addition, override the sound() 
 * method to make a specific sound for each animal.
 */


// Animal.java
// Define the Animal class
class Animal {
    // Method for animal to eat
    public void eat() {
        // Print the message
        System.out.println("Animal eats.");
    }

    // Method for animal to make sound
    public void sound() {
        // Print the message
        System.out.println("Animal makes a sound.");
    }
} 


// Lion.java
// Define the Lion class
class Lion extends Animal {
    // Overrride the eat method
    @Override
    public void eat() {
        // Print the message
        System.out.println("Lion eat meat.");
    }

    // Overrid the sound method
    @Override 
    public void sound() {
        
    }
}








public class JavaPolymorphism7 {
    
}
