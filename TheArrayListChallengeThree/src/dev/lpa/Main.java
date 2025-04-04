package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> menuArrayList = new ArrayList<>();

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter items to add (comma delimited list):");
                    String[] itemsToAdd = getDelimitedData().split(",");
                    for (String item : itemsToAdd) {
                        menuArrayList.add(item.trim());
                    }
                    System.out.println("Updated list: " + menuArrayList);
                    break;

                case 2:
                    System.out.println("Enter items to remove (comma delimited list):");
                    String[] itemsToRemove = getDelimitedData().split(",");
                    for (String item : itemsToRemove) {
                        menuArrayList.remove(item.trim());
                    }
                    System.out.println("Updated list: " + menuArrayList);
                    break;

                case 0:
                    System.out.println("Shutting down...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void printMenu() {
        String menu = """
                Available actions:

                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)

                Enter a number for which action you want to do:
                """;

        System.out.print(menu);
    }

    public static String getDelimitedData() {
        return scanner.nextLine(); // Directly return user input
    }
}
