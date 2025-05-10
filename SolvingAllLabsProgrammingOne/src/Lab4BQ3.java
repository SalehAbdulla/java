public class Lab4BQ3 {
    public static void main(String[] args) {
        printReversedOrder(123);
    }
    public static void printReversedOrder(int number){
        if (number < 100 || number > 999) {
            System.out.println("incorrect input.");
            return;
        }
        int temp = number;
        int firstDigit = temp % 10;
        temp = temp / 10;
        int secondDigit = temp % 10;
        temp = temp / 10;
        int thirdDigit = temp % 10;

        System.out.printf(number+ " reversed is %d%d%d.%n", firstDigit, secondDigit,thirdDigit);
    }
}
