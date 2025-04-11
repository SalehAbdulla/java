public class Test {
    public static void main(String[] args) {
        int nb = 4;
        incrementByTwo(nb);
        System.out.println("nb = " + nb);
    }

    public static void incrementByTwo(int num) {
        num = num + 2;
    }
}
