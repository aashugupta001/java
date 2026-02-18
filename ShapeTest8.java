// Superclass
class Shape {
    double area() {
        return 0;
    }
}

// Triangle class
class Triangle extends Shape {
    double b = 5, h = 4;

    double area() {
        return 0.5 * b * h;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double l = 6, w = 3;

    double area() {
        return l * w;
    }
}

// Circle class
class Circle extends Shape {
    double r = 3;

    double area() {
        return Math.PI * r * r;
    }
}

// Main class
public class ShapeTest8 {
    public static void main(String[] args) {

        Shape s;

        s = new Triangle();
        System.out.println("Triangle Area = " + s.area());

        s = new Rectangle();
        System.out.println("Rectangle Area = " + s.area());

        s = new Circle();
        System.out.println("Circle Area = " + s.area());
    }
}
