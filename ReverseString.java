// Create a Java program that uses abstraction to model a shape system.

abstract class Shape {

    abstract double getArea();
}

class Square extends Shape {
    
    double side;

    public Square(douuble side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}