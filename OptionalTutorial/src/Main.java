import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        Cat cat = findCatByName("Fred");


        // What if we didn't get the cat from the database?
        // what should this function return?

        // Maybe null, right?

        // if we got a null variable, and we tried to access the cat's age
        // then we will face nullPointerException!
        // yeah we could solve it with an if statement

//        if (cat != null) {
//            cat.getAge();
//        } else {
//            System.out.println(0);
//        }

        // Here where optional comes handy

        Optional<Cat> myCat = findCatByName("Fred Again");
        System.out.println(myCat.map(Cat::getAge));

    }


    public static  Optional<Cat>  findCatByName(String name) {
        // in real example we gonna process from database
        Cat cat = new Cat("Fred");
        return Optional.ofNullable(cat);
    }
}
