public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    // The messages these methods return should somewhere contain the name of the class, Car.

    // startEngine accepts no parameters and returns a message which says that the car's engine is starting.
    public String startEngine(){
        return this.getClass().getSimpleName() + " -> startEngine()";
    }

    // accelerate accepts no parameters and returns a message that says the car is accelerating.
    public String accelerate(){
        return this.getClass().getSimpleName() + " -> accelerate()";
    }
    // brake accepts no parameters and returns a message stating the car is braking.
    public String brake(){
        return this.getClass().getSimpleName() + " -> brake()";
    }


    // Two getter methods should also be defined here for the member variables cylinders and name.
    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }

}
