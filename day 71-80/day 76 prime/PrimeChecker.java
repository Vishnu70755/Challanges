import java.util.Scanner;

public class PrimejaChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime Number Checker");
        char continueInput = 'y';

        while (continueInput == 'y') {
            System.out.print("Enter a number to check if it is prime: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

            System.out.print("Do you want to check another number? (y/n): ");
            continueInput = scanner.next().charAt(0);
        }

        scanner.close();
        System.out.println("Program ended.");
    }

    // Helper method to determine if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
