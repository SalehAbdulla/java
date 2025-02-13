public class Burger {
    // burgerType, burgerToppings, burgerQuantity
    private String burgerType;
    private int burgerToppings;
    private double price;

    public Burger(String burgerType, int burgerToppings){
        // meat or chicken
        this.burgerType = (burgerType == "meat" || burgerType == "chicken") ? burgerType : "Invalid burger Type";
        // maximum of 3
        this.burgerToppings = (burgerToppings > 0  && burgerToppings <= 3) ? burgerToppings : -1;
    }

    public double getPrice(){
        double sum;
        if (burgerType == "chicken") {
            sum = 2.0 + burgerToppings * 1;
        } else {
            sum = 3.0 + burgerToppings * 1.5;
        }
        return sum;
    }
}