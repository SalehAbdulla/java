public class Main{
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 40);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog beautifulDog = new Dog("Beautiful dog", 15);
        doAnimalStuff(beautifulDog, "fast");

        Dog bigBoomDog = new Dog("Big boom Dog", 80.0, "curly ear", "straight ear shape ");
        doAnimalStuff(bigBoomDog, "slow");

        Dog wolfDog = new Dog("wolf", 40);
        doAnimalStuff(wolfDog, "fast");

        Fish goldFish = new Fish("Gold Fish", 0.25, 2, 3);
        doAnimalStuff(goldFish, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

}