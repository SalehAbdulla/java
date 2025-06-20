package dev.lpa;

public class Fish extends Animal{

    public Fish (String type, String size, int weight){
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(type + " lazily swimming");
        } else {
            System.out.println(type + " fast swimming");
        }

    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("Goldfish")) {
            System.out.println("Swish! ");
        } else {
            System.out.println("Splash! ");
        }
    }

}
