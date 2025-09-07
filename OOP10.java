/**
 * Write a Java program to create a class called "Airplane" with a flight number, 
 * destination, and departure time attributes, and methods to check flight 
 * status and delay.
 */


// Airplane.java
// Import the java LocalTime class
import java.time.LocalTime;

// Definethe Airplana class
/* public */ class Airplane {
    // Create a private field
    private String flightNumber;
    // Create a private field
    private String destination;
    // Create a private field
    private LocalTime scheduleDeparture;
    // Create a private field
    private int delayTime;

    // Constructor for the airplane class
    public Airplane(String flightNumber, String destination, LocalTime scheduleDeparture) {
        // Assign the flightnumber parameter
        this.flightNumber = flightNumber;
        // Assign the destination parameter
        this.destination = destination;
        // Assign the schedule departure parameter
        this.scheduleDeparture = scheduleDeparture;
        // Initialize the delay time 0
        this.delayTime = 0;
    }

    // Getter method for the flight number
    public String getFlightNumber() {
        // Return the flight number
        return flightNumber;
    }

    // Setter method for the flight number
    public void setFlightNumber(String flightNumber) {
        
    }


}


public class OOP10 {
    
}
