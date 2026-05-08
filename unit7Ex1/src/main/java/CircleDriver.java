public class CircleDriver {
    public static void main(String[] args) {
        Circle circle = new Circle();
        try {
            circle.setRadius(-3);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("More important code!");
    }
}
