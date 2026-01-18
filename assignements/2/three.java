import java.util.Scanner;


public class three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g): ");
        double grams = scanner.nextDouble();
        double gramsPerLuoti = 13.28;
        int luotiPerNaula = 32;
        int naulaPerLeiviska = 20;
        double totalLuoti = grams / gramsPerLuoti;   
        int leiviska = (int) (totalLuoti / (luotiPerNaula * naulaPerLeiviska));
        totalLuoti -= leiviska * luotiPerNaula * naulaPerLeiviska;
        int naula = (int) (totalLuoti / luotiPerNaula);
        totalLuoti -= naula * luotiPerNaula;
        double luoti = totalLuoti;
        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
        grams, leiviska, naula, luoti);
    }
}