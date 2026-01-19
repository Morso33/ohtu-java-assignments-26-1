public class CarAlt extends AbstractVehicle {
    private String color;

    public CarAlt(String fuel, String color, double fuelEfficiency) {
        super(fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Type: Car\nFuel: " + fuel + "\nColor: " + color + "\nFuel Efficiency: " + fuelEfficiency + " km/l";
    }
}
