import model.EdibleFruit.Apple;
import model.EdibleFruit.EdibleFruit;
import model.EdibleFruit.Orange;

public class FruitDriver {
    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.setColor("RED");
        apple.setMadeIn("BAHRAIN");
        apple.setTaste("SWEET");
        apple.setName("APPLE LIKE NO OTHER");
        apple.setPrice(1000.0);

        Orange orange = new Orange();
        orange.setColor("ORANGE");
        orange.setMadeIn("SAUDI");
        orange.setTaste("SOU");
        orange.setName("ORANGE LIKE NO OTHER");
        orange.setPrice(3000.0);

        System.out.println("PRICE OF APPLE: "+apple.getPrice()+ " | COLOR: "+apple.getColor());
        System.out.println("PRICE OF ORANGE: "+orange.getPrice());


        // TEST METHOD CALLED EdibleFruit.prepareForEating()
        EdibleFruit edibleFruit = new EdibleFruit();
        edibleFruit.prepareForEating();


        // AFTER OVERRIDING
        apple.prepareForEating();
        orange.prepareForEating();


        // Run your program. What do you see printed to the screen. Explain this.

        // THE PROGRAM STARTS WORKING FROM THE PARENTS, FROM THE OBJECT CLASS DOWN TO APPLE CLASS
        // THEREFORE, WE SEE THE EXCECUTION OF FRUIT FIRST, THEN THE OTHERS CHILDS.

    }
}
