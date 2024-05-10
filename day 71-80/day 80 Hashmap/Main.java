import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding some key-value pairs to the HashMap
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Cherry", 20);
        map.put("Date", 40);
        map.put("Elderberry", 10);

        // Printing the HashMap
        System.out.println("Current HashMap: " + map);

        // Checking if a key exists in the HashMap
        String keyToCheck = "Cherry";
        if (map.containsKey(keyToCheck)) {
            System.out.println("The map contains key: '" + keyToCheck + "' with value: " + map.get(keyToCheck));
        } else {
            System.out.println("The map does not contain key: '" + keyToCheck + "'");
        }

        // Iterating over the HashMap to print all key-value pairs
        System.out.println("All entries in the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
