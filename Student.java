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

}