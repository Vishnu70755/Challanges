import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeMap of String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding some key-value pairs to the TreeMap
        treeMap.put("Orange", 45);
        treeMap.put("Grape", 35);
        treeMap.put("Mango", 25);
        treeMap.put("Peach", 55);
        treeMap.put("Plum", 15);

        // Printing the TreeMap
        System.out.println("Initial TreeMap: " + treeMap);

        // Checking if a key exists in the TreeMap
        String keyToCheck = "Mango";
        if (treeMap.containsKey(keyToCheck)) {
            System.out.println("The TreeMap contains key: '" + keyToCheck + "' with value: " + treeMap.get(keyToCheck));
        } else {
            System.out.println("The TreeMap does not contain key: '" + keyToCheck + "'");
        }

        // Iterating over the TreeMap to print all key-value pairs
        System.out.println("All entries in the TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
