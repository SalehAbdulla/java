import java.util.InputMismatchException;
import java.util.Scanner;

public class AntiqueCarsDriver {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n\n\n\tWelcome to Antique Cars Club, where you see the best cars in the world!\n\n\n");
        boolean isOn = true;

        while (isOn) {

            int userInput = getMenu();

            switch (userInput) {
                case 1:
                    // TODO: Add Owner to the system
                    System.out.println("user choice is 1");
                    // owner.addOwnerToTheSystem();
                    break;
                case 2:
                    // TODO: Add car to Owners list of cars
                    System.out.println("user choice is 2");
                    // owner.addCarToOwnersList();
                    break;
                case 3:
                    // TODO: List an owners cars
                    System.out.println("user choice is 3");
                    // owner.listOwnersCars;
                    break;
                case 4:
                    // TODO: Set car for sale
                    System.out.println("user choice is 4");
                    // owner.setCarForSale();
                    break;
                case 5:
                    // TODO: Organize a test drive of a car
                    System.out.println("user choice is 5");
                    // owner.setCarForTestDrive();
                    break;
                case 6:
                    System.out.println("user choice is 6");
                    System.out.println("Thank you, exiting...");
                    isOn = false;
                    break;
                default:
                    System.out.println("Unknow choice");
                    break;
            }
        }
    }

    public static int getMenu() {
        int userInput = 0;

            do {
                System.out.println("""
                        Please choose an option from the following menu:
                            1. Add Owner to the system
                            2. Add car to Owners list of cars
                            3. List an owners cars
                            4. Set car for sale
                            5. Organize a test drive of a car
                            6. Exit
                        """);

                try {
                    userInput = scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("error: invalid entry, you must insert a number");
                    continue;
                }

                if (userInput < 1 || userInput > 6) {
                    userInput = 0;
                    System.out.println("error: please insert (between 1 to 6)");
                }

            } while (userInput == 0);

        return userInput;
    }

}
