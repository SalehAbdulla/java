public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;  // There are no prime factors for numbers less than 2
        }

        int largestPrime = -1;

        // Check for divisibility by 2 first to handle even numbers
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        // Now check for odd factors from 3 upwards
        int until = (int) Math.sqrt(number);
        System.out.println(until);
        for (int i = 3; i <= until; i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        // If remaining number is a prime larger than 2
        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }
}
