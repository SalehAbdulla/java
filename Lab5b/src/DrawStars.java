public class DrawStars {
    public static void main(String[] args) {

        drawStars(-1);

    }

    public static void drawStars(int n) {

        if (n == -1){
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
