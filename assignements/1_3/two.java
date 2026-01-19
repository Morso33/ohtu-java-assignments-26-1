import java.util.Scanner;


public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);
            decimal = decimal * 2 + (bit - '0');
        }

        System.out.println("Decimal value: " + decimal);
        scanner.close();
    }
}