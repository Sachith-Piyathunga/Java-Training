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
    private LocalTime scheduledDeparture;
    // Create a private field
    private int delayTime;

    // Constructor for the airplane class
    public Airplane(String flightNumber, String destination, LocalTime scheduleDeparture) {
        // Assign the flightnumber parameter
        this.flightNumber = flightNumber;
        // Assign the destination parameter
        this.destination = destination;
        // Assign the schedule departure parameter
        this.scheduledDeparture = scheduledDeparture;
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
        // Assign the flight number parameter
        this.flightNumber = flightNumber;
    }

    // Getter method for the destination
    public String getDestination() {
        // Return destination
        return destination;
    }
    
    // Setter method for the destination
    public void setDestination(String destination) {
        // Assign the destination parameter
        this.destination = destination;
    }

    // Getter mthod for the scheduled departure
    public LocalTime getScheduledDeparture(LocalTime scheduledDeparture) {
        // Retunrn the scheduled departure
        return scheduledDeparture;
    }

    // Setter method for the scheduled departure time
    public void setScheduledDeparture(LocalTime scheduledDeparture) {
        // Assign the scheduled departure time parameter
        this.scheduledDeparture = scheduledDeparture;
    }

    // Getter method for the delay time
    public int getDelayTime() {
        // Return the delay time
        return delayTime;
    }

    // Method to set a delay and update the scheduled departure time
    public void delay(int minutes) {
        // Assign the delay time parameter
        this.delayTime = minutes;
        // Update the scheduled departure time
        this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
    }

    // Method check the status of the flight
    public void checkStatus() {
        // Check if time is no delay
        if (delayTime == 0) {
            // Print the message
        System.out.println("Flight " + flightNumber + " is on time.");
        } else {
            // Print the message
            System.out.println("Flight " + flightNumber + " is delayed by " + delayTime + " minutes.");
        }
    }
}


/**
 * Explanation
 * 
 * The above class represents an airplane with a flight number, destination, and 
 * scheduled departure time. It has getter and setter methods for these attributes. 
 * The class also two methods "delay()" and "checkStatus()" to delay the flight 
 * and check its status. The "delay()" method takes an integer value representing 
 * the number of minutes the flight will be delayed and updates the scheduled 
 * departure time accordingly. By using “checkStatus()” method, you can determine 
 * whether the flight has been delayed or is on time.
 * 
 */



// OOP10.java
// Main class 
public class OOP10 {
    // Define the main method
    public static void main(String[] args) {
        // Crete the new airplane object
        Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(10, 30));
        // Crete the new airplane object
        Airplane flight2 = new Airplane("KUI765", "New York", LocalTime.of(14, 0));
        // Create the new airplane object
        Airplane flight3 = new Airplane("JUY456", "Paris", LocalTime.of(14, 0));
        
        // Print the flight status
        System.out.println("Flight status: ");

        // Check the flight status of flight 1
        flight1.checkStatus();


















    }
}
