public abstract class Part implements Accounts {
    private int stock;
    private double price;
    private int quantity;

    public Part(int stock, double price, int quantity) {
        this.stock = stock;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void sell(){
        this.stock--;
    }

    public double getTotalSalesPrice() {
        return this.price * quantity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
