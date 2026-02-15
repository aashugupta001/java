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

    double calculateBonus() {
        return salary * 0.10; 
    }

    
    void generateReport() {
        System.out.println("\nEmployee Report");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    
    void manageProject() {
        System.out.println(name + " is working on company projects.");
    }
}


class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    double calculateBonus() {
        return salary * 0.20;
    }

    void manageProject() {
        System.out.println(name + " is managing multiple teams and projects.");
    }
}


class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    double calculateBonus() {
        return salary * 0.15;
    }

    void manageProject() {
        System.out.println(name + " is developing software modules.");
    }
}


class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    double calculateBonus() {
        return salary * 0.12;
    }

    void manageProject() {
        System.out.println(name + " is writing and debugging code.");
    }
}

// Main class
public class CompanyTest {
    public static void main(String[] args) {

        Manager m = new Manager("Anjali", "Delhi", 80000);
        Developer d = new Developer("Radha", "Noida", 60000);
        Programmer p = new Programmer("Rani", "Lucknow", 50000);
        

        // Manager details
        m.generateReport();
        System.out.println("Bonus: " + m.calculateBonus());
        m.manageProject();

        // Developer details5
        d.generateReport();
        System.out.println("Bonus: " + d.calculateBonus());
        d.manageProject();

        // Programmer details
        p.generateReport();
        System.out.println("Bonus: " + p.calculateBonus());
        p.manageProject();
    }
}


