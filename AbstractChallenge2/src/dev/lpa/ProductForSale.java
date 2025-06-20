package dev.lpa;

public abstract class ProductForSale {
    protected String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.println("TYPE: " + type);
        System.out.println("DESCRIPTION: " + description);
        System.out.println("PRICE: " + price);
        System.out.println("QUANTITY: " + quantity);
        System.out.println("-".repeat(30));
        System.out.println("TOTAL PRICE: " + getSalesPrice(quantity));

    }
    // Show Product Type, description, price, and so on.
    public abstract void showDetails();

}
