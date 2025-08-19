/**
 * Problem
 * 
 * Write a Java program that creates a class hierarchy for employees of a company. 
 * The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
 * Each subclass should have properties such as name, address, salary, and job title. 
 * Implement methods for calculating bonuses, generating performance reports, and managing projects.
 * 
 */

// Class declaretion for Employee
class Employee {
    // Private fields for the Employee class
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    // Constructor for the employee class
    private Employee(String name, String address, double salary, String jobTitle) {
        // Initialize the name field
        this.name = name;
        // Initalize the address feild
        this.address = address;
        // Initialize the salary field
        this.salary = salary;
        // Initialize the jobTitle field
        this.jobTitle = jobTitle;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Getter method for the address field
    public String getAddress() {
        return address;
    }

    // Getter method for the salary field
    public double getSalary() {
        return salary;
    }

    // Getter method for the jobTitle field
    public String getJobTitle() {
        return jobTitle;
    }

    // Method to calculate the bonus for the employee
    public double calculateBonus() {
        // Default implemetation for bonus calculation
        return 0.0;
    }

    // Method to generate the preformance report for the employee
    public String generatePerformanceReport() {
        // Defult implementation for performance report
        return "No performance report available.";
    }
}

/**
 * Explanation
 * 
 * Employee class: This class represents a generic employee with private instance 
 * variables 'name', 'address', 'salary', and 'jobTitle'. 
 * It also provides getter methods to access these private variables.
 *      getName(): Returns the employee's name.
 *      getAddress(): Returns the employee's address.
 *      getSalary(): Returns the employee's salary.
 *      getJobTitle(): Returns the employee's job title.
 * 
 * calculateBonus(): This method is used to calculate the bonus for an employee. 
 * In the base class, it provides a default implementation that returns 0.0. 
 * Subclasses can override this method to provide custom bonus calculation logic.
 * 
 * generatePerformanceReport(): This method generates a performance report for an 
 * employee. Similar to the bonus calculation, it provides a default implementation 
 * that returns "No performance report available." Subclasses can override this 
 * method to provide custom performance report generation logic.
 * 
 */

// Class declaretion for manager witch extends Employee
class Manager extends Employee {
    // private field for the number of subordinates
    private int numberOfSubordinates;

    // Constructor for manager class
    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        // Calling the constructor of the superclass Employee
        super(name, address, salary, jobTitle);
        // Initialize the numberOfSubordinates field
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // Getter method for the numberOfSubordinates field
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    // Override method to calcula the bonus for the manager
    @Override
    public double calculateBonus() {
        // Custom inplimantation for the bonus calculation 
        return getSalary() * 0.15;
    }

    // Override method to genarate the performance report for the manager
    @Override
    public String generatePerformanceReport() {
        // Custom implimantation for performance report for manager
        return "Performance report for Manager " + getName() + ": Excellent";
    }

    // Custom method for managing project
    public void mangeProject() {
        // Print the message including the manager is managing a project
        System.out.println("Manager " + getName() + " is managing a project.");
    }

}

/**
 *  Explanation
 * 
 * extends Employee: This line indicates that the "Manager" class inherits from the 
 * "Employee" class. It means that a Manager is a specialized type of Employee and 
 * inherits all the attributes and methods of the Employee class.
 * 
 * private int numberOfSubordinates: This instance variable represents the number of 
 * subordinates managed by the manager. 
 * It is specific to the "Manager" class and not present in the base "Employee" class.
 * 
 * public Manager(String name, String address, double salary, String jobTitle, int 
 * numberOfSubordinates): This is the constructor for the "Manager" class. 
 * It takes parameters for 'name', 'address', 'salary', 'jobTitle', and 
 * numberOfSubordinates, which are used to initialize the attributes inherited 
 * from the "Employee" class as well as the numberOfSubordinates specific to managers. 
 * The super(...) keyword is used to call the constructor of the superclass (Employee) 
 * to initialize its attributes.
 * 
 * public int getNumberOfSubordinates(): This method allows you to retrieve the 
 * number of subordinates managed by the manager.
 * 
 * @Override public double calculateBonus(): This method is marked with the @Override 
 * annotation, indicating that it is an overridden method from the superclass (Employee). 
 * The "calculateBonus()" method provides a custom implementation for bonus calculation 
 * for managers. In this case, it calculates the bonus as 15% of the manager's salary.
 * 
 * @Override public String generatePerformanceReport(): Similar to the "calculateBonus()" 
 * method, this method is also marked as an override and provides a custom implementation 
 * for generating a performance report for managers. 
 * It returns a specific performance report message for managers, including the manager's 
 * name and an "Excellent" rating.
 * 
 * 
 * public void manageProject(): This is a custom method specific to the "Manager" class. 
 * It simulates the action of a manager managing a project by printing a message to the console.
 * 
 */


// Class declaretion for developer which extends Employee
class Developer extends Employee {
    // Private field for the programming language
    private String programmingLanguage;

    // Constructor for the Developer class
    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        // Calling the constructor of the superclass Employee
        super(name, address, salary, jobTitle);
        // Initialize the programmingLanguage field
        this.programmingLanguage = programmingLanguage;
    }

    // Getter method for the programmingLanguage field
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Override method to calculate the bonus for the developer
    @Override
    public double calculateBonus() {
        // Custom implimantation for bonus calculation for developers
        return getSalary() * 0.10;
    }

    // Override method to genarate the performance report for the developer
    @Override
    public String generatePerformanceReport() {
        // Custom implimantation for performance report for developers
        return "Performance report for Developer " + getName() + ": Good";
    }

    // Custom method for writing code
    public void writeCode() {
        // Pring the message indicating the developer is writing code
        System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage);
    }
}

