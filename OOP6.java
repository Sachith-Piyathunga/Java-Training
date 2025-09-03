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

    // Method to set the duration of the traffic light
    public void setDuration(int duration) {
        // Update the duration variable to the new value
        this.duration = duration;
    }
} 


/**
 * Explanation 
 * 
 * The above class has two private attributes: ‘color’ and ‘duration’. A constructor 
 * initializes these attributes with the values passed as arguments, and getter and 
 * setter methods to access and modify these attributes. It also has methods to change 
 * the ‘color’, and to check if the light is red or green.
 * 
 */


// OOP6.java
// Main class
public class OOP6 {
    // Define the main method
    public static void main(String[] args) {
        
        // Create the new traffic light object
        TrafficLight light = new TrafficLight("red", 30); 

        // Print whether the traffic light is red
        System.out.println("The light is red: " + light.isRed());

        // Print whether the traffic light is green
        System.out.println("The light is green: " + light.isGreen());

        // Change the colouer of the light
        light.changeColour("green");

        // Print whether the traffic light is green now
        System.out.println("The light is now green: " + light.isGreen());

        // Print the duration of the traffic light
        System.out.println("The light duration is: " + light.getDuration());

        // Set the new duration for the traffic light
        light.setDuration(20);
    }
}
