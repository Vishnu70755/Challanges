import java.util.Scanner;

// Operations
class Addition {
    public double add(double a, double b) {
        return a + b;
    }
}

class Subtraction {
    public double subtract(double a, double b) {
        return a - b;
    }
}

class Multiplication {
    public double multiply(double a, double b) {
        return a * b;
    }
}

class Division {
    public double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return a / b;
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

// User Interface
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        while (true) {
            System.out.println("Select operation: 1) Add 2) Subtract 3) Multiply 4) Divide 5) Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            try {
                double result;
                switch (choice) {
                    case 1:
                        result = addition.add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = subtraction.subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = multiplication.multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        result = division.divide(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
