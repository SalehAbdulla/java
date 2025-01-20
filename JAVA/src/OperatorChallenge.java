public class OperatorChallenge {
    public static void main (String[]args) {
        double value1 = 20.00d;
        double value2 = 80.00d;

        double total = (value1 + value2) * 100.00d;
        System.out.println(total);
        double remainder = total % 40.00d;
        System.out.println("The remainder is: " + remainder);

        boolean isRemain = (remainder == 0) ? true : false;
        System.out.println("The result is: " + isRemain);

        if (!isRemain) {
            System.out.println("got some remainder");
        }
    }
}