/**
 * Explanation
 * 
 * extends Employee: Similar to the "Manager" class, this line indicates that the Developer 
 * class inherits from the "Employee" class. 
 * It means that a 'Developer' is a specialized type of 'Employee' and inherits all the 
 * attributes and methods of the Employee class.
 * 
 * private String programmingLanguage: This instance variable represents the programming 
 * language that the developer specializes in. 
 * It is specific to the "Developer" class and not present in the base "Employee" class.
 * 
 * public Developer(String name, String address, double salary, String jobTitle, 
 * String programmingLanguage): This is the constructor for the "Developer" class. 
 * It takes parameters for 'name', 'address', 'salary', 'jobTitle', and programmingLanguage, 
 * which are used to initialize the attributes inherited from the "Employee" class as well 
 * as the programmingLanguage specific to developers. 
 * The super(...) keyword is used to call the constructor of the superclass (Employee) to initialize its attributes.
 * 
 * public String getProgrammingLanguage(): This method allows you to retrieve the 
 * programming language specialization of the developer.
 * 
 * @Override public double calculateBonus(): This method is marked with the @Override annotation, 
 * indicating that it is an overridden method from the superclass (Employee). 
 * The "calculateBonus()" method provides a custom implementation for bonus calculation for developers. 
 * In this case, it calculates the bonus as 10% of the developer's salary.
 * 
 * @Override public String generatePerformanceReport(): Similar to the "calculateBonus()" method, 
 * this method is also marked as an override and provides a custom implementation for 
 * generating a performance report for developers. 
 * It returns a specific performance report message for developers, including the developer's name and a "Good" rating.
 * 
 * public void writeCode(): This is a custom method specific to the "Developer" class. It simulates 
 * the action of a developer writing code in their specialized programming language by printing a message to the console.
 * 
 */


 // Class declareion for programmer which extends Developer
 class Programmer extends Developer {
    // Constructor for the programmer class
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        // Calling the constructor of the superclass Developer
        super(name, address, salary, "Programmer", programmingLanguage);
    }

    // Override the method to calculate the binus for the programmer
    @Override
    public double calculateBonus() {
        // Custom implimantation for bonus calculation for programmer
        return getSalary() * 0.12;
    }

    // Override method to genarate the performance report for programmers
    @Override
    public String generatePerformanceReport() {
        // Custom implimantation for performance report for programmers
        return "Performance report for programmer " + getName() + " :Excellent";
    }

    // Custom method for debugging the code
    public void debugCode() {
        // Printing a message indicating the programmer is debugging the code
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
    }
}

/**
 * Explanation
 * 
 * extends Developer: This line indicates that the "Programmer" class inherits from the 
 * "Developer" class. It means that a 'Programmer' is a specialized type of 'Developer' 
 * and inherits all the attributes and methods of the Developer class.
 * 
 * public Programmer(String name, String address, double salary, String programmingLanguage): 
 * This is the constructor for the "Programmer" class. 
 * It takes parameters for 'name', 'address', 'salary', and 'programmingLanguage'. 
 * It passes these parameters to the constructor of the superclass (Developer) using the super(...) 
 * keyword to initialize the attributes inherited from the "Developer" class. 
 * The 'jobTitle' parameter is set to "Programmer" to indicate the specific job title for programmers.
 * 
 * @Override public double calculateBonus(): This method is marked with the @Override annotation, 
 * indicating that it is an overridden method from the superclass (Developer). 
 * The "calculateBonus()" method provides a custom implementation for bonus calculation for programmers. 
 * In this case, it calculates the bonus as 12% of the programmer's salary.
 * 
 * @Override public String generatePerformanceReport(): Similar to the "calculateBonus()" method, 
 * this method is also marked as an override and provides a custom implementation for generating a 
 * performance report for programmers. 
 * It returns a specific performance report message for programmers, including the programmer's 
 * name and an "Excellent" rating.
 * 
 * public void debugCode(): This is a custom method specific to the "Programmer" class. 
 * It simulates the action of a programmer debugging code in their specialized programming 
 * language by printing a message to the console.
 * 
 */


 // JavaInheritance9.java
// public class declaretion for the main class 
public class JavaInheritance9 {
    // Main method
    public static void main(String[] args) {
        // Create the instance fo the Manager
        Manager manager = new Manager("Sachintha", "123 ASD St", 25000, "Manager", 10);
        // Create the instance of the Developer
        Developer developer = new Developer("Chamod", "1234 qwe St", 520, "Developer", "Java");
        // Create the insatnce of programmer
        Programmer programmer = new Programmer("Piyathunga", "234 cvb St", 4500, "JavaScript");

        // Print the manager's bonus
        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        // Print the developer's bonus
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        // Print the programmer's bonus
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

        // Print the manager's performance report
        System.out.println(manager.generatePerformanceReport());
        // Print the developer's performance report
        System.out.println(developer.generatePerformanceReport());
        // Print the programmer's performances report
        System.out.println(programmer.generatePerformanceReport());
        
        // Manager managing the project
        manager.mangeProject();
        // Developer writing the code
        developer.writeCode();
        // Programmer debuging the code
        programmer.debugCode();
    }  
}

/**
 * Explanation
 * 
 * Creating Employee Objects:
 *      Three employee objects are created: 'manager', 'developer', and 
 *      'programmer', each with their specific attributes such as name, address, 
 *      salary, and job title.
 *      manager is an instance of the "Manager" class.
 *      developer is an instance of the "Developer" class.
 *      programmer is an instance of the "Programmer" class.
 * 
 * Calculating Bonuses:
 *      The program calls the "calculateBonus()" method for each employee type 
 *      (manager, developer, and programmer) to calculate their respective bonuses.
 *      The bonuses are displayed on the console.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */