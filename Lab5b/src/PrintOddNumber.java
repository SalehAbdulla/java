public class PrintOddNumber {
    public static void main(String[] args) {
        int startValue = 7;
        int stopValue = 11;
        printOddNumber(startValue,stopValue);
    }


    // for-loop to display the sequence of odd numbers
    //method to print odd numbers
    public static void printOddNumber(int startValue, int stopValue) {

        for (int i = startValue; i <= stopValue; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}
