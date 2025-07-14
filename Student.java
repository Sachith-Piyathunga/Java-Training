/**
 * Chaining Constructors
 * Write a Java program to create a class called Student with instance variables 
 * studentId, studentName, and grade. Implement a default constructor and a 
 * parameterized constructor that takes all three instance variables. Use 
 * constructor chaining to initialize the variables. Print the values of the 
 * variables.
 */

 public class Student {

   private int studentId;
   private String studentName;
   private String grade;

   public Student() {
      this.studentId = 0;
      this.studentName = "Unknown";
      this.grade = "None"; 
   }

   public Student (int studentId, String studentName, String grade) {
      this.studentId = studentId;
      this.studentName = studentName;
      this.grade = grade;
   }

   public static void main(String[] args) {
      Student student1 = new Student(101, "Sachintha", "A");

      
   }
 }