public class Main {
    public static void main(String[] args) {
        System.out.println("The sum = " + sumDigits(1234));
    }

    public static int sumDigits(int number){
        if (number < 0) {
            return -1;
        }
        int total = 0;

        while (number != 0) {
            total += number % 10;
            number = number / 10;
        }

        return total;
    }


}