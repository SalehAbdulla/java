public class Main{
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 40);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Super Fast");

        Dog curlyDog = new Dog("Curly", 15);
        doAnimalStuff(curlyDog, "slow");

        Dog friendlyDog = new Dog("Friendly Dog", 20, "Nice ear", "Nice tail");
        doAnimalStuff(friendlyDog, "somewhat fast");

        Dog wolf = new Dog("wolf", 40);
        doAnimalStuff(wolf, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }


}