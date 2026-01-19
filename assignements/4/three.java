import java.util.Scanner;


public class three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int[] uniqueArr = new int[size];
        int uniqueCount = 0;

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        System.out.println("\nThe array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }

        scanner.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}