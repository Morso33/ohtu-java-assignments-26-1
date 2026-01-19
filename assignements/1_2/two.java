import java.util.Scanner;


public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter length of first leg: ");
        double a = scanner.nextDouble();
        System.out.print("Enter length of second leg: ");
        double b = scanner.nextDouble();
        double hypotenuse = Math.sqrt(a * a + b * b);
        
        
        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
}