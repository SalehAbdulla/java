package model.EdibleFruit;

public class Apple extends EdibleFruit {
    private String madeIn;

    public Apple() {
        System.out.println("Creating an Apple object");
    }

    public Apple(String madeIn) {
        this.madeIn = madeIn;
        System.out.println("Creating an Apple object");

    }

    public Apple(String taste, double price, String madeIn) {
        super(taste, price);
        this.madeIn = madeIn;
        System.out.println("Creating an Apple object");

    }

    public Apple(String color, String name, String taste, double price, String madeIn) {
        super(color, name, taste, price);
        this.madeIn = madeIn;
        System.out.println("Creating an Apple object");
    }

    @Override
    public void prepareForEating() {
        System.out.println("Wash apple before eating");
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
}
