public class Car {
    private final Long carId;
    private String registration;
    private String make;
    private String model;
    private String year;
    private double mileage;

    public Car(Long carId, String registration, String make, String model, String year, double mileage) {
        this.carId = carId;
        this.registration = registration;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public Long getCarId() {
        return carId;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
