public class TenthQuestion {
    public static void main(String[] args) {
        drawStars(7,true);
    }

    public static void drawStars(int n, boolean isUpOrDown) {
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        if (!isUpOrDown) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

}
