/**
 * Static Block for Initialization
 * 
 * Write a Java program to create a class called Configuration with a static 
 * block that initializes a static variable 'configValue' from a configuration 
 * file (simulated with a default value). Print the value of 'configValue' in 
 * the main method.
 * 
 */

public class Configuration  {
    
    public static String Configuration;

    static {
        configValue = "Default config value";
        System.out.println("Static block executed: configValue initialized");
    }
}