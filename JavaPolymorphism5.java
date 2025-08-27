/**
 * Write a Java program to create a base class Sports with a method called play(). 
 * Create three subclasses: Football, Basketball, and Rugby. Override the play() 
 * method in each subclass to play a specific statement for each sport.
 */


// Sports.java
// Base class Sports
// Define the Sports class
class Sports {

    // Create the method call play
    public void play() {
        // Print the message
        System.out.println("Playing the sport...........\n");
    }
}

// Football.java
// Subclass Football
// Define the Football class
class Football extends Sports {

    // Override the method call play
    @Override
    public void play() {
        // Print the message
        System.out.println("Playing football..........");
    }
}


// Basketball.java
// Subclass Basketball
// Define the Basketball class
class Basketball extends Sports {
    // Override the play method
    @Override 
    public void play() {
        // Print the message
        System.out.println("Playing basketbal.............");
    }
}


// Rugby.java
// Subclass Rugby
// Definethe Rugby class
class Rugby extends Sports {
    // Override the play method
    @Override
    public void play() {
        // Print the message
        System.out.println("Playing rugby..........");
    }
}


// JavaPolymorphism5.java
// Main class
public class JavaPolymorphism5 {
    
    // Define the main method
    public static void main(String[] args) {

        // Create the Sports object
        Sports sports = new Sports();
        // Create the Football object
        Football football = new Football();
        // Create the Basketball object
        Basketball basketball = new Basketball();
        // Create the Rugby objet
        Rugby rugby = new Rugby();

        // Call the every play methods
        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
