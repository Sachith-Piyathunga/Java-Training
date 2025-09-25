/**
 * Write a Java program to create a class called "Event" with attributes for event 
 * name, date, and location. Create subclasses "Seminar" and "MusicalPerformance" 
 * that add specific attributes like number of speakers for seminars and performer 
 * list for concerts. Implement methods to display event details and check for 
 * conflicts in the event schedule.
 * 
 */


// Event.java
// Import the java Date class
import java.util.Date;

// Define the Event class
class Event {

    // Create the atribute
    String eventName;
    Date date;
    String location;

    // Declare the constructor for the event class
    public Event(String eventName, Date date, String location) {
        // Assign the parameters
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    // Method to display the details
    public void displayDetails() {
        // Print the details
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }
}









































public class OOP23 {
    
}
