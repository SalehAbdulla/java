public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12, 12, 12));
    }

    public static boolean hasSameLastDigit(int value1, int value2, int value3) {

        if (!isValid(value1) || !isValid(value2) || !isValid(value3)) {
            return false;
        }

        int valueOneDigitThree = value1 % 10;
        int valueTwoDigitThree = value2 % 10;
        int valueThreeDigitThree = value3 % 10;

        return (valueOneDigitThree == valueTwoDigitThree || valueOneDigitThree == valueThreeDigitThree
                || valueTwoDigitThree == valueOneDigitThree || valueTwoDigitThree == valueThreeDigitThree
                || valueThreeDigitThree == valueTwoDigitThree || valueThreeDigitThree == valueOneDigitThree
        );
    }


    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }

}