import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Printing the HashSet
        System.out.println("HashSet contents: " + set);

        // Checking if an element exists in the HashSet
        String elementToCheck = "Banana";
        if (set.contains(elementToCheck)) {
            System.out.println("The set contains " + elementToCheck);
        } else {
            System.out.println("The set does not contain " + elementToCheck);
        }

        // Removing an element from the HashSet
        set.remove("Date");
        System.out.println("HashSet after removing 'Date': " + set);
    }
}
