package dev.lpa;

public enum Topping {
    CHEESE,
    MAYO,
    CHEDDAR,
    KETCHUP,
    JALAPENO;

    public double getPrice() {
        return switch (this) {
            case CHEDDAR -> 1.9;
            case JALAPENO -> 2.0;
            default -> 0.0;
        };
    }

}
