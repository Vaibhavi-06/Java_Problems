// Abstract class
abstract class Shape {
    abstract void calculateArea();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String args[]) {

        // Creating objects with fixed values
        Shape c = new Circle(5);          // radius = 5
        Shape r = new Rectangle(10, 4);   // length = 10, breadth = 4

        c.calculateArea();
        r.calculateArea();
    }
}
