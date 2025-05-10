import java.util.Scanner;

public class Lab4BQ1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num1 = readNumber();
        System.out.println("Enter a number:");
        int num2 = readNumber();
        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
    }

    public static int readNumber() {
        return scanner.nextInt();
    }

    public static void add(int num1, int num2) {
        System.out.println("Sum is: " + (num1 + num2));
    }

    public static void subtract(int num1, int num2) {
        System.out.println("Difference is: " + (num1 - num2));
    }

    public static void multiply(int num1, int num2) {
        System.out.println("Product is: " + (num1 * num2));
    }

}
