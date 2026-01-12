public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;


    public String getMake(){
        return make;
    }

    public String getModel(){
        return make;
    }

    public String getColor(){
        return make;
    }

    public String isConvertible(){
        return make;
    }

    public void describeCar(){

        System.out.println(doors + "-Doors " + color + " " +
            make + " " +
            model + " " + 
            (convertible ? "Convertible" : "Non-Convertible")
        );
    }








}