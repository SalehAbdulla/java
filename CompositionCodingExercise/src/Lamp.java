public class Lamp {
    // style of type String, battery of type boolean, and globRating of type int.
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.print("Lamp -> Turning on");
    }

    public String getStyle(){
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }


}
