public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Demonstration ===\n");

        AbstractVehicle car = new CarAlt("Petrol", "Red", 15.0);
        AbstractVehicle motorcycle = new Motorcycle("Petrol", "Black");
        AbstractVehicle bus = new BusAlt("Diesel", 40, 8.0);
        AbstractVehicle eCar = new ElectricCar("Blue", 0.2);
        AbstractVehicle eMotorcycle = new ElectricMotorcycle("Green");

        AbstractVehicle[] vehicles = {car, motorcycle, bus, eCar, eMotorcycle};

        for (AbstractVehicle v : vehicles) {
            v.start();
            v.stop();
            System.out.println(v.getInfo());
            v.charge();
            System.out.println("Fuel Efficiency: " + v.calculateFuelEfficiency() + (v.fuel.equals("Electric") ? " kWh/km" : " km/l"));
            System.out.println();
        }
    }
}
