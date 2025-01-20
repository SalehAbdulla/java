public class Main{
    public static void main (String[] args) {
        System.out.println(hasTeen(9,99,19));
    }
    public static boolean hasTeen(int value1, int value2, int value3){
        if (value1 > 12 && value1 < 20) {
            return true;
        } else if (value2 > 12 && value2 < 20) {
            return true;
        } else if (value3 > 12 && value3 < 20) {
            return true;
        } else {
            return false;
        }
    }
}