public class CustomerGenerator {

    public static void generateCustomers(ServicePoint sp, int amount) {
        for (int i = 0; i < amount; i++) {
            Customer c = new Customer(System.nanoTime());
            sp.addToQueue(c);
        }
    }
}
