import java.util.ArrayList;

public class Owner {
    private long ownerId;
    private String ownerName;
    private String ownerPhone;
    private Car carForSale;
    private Car carForTestDrive;
    private ArrayList<Car> ownerCars;

    public Owner(long ownerId, String ownerName, String ownerPhone, Car carForSale, Car carForTestDrive, ArrayList<Car> ownerCars) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.carForSale = carForSale;
        this.carForTestDrive = carForTestDrive;
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

    public ArrayList<Car> getOwnerCars() {
        return ownerCars;
    }

    public void setOwnerCars(ArrayList<Car> ownerCars) {
        this.ownerCars = ownerCars;
    }
}
