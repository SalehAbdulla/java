public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(5.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalAccessException {
        if (radius < 0) throw new IllegalAccessException("radius cannot be negative");
        this.radius = radius;
    }

}
