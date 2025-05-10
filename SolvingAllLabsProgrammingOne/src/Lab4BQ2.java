import javax.swing.*;

public class Lab4BQ2 {
    public static void main(String[] args) {
        printDescendingOrder(1, 2, 3);
    }

    public static void printDescendingOrder(int num1, int num2, int num3) {
        // smaller small big
        if (num3 > num2 && num2 > num1) {
            System.out.printf("Values in descending order are: %d %d %d %n", num3, num2, num1);
        }
        // smaller big small
        else if (num2 > num3 && num3 > num1) {
            System.out.printf("Values in descending order are: %d %d %d %n", num2, num3, num1);
        }
        // small smaller big
        else if (num3 > num1 && num1 > num2) {
            System.out.printf("Values in descending order are: %d %d %d %n", num3, num1, num2);
        }
        // small big smaller
        else if (num2 > num1 && num1 > num3) {
            System.out.printf("Values in descending order are: %d %d %d %n", num2, num1, num3);
        }
        // big smaller small
        else if (num1 > num3 && num3 > num2) {
            System.out.printf("Values in descending order are: %d %d %d %n", num1, num3, num2);
        }
        // big small smaller
        else if (num1 > num2 && num2 > num3) {
            System.out.printf("Values in descending order are: %d %d %d %n", num1, num2, num3);
        }
    }
}
