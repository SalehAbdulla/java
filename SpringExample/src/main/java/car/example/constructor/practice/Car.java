package car.example.constructor.practice;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void showCarInfo(){
        System.out.println("Car information is: " + specification.toString());
    }

}
