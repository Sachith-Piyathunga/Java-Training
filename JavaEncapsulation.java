/**
 * Write a Java program to create a class called Person with private instance variables 
 * name, age. and country. Provide public getter and setter methods to access and modify these variables.
 */
 
// Person.java
// Person class
class Person {
    // Private field to store the name of the person
    private String name;
    // Private field to store the age of the person
    private int age;
    // Private field to store country of the person
    private String country;

    // Public method to get the name of the person
    public String getName() {
        return name;
    }

    // Public method to set the name of the person
    public void setName(String name) {
        this.name = name;
    }

    // Public method to get the age of the person
    public int getAge() {
        return age;
    }

    // Public method to set the age of the person
    public void setAge(int age) {
        this.age = age;
    }

    // Public method to get the country of the person
    public String getCountry() {
        return country;
    }

    // Public method to set the country of the person
    public void setCountry(String country) {
        this.country = country; 
    }

}

// JavaEncapsulation.java
// Main class
public class JavaEncapsulation {
    public static void main(String[] args) {
        // Crete an instance of person
        Person person = new Person();

        // Set values using seter methods
        person.setName("Sachintha Piyathunga");
        person.setAge(25);
        person.setCountry("Sri Lanaka");

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

    }
}
