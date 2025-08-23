/**
 * Write a Java program to create a class called Product with private instance 
 * variables productName, productCode, and price. Provide public getter and setter 
 * methods to access and modify these variables. Add a method called applyDiscount() 
 * that takes a percentage and reduces the price by that percentage.
 */

// Define the product class
/* public */ class Product {
    // Private instance variables
    private String productName;
    private String productCode;
    private double price;

    // Getter method for the product name
    public String getProductName() {
        return productName;
    }

    // Setter method for the product name
    public void setProductName(String productName) {
        this.productName = productName;
    } 

    // Getter method for the product code
    public String getProductCode() {
        return productCode;
    }

    // Setter method for the product code
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    // Getter mrthod for thr price
    public double price() {
        return price;
    }

    // Setter method for the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method for the discount percentage for the product
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price -= this.price * (percentage / 100);
        }
    }
}

// JavaEncapsulation6.java
// Main class
public class JavaEncapsulation6 {
    // Main method for the product class
    public static void main(String[] args) {
        // Create the object for product
        Product product = new Product();

        // Set the values using setter methods
        product.setProductName("Lenovo Laptop");
        product.setProductCode("LAP-45983-Rizen-R");
        product.setPrice(350000.56);
    }
}
