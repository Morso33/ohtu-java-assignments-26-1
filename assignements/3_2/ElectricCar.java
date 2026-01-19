public class ElectricCar extends AbstractVehicle {
    private String color;

    public ElectricCar(String color, double fuelEfficiency) {
        super("Electric", fuelEfficiency);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("ElectricCar is charging...");
    }

    @Override
    public String getInfo() {
        return "Type: Electric Car\nFuel: Electric\nColor: " + color + "\nFuel Efficiency: " + fuelEfficiency + " kWh/km";
    }
}