import java.text.DecimalFormat;
import java.util.Scanner;

public class Invoice {

    public static Scanner scanner = new Scanner(System.in);
    public static double totalAmountDue;
    public static double userPayment;

    public static void main(String[] args) {

        DecimalFormat fmt = new DecimalFormat("#0.000");
        boolean endLoop = false;

        while (!endLoop) {
            System.out.println("Enter Price");
            totalAmountDue += scanner.nextDouble();

            System.out.println("Another item? enter Y or N");
            char userInput = scanner.nextLine().toUpperCase().charAt(0);
            switch (userInput) {
                case 'Y':

                    double billAmount = scanner.nextDouble();
                    totalAmountDue += billAmount;
                    break;
                case 'N':
                    System.out.println("Total due: " + totalAmountDue);

                    do {
                        userPayment += getPayment();
                    } while (userPayment >= totalAmountDue);

                    System.out.println("Paid in full. Thank you for shoppping with ACME Store Your change is: " + fmt.format(userPayment - totalAmountDue));
                    break;

                default:
                    System.out.println("Invalid entry");
            }

            System.out.println("Another item? enter Y or N");

        }

    }

    public static double getPayment() {
        System.out.println("Enter payment");
        return scanner.nextDouble();
    }
}
