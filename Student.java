public class Student {
    
    private int ID;
    private String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void printStudent (String header) {
        System.out.println(header);
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getname());
    }

    public int getID() {
        return ID;
    }

    public String getname() {
        return name;
    }

    public static void main(String[] args) {
        Student obj = new Student(2563, "Sachintha")

        obj.printStudent("Student details: ");
    }

}