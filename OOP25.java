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
        return baseFee + additionalFee;
    }

    // Override the display etails method
    @Override
    public void displayDetails() {
        // Call the supercall method
        super.displayDetails();
        // Display details
        System.out.println("Personal Trainer Available: " + (personalTrainerAvailable ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"))
    }
} 


/**
 * Explanation
 * 
 *  - Class definition: Defines the PremiumMembership class, which extends 
 *    GymMembership.
 *  - Additional attributes: Declares two attributes: personalTrainerAvailable 
 *    (boolean) and spaAccess (boolean).
 * 
 *  - Constructor:
 *      - Calls the superclass (GymMembership) constructor to initialize memberName, 
 *        membershipType, and duration.
 *      - Initializes personalTrainerAvailable and spaAccess attributes with provided 
 *        values.
 * 
 *  - Override calculateFees() method:
 *      - Calls the superclass method super.calculateFees() to get the base fee.
 *      - Adds additional fees if personalTrainerAvailable and spaAccess are true.
 *      - Returns the total fee, which includes the base fee and any additional fees.
 * 
 *  - Override displayDetails() method:
 *      - Calls the superclass method super.displayDetails() to display base details.
 *      - Adds lines to print whether a personal trainer is available and whether 
 *        spa access is available.
 * 
 */


// OOP25.java
// Main class
public class OOP25 {
    // Define the main method
    public static void main(String[] args) {

        // Create an instance of GymMembership 
        GymMembership basicMember = new GymMembership("Sachintha", 
        "Monthly", 6);

        // Create an instance of PremiumMembership
        PremiumMembership premiumMember = new PremiumMembership("Chamod", 
        "Annual", 12, true, true);

        // Display details of the basic membership
        System.out.println("Basic Membership Details:");
        basicMember.displayDetails();

        // Display details of the premium membership
        System.out.println("\nPremium Membership Details:");
        premiumMember.displayDetails();
    }
}


/*
 * Explanation
 * 
 *  - Class definition: Defines the Main class to test GymMembership and 
 *    PremiumMembership classes.
 * 
 *  - main method: Entry point of the program.
 *      - Create an instance of GymMembership:
 *      - Instantiates a GymMembership object named basicMember.
 *      - Initializes with memberName as "Njeri Inka", membershipType as "Monthly", 
 *        and duration as 6 months.
 *  - Create an instance of PremiumMembership:
 *      - Instantiates a PremiumMembership object named premiumMember.
 *      - Initializes with memberName as "Willy Diantha", membershipType as "Annual", 
 *        duration as 12 months, personalTrainerAvailable as true, and spaAccess as true.
 *  - Display details of the basic membership:
 *      - Prints "Basic Membership Details:" to the console.
 *      - Calls basicMember.displayDetails() to print the details of the basic membership.
 *  - Display details of the premium membership:
 *      - Prints "\nPremium Membership Details:" to the console.
 *      - Calls premiumMember.displayDetails() to print the details of the 
 *        premium membership.
 * 
 */