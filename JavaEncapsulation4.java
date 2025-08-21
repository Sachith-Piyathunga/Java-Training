/**
 * Write a Java program to create a class called Car with private instance variables 
 * company_name, model_name, year, and mileage. Provide public getter and setter 
 * methods to access and modify the company_name, model_name, and year variables. 
 * However, only provide a getter method for the mileage variable.
 */


// Car.java
// Car class
class Car {
    // Declare a private String variable for the company name
    private String company_Name;

    // Declare a private String variable for the model name
    private String model_Name;

    // Declare a private int variable for the year
    private int year;

    // Declare a private double variable for the mileage
    private double mileage;

    // Getter method for the copmpany name
    public String getCompany_Name() {
        return company_Name;
    }

    // Setter method for the company name
    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    // Getter method for the model name
    public String getModel_Name() {
        return model_Name;
    }

    // Setter method for the model name
    public void setModel_Name(String model_Name) {
        this.model_Name = model_Name;
    }

    // Getter method for the year
    public int getYear() {
        return year;
    }

    // Setter method for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter method for the mileage
    public double getMileage() {
        return mileage;
    }
}


// JavaEncapsulation4.java
// Main class
public class JavaEncapsulation4 {
    public static void main(String[] args) {
        // Create an insatance of car
        Car car =new Car();

        // Set the values using setter method
        car.setCompany_Name("HONDA");
        car.setModel_Name("CIVIC");
        car.setYear(2025);
    }
}
