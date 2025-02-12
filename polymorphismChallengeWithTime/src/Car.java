public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    // subclasses can override it, but not others
    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }

    public void drive(){
        System.out.println("Car - > driving, type is : " + getClass().getSimpleName());
        runEngine();
    }

}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinder = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinder){
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinder);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}
