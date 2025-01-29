public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Cat", "small", 10.0);
        doAnimalStuff(animal, "fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }

}