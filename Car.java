/**
 * Constructor with Default Values
 * Write a Java program to create a class called Car with instance 
 * variables make, model, and year. Implement a parameterized constructor 
 * that initializes these variables and assigns default values if not provided. 
 * Print the values of the variables.
 */

 public class Car {
    
    private String make;
    private String model;
    private int year;

    public Car (String make, String model, int year) {
        
        this.make = (make == null || make.isEmpty()) ? "Unknown make" : make;
        this.model = (model == null || model.isEmpty()) ? "Unknown model" : model;
        this.year = (year <= 0 ) ? 2000 : year;
    }
 }