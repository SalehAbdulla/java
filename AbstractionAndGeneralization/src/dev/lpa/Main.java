package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("animal", "big", 100);

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("GoldFish", "small", 15));
        animals.add(new Fish("Barracuda", "big", 10));
        animals.add(new Dog("pug", "small", 70));

        for (Animal animal: animals) {
            doAnimalStuff(animal);
        }


    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }

}