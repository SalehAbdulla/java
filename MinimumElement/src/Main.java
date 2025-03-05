import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userWishToEnter = readInteger();
        int[] userDigits = readElements(userWishToEnter);
        int minDigit = findMin(userDigits);
        System.out.println("Min = " + minDigit);

    }

    private static int readInteger() {
        // How many element user wants to put in.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many digits would you like to enter ? ");
        int input = scanner.nextInt();
        return input;
    }


    private static int[] readElements(int len) {
        int[] array = new int[len];
        Scanner scanner = new Scanner(System.in);
        System.out.println("I Love Me");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            min = Math.min(min, element);
        }
        return min;
    }

}