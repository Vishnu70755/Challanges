import java.util.LinkedList;
import java.util.Scanner;

public class StackOperations {
    private LinkedList<Integer> stack;
    private final int capacity;

    public StackOperations(int capacity) {
        this.stack = new LinkedList<>();
        this.capacity = capacity;
    }

    // Push operation
    public void push(int value) {
        if (stack.size() >= capacity) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stack.addFirst(value);
            System.out.println("Pushed: " + value);
        }
        displayStack();
    }

    // Pop operation
    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = stack.removeFirst();
        System.out.println("Popped: " + value);
        displayStack();
        return value;
    }

    // Peek operation
    public int peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = stack.getFirst();
        System.out.println("Peeked: " + value);
        return value;
    }

    // Display stack
    public void displayStack() {
        System.out.println("Current Stack: " + stack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack is " + (stack.isEmpty() ? "empty" : "not empty"));
        System.out.println("Stack is " + (stack.size() == capacity ? "full" : "not full"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 10; // Define capacity of the stack
        StackOperations stack = new StackOperations(capacity);

        // Adding elements to the stack using Scanner
        System.out.println("Enter the number of elements you want to push into the stack (max " + capacity + "):");
        int numElements = scanner.nextInt();

        for (int i = 0; i < numElements && i < capacity; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            stack.push(value);
        }

        // Pop and peek operations
        boolean continueOperations = true;
        while (continueOperations) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Pop");
            System.out.println("2. Peek");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        stack.pop();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        stack.peek();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    continueOperations = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
        scanner.close();
    }
}
