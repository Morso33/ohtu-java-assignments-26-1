import java.util.Scanner;


public class four {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        while (true) {
            int score = 0;

            for (int i = 1; i <= 10; i++) {
                int a = (int) (Math.random() * 10) + 1;
                int b = (int) (Math.random() * 10) + 1;

                System.out.print("Question " + i + ": " + a + " x " + b + " = ");
                int answer = scanner.nextInt();

                if (answer == a * b) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + (a * b));
                }
            }

            System.out.println("Your score: " + score + "/10");

            if (score == 10) {
                System.out.println("Congratulations! You have mastered the multiplication tables!");
                break;
            } else {
                System.out.println("Try again!\n");
            }
        }

        scanner.close();
    }
}