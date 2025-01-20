public class Main{
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int value1, int value2) {

        if (value1 < 10 || value1 > 99 || value2 < 10 || value2 > 99) {
            return false;
        } else {
            return ( (value1 % 10 == value2 % 10) || (value1 % 10 == value2 / 10) || (value1 / 10 == value2 % 10) || (value1 / 10 == value2 / 10) );
        }
    }
}



