public class Main {
    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator("2025","LG");
        DishWasher dishWasher = new DishWasher("2025", "LG");
        CoffeeMaker coffeeMaker = new CoffeeMaker("2025", "LG");

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);
        smartKitchen.loadDishwasher();
        smartKitchen.addWater();
        smartKitchen.pourMilk();

    }
}
