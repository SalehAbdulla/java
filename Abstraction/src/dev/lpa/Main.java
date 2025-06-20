package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf", "Big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("GoldenFish", "small",1));
        animals.add(new Fish("Barracuda", "big",75 ));
        animals.add(new Dog("Pug", "small", 20));


        animals.add(new Horse("Clydesdale", "large", 1000));

        for (Animal animal: animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }

    }

    private static void doAnimalStuff(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("This animal is Dog");
        }

        animal.makeNoise();
        animal.move("fast");

    }
}
