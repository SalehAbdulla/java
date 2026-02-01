public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("General Animal", "Huge", 400);
        Dog dog = new Dog();
        doAnimalStuff(animal, "slow");
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        yorkie.toString();
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

}
