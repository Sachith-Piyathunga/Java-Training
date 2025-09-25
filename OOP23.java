/**
 * Write a Java program to create a class called "Event" with attributes for event 
 * name, date, and location. Create subclasses "Seminar" and "MusicalPerformance" 
 * that add specific attributes like number of speakers for seminars and performer 
 * list for concerts. Implement methods to display event details and check for 
 * conflicts in the event schedule.
 * 
 */


// Event.java
// Import the nessary java class
import java.util.Date;
import java.util.List;


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

    // Method to check the event details right
    public boolean isConflict(Event otherEvent) {
        return this.date.equals(otherEvent.date) && this.location.equals(otherEvent.location);
    }
}


/**
 * Explanation
 * 
 *      - Import statement: Imports the Date class from java.util.
 *      - Class definition: Defines the Event class.
 *      - Attributes: Declares three attributes: eventName (String), date (Date), 
 *        and location (String).
 *      - Constructor: Initializes the eventName, date, and location attributes.
 *      - displayDetails() method: Prints the event's name, date, and location.
 *      - isConflict() method: Checks if the current event conflicts with another 
 *        event by comparing their dates and locations.
 * 
 */


// Seminar.java
// Define the Seminar subclass
class Seminar extends Event {

    // Create the attribute
    int numberOfSpeakers;

    // Create the constructor for the Speaker class
    public Seminar(String eventName, Date date, String location, int numberOfSpeakers) {

        // Create the super class for the constructor
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    // Override the display details method
    @Override
    public void displayDetails() {
        // Call the super class method
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}


/**
 * Explanation
 * 
 *      - Import statements: Imports the 'Date' and 'List' classes from java.util.
 *      - Class definition: Defines the Seminar class, which extends the Event class.
 */

















public class OOP23 {
    
}
