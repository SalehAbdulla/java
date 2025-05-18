package dev.lpa;

public class Dog extends Animal{

    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("MOVING ..." + speed);
        if (speed.equalsIgnoreCase("slow")){
            System.out.print(type + " walking");
        } else {
            System.out.print(type + " Running");
        }
    }

    @Override
    public void makeNoise() {
        // Because we have protected access modifier,
        // We can use the type directly
        if (type.equalsIgnoreCase("wolf")) {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
    }

}

