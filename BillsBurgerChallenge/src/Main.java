public class Main {
    public static void main(String[] args) {

        Burger burger = new Burger("MIGHTY CHICKEN", 4.0);
        burger.setSize("LARGE");
        burger.addTopping("CHEESE", "AVOCADO", "MAYO");
        burger.printItem();
    }
}
