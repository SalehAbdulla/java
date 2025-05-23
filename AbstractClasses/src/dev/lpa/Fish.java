package dev.lpa;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed){
        if (speed.equalsIgnoreCase("slow")){
            System.out.println(getExplicitType() + " Lazily swimming ...");
        } else {
            System.out.println(getExplicitType() + " darting frantically...");
        }

    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("GoldFish")) {
            System.out.println("Swish! ");
        } else {
            System.out.println("Splash! ");
        }
    }
}
