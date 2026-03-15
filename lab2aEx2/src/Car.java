public class Car {

    private Employee owner;
    private String brand;
    private String model;
    private String color;
    private String modelDate;

    public Car(String brand, String model, String color, String modelDate) {
        this(null, brand, model, color, modelDate);
    }

    public Car(Employee owner, String brand, String model, String color, String modelDate) {
        this.owner = owner;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.modelDate = modelDate;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelDate() {
        return modelDate;
    }

    public void setModelDate(String modelDate) {
        this.modelDate = modelDate;
    }



    public void printCarInfo() {
        System.out.println("Car " +
                "owner=" + owner.toString()+
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", modelDate='" + modelDate + '\''
                );
    }


}
