public class Circle {
    private double radius;

    public double getRadius(){
        return this.radius;
    }

    public void setRadis(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("radius cannot be negative");
        }
        this.radius = radius;
    }
}
