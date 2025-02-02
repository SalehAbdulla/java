public class RectangleTwo extends shape {

    private int width;
    private int height;


    public RectangleTwo(int x, int y){
        this(x, y, 0,0);
    }

    public RectangleTwo(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

}
