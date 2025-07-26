public class Student {
    
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("Name: " + name + "Age: " + age);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Sachintha", 25);
        student1.printDetails();
    }
}
