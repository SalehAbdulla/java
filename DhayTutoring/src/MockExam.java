import java.util.Scanner;

public class MockExam {
    public static void main(String[] args) {

    }

    public static void sumOfEven() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        do {
            System.out.println("Enter a number (0 to quit):");
            int userInput = scanner.nextInt();
            if (userInput == 0) break;
            if (userInput % 2 == 0) {
                sum += userInput;
            }

        } while (true);

        System.out.println("The sum of even numbers is " + sum);
    }
}
