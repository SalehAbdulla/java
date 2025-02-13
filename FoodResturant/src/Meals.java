public class Meals {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double price;

    public Meals(){
        burger = new Burger("regular", 1);
        drink = new Drink("cooke", "small", 1);
        sideItem = new SideItem(true, false);
        price = 3.0;
    }

    // Factory Instance
    public Meals(String burgerType, int burgerToppings,
                 String drinkType, String drinkSize, int drinkQuantity,
                 Boolean fries, Boolean extraCheese) {

        burger = new Burger(burgerType, burgerToppings);
        drink = new Drink(drinkType, drinkSize, drinkQuantity);
        sideItem = new SideItem(fries, extraCheese);
    }

}
