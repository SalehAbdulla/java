package dev.lpa;

import javax.lang.model.element.AnnotationMirror;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // This is an advantage of an abstract class, we can't have an instance of this class
//        Animal animal = new Animal("ANIMAL", "BIG", 100);

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);


        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(new Dog("German Dog", "Big", 150));
        animals.add(new Fish("Golden Fish", "Small", 1));
        animals.add(new Fish("Barracude", "Big", 75));
        animals.add(new Dog("Pug", "Small", 20));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }

    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
        System.out.println("-".repeat(30));
    }

}