package model.EdibleFruit;

import model.base.Fruit;

public class EdibleFruit extends Fruit {
    private String taste;
    private double price;

    public EdibleFruit(){
        System.out.println("Creating an EdibleFruit object");
    }

    public EdibleFruit(String taste, double price) {
        this.taste = taste;
        this.price = price;
        System.out.println("Creating an EdibleFruit object");

    }

    public EdibleFruit(String color, String name, String taste, double price) {
        super(color, name);
        this.taste = taste;
        this.price = price;
        System.out.println("Creating an EdibleFruit object");

    }

    public void prepareForEating(){
        System.out.println("Prepare Fruit for eating");
    }


    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
