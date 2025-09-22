/**
 * Write a Java program to create a class called "Course" with attributes for course 
 * name, instructor, and credits. Create a subclass "OnlineCourse" that adds 
 * attributes for platform and duration. Implement methods to display course 
 * details and check if the course is eligible for a certificate based on duration.
 * 
 */


// Define the Course class
/* public */ class Course {

    // Create the atributes
    private String courseName;
    private String instructor;
    private int credits;

    // Constructor for the Course class
    public Course(String courseName, String instructor, int credits) {
        // Assign the parameters
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    // Method to display the course details
    public void displayCourseDetails() {
        // Print the details
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }

    // Getter method for name
    public String getCourseName() {
        return courseName;
    }

    // Getter method for the instructor
    public String getInstructor() {
        return instructor;
    }

    // Getter method for the credits
    public int getCredits() {
        return credits;
    }
}


/**
 * Explanation
 * 
 * Course Class:
 *      - Attributes: courseName, instructor, and credits.
 *      - Constructor: Initializes the attributes.
 *      - displayCourseDetails(): Prints the course details.
 *      - Getters: Methods to get the values of the attributes.
 * 
 */


// Define the Online course class
class OnlineCourse extends Course {

    // Create the atributes
    private String platform;
    private int duration;

    // Constructor for the online course class
    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        // Call the super class constructor
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    // Override the display course details method
    @Override
    public void displayCourseDetails() {
        // Call the super class method
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
    }

    // Method to check if the course is eligible for a certificate
    public boolean isEligibleForCertificate() {
        return duration >= 10;
    }

    // Getter method for platform
    public String getPlatform() {
        return platform;
    }

    // Getter method for duration
    public int getDuration() {
        return duration;
    }
}
























public class OOP20 {
    
}
