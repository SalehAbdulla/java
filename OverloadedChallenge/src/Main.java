public class Main {
    public static void main (String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
    public static double convertToCentimeters(int inchesValue) {
        return (inchesValue * 2.54);
    }

    public static double convertToCentimeters(int heightFeet, int remainHeightInches) {
        int heightFeetToInches = heightFeet * 12;
        int total = (heightFeetToInches + remainHeightInches);
        return convertToCentimeters(total);
    }
}
