import java.util.Scanner;


public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < size; i++) {
            int currentSum = 0;
            for (int j = i; j < size; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));

        scanner.close();
    }
}