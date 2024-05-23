import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        
        
        try {
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("Age entered: " + age);
            System.out.print("You are Eligible for voting ");
        } catch (InvalidAgeException e) {
            System.err.println("InvalidAgeException: " + e.getMessage());
            System.out.print("You are Not Eligible for voting ");
        } finally {
            scanner.close();
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }
}
