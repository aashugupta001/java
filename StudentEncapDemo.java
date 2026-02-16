
// Student class with private variables
class Student {

    private String name;
    private int age;
    private double marks;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0)      // validation example
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    
    public void setMarks(double marks) {
        if(marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Marks should be between 0 and 100");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }
}

// Main class
public class StudentEncapDemo {
    public static void main(String[] args) {

        Student s = new Student();

        // setting values
        s.setName("Amit");
        s.setAge(20);
        s.setMarks(85.5);

        // getting values
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Marks: " + s.getMarks());
    }
}
