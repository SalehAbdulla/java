package com.unit1.ex1;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }

}
