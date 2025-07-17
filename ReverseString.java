// Runtime Polymorphism (Method Overriding)

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Animal a = new Dog();  // Runtime polymorphism
        a.sound();             // Calls Dog’s sound()
    }
}
