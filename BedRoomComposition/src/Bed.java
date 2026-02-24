//2) Create a class and name it Bed.
// Five private member variables should be declared:
// style of type String, and pillows, height, sheets, quilt of type int.
// A constructor should be coded which accepts these five member variables as parameters.
// Also, six methods should be defined:
// make() has no return type and prints a message to the effect that the bed is being made;
// getStyle() which returns the value of style;
// getPillows() returns the number of pillows;
// getHeight() returns the height of the bed;
// getSheets() returns the number of sheets on the bed;
// and getQuilt() returns the value of quilt./*
//*/

public class Bed {
    // style of type String, and pillows, height, sheets, quilt of type int.
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    // A constructor should be coded which accepts these five member variables as parameters.
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    // make() has no return type and prints a message to the effect that the bed is being made;
    public void make(){
        System.out.println("Bed is being made");
    }
    // getStyle() which returns the value of style;
    public String getStyle(){
        return this.style;
    }
    // getPillows() returns the number of pillows;
    public int getPillows(){
        return this.pillows;
    }
    // getHeight() returns the height of the bed;
    public int getHeight(){
        return this.height;
    }
    // getSheets() returns the number of sheets on the bed;
    public int getSheets(){
        return this.sheets;
    }
    // and getQuilt() returns the value of quilt.
    public int getQuilt() {
        return this.quilt;
    }
}
