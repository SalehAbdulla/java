public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int total = 0;
        for (int i = 1; i < 1001 & counter != 5; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Found number met the conditions "+ i);
                total += i;
                counter++;
            }
        }
        System.out.println("The sum of the numbers that's met the conditions is = " + total);
    }
}

