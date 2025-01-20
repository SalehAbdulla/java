public class Main{
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number) {
        int total = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit %2 == 0) {
                total += lastDigit;
                number = number / 10;
            } else {
                number = number / 10;
            }
        }
        return total;
    }

}