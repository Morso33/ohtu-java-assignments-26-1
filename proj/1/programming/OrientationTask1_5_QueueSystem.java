import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_5_QueueSystem {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose action: 1 = Queue, 2 = Dequeue, 0 = Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Customer c = new Customer(System.nanoTime());
                queue.addFirst(c);
                System.out.println("Customer " + c.getId() + " queued.");
            } else if (choice == 2) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    Customer c = queue.removeLast();
                    c.setEndTime(System.nanoTime());
                    System.out.println("Customer " + c.getId() +
                            " spent " + c.getTimeSpent() + " ns in queue.");
                }
            } else if (choice == 0) {
                break;
            }
        }
        scanner.close();
    }
}
