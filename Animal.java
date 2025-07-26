public class Animal {
    
    public void makeSound() {
        System.out.println("The animal make sound");
    }

    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meawes.");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();
        
    }
}
