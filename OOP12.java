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


/**
 * Explanation
 * 
 * The above "School" class represents a school with students, teachers, and classes. 
 * It has three ArrayList attributes to store Student, Teacher, and SchoolClass objects.
 * The constructor initializes these ArrayLists as empty lists. It has methods to add 
 * and remove students, teachers, and classes from their respective ArrayLists. It 
 * also has getter methods to access ArrayLists of students, teachers, and classes.
 * 
 */


// Student.java
// Define the Student class
/* public */ class Student {

    // Create the private field
    private String name;
    // Create the private field
    private int age;

    // Constructor for the Student class
    public Student(String name, int age) {
        // Assign the parameter
        this.name = name;
        // Assign the parameter
        this.age =age;
    }

    // Getter method for the name
    public String getName() {
        // Return the name
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        // Assign the parameter
        this.name = name;
    }

    // Getter method for the age
    public int getAge() {
        // Return the age
        return age;
    }

    // Setter method for the age
    public void setAge(int age) {
        // Assign the parameter
        this.age = age;
    }
}


/**
 * Explanation
 * 
 * The "Student" class represents a student with a name and an age. It has a 
 * constructor that takes two arguments, name and age, and initializes the 
 * corresponding attributes. It also has getter and setter methods to access and 
 * modify name and age attributes.
 * 
 */


// Teacher.java
// Define the teacher class
/* public */ class Teacher {

    // Private field to store the name
    private String name;
    // Private field to store the subject
    private String subject;

    // Costructor for the teacher class
    public Teacher(String name, String subject) {
        // Assign the parameter
        this.name = name;
        // Assign the parameter
        this.subject = subject;
    }

    // Getter method for the name
    public String getName() {
        // Return the name
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        // Assign the parameter
        this.name = name;
    }

    // Getter method for the subject
    public String getSubject() {
        // Return the subject
        return subject;
    }

    // Setter method for the subject
    public void setSubject(String subject) {
        // Assign the subject
        this.subject = subject;
    }
}


/**
 * Explanation
 * 
 * The Teacher class represents a teacher in a school. It has two private 
 * attributes: name (teacher's name) and subject (Subject the teacher teaches). 
 * The class has a constructor that takes two arguments, the teacher's name and 
 * subject, and initializes the corresponding attributes. It also has getter and 
 * setter methods to access and modify the name and subject attributes.
 * 
 */


// SchoolClass.java
// Define the schoolclass class
/* public */ class SchoolClass {

    // Create the private field
    private String className;
    // Create the private field
    private Teacher teacher;
    // Create the private field
    private ArrayList<Student> students;

    // Constructor for the schoolclass class
    public SchoolClass(String className, Teacher teacher) {
        // Assign the parameter
        this.className = className;
        // Assign the parameter
        this.teacher = teacher;
        // Assign the parameter
        this.students = new ArrayList<Student>();
    }
}



















public class OOP12 {
    
}
