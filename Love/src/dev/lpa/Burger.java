package dev.lpa;

public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price){
        super(name, "BURGER", price);
    }

    private double getExtraPrice(String extra){
        return switch(extra) {
            case "CHEESE", "AVOCADO" ->  2.0;
            case "MEAT", "SALAMI" ->  3.0;
            default -> 0.0;
        };
    }

    public void addExtraItem(String extra1, String extra2, String extra3){
        this.extra1 = new Item(extra1, "TOPPING", getExtraPrice(extra1));
        this.extra2 = new Item(extra2, "TOPPING", getExtraPrice(extra2));
        this.extra3 = new Item(extra3, "TOPPING", getExtraPrice(extra3));
    }

    private void printExtraItems(){
        if (extra1 != null) extra1.printItem();
        if (extra2 != null) extra2.printItem();
        if (extra3 != null) extra3.printItem();
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice()
                + ((extra1 != null) ? extra1.getBasePrice() : 0)
                + ((extra2 != null) ? extra2.getBasePrice() : 0)
                + ((extra3 != null) ? extra3.getBasePrice() : 0);
    }


    public void printAllItems() {
        printItem("BASE BURGER", getBasePrice());
        printExtraItems();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
