import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Owner {
    private long ownerId;
    private String ownerName;
    private String ownerPhone;
    private Car carForSale;
    private Car carForTestDrive;
    private HashMap<Long, Car> ownerCars = new HashMap<Long, Car>();

    public Owner() {
        this(-1, "unknown", "38383838", null, null);
    }

    public Owner(long ownerId, String ownerName, String ownerPhone) {
        this(ownerId, ownerName, ownerPhone, null, null);
    }

    public Owner(long ownerId, String ownerName, String ownerPhone, Car carForSale, Car carForTestDrive) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.carForSale = carForSale;
        this.carForTestDrive = carForTestDrive;
    }

    public HashMap<Long, Car> getOwnerCars() {
        return ownerCars;
    }

    public void setOwnerCars(HashMap<Long, Car> ownerCars) {
        this.ownerCars = ownerCars;
    }


    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public Car getCarForSale() {
        return carForSale;
    }

    public void setCarForSale(Car carForSale) {
        this.carForSale = carForSale;
    }

    public Car getCarForTestDrive() {
        return carForTestDrive;
    }

    public void setCarForTestDrive(Car carForTestDrive) {
        this.carForTestDrive = carForTestDrive;
    }

}