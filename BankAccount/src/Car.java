public class Car {
    private String make;
    private String model;
    private String color;

    private int doors;
    private boolean convertable;

    public void describeCar() {
        System.out.println(doors + "-Doors " + color + " " + model + " " + make + " "
                + (convertable ? "Convertable" : " "));
    }

    public String getMake() {
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors(){
        return doors;
    }

    public boolean getConvertable(){
        return convertable;
    }

    public void setMake(String make) {
        this.make = make;
    }


}
