public class ElectricMotorcycle extends AbstractVehicle {
    private String color;

    public ElectricMotorcycle(String color) {
        super("Electric", 0);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("ElectricMotorcycle is charging...");
    }

    @Override
    public String getInfo() {
        return "Type: Electric Motorcycle\nFuel: Electric\nColor: " + color;
    }
}