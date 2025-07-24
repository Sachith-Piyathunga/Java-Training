/**
 * Static Variables
 * 
 * Write a Java program to create a class called "Counter" with a static variable count. Implement a 
 * constructor that increments count every time an object is created. Print the value of count after 
 * creating several objects.
 */

public class Counter {
    
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount () {
        return count;
    }

    public static void main(String[] args) {
        
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println("Count: " + Counter.getCount());
    }
}

/**
 * Explanation:
 * 
 * Define the Counter class:
 *      The Counter class is defined using the class keyword.
 * Static variable to keep track of the count of instances:
 *      A private static variable count is declared to keep track of the number of instances created.
 * Constructor increments the static variable count:
 *      The constructor Counter() is defined to increment the count variable every time a new instance is created.
 * Static method to get the value of count:
 *      A static method getCount() is defined to return the value of the static variable count.
 * Main method to test the Counter class:
 *      The main method is defined to test the Counter class.
 *      Several Counter objects (c1, c2, c3) are created.
 *      The value of count is printed using the getCount() method.
 * 
 */
