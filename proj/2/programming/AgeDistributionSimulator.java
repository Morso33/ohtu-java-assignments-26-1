public class AgeDistributionSimulator {

    static final int RUNS = 1000;
    static final int MAX_AGE = 30;

    // cumulative %, age
    static int[][] ageDistribution = {
        {15, 20},
        {35, 21},
        {55, 22},
        {75, 23},
        {90, 24},
        {100, 25}
    };

    public static void main(String[] args) {
        int[] generatedAges = new int[MAX_AGE + 1];

        for (int i = 0; i < RUNS; i++) {
            int r = (int) (Math.random() * 100) + 1;
            int row = 0;
            while (r > ageDistribution[row][0]) {
                row++;
            }
            int age = ageDistribution[row][1];
            generatedAges[age]++;
        }

        System.out.println("Age  Count   Percentage");
        for (int age = 0; age <= MAX_AGE; age++) {
            if (generatedAges[age] > 0) {
                System.out.printf("%-4d %-6d %.2f%%\n",
                        age,
                        generatedAges[age],
                        100.0 * generatedAges[age] / RUNS);
            }
        }
    }
}
