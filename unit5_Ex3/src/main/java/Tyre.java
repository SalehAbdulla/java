public class Tyre extends Part {
    public Tyre(int stock, double price, int quantity) {
        super(stock, price, quantity);
    }

    @Override
    public String toString() {
        return "Tyre{} " + super.toString();
    }
}
