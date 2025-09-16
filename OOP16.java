/**
 * Write a Java program to create a class with methods to search for flights and 
 * hotels, and to book and cancel reservations.
 */


// Import java ArrayList class
import java.util.ArrayList;

// Import the Random class
import java.util.Random;

// TravelApp.java
// Define the TravelApp class
/* public */ class TravelApp {

    // Declare an array list
    private ArrayList flights;
    // Declare an array list
    private ArrayList hotels;

    // Constructor for the travel app class
    public TravelApp() {
        // Initialize the flights array list
        this.flights = new ArrayList();
        // Initialize the hotels array list
        this.hotels = new ArrayList();
    }

    // Method to search for flights
    public void searchFlights(String origin, String destination, String date, int numPassengers) {
        // Print the search details
        System.out.println("Searching for flights from " + origin + " to " + destination + " on " + date + " for " + numPassengers + " passengers.");
    }

    // Method to search for hotels
    public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
        // Print the search details
        System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut + " for " + numGuests + " guests.");
    }

    // Method to book a flight
    public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        // Create the new flight object
        Flight flight = new Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price);
        // Generate a confomation number
        int confirmationNumber = generateConfirmationNumber();
        // Set the confomation number for the flight
        flight.setConfirmationNumber(confirmationNumber);
        // Add the flight to the flights ArrayList
        this.flights.add(flight);
        // Print the confimatioin number for the booked flight
        System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
    }

    // Method to book a hotel
    public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
        // Create the new hotel object
        Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
        // Generate a confimation number
        int confirmationNumber = generateConfirmationNumber();
        // Set the confirmation number for the hotel
        hotel.setConfirmationNumber(confirmationNumber);
        // Add the hotel to the hotels array list
        this.hotels.add(hotel);
        // Print the confirmation number for the booked hotel
        System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
    }

    // Method to cancel a reservation
    public void cancelReservation(int confirmationNumber) {
        // Loop through the flights array list
        for (Flight flight : this.flights) {
            // Check if the confirmation number is maches
            if (flight.getConfirmationNumber() == confirmationNumber) {
                this.flights.remove(flight);
                // Print the cancellation message
                System.out.println("Flight reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }

        // Loop through the hotels array list
        for (Hotel hotel : this.hotels) {
            // Check if the confirmation number is maches
            if (hotel.getConfirmationNumber() == confirmationNumber) {
                this.hotels.remove(hotel);
                // Print the cancellation message
                System.out.println("Hotel reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }

        // Print the message if no reservation is found
        System.out.println("No reservation found with confirmation number " + confirmationNumber + ".");
    }

    // Method to generate the random confirmation number
    private int generateConfirmationNumber() {
        // Create the random object
        Random rand = new Random();
        // Generate and return a random number
        return rand.nextInt(900000) + 100000;
    }
}


/**
 * Explanation
 * 
 * The above Java class is used for searching and booking flights and hotels, as well 
 * as cancelling reservations. It contains methods to search for flights and hotels 
 * based on specific criteria, book flights and hotels by creating new Flight and 
 * Hotel objects, cancel reservations by confirmation number, and generate a random 
 * confirmation number using the Random class in Java. It also contains private 
 * instance variables to store ArrayLists of Flight and Hotel objects that 
 * represent the current reservations.
 * 
 */


// Flight.java
// Define the Flight class
/* public */ class Flight {
    
    // Declare a variable
    private int flightNumber;
    // Declare a variable
    private String passengerName;
    // Declare a variable
    private String origin;
    // Declare a variable
    private String destination;
    // Declare a variable
    private String date;
    // Declare a variable
    private int numPassengers;
    // Declare a variable
    private double price;
    // Declare a variable
    private int confirmationNumber;

    // Constructor for the flight class
    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        // Initialize the flight number
        this.flightNumber = flightNumber;
        // Initialize the passenger name
        this.passengerName = passengerName;
        // Initialize the origin
        this.origin = origin;
        // Initialize the destination
        this.destination = destination;
    }
}
























public class OOP16 {
    
}
