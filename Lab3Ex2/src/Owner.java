import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Owner {
    private long ownerId;
    private String ownerName;
    private String ownerPhone;
    private Car carForSale;
    private Car carForTestDrive;
    private HashMap<String, Car> ownerCars = new HashMap<String, Car>();


    public Owner(long ownerId, String ownerName, String ownerPhone, Car car) {
        this(ownerId, ownerName, ownerPhone, null, null, car);
    }

    public Owner(long ownerId, String ownerName, String ownerPhone, Car carForSale, Car carForTestDrive, Car car) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.carForSale = carForSale;
        this.carForTestDrive = carForTestDrive;
        ownerCars.put(car.getRegistration(), car);
        car.setOwner(this);
    }

    public HashMap<String, Car> getOwnerCars() {
        return ownerCars;
    }


    public long getOwnerId() {
        return ownerId;
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