/**
 * Write a Java program to create a class called Desktop with private instance variables 
 * brand, processor, and ramSize. Provide public getter and setter methods to access and 
 * modify these variables. Add a method called upgradeRam() that takes an integer value 
 * and increases the ramSize by that value.
 */

// Define the Desktop class
/* public */ class Desktop {
    // private instance variables
    private String brand;
    private String processor;
    private int ramSize;

    // Getter method for the brand
    public String getBrand() {
        return brand;
    }

    // Setter method for the brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for the processor
    public String getProcessor() {
        return processor;
    }

    // Setter method for the processor
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    // Getter method for the ram size
    public int getRamSize() {
        return ramSize;
    }

    // Setter method for the ram size
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

}





public class JavaEncapsulation8 {
    
}
