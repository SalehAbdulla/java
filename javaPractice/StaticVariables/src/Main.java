public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");

        rex.printName();
        fluffy.printName();
    }
}

// class Dog {
//    static String genus = "Canis";
//
//    void printData(){
//
//        Dog d = new Dog();
//        System.out.println(d.genus); // wrong Confusing!
//        System.out.println(Dog.genus); // correct
//    }
//
//
//}
