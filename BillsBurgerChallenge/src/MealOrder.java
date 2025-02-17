public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item fries;

    public MealOrder(){
        this.burger = new Burger("MIGHTY CHECKIN", 4);
        this.drink = new Item("DRINK", "7-Up", 1);
        this.fries = new Item("FRIES", "Fries", 2);
    }

    public double getTotalAmount(){
        return this.burger.getAdjustedPrice()
                + this.drink.getAdjustedPrice()
                + this.fries.getAdjustedPrice();
    }

    public void printMeal(){
        this.burger.printItem();
        this.drink.printItem();
        this.fries.printItem();
        System.out.println("-".repeat(30));
        System.out.println( "TOTAL AMOUNT: " + getTotalAmount());
    }
}