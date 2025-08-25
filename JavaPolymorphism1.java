/**
 * Write a Java program to create a base class Animal (Animal Family) with a method 
 * called Sound(). Create two subclasses Bird and Cat. Override the Sound() method 
 * in each subclass to make a specific sound for each animal.
 */

// Animal.java
// Base class Amimal
// Declare the Animal class
/* public */ class Animal {
    // Method to print the animal sound
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Bird.java
// Subclass bird
// Declare the Birdclas extend the animal class
/* public */ class Bird extends Animal {
    // Override the makesound method
    @Override
    public void makeSound() {
        System.out.println("The bird chips");
    }
} 



public class JavaPolymorphism1 {
    
}
