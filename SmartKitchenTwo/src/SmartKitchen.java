public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }
    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean setBrewMasterState, boolean setDishWasherState, boolean setIceBoxState){
        brewMaster.setHasWorkToDo(setBrewMasterState);
        dishWasher.setHasWorkToDo(setDishWasherState);
        iceBox.setHasWorkToDo(setIceBoxState);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }


}

class Refrigerator {
    private boolean hasWorkToDo;

    protected void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void orderFood(){
        if (hasWorkToDo) {
            System.out.println("Food ordered");
            hasWorkToDo = false;
        }
    }

}

class DishWasher {
    private boolean hasWorkToDo;

    protected void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void doDishes(){
        if (hasWorkToDo) {
            System.out.println("Dishes cleaned");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    protected void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void brewCoffee(){
        if (hasWorkToDo) {
            System.out.println("Here's your coffee");
            hasWorkToDo = false;
        }
    }
}