import java.time.Year;
import java.util.*;

public class CarsClub {
    private LinkedHashMap<Long, Owner> owners;
    private HashMap<String, Car> cars;
    private long ownersIdCounter;

    public CarsClub() {
        this.owners = new LinkedHashMap<>();
        this.cars = new HashMap<>();
    }

    public void addOwner() {
        String userName = promptUsersName();
        String userPhoneNumber = promptUsersPhone();
        // Since the relationship is 1 to many, then we must have at least 1 car
        // to add the user, thus, we're going to ask for car information as well here
        System.out.println("Hi, " + userName +", \nTo be a member of our club, you must at least have 1 classic car, please provide us with the following.");

        // I THINK ASKING THE USER IF HE HAS A CAR OR NOT, IF YES WE PROCEED, NOT RETURN - STILL NOT IMPLEMENTED
        Car ownerCar = promptUserToAddCar();

        long newId = ownersIdCounter + 1L;
        ownersIdCounter++;

        Owner newOwner = new Owner(newId , userName, userPhoneNumber, ownerCar);
        owners.put(newId, newOwner);
        cars.put(ownerCar.getRegistration(), ownerCar);

        System.out.println("new owner added successfully");
        System.out.println("======= Here is the detail registered: ======= \n");
        System.out.println("Name: " + newOwner.getOwnerName());
        System.out.println("Phone: " +  newOwner.getOwnerPhone());
        System.out.println("Car Brand: " + ownerCar.getMake() + " | Car Model: " + ownerCar.getModel() + " | Year: " + ownerCar.getYear());
        System.out.println("-".repeat(20));
    }

    private Car promptUserToAddCar(){

        String registration = "";
        String make = "";
        String model = "";
        int year = 0;
        double mileage = 0.0;

            do {
                System.out.println("please insert the car registration plate (plate number)");
                registration = AntiqueCarsDriver.scanner.next().trim();
                if (registration.isEmpty()) {
                    System.out.println("registration cannot be empty, try again");
                } else if (registration.length() > 20) {
                    System.out.println("registration should not exceed 20 length!");
                    registration = "";
                }
            } while(registration.isEmpty());

            do {
                System.out.println("please insert the car make (brand, ex,. TOYOTA)");
                make = AntiqueCarsDriver.scanner.next().trim();
                if (make.isEmpty()) {
                    System.out.println("brand cannot be empty, try again");
                } else if (make.length() > 10) {
                    System.out.println("make should not exceed 10 length!");
                    make = "";
                }
            } while (make.isEmpty());

            do {
                System.out.println("please insert the car model (ex,. CAMRY)");
                model = AntiqueCarsDriver.scanner.next().trim();
                if (model.isEmpty()) {
                    System.out.println("model cannot be empty, try again");
                } else if (model.length() > 10) {
                    System.out.println("model should not exceed 10 length!");
                    model = "";
                }

            } while (model.isEmpty());

            do {
                System.out.println("please insert the car year (ex,. 1940)");
                try {
                    year = Integer.parseInt(AntiqueCarsDriver.scanner.next());
                } catch (InputMismatchException e) {
                    System.out.println("invalid entry, please insert a number");
                }

                if (year < 1800 || year > Year.now().getValue()) {
                    System.out.println("Year cannot be less than 1800 or greater than current year!, please insert the correct year");
                    year = 0;
                }

            } while (year == 0);


            do {
                try {
                    System.out.println("please insert the car mileage (ex,. 200.22)");
                    mileage = Double.parseDouble(AntiqueCarsDriver.scanner.next());
                } catch (InputMismatchException e) {
                    System.out.println("mileage must be a decimal place number (ex,. 200.22) ");
                }
            } while(mileage == 0.0);

        return new Car(registration, make, model, year, mileage);

    }

