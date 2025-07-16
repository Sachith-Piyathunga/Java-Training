// Inheritance 

class Animal {
    
    void eat() {
        System.out.println("Animal is eating.....");
    }
    void sleep() {
        System.out.println("Animal is sleepnig.....");
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking.....");
        }   
    }
}

public class Main {
    public static void main(String[] rgs) {
        Dog myDog = new Dog();

        myDog.eat();
    }
}