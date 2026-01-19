public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName); // call Car constructor
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            // faster acceleration: +20 instead of +10
            for (int i = 0; i < 2; i++) {
                super.accelerate();
            }
            consumeFuel(15); // higher fuel consumption
        }
    }

    @Override
    void decelerate(int amount) {
        // stronger braking
        super.decelerate(amount * 2);
        consumeFuel(5); // braking also consumes more fuel
    }

    private void consumeFuel(double amount) {
        // simulate higher fuel usage
        double fuel = getGasolineLevel() - amount;
        if (fuel < 0) fuel = 0;

        // refill logic workaround: empty then refill remaining
        super.fillTank();
        for (int i = 0; i < 100 - fuel; i++) {
            // fake usage by accelerating until fuel matches
            super.accelerate();
        }
    }
}