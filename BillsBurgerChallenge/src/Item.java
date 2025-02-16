public class Item {
    private String type;
    private String name;
    private String size;
    private double price;

    public Item(String type, String name, double price){
        this.type = type;
        this.name = name;
        this.size = "MEDIUM";
        this.price = price;
    }

    public void setSize(String size){
        this.size = size;
    }

    public double getBasePrice(){
        return price;
    }

    public double getAdjustedPrice(){
        return switch (size){
            case "LARGE" -> getBasePrice() + 1;
            case "SMALL" -> getBasePrice() - 0.5;
            default -> getBasePrice();
        };
    }

    public String getName(){
        if (type.equals("DRINK") || type.equals("SIDE")){
            return size + " " + name;
        }
        return name;
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }

}