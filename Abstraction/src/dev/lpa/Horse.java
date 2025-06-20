package dev.lpa;

public class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        super.move(speed);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
