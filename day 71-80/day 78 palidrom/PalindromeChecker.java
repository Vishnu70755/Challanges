import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine(); // Read the input string

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Helper method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Not a palindrome if mismatch found
            }
            i++;
            j--;
        }
        return true; // Is a palindrome
    }
}
