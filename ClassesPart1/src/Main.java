public class Main{
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("2025");
        car.setConvertible(true);

        //System.out.println("Make = " + car.getMake());
        //System.out.println("Make = " + car.getModel());
        //car.describeCar();

        Car targa = new Car();

        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);

        System.out.println("Make = " + targa.getMake());
        System.out.println("Model = " + targa.getModel());


        targa.describeCar();


    }
}

