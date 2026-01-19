public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String fuel, String color) {
        super(fuel, 5);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Type: Motorcycle\nFuel: " + fuel + "\nColor: " + color;
    }
}