// Write a Java class that calculates the area of a circle using OOP.

public class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area: " + c.getArea());
    }
}
