import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Invoice {

    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat fmt = new DecimalFormat("#0.000");
    public static double totalBill = 0;
    public static double allPayments = 0;

    public static void main(String[] args) {


        boolean anotherItem = true;
//        char userInput = scanner.nextLine().toUpperCase().charAt(0);
        do {

            System.out.println("Enter Price");
            Scanner newBillScanner = new Scanner(System.in);

            double newBill = newBillScanner.nextDouble();
            totalBill += newBill;

            Scanner yesOrNoScanner = new Scanner(System.in);
            System.out.println("Another Item? enter Y or N");
            char yesOrNo = yesOrNoScanner.nextLine().toUpperCase().charAt(0);

            if (yesOrNo == 'Y') {
                continue;
            } else if (yesOrNo == 'N'){
                anotherItem = false;
                System.out.println("Total Due: " + totalBill);
                System.out.println("Enter Payment");
                Scanner getPaymentScanner = new Scanner(System.in);

                do {
                    double getPayment = getPaymentScanner.nextDouble();
                    allPayments += getPayment;
                    if (allPayments < totalBill) {
                        System.out.println("Insufficient Payment");
                        System.out.println("Total Due: " + totalBill);
                        System.out.println("Enter Payment");
                    }
                } while (allPayments < totalBill);

                if (allPayments >= totalBill) {
                    String change = fmt.format(Math.abs(totalBill - allPayments));
                    System.out.println("Paid In Full. Thank you for shoppping with ACME Store Your change is: " + change);
                }

            }


        } while (anotherItem);


    }


}
