public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }

    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (width + length);
    }

}
