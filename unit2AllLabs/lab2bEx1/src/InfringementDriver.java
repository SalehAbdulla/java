import java.util.ArrayList;
import java.util.Scanner;

public class InfringementDriver {

    public static void main(String[] args) {
        System.out.println("\n" + "-".repeat(10) + " Infringement Driver App " + "-".repeat(10));
        System.out.println("\n\t\t\tWelcome to Infringement Driver App");
        System.out.println("\t\t\tFollow the instruction: ");
        System.out.println("\t\t\tYou will be asked to enter the information 5 times\n");
        System.out.println("-".repeat(30));
        ArrayList<Infringement> infringements = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            int counter = i + 1;
            System.out.println("Entry Number " + counter + ":");
            System.out.print("\n\t\t\tEnter the Infringement type: ");
            String type = scanner.nextLine();

            System.out.print("\n\t\t\tEnter the Infringement time: ");
            String time = scanner.nextLine();

            System.out.print("\n\t\t\tEnter the Infringement place: ");
            String place = scanner.nextLine();

            System.out.print("\n\t\t\tEnter the Infringement fineAmount: ");
            double fineAmount = scanner.nextDouble();

            scanner.nextLine();

            System.out.print("\n\t\t\tEnter the Name: ");
            String name = scanner.nextLine();

            Infringement infringement = new Infringement(type, time, place, fineAmount, name);
            infringements.add(infringement);
        }

        for (Infringement in : infringements) {
            in.printInfringement();
        }

    }
}
