public class Burger extends Item {

    private Item topping1;
    private Item topping2;
    private Item topping3;

    public Burger(String name, double price){
        super("BURGER", name, price);
    }

    public double getToppingPrice(String toppingName){
        return switch (toppingName){
            case "CHEESE", "AVOCADO", "STAKE" -> 2.0;
            case "DOUBLE MEAT", "DOUBLE CHECKIN" -> 4.0;
            default -> 0.0;
        };
    }

    public void addTopping(String toppingName1, String toppingName2, String toppingName3){
        this.topping1 = new Item("TOPPING", toppingName1, getToppingPrice(toppingName1));
        this.topping2 = new Item("TOPPING", toppingName2, getToppingPrice(toppingName2));
        this.topping3 = new Item("TOPPING", toppingName3, getToppingPrice(toppingName3));
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice()
                + ((topping1 == null) ? 0 : topping1.getBasePrice())
                + ((topping2 == null) ? 0 : topping2.getBasePrice())
                + ((topping3 == null) ? 0 : topping3.getBasePrice());
    }

    @Override
    public void printItem() {
        printItem("BASE BURGER", getBasePrice());
        if (topping1 != null){
            topping1.printItem();
        }

        if (topping2 != null){
            topping2.printItem();
        }

        if (topping3 != null){
            topping3.printItem();
        }

        System.out.println("-".repeat(30));
        super.printItem();
    }
}