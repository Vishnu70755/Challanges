import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Printing the initial LinkedList
        System.out.println("Initial LinkedList: " + list);

        // Removing elements from the LinkedList
        list.remove("Banana"); // Remove by object
        list.remove(1);        // Remove by index (after Banana is removed, 'Date' is at index 1)

        // Printing the LinkedList after removals
        System.out.println("LinkedList after removals: " + list);

        // Finding the size of the LinkedList
        System.out.println("Size of the LinkedList: " + list.size());

        // Retrieve an element at a specific position
        System.out.println("Element at position 0: " + list.get(0));

        // Update an element at a specific position
        list.set(0, "Apricot");
        System.out.println("Updated LinkedList: " + list);
    }
}
