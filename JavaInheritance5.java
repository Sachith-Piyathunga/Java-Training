/**
 * Write a Java program to create a class called Animal with a method named move(). 
 * Create a subclass called Cheetah that overrides the move() method to run.
 */

// Animal.java
// Parent class Animal
// Define the Animal class
/* public */ class Animal {
    // Method to print the message
    public void move() {
        System.out.println("Animal moves...");
    }
}

// Cheetah.java
// Child class Cheetah
/* public */ class Cheetah extends Animal {
    // Override the move method
    @Override
    public void move() {
        System.out.println("This Chetah is running....");
    } 
}

// JavaInheritance5.java
// Main class
// Define the JavaInheritance5 class
public class JavaInheritance5 {
    // Add main method
    public static void main(String[] args) {
        // Create the instance of the Animal
        Animal animal = new Animal();
        // Call the move method
        animal.move();

        // Create the instance of the Cheetah
        Cheetah cheetah = new Cheetah();
        // Call the move mwthod
        cheetah.move();
    }
}

/**
 * Explanation
 * In the above exercise, the Animal class has a single method called move(). 
 * This method simply prints a message to the console saying the animal is moving. 
 * The Cheetah class extends the Animal class and overrides the move() method to 
 * print a message that Cheetah is running.
 * 
 * In the JavaInheritance5 class, create an instance of the "Animal" class and call 
 * its move() method. 
 * This prints the "This animal is moving" message to the console. 
 * We also create an instance of the "Cheetah" class and call its move() method. 
 * This prints the "This cheetah is running" message to the console.
 */
