/**
 * Write a Java program to create a class called Product with private instance 
 * variables productName, productCode, and price. Provide public getter and setter 
 * methods to access and modify these variables. Add a method called applyDiscount() 
 * that takes a percentage and reduces the price by that percentage.
 */

// Define the product class
/* public */ class product {
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

}



public class JavaEncapsulation6 {
    
}
