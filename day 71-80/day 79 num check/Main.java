import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an ArrayList with 20 fixed numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i * 5);  // Add multiples of 5 for variety (5, 10, 15, ..., 100)
        }

        // Removing elements
        System.out.println("Original ArrayList: " + numbers);
        numbers.remove(new Integer(25)); // Example: Remove 25
        numbers.remove(new Integer(50)); // Example: Remove 50
        System.out.println("ArrayList after removals: " + numbers);

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + numbers.size());

        // Checking for specific numbers
        System.out.println("Enter a number to check if it exists in the ArrayList:");
        int numberToCheck = scanner.nextInt();
        if (numbers.contains(numberToCheck)) {
            System.out.println("The list contains " + numberToCheck + ".");
        } else {
            System.out.println("The list does not contain " + numberToCheck + ".");
        }

        scanner.close();
    }
}
