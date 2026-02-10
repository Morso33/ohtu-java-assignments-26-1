package eduni.distributions;

import java.util.Random;

public class Negexp {
    private final double mean;
    private final Random random;

    public Negexp(double mean) {
        this(mean, new Random());
    }

    public Negexp(double mean, long seed) {
        this(mean, new Random(seed));
    }

    public Negexp(double mean, Random random) {
        if (mean <= 0) {
            throw new IllegalArgumentException("mean must be > 0");
        }
        this.mean = mean;
        this.random = random;
    }

    public double sample() {
        double u = random.nextDouble();
        if (u == 0.0) {
            u = Double.MIN_VALUE;
        }
        return -mean * Math.log(u);
    }
}
