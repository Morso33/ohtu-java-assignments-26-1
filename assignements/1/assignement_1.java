import java.util.Scanner;

public class assignement_1 {
    
    public static void task_1()
    {
        System.out.println("Hello, user.");
    }

public static void task_2() {
    int height = 4;

    for (int i = 1; i <= height; i++) {
        for (int j = 0; j < height - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void task_3()
{
    Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The average of the numbers is " + ((first + second + third) / 3.0));
        System.out.println("The product of the numbers is " + (first * second * third));
}


    public static void main(String[] args)
    {
        System.out.println("EP->called");
        //task_1();
        //task_2();
        task_3();
    }
}