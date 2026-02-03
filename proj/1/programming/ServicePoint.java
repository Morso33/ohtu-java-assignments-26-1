import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime = 0;
    private int servedCustomers = 0;

    public void addToQueue(Customer c) {
        queue.addFirst(c);
    }

    public Customer removeFromQueue() {
        return queue.removeLast();
    }

    public void serve() throws InterruptedException {
        while (!queue.isEmpty()) {
            Customer c = removeFromQueue();
            long serviceStart = System.nanoTime();

            long serviceTime = (long) (Math.random() * 1_000_000_000);
            Thread.sleep(serviceTime / 1_000_000);

            long serviceEnd = System.nanoTime();

            long waitingTime = serviceStart - c.getStartTime();
            long responseTime = waitingTime + (serviceEnd - serviceStart);

            totalServiceTime += (serviceEnd - serviceStart);
            servedCustomers++;

            System.out.println("Customer " + c.getId());
            System.out.println("Service time: " + (serviceEnd - serviceStart) + " ns");
            System.out.println("Response time: " + responseTime + " ns\n");
        }
    }

    public double getAverageServiceTime() {
        return (double) totalServiceTime / servedCustomers;
    }
}
