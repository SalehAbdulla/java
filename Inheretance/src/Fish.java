public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(int gills, int fins){
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){}

    private void moveBackFin(){}

    public void move(String speed) {
        super.move(speed);
    }
}
