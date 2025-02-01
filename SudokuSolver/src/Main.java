public class Main {

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 3, 0, 0, 0, 0},
                {1, 0, 0, 0, 9, 5, 0, 0, 0},
                {8, 0, 0, 0, 0, 0, 9, 0, 0},
                {0, 4, 3, 0, 0, 7, 5, 0, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3},
        };
    }




    public static boolean isNumberInRow(int[][] board, int rowNumber, int number){
        for (int i = 0; i < GRID_SIZE; i++){
            if (board[rowNumber][i] == number){
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberInColumn(int[][] board, int columnNumber, int number){
        for(int i = 0; i < GRID_SIZE; i++){
            if (board[i][columnNumber] == number){
                return true;
            }
        }
        return false;
    }



}