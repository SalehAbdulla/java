import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean willingToPurchase = true;
        while (willingToPurchase){

            System.out.println("Enter the carType of car G For Gas, H for Hybrid, E for Electric, C for CancelOrder ");
            String carType = s.nextLine();
            Car purchasedCar;

            if ("Cc".contains(carType)){
                System.out.println("Order Cancelled");
                willingToPurchase = false;
            }

            switch (carType){
                // case 'G' -> new GasPoweredCar(description, avgKmPerLitre, cylinders);
                case "G":
                    System.out.println("Enter the description of the car would you like to purchase: ");
                    String description = s.nextLine();

                    System.out.println("Enter the avgKmPerLitre of the car would you like to purchase: ");
                    double avgKmPerLitre = Double.parseDouble(s.nextLine());

                    System.out.println("Enter the number of car cylinders would you like to purchase: ");
                    int cylinders = Integer.parseInt(s.nextLine());

                    purchasedCar = Car.buyCar("G",description, avgKmPerLitre, cylinders);
                    break;

                case "H":
                    // HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize)

                    System.out.println("Enter the description of the car would you like to purchase: ");
                    String descriptionOfHybridCar = s.nextLine();

                    System.out.println("Enter the avgKmPerLitre of the car would you like to purchase: ");
                    double avgKmPerLitreOfHybridCar = Double.parseDouble(s.nextLine());

                    System.out.println("Enter the number of car's cylinders would you like to purchase: ");
                    int cylindersOfHybridCar = Integer.parseInt(s.nextLine());

                    System.out.println("Enter the car's battery size would you like to purchase: ");
                    int batterySizeOfHybridCar = Integer.parseInt(s.nextLine());

                    purchasedCar = Car.buyCar("H",descriptionOfHybridCar, cylindersOfHybridCar,
                            batterySizeOfHybridCar);
                    break;

                case "E":
                    // ElectricCar(String description, double avgKmPerCharge, int batterySize)
                    System.out.println("Enter the description of the car would you like to purchase: ");
                    String descriptionOfElectricCar = s.nextLine();

                    System.out.println("Enter the avgKmPerCharge of the car would you like to purchase: ");
                    double avgKmPerChargeOfElectricCar = Double.parseDouble(s.nextLine());


                    System.out.println("Enter the car's battery size would you like to purchase: ");
                    int batterySizeOfElectricCar = Integer.parseInt(s.nextLine());

                    purchasedCar = Car.buyCar("E",descriptionOfElectricCar, avgKmPerChargeOfElectricCar,
                            batterySizeOfElectricCar);
                    break;

                default:
                    System.out.println("Invalid car, please enter a valid entry.");
                    continue;
            }

            if (purchasedCar != null){
                System.out.println("Thank you for choosing us");
                System.out.println("Here is you order: " + purchasedCar.printPurchasedCar() + " 🚗");
                purchasedCar.printPurchasedCar();
                willingToPurchase = false;
            }
            s.close();
        }
    }
}