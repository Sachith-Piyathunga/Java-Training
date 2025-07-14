/**
 * Default Constructor
 * Write a Java program to create a class called “Cat” with instance variables 
 * name and age. Implement a default constructor that initializes the name to 
 * "Unknown" and the age to 0. Print the values of the variables.
 */

 public class Cat {
    
    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
 }