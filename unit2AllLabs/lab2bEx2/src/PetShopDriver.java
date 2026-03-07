import java.util.concurrent.ThreadLocalRandom;

public class PetShopDriver {

    public static PetShop petShop = new PetShop();

    public static void main(String[] args) {

        // show report before the sales
        petShop.showShopReport();

        // enter dummy data - without sales record -- uncomment if you want to add data
//        EnterDummyData();

        // let customer enter the shop
        petShop.EnterTheShop();

        // show report after the sales
        petShop.showShopReport();

        // Show all animals in the store
//        petShop.showAnimalsInStore();

    }

    public static String getRandColor(){
        String[] colors = {"black", "white"};
        int getRandIdx = (int) (Math.random() * colors.length);
        return colors[getRandIdx];
    }

    public static void EnterDummyData(){
        // Create a dummy data
        for (int i = 0; i < 15; i++) {
            Cat cat = new Cat("cat"+ i, "male", ThreadLocalRandom.current().nextInt(1, 24), getRandColor(), ThreadLocalRandom.current().nextInt(100, 250));
            Dog dog = new Dog("dog"+ i, "female", ThreadLocalRandom.current().nextInt(1, 24), getRandColor(), ThreadLocalRandom.current().nextInt(100, 250));
            Bird bird = new Bird("bird" +i ,"female", ThreadLocalRandom.current().nextInt(1, 24), getRandColor(), ThreadLocalRandom.current().nextInt(100, 250));

            petShop.AddAnimals(cat);
            petShop.AddAnimals(dog);
            petShop.AddAnimals(bird);
        }

    }
}




