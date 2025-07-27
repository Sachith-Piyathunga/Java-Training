/**
 * Inner Class
 * 
 * Write a Java program to create an outer class called Computer with an inner 
 * class Processor. The Processor class should have a method "displayDetails()" 
 * that prints the details of the processor (e.g., brand and speed). Create an 
 * instance of Processor from the Computer class and call the "displayDetails()" method
 */

class Computer {
    
    class Processor {
        void displayDetails() {
            System.out.println("Processor Brand: Intel");
            System.out.println("Processor Speed: 3.5 GHz");
        }
    }

    void showProcessorDetails() {

        Processor processor = new Processor();
        processor.displayDetails();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.showProcessorDetails();
    }
}
