public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("🚘 Starting Engine 🚘");
    }

    public void drive() {
        runEngine();
        System.out.println("Driving ... 🚗🚗🚗🚗🚗");
    }

    public String carPurchased(){
        return this.getClass().getSimpleName();
    }

    protected void runEngine() {
        System.out.println("🚘 Running Engine 🚘");
    }

    // Instance factory
    public static Car buyCar(String carType, String description, double avgKmPerLitre, int cylinders, int ... optionalParams){

        int avgKmPerCharge = (optionalParams.length > 0) ? optionalParams[0] : 0;
        int batterySize = (optionalParams.length > 1) ? optionalParams[1] : 0;

        return switch (carType.toUpperCase().charAt(0)){
            case 'G' -> new GasPoweredCar(description, avgKmPerLitre, cylinders);
            case 'H' -> new HybridCar(description, avgKmPerLitre, batterySize, cylinders);
            case 'E' -> new ElectricCar(description, avgKmPerCharge, batterySize);
            default -> new Car(description);
        };
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders){
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("GasPoweredCar's engine being started ...");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("GasPoweredCar's engine being Run ...");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("GasPoweredCar's engine driving ...");
    }

    @Override
    public String carPurchased() {
        return super.carPurchased();
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("ElectricCar's engine being started ...");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("ElectricCar's engine being Run ...");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("ElectricCar's engine driving ...");
    }


    @Override
    public String carPurchased() {
        return super.carPurchased();
    }
}


class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;


    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("HybridCar's engine being started ...");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("HybridCar's engine being Run ...");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("HybridCar's engine driving ...");
    }

    @Override
    public String carPurchased() {
        return super.carPurchased();
    }
}

