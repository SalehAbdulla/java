public class Main {
    public static void main(String[] args) {
        numberToWords(10);
    }
    public static void numberToWords(int number){

        if (number < 0){
            System.out.println("Invalid Value");
        } else {

            int reversedNumber = reverse(number);
            if (number == 0) {
                System.out.println("Zero");
            }

            while (reversedNumber > 0) {

                switch (reversedNumber % 10) {
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    case 0 -> System.out.println("Zero");
                }

                reversedNumber = reversedNumber / 10;
            }

            reversedNumber = reverse(number);

            if (getDigitCount(reversedNumber) != getDigitCount(number)) {
                int difference = getDigitCount(number) - getDigitCount(reversedNumber);
                //System.out.println("The difference is = " + difference);
                for (int i = 0; i < difference; i++) {
                    System.out.println("Zero");
                }
            }
        }

    }

    public static int reverse(int number){

        // Catch negative numbers
        if (number < 0){
            number = Math.abs(number);
            int reversed = 0;
            while (number > 0){
                int lastDigit = number % 10;
                reversed = (reversed * 10) + lastDigit;
                number = number / 10;
            }
            return -reversed;
        } else {

            int reversed = 0;
            while (number > 0){
                int lastDigit = number % 10;
                reversed = (reversed * 10) + lastDigit;
                number = number / 10;
            }
            return reversed;
        }
    }
    
    public static int getDigitCount(int number) {
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int count = 0;
        while (number > 0){
            count += 1;
            number = number / 10;
        }
        return count;
    }
    
}


















