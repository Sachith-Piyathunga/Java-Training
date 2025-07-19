/**
 * Static Block for Initialization
 * 
 * Write a Java program to create a class called Configuration with a static 
 * block that initializes a static variable 'configValue' from a configuration 
 * file (simulated with a default value). Print the value of 'configValue' in 
 * the main method.
 * 
 */

// Define the Configuration class
public class Configuration {
    // Declare a static variable configValue
    public static String configValue;

    // Static block to initialize configValue
    static {
        // Simulating reading from a configuration file by assigning a default value
        configValue = "Default Config Value";
        System.out.println("Static block executed: configValue initialized");
    }

    // Main method to print the value of configValue
    public static void main(String[] args) {
        // Print the value of configValue
        System.out.println("Config Value: " + configValue);
    }
}

/**
 * Explanation:
 * Define the Configuration class:
 *      The Configuration class is defined using the class keyword.
 * Declare a static variable configValue:
 *      The static variable configValue is declared. It will hold the configuration value.
 *  Static block to initialize configValue:
 *      A static block is used to initialize the static variable configValue.
 *      This block simulates reading from a configuration file by assigning a default value to configValue.
 *      A message is printed to indicate that the static block has been executed and configValue has been initialized.
 * Main method to print the value of configValue:
 *      The main method is defined to test the Configuration class.
 *      It prints the value of configValue to the console.
 * 
 */