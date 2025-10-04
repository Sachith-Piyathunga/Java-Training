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


/**
 * Explanation
 * 
 *  - Class definition: Defines the GymMembership class.
 *  - Attributes: Declares three attributes: memberName (String), membershipType 
 *     (String), and duration (int, in months).
 *  - Constructor: Initializes the memberName, membershipType, and duration 
 *    attributes with provided values.
 * 
 *  - calculateFees() method:
 *      - Sets a base fee of $50.0 per month.
 *      - Returns the total fee by multiplying the base fee with the duration in months.
 * 
 *  - checkSpecialOffers() method:
 *      - Checks if the membership type is "annual".
 *      - Returns a 10% discount message if the membership type is annual.
 *      - Returns a message indicating no special offers for other membership types.
 * 
 *  - displayDetails() method:
 *      - Prints the member's name, membership type, and duration.
 *      - Calls calculateFees() to print the total membership fees.
 *      - Calls checkSpecialOffers() to print any applicable special offers.
 * 
*/


// PremiumMembership.java
// Define the PremiumMembership subclass
class PremiumMembership extends GymMembership {

    // Create attributes
    boolean personalTrainerAvailable;
    boolean spaAccess;

    // Constructor for PremiumMembership class
    public PremiumMembership(String memberName, String membershipType, int duration, 
    boolean personalTrainerAvailable, boolean spaAccess) {
        // Call the superclass constructor
        super(memberName, membershipType, duration);
        this.personalTrainerAvailable = personalTrainerAvailable;
        this.spaAccess = spaAccess;
    }

    // Override the calculateFees method
    @Override
    public double calculateFees() {
        // Call superclass method
        double baseFee = super.calculateFees();
        double additionalFee = 0.0;

        // Additional fee per month for personal trainer
        if (personalTrainerAvailable) {
            additionalFee += 30.0 * duration;
        }
        // Additional fee per month for spa access
        if (spaAccess) {
            additionalFee += 20.0 * duration;
        }
    }
} 



















public class OOP25 {
    
}
