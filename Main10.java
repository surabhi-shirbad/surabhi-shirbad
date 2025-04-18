// Base class
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; // Default 10% bonus
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ":");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }

    public void manageProject(String projectName) {
        System.out.println(name + " is working on project: " + projectName);
    }
}

// Manager class
class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus for managers
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " is managing the project: " + projectName);
    }
}

// Developer class
class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus for developers
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " is developing the project: " + projectName);
    }
}

// Programmer class
class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.12; // 12% bonus for programmers
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " is programming on the project: " + projectName);
    }
}

// Main class to test
public class Main10 {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Alice", "123 Main St", 90000);
        Employee emp2 = new Developer("Bob", "456 Oak Ave", 75000);
        Employee emp3 = new Programmer("Charlie", "789 Pine Rd", 60000);

        emp1.generatePerformanceReport();
        emp1.manageProject("NextGen CRM");

        System.out.println();

        emp2.generatePerformanceReport();
        emp2.manageProject("Mobile App");

        System.out.println();

        emp3.generatePerformanceReport();
        emp3.manageProject("Backend System");
    }
}
