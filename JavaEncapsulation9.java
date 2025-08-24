/**
 * Write a Java program to create a class called House with private instance variables 
 * address, numberOfRooms, and area. Provide public getter and setter methods to access 
 * and modify these variables. Add a method called calculatePrice() that returns the 
 * price of the house based on its area and a price per square meter.
 */


// House.java
// Define the House class
/* public */ class House {
    // Private insatance variable
    private String address;
    private int numberOfRooms;
    private double area;

    // Getter method for the adress
    public String getAddress() {
        return address;
    }

    // Setter method for adress
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter method for the number of rooms
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    // Setter method for the number of rooms
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    // Getter method for the area
    public double getArea() {
        return area;
    }

    // Setter method for the area
    public void setArea(double area) {
        this.area = area;
    }

    // Method to calculate the price of the house
    public double calculatePrice(double pricePerSqureMeter) {
        return this.area * pricePerSqureMeter;
    }
}


// JavaEncapsulation9.java
// Main class
public class JavaEncapsulation9 {
    // Main method
    public static void main(String[] args) {
        
    }
}
