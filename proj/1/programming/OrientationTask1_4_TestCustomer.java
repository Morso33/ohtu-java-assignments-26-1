public class OrientationTask1_4_TestCustomer {
    public static void main(String[] args) throws InterruptedException {
        Customer c1 = new Customer(System.nanoTime());
        Thread.sleep(100);
        c1.setEndTime(System.nanoTime());

        System.out.println("Customer ID: " + c1.getId());
        System.out.println("Time spent: " + c1.getTimeSpent() + " ns");
    }
}