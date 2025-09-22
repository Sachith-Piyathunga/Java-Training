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



























public class OOP20 {
    
}
