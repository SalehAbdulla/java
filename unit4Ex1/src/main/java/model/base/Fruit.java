package model.base;

public class Fruit {
    private String color;
    private String name;

    public Fruit(){
        System.out.println("Creating a Fruit object!");
    }

    public Fruit(String color, String name) {
        this.color = color;
        this.name = name;
        System.out.println("Creating a Fruit object!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
