import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeQueueOperations {
    private ArrayDeque<Integer> queue;

    public ArrayDequeQueueOperations() {
        queue = new ArrayDeque<>();
    }

    // Enqueue operation
    public void enqueue(int value) {
        queue.addLast(value);
        System.out.println("Enqueued: " + value);
        displayQueue();
    }

    // Dequeue operation
    public int dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = queue.removeFirst();
        System.out.println("Dequeued: " + value);
        displayQueue();
        return value;
    }

    // Peek operation
    public int peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = queue.getFirst();
        System.out.println("Peeked: " + value);
        return value;
    }

    // Display queue
    public void displayQueue() {
        System.out.println("Current Queue: " + queue);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is " + (queue.isEmpty() ? "empty" : "not empty"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDequeQueueOperations queue = new ArrayDequeQueueOperations();

        // Adding elements to the queue using Scanner
        System.out.println("Enter the number of elements you want to enqueue:");
        int numElements = scanner.nextInt();

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            queue.enqueue(value);
        }

        // Dequeue and peek operations
        boolean continueOperations = true;
        while (continueOperations) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Dequeue");
            System.out.println("2. Peek");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        queue.dequeue();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        queue.peek();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    continueOperations = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            }
        }
        scanner.close();
    }
}

