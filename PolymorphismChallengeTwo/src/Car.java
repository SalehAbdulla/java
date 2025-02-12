public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }

    public void StartEngine(){
        System.out.println("Engine starting ...");
    }

    public void drive(){
        runEngine();
        System.out.println("Driving ...");
    }

    protected void runEngine(){
        System.out.println("Engine starting ...");
    }

    public String printPurchasedCar(){
        return this.getClass().getSimpleName();
    }

    public static Car buyCar(String carType, String description, double ... optionalParamsInt){
        int cylinders = (optionalParamsInt.length > 0) ? (int) optionalParamsInt[0] : 0;
        int batterySize = (optionalParamsInt.length > 1) ? (int) optionalParamsInt[1] : 0;

        double avgKmPerLitre = (optionalParamsInt.length > 2) ? optionalParamsInt[2]: 0;
        double avgKmPerCharge = (optionalParamsInt.length > 3) ? optionalParamsInt[3]: 0;

        return switch (carType.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description, avgKmPerLitre, cylinders);
            case 'E' -> new ElectricCar(description, avgKmPerCharge, batterySize);
            case 'H' -> new HybridCar(description, avgKmPerLitre, cylinders, batterySize);
            default -> new Car(description);
        };
    }
}


class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
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

}




