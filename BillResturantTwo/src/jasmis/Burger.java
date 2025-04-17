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
                + ((extra1 != null) ? extra1.getAdjustedPrice() : 0)
                + ((extra2 != null) ? extra2.getAdjustedPrice() : 0)
                + ((extra3 != null) ? extra3.getAdjustedPrice() : 0);
    }


    public double getExtraPrice(String toppingName){
        return switch (toppingName){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 2.0;
            default -> 0.0;
        };
    }

    public void addToppings(String extraName1,String extraName2, String extraName3){
        this.extra1 = new Item(extraName1, extraName1, getExtraPrice(extraName1));
        this.extra2 = new Item(extraName2, extraName2, getExtraPrice(extraName2));
        this.extra3 = new Item(extraName3, extraName3, getExtraPrice(extraName3));
    }

    public void printItemizedList(){
        if (extra1 != null) extra1.printItem();
        if (extra2 != null) extra2.printItem();
        if (extra3 != null) extra3.printItem();
    }

    @Override
    public void printItem() {
        System.out.printf("%20s:%5.2f%n", getName(), getBasePrice());
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }

}
