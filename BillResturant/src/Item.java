public class Item {
    private String name;
    private String type;
    private String size = "MEDIUM";
    private double price;

    public Item(String name, String type, double price){
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public void setSize(String size){
        this.size = size.toUpperCase();
    }

    public String getName(){
        if (type.equalsIgnoreCase("DRINK") || type.equalsIgnoreCase("SIDE")){
            return size + " " + name;
        }

        return name;
    }

    public double getBasePrice(){
        return price;
    }

    public double getAdjustedPrice(){
        return switch(size){
            case "LARGE" -> getBasePrice() + 1;
            case "SMALL" -> getBasePrice() - 0.5;
            default -> getBasePrice();
        };
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }

}