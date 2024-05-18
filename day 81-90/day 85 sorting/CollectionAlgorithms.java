import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionAlgorithms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();

        // Prompt user to input 10 integers
        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            intList.add(number);
        }

        // Sorting the ArrayList
        Collections.sort(intList);
        System.out.println("Sorted integer list: " + intList);

        // Shuffling the ArrayList
        Collections.shuffle(intList);
        System.out.println("Shuffled integer list: " + intList);

        // Reversing the sorted ArrayList
        Collections.sort(intList); // Ensure the list is sorted before reversing
        Collections.reverse(intList);
        System.out.println("Reversed sorted integer list: " + intList);

        scanner.close();
    }
}
