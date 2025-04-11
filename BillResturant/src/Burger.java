public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price){
        super(name, "BURGER", price);
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice()
                + ((extra1 == null ) ? 0 : extra1.getAdjustedPrice())
                + ((extra2 == null) ? 0 : extra2.getAdjustedPrice())
                + ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName){
        return switch(toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "HAM", "SALAMI" -> 3.0;
            default -> 0.0;
        };
    }

    public void addItems(String toppingName1, String toppingName2, String toppingName3){
        this.extra1 = new Item( toppingName1, "TOPPING", getExtraPrice(toppingName1));
        this.extra2 = new Item( toppingName2, "TOPPING", getExtraPrice(toppingName2));
        this.extra3 = new Item( toppingName3, "TOPPING", getExtraPrice(toppingName3));
    }


    public void printItemizedList(){
        if (extra1 != null){extra1.printItem();}
        if (extra2 != null){extra2.printItem();}
        if (extra3 != null){extra3.printItem();}
    }

    @Override
    public void printItem() {
        System.out.printf("%20s:%5.2f%n", getName(), getBasePrice());
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}