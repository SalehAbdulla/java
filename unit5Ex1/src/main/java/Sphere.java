public class Sphere extends Shape3D {
    private double radius;

    public Sphere(){
        this(0);
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double displayVolume() {
        return (((double) 4 / 3) * Math.PI * Math.pow(radius, 3));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
