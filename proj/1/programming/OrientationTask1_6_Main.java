public class OrientationTask1_6_Main {
    public static void main(String[] args) throws InterruptedException {
        ServicePoint sp = new ServicePoint();
        CustomerGenerator.generateCustomers(sp, 5);

        sp.serve();

        System.out.println("Average service time: " +
                sp.getAverageServiceTime() + " ns");
    }
}
