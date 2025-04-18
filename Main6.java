// Main.java
class Person {
    protected String firstName;
    protected String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to get first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get last name
    public String getLastName() {
        return lastName;
    }
}

// Subclass Employee
class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    // Constructor
    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    // New method in subclass
    public String getEmployeeId() {
        return employeeId;
    }

    // Overridden method
    @Override
    public String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }
}

// Main class to test
public class Main6 {
    public static void main(String[] args) {
        Person person = new Person("Alice", "Walker");
        Employee employee = new Employee("John", "Smith", "E123", "Software Engineer");

        System.out.println("Person Info:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        System.out.println("\nEmployee Info:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName()); // Includes job title
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
