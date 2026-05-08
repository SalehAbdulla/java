public class PartFit extends Service {

    private Part part;

    public PartFit(Part part, double price) {
        super(price);
        this.part = part;
    }

    @Override
    public void sell() {
        part.sell();
        // It also calculates the price for the service
        // by adding the price of the part to the price of the service.
        this.setPrice(part.getPrice() + this.getPrice()); // maybe, will test this later on
    }

}
