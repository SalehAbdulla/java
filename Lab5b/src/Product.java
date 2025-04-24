public class Product {
    public static void main(String[] args) {
        products(2, 8);
    }
    public static void products(int startValue, int stopValue) {

        int result = 1;

        for (int i = startValue; i <= stopValue; i++) {
            result *= i;
        }


        System.out.println(result);

    }
}
