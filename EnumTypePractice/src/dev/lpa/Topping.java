package dev.lpa;

public enum Topping {
    CHEESE,
    MAYO,
    KETCHUP,
    JALAPENO;

    public double getPrice(){
        return switch (this) {
            case CHEESE ->  1.6;
            case JALAPENO -> 1.8;
            default -> 0.0;
        };
    }


}
