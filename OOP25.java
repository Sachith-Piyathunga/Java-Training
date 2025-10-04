/**
 * Write a Java program to create a class called "GymMembership" with attributes for 
 * member name, membership type, and duration. Create a subclass "PremiumMembership" 
 * that adds attributes for personal trainer availability and spa access. Implement 
 * methods to calculate membership fees and check for special offers based on 
 * membership type.
 * 
 */

// GymMembership.java
// Define the GymMembership class
/* public */ class GymMembership {
    
    // Create attributes
    String memberName;
    String memberShipType;
    int duration;

    // Constructor for the GymMembership class
    public GymMembership(String memberName, String memberShipType, int duration) {
        // Assign the parameters
        this.memberName = memberName;
        this.memberShipType = memberShipType;
        this.duration = duration;
    }

    // Method to calculate the membership fees
    public double calculateFees() {
        // Fees per month
        double baseFee = 50.0;
        return baseFee * duration;
    }

    // Method to chek the special offers
    public String checkSpecialOffers() {
        // Add the condition
        if (memberShipType.equalsIgnoreCase("annual")) {
            return "10% discount on annual membership.";
        } else {
            return "No special offers available.";
        }
    }

    // Method to display the membership details
    public void displayDetails() {
        // Print the details
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + memberShipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fees: $" + calculateFees());
        System.out.println("Special Offers: " + checkSpecialOffers());
    }
}
























public class OOP25 {
    
}
