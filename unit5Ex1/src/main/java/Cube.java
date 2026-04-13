public class Cube extends Shape3D {
    private double width;

    public Cube(){
        this(0);
    }

    public Cube(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double displayVolume() {
        return Math.pow(this.width, 3);
    }
}
