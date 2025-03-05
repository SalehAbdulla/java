public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price){
        super(name, "BURGER", price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice()
                + ((extra1 == null) ? 0 : extra1.getBasePrice())
                + ((extra2 == null) ? 0 : extra2.getBasePrice())
                + ((extra3 == null) ? 0 : extra3.getBasePrice());
    }

    public void printFullItems(){
        printItem("BURGER", getBasePrice());

        System.out.println("-".repeat(30));

        if (extra1 != null) {extra1.printItem();}
        if (extra2 != null) {extra2.printItem();}
        if (extra3 != null) {extra3.printItem();}

    }

    public double getExtraPrice(String extra){
        return switch (extra){
            case "CHEESE", "AVOCADO" -> getAdjustedPrice() + 2;
            default -> getAdjustedPrice();
        };
    }

    public void addTopping(String extra1, String extra2, String extra3){
        this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3, getExtraPrice(extra3));
    }


}