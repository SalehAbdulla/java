public class Animal {

    private String animalName;
    private final String type;
    private String gender;
    private String color;

    private int ageInMonths;
    private double price;

    public Animal(String animalName, String type, String gender, int ageInMonths, String color , double price) {
        this.animalName = animalName;
        this.type = type;
        this.gender = gender;
        this.ageInMonths = ageInMonths;
        this.color = color;
        this.price = (price < 100) ? 100 : price;
    }

    public String getAnimalName(){
        return animalName;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        switch (gender.toLowerCase()){
            case "male":
                this.gender = gender;
            case "female":
                this.gender = gender;
            default:
                this.gender = "error: unknown gender";
        }
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = (ageInMonths < 0 ? 1 : ageInMonths);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // Business logic - price cannot be less than 100BHD
        if (price < 100) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", ageInMonths=" + ageInMonths +
                ", price=" + price +
                '}';
    }
}

