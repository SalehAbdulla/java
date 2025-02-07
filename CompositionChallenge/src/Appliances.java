public class Appliances {

    private String model;
    private String manufacturer;

    public Appliances(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }

}

class Refrigerator extends Appliances {

    private boolean hasWorkToDo;

    public Refrigerator(String model, String manufacturer){
        super(model, manufacturer);
    }

    public void orderFood(){
        hasWorkToDo = true;
        System.out.println("Food ordered!");
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

}

class DishWasher extends Appliances {
    private boolean hasWorkToDo;

    public DishWasher(String model, String manufacturer){
        super(model, manufacturer);
    }
    public void doDishes(){
        hasWorkToDo = true;
        System.out.println("Dishes cleaned!");
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

}

class CoffeeMaker extends Appliances {
    private boolean hasWorkToDo;

    public CoffeeMaker(String model, String manufacturer){
        super(model, manufacturer);
    }

    public void brewCoffee(){
        hasWorkToDo = true;
        System.out.println("Here is your coffee 🍵");
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

}
