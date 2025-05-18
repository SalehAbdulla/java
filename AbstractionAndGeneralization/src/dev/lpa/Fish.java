package dev.lpa;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }


    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow")) {
            System.out.print(type + " is moving so slow");
        } else {
            System.out.print(type + " is moving so slow");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("goldFish")) {
            System.out.print("Splash ...");
        } else {
            System.out.print("Swish ...");

        }
    }
}
