public class CoffeMaker {

    private boolean HasWorkToDo;

    public boolean isHasWorkToDo() {
        return HasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        HasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        this.HasWorkToDo = true;
        System.out.println("brewCoffee executed, here's your coffee...");
    }
}
