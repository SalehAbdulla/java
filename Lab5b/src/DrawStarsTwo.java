public class DrawStarsTwo {
    public static void main(String[] args) {
        drawStars(7, true);

        for(int i=0;i<5;)
        {
            i++; System.out.println(i);
        }
    }

    public static void drawStars(int n, boolean isUpSideDown) {

        if (n == -1) {
            System.out.println("Invalid input");
            return;
        }
        if (!isUpSideDown) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i <= n; i++) {

                for (int j = n; j > i; j--) {
                    System.out.print("*");
                }


                System.out.println();
            }
        }
    }
}
