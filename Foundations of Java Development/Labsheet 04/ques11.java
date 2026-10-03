class Calculator {
    static int operationsCount = 0;

    void add(double a, double b) {
        double result = a + b;
        operationsCount++;
        System.out.println("Addition: " + result);
    }

    void subtract(double a, double b) {
        double result = a - b;
        operationsCount++;
        System.out.println("Subtraction: " + result);
    }

    void multiply(double a, double b) {
        double result = a * b;
        operationsCount++;
        System.out.println("Multiplication: " + result);
    }

    void divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            operationsCount++;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

public class ques11 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(20, 10);
        c.subtract(20, 10);
        c.multiply(20, 10);
        c.divide(20, 10);

        System.out.println("Total Operations: " + Calculator.operationsCount);
    }
}
