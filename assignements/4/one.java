import java.util.Random;
import java.util.Scanner;


public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] firstNames = {"John", "Emma", "Liam", "Olivia", "Noah", "Ava"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Taylor", "Anderson", "Wilson"};

        System.out.print("How many random names should be generated? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int firstIndex = random.nextInt(firstNames.length);
            int lastIndex = random.nextInt(lastNames.length);

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];
            System.out.println(fullName);
        }

        scanner.close();
    }
}