public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price){
        super("Burger", name, price);
    }

    public double toppingPrice(String extra){
        return switch(extra){
            case "CHEESE", "AVOCADO" -> 1.0;
            case "HAM", "SALAMI" -> 0.5;
            default -> 0.0;
        };
    }


    public void addTopping(String extra1, String extra2, String extra3){
        this.extra1 = new Item("TOPPING", extra1, toppingPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2, toppingPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3, toppingPrice(extra3));
    }

    @Override
    public double getAdjustedPrice(){
        return super.getAdjustedPrice()
                + ((extra1 == null) ? 0 : extra1.getAdjustedPrice())
                + ((extra2 == null) ? 0 : extra2.getAdjustedPrice())
                + ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public void printReceipt(){
        printItem("BASE BURGER ", getBasePrice());
        if (extra1 != null) {extra1.printItem();}
        if (extra2 != null) {extra2.printItem();}
        if (extra3 != null) {extra3.printItem();}
    }

    @Override
    public void printItem(){
        printReceipt();
        System.out.println("-".repeat(30));
        super.printItem();
    }


}