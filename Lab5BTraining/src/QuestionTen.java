public class QuestionTen {
    public static void main(String[] args) {
        drawStars(7, true);
    }

    public static void drawStars(int n, boolean isUpSideDown){
        if (!isUpSideDown) {
            for (int i = 0; i <= n; i++){
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = n; i > 0; i--){
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
