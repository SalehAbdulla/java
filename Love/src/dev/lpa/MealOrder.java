package dev.lpa;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;


    public MealOrder(){
        this("FRIES", "COKE", "MIGHTY CHICKEN");
    }


    public MealOrder(String side, String drink, String burger){
        this.side = new Item(side, "SIDE", 1.0);
        this.drink = new Item(drink, "DRINK", 2.0);
        this.burger = new Burger(burger, 4.0);
    }

    public double getTotalPrice(){
        return burger.getAdjustedPrice()
                + side.getAdjustedPrice()
                + drink.getAdjustedPrice();
    }

    public void printMeal(){
        burger.printItem();
        side.printItem();
        drink.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

}
