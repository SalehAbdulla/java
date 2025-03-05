package com.abc.first;

public class Item {

    public String type;

    public Item(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                '}';
    }

}