    private Long promptOwnerId(){
        long ownerId = 0L;
        do {
            try {
                ownerId = Long.parseLong(AntiqueCarsDriver.scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("owner Id must be a number please re-insert the owner id");
            }
        } while(ownerId == 0);
        return ownerId;
    }

    private String promptUsersName() {
        String result;

        do {
            System.out.println("Please insert member's name:");

            result = AntiqueCarsDriver.scanner.nextLine().trim();

            if (!result.matches("[A-Za-z '-]{2,50}")) {
                System.out.println("Error: name must be 2–50 characters and contain letters only.");
                result = "";
            }

        } while (result.isEmpty());

        return result.toUpperCase();
    }

    private String promptUsersPhone() {
        String result;

        do {
            System.out.println("Please insert member's phone number: (e.g, 38383838) number must by 8 digits only.");

            result = AntiqueCarsDriver.scanner.nextLine().trim();

            if (!result.matches("\\d{8}")) {
                System.out.println("Error: number must be exactly 8 digits (e.g., 38383838).");
                result = "";
            }

        } while (result.isEmpty());

        return result;
    }

    public void printAllOwnersInfo(){
        if (owners.isEmpty()) {
            System.out.println("Warning: no user registered yet!");
        }
        for (Map.Entry<Long, Owner> entry : owners.entrySet()) {
            System.out.println("\n\n======= Here is the details registered for " + entry.getValue().getOwnerName() + ": ======= \n");
            System.out.println("ID: " +  entry.getValue().getOwnerId());
            System.out.println("NAME: " + entry.getValue().getOwnerName());
            System.out.println("PHONE: " +  entry.getValue().getOwnerPhone());
            System.out.println("Owners Cars: ");
            for (Map.Entry<String, Car> carEntry : entry.getValue().getOwnerCars().entrySet()) {
                System.out.println("Car Brand: " + carEntry.getValue().getMake() + " | Car Model: " + carEntry.getValue().getModel() + " | Year: " + carEntry.getValue().getYear());
            }
            System.out.println("-".repeat(20));
        }
    }

    private void addCarToOwnerList(Long ownerId) {
        Car userCar = promptUserToAddCar();
        Owner getOwner = owners.get(ownerId);
        if (getOwner != null) {
            Optional<String> optionalCar = getOwner
                    .getOwnerCars().entrySet().stream()
                    .filter(c -> c.getValue().getRegistration().equals(userCar.getRegistration())).findFirst().get().getValue().getRegistration().describeConstable();
            if (optionalCar.isPresent()) {
                System.out.println("Warning: This car registration is already exists, we will over write the information");
            }
            getOwner.addCarToOwnerCarsList(userCar);
        } else {
            System.out.println("invalid owner id, please try again");
            return;
        }
        System.out.println("A car added successfully to owner name: " + getOwner.getOwnerName());
    }

    public void addCarToOwnerList() {

        boolean checkAndPrintOwners = checkAndPrintOwners();
        if (!checkAndPrintOwners) return;

        System.out.println("Please insert the owner id you would like to assign the car to");

        Long ownerId = promptOwnerId();

        Owner getOwner = owners.get(ownerId);

        if (getOwner == null) {
            System.out.println("invalid owner id, please try again");
            return;
        }

        addCarToOwnerList(ownerId);


    }


    private void setCarForSale(Long OwnerId, Car car) {
//        owners.entrySet().stream().findFirst().get().getValue().setCarForSale(car);
    }


    public void setCarForSale() {
        boolean checkAndPrintOwners = checkAndPrintOwners();
        if (!checkAndPrintOwners) return;

        Long ownerId = promptOwnerId();
        if (owners.get(ownerId) == null) {
            System.out.println("invalid owner id, please try again");
            return;
        }

        // prompt the user for a car to be sold
        // car must be registered already, and with ownership!

        

//        setCarForSale(ownerId, car);
    }


    public boolean checkAndPrintOwners(){
        if (owners.isEmpty()) {
            System.out.println("You cannot add a car without an owner, please add owners to the list first!");
            return false;
        }

        System.out.println("\n======= OWNERS LIST =======");
        for (Map.Entry<Long, Owner> owner : owners.entrySet()){
            System.out.println("OWNER ID: " + owner.getValue().getOwnerId() + " OWNER NAME: " + owner.getValue().getOwnerName());
        }

        System.out.println("-".repeat(20));
        return true;
    }



}
