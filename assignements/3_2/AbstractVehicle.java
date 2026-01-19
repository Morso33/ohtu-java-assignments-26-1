public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String fuel;
    protected double fuelEfficiency;

    public AbstractVehicle(String fuel, double fuelEfficiency) {
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName() + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " is stopping...");
    }

    @Override
    public void charge() {
        System.out.println(getClass().getSimpleName() + ": Not possible to charge.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}
