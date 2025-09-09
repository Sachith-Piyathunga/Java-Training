/**
 * Write a Java program to create a class called "School" with attributes for 
 * students, teachers, and classes, and methods to add and remove students and 
 * teachers, and to create classes.
 */


// Import the java ArrayList class
import java.util.ArrayList;

// School.java
// Define the school class
/* public */ class School {

    // Create the private field
    private ArrayList<Student> students;
    // Create the private field
    private ArrayList<Teacher> teachers;
    // Create the private field
    private ArrayList<SchoolClass> classes;

    // Constructor for the school class
    public School() {
        // Create new array list
        this.students = new ArrayList<Student>();
        // Create new array list
        this.teachers = new ArrayList<Teacher>();
        // Create new array list
        this.classes = new ArrayList<SchoolClass>();
    }

    // Method to add a student into students list
    public void adStudent(Student student) {
        // Add the student to the students list
        students.add(student);
    }

    // Method to remove student from the student list
    public void removeStudent(Student student) {
        // Remove the student from student list
        students.remove(student);
    }

    // Method to add a teacher to teachers list
    public void addTeacher(Teacher teacher) {
        // Add the teacher to the teachers list
        teachers.add(teacher);
    }

    // Method to remove a teacher from the teachers list
    public void removeTeacher(Teacher teacher) {
        // Remove teacher from the teachers list
        teachers.remove(teacher);
    }

    // Method to add the clas to the classes list
    public void addClass(SchoolClass schoolClass) {
        // Add class to the classes list
        classes.add(schoolClass);
    }

    // Method to get the list of students
    public ArrayList<Student> getStudents() {
        // Return the list of students
        return students;
    }

    // Method to get the list of teachers
    public ArrayList<Teacher> getTeachers() {
        // Return the list of teachers
        return teachers;
    }

    // Method to get the list of clases
    public ArrayList<SchoolClass> getClasses() {
        // Return the list of classes
        return classes;
    }
}




















public class OOP12 {
    
}
