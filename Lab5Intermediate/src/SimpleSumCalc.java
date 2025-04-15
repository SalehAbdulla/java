import java.util.Scanner;

public class SimpleSumCalc {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sumOfEven();
    }

    public static void sumOfEven(){
        // I have got to do
        int total = 0;
        // I'm MEEE
        while (true) {
            System.out.println("Enter a number (0 to quit):");
            int userInput = scanner.nextInt();
            // PUSHHHHHHHHHHHHHHHH
            if (userInput %2 == 0) total += userInput;
            // PUSHHHHHHHHHHHHHHHH
            if (userInput == 0) break;
        }
        // I"M THE BEST
        System.out.println("The sum of even numbers is " + total);

    }

}
