import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {


        Dog dogOne = new Dog();
        System.out.println(dogOne);
        System.out.println("_ _ _ _ _");


        Dog dog = new Dog("Dog", 20.0, "round", "straight");
        System.out.println(dog);
        doAnimalStuff(dog, "fast");


    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");

    }


}