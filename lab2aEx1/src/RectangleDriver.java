public class RectangleDriver {
    public static void main(String[] args) {

        Rectangle myShape = new Rectangle();
//        myShape.width = -100;
//        myShape.length = 200;

        myShape.setLength(1_000_000);
        myShape.setWidth(2_000_000);

        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());

        System.out.println(myShape.calculateArea());
        System.out.println(myShape.calculatePerimeter());

    }
}
