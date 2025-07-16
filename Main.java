// try abstract methds

abstract class Vehicle {

    abstract void accelerate();
    abstract void brake();

    void startEngine() {
        System.out.println("Engine is started!");
    }
}

class Car extends Vehicle {
    
    @Override
    void accelerate() {
        System.out.println("Car: Pressing gas pedal..");
    }
    @Override
    void brake() {
        System.out.println("Car: Applying brakes..");
    } 

}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();

        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
}