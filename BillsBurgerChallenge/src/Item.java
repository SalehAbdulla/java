public class Item {
    private String type;
    private String name;
    private String size;
    private double price;

    public Item(String type, String name, double price){
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.size = "MEDIUM";
        this.price = price;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public double getBasePrice(){
        return price;
    }

    public double getAdjustedPrice(){
        return switch(size){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f", name, price);
    }

    public void printItem(){
        printItem(name, price);
    }


}