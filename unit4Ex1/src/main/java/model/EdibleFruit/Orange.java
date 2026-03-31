package model.EdibleFruit;

public class Orange extends EdibleFruit {
    private String madeIn;

    public Orange(){}

    @Override
    public void prepareForEating() {
        System.out.println("Peel orange before eating");
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
}
