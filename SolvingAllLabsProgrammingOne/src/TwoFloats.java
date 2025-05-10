public class TwoFloats {
    public static void main(String[] args) {
        float num1 = 5.5f;
        float num2 = 7.8f;
        System.out.printf("two floats are: %.1f %.1f%n",  num1 , num2);
        System.out.printf("sum is: %d%n", (int) (num1 + num2) );
        System.out.printf("difference is: %d%n", (int) (num2 - num1));
        System.out.printf("product is: %d%n", (int) (num2 * num1));
    }
}
