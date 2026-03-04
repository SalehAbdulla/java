public class Animal {
    private String animalType;
    private Gender gender;
    private int ageInMonths;
    private double price;

    public Animal(String animalType, Gender gender, int ageInMonths, double price) {
        this.animalType = animalType;
        this.gender = gender;
        this.ageInMonths = ageInMonths;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
