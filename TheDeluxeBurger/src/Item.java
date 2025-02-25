public class Item {

    private String name;
    private String type;
    private String size;
    private double price;


    public Item(String name, String type, double price){
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
        this.size = "MEDIUM";
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
        System.out.printf("%20s:%6.2f", name, price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }
}