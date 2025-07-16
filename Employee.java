// Encapsulation using private modifier

public class Employee {
    
    private int ID;
    private String name;

    public void setId(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        
        Employee emp = new Employee();

        emp.setId(5896);
        emp.setName("Sachintha");

        System.out.println("Employee ID is: " + emp.getID());
        System.out.println("Employee name is: " + emp.getName());
    }
    
}
