public class SmartKitchen {

    private CoffeeMake brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMake();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean setBrewMasterState, boolean setDishWasherState, boolean setIceBoxState){
        brewMaster.setHasWorkToDo(setBrewMasterState);
        dishWasher.setHasWorkToDo(setDishWasherState);
        iceBox.setHasWorkToDo(setIceBoxState);
    }

    private CoffeeMake getBrewMaster(){
        return brewMaster;
    }

    private DishWasher getDishWasher(){
        return dishWasher;
    }

    private Refrigerator getIceBox(){
        return iceBox;
    }

    public void doKitchenWork(){
        getBrewMaster().brewCoffee();
        getIceBox().orderFood();
        getDishWasher().doDishes();
    }

}


class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Food Ordered");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Dishes cleaned");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMake {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Here's your coffee 🍵");
            hasWorkToDo = false;
        }
    }
}