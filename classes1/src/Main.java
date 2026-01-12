public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.make = "Porche";
        car.model = "Carrera";
        car.color = "Red";
        
        System.out.println("Make = " + car.make);
        System.out.println("Model = " + car.model);

        car.describeCar();

    }
}