class Calculator {

    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add two double numbers
    double add(double a, double b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class CalculatorDemo {
    public static void main(String args[]) {

        Calculator c = new Calculator();

        System.out.println("Add(int, int) = " + c.add(10, 20));
        System.out.println("Add(double, double) = " + c.add(5.5, 4.5));
        System.out.println("Add(int, int, int) = " + c.add(1, 2, 3));
    }
}
