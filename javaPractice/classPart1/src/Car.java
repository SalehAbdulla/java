public class Car {
    private String make;
    private String color;
    private String model;
    private int doors;
    private boolean convertible;

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }


    public void describeCar(){
        System.out.println(doors + "-Doors " + color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : "Non-Convertible")
        );
    }

}
