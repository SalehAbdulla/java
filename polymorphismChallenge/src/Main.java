import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the car type: G for Gas, H for Hybrid, E for Electric, C to cancel order");
            String carType = s.nextLine().trim().toUpperCase(); // Normalize input

            if (carType.equals("C")) {
                System.out.println("Order cancelled.");
                break;
            }

            Car userPurchasedCar = null; // Store the car object

            switch (carType) {
                case "G":  // GasPoweredCar
                    System.out.print("Enter number of cylinders: ");
                    int cylinders = Integer.parseInt(s.nextLine());

                    System.out.print("Enter avg Km per litre: ");
                    double avgKmPerLitre = Double.parseDouble(s.nextLine());

                    System.out.print("Enter description: ");
                    String description = s.nextLine();

                    userPurchasedCar = Car.buyCar("G", description, avgKmPerLitre, cylinders);
                    break;

                case "H":  // HybridCar
                    System.out.print("Enter number of cylinders: ");
                    cylinders = Integer.parseInt(s.nextLine());

                    System.out.print("Enter avg Km per litre: ");
                    avgKmPerLitre = Double.parseDouble(s.nextLine());

                    System.out.print("Enter battery size: ");
                    int batterySize = Integer.parseInt(s.nextLine());

                    System.out.print("Enter description: ");
                    description = s.nextLine();

                    userPurchasedCar = Car.buyCar("H", description, avgKmPerLitre, cylinders, batterySize);
                    break;

                case "E":  // ElectricCar
                    System.out.print("Enter avg Km per charge: ");
                    int avgKmPerCharge = Integer.parseInt(s.nextLine());

                    System.out.print("Enter battery size: ");
                    batterySize = Integer.parseInt(s.nextLine());

                    System.out.print("Enter description: ");
                    description = s.nextLine();

                    userPurchasedCar = Car.buyCar("E", description, avgKmPerCharge, batterySize);
                    break;

                default:
                    System.out.println("Invalid car type! Try again.");
                    continue; // Restart loop
            }

            // Display the purchased car
            System.out.println("You have purchased: " + userPurchasedCar.carPurchased());
        }

        s.close(); // Close scanner
    }

}
