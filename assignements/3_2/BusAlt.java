public class BusAlt extends AbstractVehicle {
    private int capacity;

    public BusAlt(String fuel, int capacity, double fuelEfficiency) {
        super(fuel, fuelEfficiency);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return "Type: Bus\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers\nFuel Efficiency: " + fuelEfficiency + " km/l";
    }
}
