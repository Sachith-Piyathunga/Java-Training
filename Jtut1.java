/**
 *      -- Java Garbage Collection
 * 
 * The Java Garbage Collector (GC) is an automatic memory management system within 
 * the Java Virtual Machine (JVM). Its primary function is to automatically reclaim 
 * memory occupied by objects that are no longer referenced by the running Java 
 * application, thus preventing memory leaks and simplifying memory management for 
 * developers.
 * 
 *      -- class
 * In Java, a class serves as a blueprint or a template for creating objects. 
 * It defines the structure and behavior that objects of that class will possess.
 *  Instances of a class are objects
 * 
 */

// Declare class
/* public */ class Counter {
    private int value;
    public void inc() {
        ++value;
    }
    public int getValue() {
        return value;
    }
}

// Declaring attribute
/* public */ class Foo {
    private int x;
    private float f = 0.0;
    private String name = "Anonymous";
}

// Declaring methods
/* public */ class Counter {
    public static final int MAX = 100;
    private int value;
    public void inc() {
        if (value < MAX) {
            ++value;
        }
    }
    public int getValue() {
        return value;
    }
}

/**
 * Constructors
 * 
 * role: Object initialization
 * Name must be the same as class name
 * Must not have return type
 * 
 */







































public class Jtut1 {
    
}
