public class Car {
    private String registration;
    private String make;
    private String model;
    private int year;
    private double mileage;
    private Owner owner;

    public Car(String registration, String make, String model, int year, double mileage) {
        this.registration = registration;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
