public class TestForTurboGen {
    
}

// 1. Test 1
interface Shape {
    double area();
}

class Circle implements Shape {
    double redious = 5;

    public double area() {
        return Math.PI *  radius * radius;
    }
}

// Test 2 for the static methods

/**
 * 
 */