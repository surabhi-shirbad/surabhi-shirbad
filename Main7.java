
class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    public HRManager(double salary) {
        super(salary);
    }

    public void work() {
        System.out.println("HR Manager is managing employee relations.");
    }

    public void addEmployee(String name) {
        System.out.println("Added new employee: " + name);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Employee generalEmployee = new Employee(40000);
        HRManager hr = new HRManager(60000);

        System.out.println("General Employee:");
        generalEmployee.work();
        System.out.println("Salary: $" + generalEmployee.getSalary());

        System.out.println("\nHR Manager:");
        hr.work(); 
        System.out.println("Salary: $" + hr.getSalary());
        hr.addEmployee("Emily Johnson"); 
    }
}


