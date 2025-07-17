// Show method overriding using inheritance

class Parent {
    void greet() {
        System.out.println("Hello from parent");
    }
}

class Child extends Parent {
    void greet() {
        System.out.println("Hello from child");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.greet();  // runtime polymorphism
    }
}
