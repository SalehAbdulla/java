import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {

        Service service;
        Part part;

        int partOrCarWash = 0;
        do {
            System.out.println("""
                        ACME GARAGE SALES
                        1.Part
                        2.CarWash
                    """);

            try {
                partOrCarWash = Integer.parseInt(scanner.next());
                if (partOrCarWash != 1 && partOrCarWash != 2) {
                    System.out.println("Please enter 1 for Part and 2 for Car wash");
                    partOrCarWash = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("entry must be a number");
            }

        } while (partOrCarWash == 0);

        // if car wash, just give it a price 10$.
        if (partOrCarWash == 2) {
            service = new CarWash(10);
            System.out.printf("Price: %.1f$ ", service.getPrice());
            exit(0);
        }

        // Part logic

        // it must be 1 for part, either a tire or exhaust
        int tyreOrExhaust = 0;

        do {
            System.out.println("""
                        1.Tyre
                        2.Exhaust
                    """);

            try {
                tyreOrExhaust = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Your entry must be a number!");
            }

            if (tyreOrExhaust != 1 && tyreOrExhaust != 2) {
                System.out.println("Please enter 1 or 2");
                tyreOrExhaust = 0;
            }

        } while (tyreOrExhaust == 0);


        int quantity = 0;
        System.out.println("""
                  Please Enter Quantity:
                """);
        do {
            try {
                quantity = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("input must be a number");
            }
        } while (quantity == 0);

        Part tyreOrExhaustPurchase = tyreOrExhaust == 1 ?
                new Tyre(100, 20, quantity) :
                new Exhaust(50, 40, quantity);

        int saleOrSaleAndFit = 0;
        do {
            System.out.println("""
                    1. Sale Only
                    2. Sale and fit
                    """);
            try {
                saleOrSaleAndFit = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("input must be a number");
            }

            if (saleOrSaleAndFit != 1 && saleOrSaleAndFit != 2) {
                System.out.println("input must be either 1 or 2");
                saleOrSaleAndFit = 0;
            }

        } while (saleOrSaleAndFit == 0);

        // either way we are selling as many time as the quantity
        for (int i = 0; i < quantity; i++) {
            tyreOrExhaustPurchase.sell();
        }

        if (saleOrSaleAndFit == 2) {
            service = new PartFit(tyreOrExhaustPurchase, 25);

            // Print price and Stock
            double calcPrice = service.getPrice() + tyreOrExhaustPurchase.getPrice()*quantity;
            System.out.printf("Price: %.2f%n", calcPrice);
            System.out.println("Stock Level for " + tyreOrExhaustPurchase.getClass().getName() + " is " + tyreOrExhaustPurchase.getStock());
            exit(0);
        }

        //, then sale only, Print price and Stock
        double calcPrice = (tyreOrExhaustPurchase.getPrice() * quantity);
        System.out.printf("Price: %.2f%n ", calcPrice);
        System.out.println("Stock Level for " + tyreOrExhaustPurchase.getClass().getName() + " is " + tyreOrExhaustPurchase.getStock());

    }
}


//Assume the following at the start of the program:
//        ◦ Tyre stock level: 100
//        ◦ Tyre price: 20 -- $
//        ◦ Exhaust stock level: 50
//        ◦ Exhaust price: 40 -- $
//        ◦ Fitting an exhaust or up to 4 tyres: 25$  (no need to validate for number of  tyres)