import java.util.*;

public class CarsClub {
    private LinkedHashMap<Long, Owner> owners;
    private HashMap<Long, Car> cars;
    private long ownersIdCounter;

    public LinkedHashMap<Long, Owner> getOwners() {
        return owners;
    }

    public void setOwners(LinkedHashMap<Long, Owner> owners) {
        this.owners = owners;
    }

    public HashMap<Long, Car> getCars() {
        return cars;
    }

    public void setCars(HashMap<Long, Car> cars) {
        this.cars = cars;
    }

    public long getOwnersIdCounter() {
        return ownersIdCounter;
    }

    public void setOwnersIdCounter(long ownersIdCounter) {
        this.ownersIdCounter = ownersIdCounter;
    }

    public CarsClub() {
        this.owners = new LinkedHashMap<>();
        this.cars = new HashMap<>();
        this.ownersIdCounter = 1;
    }

    public void addOwner() {
        String userName = promptUsersName();
        String userPhoneNumber = promptUsersPhone();
        ownersIdCounter++;
        long newId = ownersIdCounter + 1L;
        owners.put(newId, new Owner(newId , userName, userPhoneNumber));
        System.out.println("new owner added successfully");
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
            System.out.println("Please insert member's phone number:");

            result = AntiqueCarsDriver.scanner.nextLine().trim();

            if (!result.matches("\\d{8}")) {
                System.out.println("Error: number must be exactly 8 digits (e.g., 38383838).");
                result = "";
            }

        } while (result.isEmpty());

        return result;
    }

}
