public class Main {
    public static void main(String[] args) {
        int startNumber = 5;
        int end = 20;
        int totalEvenNumbers = 0;
        int totalOddNumbers = 0;

        while (true) {
            if (startNumber > end) {
                break;
            }

            if (isEvenNumber(startNumber)){
                System.out.print(startNumber + "_");
                totalEvenNumbers++;
            }

            if (isOddNumber(startNumber)){
                totalOddNumbers++;
            }

            if (totalEvenNumbers == 5) {
                break;
            }

            startNumber++;

        }
        System.out.println("\nTotal even numbers is = " + totalEvenNumbers + ", total odd numbers is = " + totalOddNumbers);
    }

    public static boolean isEvenNumber(int number) {
        return (number %2 == 0);
    }
    public static boolean isOddNumber(int number) {
        return (number %2 != 0);
    }
}
