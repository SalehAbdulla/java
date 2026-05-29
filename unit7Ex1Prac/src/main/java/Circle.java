public class Circle {

    private double radius;

    public Circle() {
        this.radius = 5.0;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }
}
