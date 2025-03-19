package dev.lpa;

public class Item {
    private String name;
    private String type;
    private String size = "MEDIUM";
    private double price;

    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getItemName(){
        if (type.equals("DRINK") || type.equals("SIDE")){
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice(){
        return price;
    }

    public double getAdjustedPrice(){
        return switch (size) {
            case "LARGE" -> getBasePrice() + 1;
            case "SMALL" -> getBasePrice() - 0.5;
            default -> getBasePrice();
        };
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem(){
        printItem(getItemName(), getAdjustedPrice());
    }

}
