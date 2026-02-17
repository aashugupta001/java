// Base Class
class Employee {

    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println(name + " Bonus: " + bonus);
    }

    void performanceReport() {
        System.out.println(name + " performance is satisfactory.");
    }

    void manageProject() {
        System.out.println(name + " is managing general tasks.");
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

// Manager subclass
class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println(name + " Bonus: " + bonus);
    }

    void manageProject() {
        System.out.println(name + " is managing company projects.");
    }
}

// Developer subclass
class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    void calculateBonus() {
        double bonus = salary * 0.15;
        System.out.println(name + " Bonus: " + bonus);
    }

    void performanceReport() {
        System.out.println(name + " code quality is excellent.");
    }
}

// Programmer subclass
class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    void manageProject() {
        System.out.println(name + " is handling module development.");
    }
}

// MAIN CLASS (only this is public)
public class EmployeeSystem {

    public static void main(String[] args) {

        Manager m = new Manager("Rahul", "Surat", 60000);
        Developer d = new Developer("Amit", "Ahmedabad", 50000);
        Programmer p = new Programmer("Neha", "Mumbai", 45000);

        m.display(); 
        m.calculateBonus();
        m.performanceReport();
        m.manageProject();

        d.display();
        d.calculateBonus();
        d.performanceReport();
        d.manageProject();

        p.display();
        p.calculateBonus();
        p.performanceReport();
        p.manageProject();
    }
}
