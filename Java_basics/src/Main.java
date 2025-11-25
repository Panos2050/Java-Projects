class Calculator {

    // Add
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Subtraction
    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    // Multiplication
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    // Division (safe — checks for 0)
    public double divide(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (double) n1 / n2;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int num1 = 10;
        int num2 = 5;

        System.out.println("Add: " + calc.add(num1, num2));
        System.out.println("Subtract: " + calc.subtract(num1, num2));
        System.out.println("Multiply: " + calc.multiply(num1, num2));
        System.out.println("Divide: " + calc.divide(num1, num2));
    }
}
