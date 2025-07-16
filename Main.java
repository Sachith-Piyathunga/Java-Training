// Polymorphism
// Method Overloading and Overriding

// Parent Class
class Parent {
    // Overloaded method (compile-time polymorphism)
    public void func() {
        System.out.println("Parent.func()");
    }

    // Overloaded method (same name, different parameter)
    public void func(int a) {
        System.out.println("Parent.func(int): " + a);
    }
}

// child class
class child extends Parent {
    @Override
    public void func(int a) {
        System.out.println("Child.func(int): " + a);
    }
}