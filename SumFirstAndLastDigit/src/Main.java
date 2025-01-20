public class Main{
    public static void main(String[] args) {
        System.out.println("The Sum of first and last digit is = " + sumFirstAndLastDigit(10));
    }
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;

        while (number > 9){
            number = number / 10;
        }

        System.out.println(lastDigit);
        System.out.println(number);

        return (number + lastDigit);
    }
}
