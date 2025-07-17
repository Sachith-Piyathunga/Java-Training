// Create a class Person with private fields name and age, and provide getter and setter methods.

class Person {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Sachintha");
        p.setAge(22);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
