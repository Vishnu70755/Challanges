import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();  // Read the entire line as a string

        String reversedString = reverseString(input);

        System.out.println("Reversed String: " + reversedString);
        scanner.close();
    }

    // Helper method to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
