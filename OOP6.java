/**
 * Traffic Light Simulation
 * 
 * Write a Java program to create class called "TrafficLight" with attributes for 
 * color and duration, and methods to change the color and check for red or green.
 * 
 */


// TrafficLight.java
// Define the traffic light class
/* public */ class TrafficLight {

    // Declare the private variable
    private String colour;
    // Declare the private variable
    private int duration;

    // Constructor for the traffic light class
    public TrafficLight(String colour, int duration) {
        // Initialize the colour traffic light
        this.colour = colour;
        // Initialize the duration of the traffic light
        this.duration = duration;
    }

    // Method to change the colour of the traffic light
    public void changeColour(String newColour) {
        // Update the variable
        colour = newColour;
    }

    // Method ot check if the trafficlight is red
    public boolean isRed() {
        // Return ture if the colour is red
        return colour.equals("red");
    }

    // Method to check if traffic light is green
    public boolean isGreen() {
        // Return true if the colour is green
        return colour.equals("green");
    }

    // Method to get the duratio of the traffic light
    public int getDuration() {
        // Return the duration
        return duration;
    }
} 














public class OOP6 {
    
}
