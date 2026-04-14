public class Pegasus extends Horse implements Flying {
    private int numberOfBelievers;

    public Pegasus(String name, int age, String gender, String breed, String color, int numberOfBelievers) {
        super(name, age, gender, breed, color);
        this.numberOfBelievers = numberOfBelievers;
    }

    public int getNumberOfBelievers() {
        return numberOfBelievers;
    }

    public void setNumberOfBelievers(int numberOfBelievers) {
        this.numberOfBelievers = numberOfBelievers;
    }

    @Override
    public void fly() {
        System.out.println("Pegasus is flying high in the sky!");
    }
}
