// Create a Java program that uses abstraction to model a shape system.

abstract class Shape {

    abstract double getArea();
}

class Square extends Shape {
    
    double side;

    public Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }

    public static void main(String[] args) {
        Square squ = new Square(10.0);

        System.out.println("Area of square: " + squ.getArea());
    }
}