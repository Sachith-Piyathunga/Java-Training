// Create a Vehicle class with a method startEngine(). Create two subclasses Car and Bike that override this method.

class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.startEngine();
        v2.startEngine();
    }
}
