public class Horse extends Mammal {
    private String breed;
    private String color;

    public Horse(String name, int age, String gender, String breed, String color) {
        super(name, age, gender);
        this.breed = breed;
        this.color = color;
    }

    public void pullACart(){
        System.out.println("Pulling the cart...");
    }

    @Override
    public void eat() {
        System.out.println(this.breed + "eating...");
    }

    @Override
    public void sleep() {
        System.out.println(this.breed + "sleeping...");
    }

    @Override
    public void move() {
        System.out.println(this.breed + "moving...");
    }

    @Override
    public void speak() {
        System.out.println(this.breed + "speaking...");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
