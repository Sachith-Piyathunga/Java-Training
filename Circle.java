// Create a class Animal and a subclass Dog which overrides a method makeSound().

class Animal {
    void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
