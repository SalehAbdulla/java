public class Main {
    public static void main(String[] args) {

    }

    public static double convertToCentimeters(int num) {
        return 2.54 * num;
    }

    public static double convertToCentimeters(int heightFeet, int heightInch) {
        return convertToCentimeters((heightFeet * 12) + heightInch);
    }


}