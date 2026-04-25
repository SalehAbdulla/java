public class CarWash extends Service {
    public CarWash(double price) {
        super(price);
    }

    @Override
    public void sell() {

    }

    @Override
    public String toString() {
        return "CarWash{} " + super.toString();
    }
}
