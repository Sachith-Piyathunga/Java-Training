/**
 * Constructor for Singleton Pattern
 *
 *  Write a Java program to create a class called Singleton that ensures only 
 * one instance of the class can be created. Implement a private constructor and 
 * a public static method to get the single instance of the class. Print a message 
 * indicating the creation of the instance.
 * 
 */

 public class Singleton {
    
    private static Singleton singleInstance = null;
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {

        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public static void main(String[] args) {

    }
 }